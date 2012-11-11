package io.machinecode.intellij.ceylon;

import com.intellij.lang.ASTNode;
import com.intellij.lang.LanguageParserDefinitions;
import com.intellij.lang.ParserDefinition;
import com.intellij.lang.PsiBuilder;
import com.intellij.lang.PsiBuilderFactory;
import com.intellij.lexer.Lexer;
import com.intellij.openapi.application.ApplicationManager;
import com.intellij.openapi.fileTypes.FileTypeManager;
import com.intellij.openapi.project.Project;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiFile;
import com.intellij.psi.PsiFileFactory;
import com.intellij.psi.impl.PsiFileFactoryImpl;
import com.intellij.psi.impl.source.DummyHolder;
import com.intellij.psi.impl.source.DummyHolderFactory;
import com.intellij.psi.impl.source.tree.CompositeElement;
import com.intellij.psi.impl.source.tree.FileElement;
import com.intellij.psi.impl.source.tree.TreeElement;
import com.intellij.testFramework.PsiTestCase;
import com.intellij.testFramework.fixtures.IdeaProjectTestFixture;
import com.intellij.testFramework.fixtures.IdeaTestFixtureFactory;
import com.intellij.util.IncorrectOperationException;
import com.intellij.util.LocalTimeCounter;
import io.machinecode.intellij.ceylon.lang.CeylonElementType;
import io.machinecode.intellij.ceylon.lang.psi.CeylonPsiCreator;

import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;

/**
 * @author Brent Douglas <brent.n.douglas@gmail.com>
 */
public abstract class CeylonTestCase extends PsiTestCase {

    private static final String TEMP_FILENAME = "temp.ceylon";

    private IdeaProjectTestFixture fixture;

    public Project getProject() {
        return myProject;
    }

    public abstract String getResourceDirectory();

    @Override
    protected void setUp() {
        fixture = IdeaTestFixtureFactory.getFixtureFactory().createLightFixtureBuilder().getFixture();

        try {
            fixture.setUp();
        } catch (Exception e) {
            e.printStackTrace();
        }
        myProject = fixture.getProject();
    }

    @Override
    protected void tearDown() {
        ApplicationManager.getApplication().invokeLater(new Runnable() {
            public void run() {
                try {
                    fixture.tearDown();
                } catch (Exception e) {
                    //e.printStackTrace();
                }
            }
        });
    }

    protected PsiFile getPsiFileFromLine(final String text) throws IncorrectOperationException {
        final String filename = myProject.getBaseDir() + TEMP_FILENAME;
        return PsiFileFactory.getInstance(myProject).createFileFromText(filename,
                FileTypeManager.getInstance().getFileTypeByFileName(TEMP_FILENAME),
                text,
                LocalTimeCounter.currentTime(),
                true);
    }

    protected PsiFile getPsiFileFromFile(final String fileName) throws IncorrectOperationException {
        return PsiFileFactory.getInstance(myProject).createFileFromText(fileName,
                FileTypeManager.getInstance().getFileTypeByFileName(fileName),
                readFile(getResourceDirectory() + '/' + fileName),
                LocalTimeCounter.currentTime(),
                true);
    }

    protected PsiElement getPsiElementFromFile(final String fileName, final CeylonElementType type) throws IncorrectOperationException {
        final String text = readFile(getResourceDirectory() + '/' + fileName);
        return ((PsiFileFactoryImpl)PsiFileFactory.getInstance(myProject)).createElementFromText(text,
                CeylonLanguage.CEYLON_LANGUAGE,
                type,
                CeylonPsiCreator.createElement(new CompositeElement(type)));
    }

    protected PsiElement getPsiElementFromLine(final String text, final CeylonElementType type, final CeylonElementType parent) throws IncorrectOperationException {
        return ((PsiFileFactoryImpl)PsiFileFactory.getInstance(myProject)).createElementFromText(text,
                CeylonLanguage.CEYLON_LANGUAGE,
                type,
                CeylonPsiCreator.createElement(new CompositeElement(parent)));
    }

    private static String readFile(final String path) {
        try {
            final InputStream stream = CeylonTestCase.class.getClassLoader().getResourceAsStream(path);
            final StringBuilder builder = new StringBuilder();
            final byte[] buffer = new byte[256];
            while ((stream.read(buffer)) != -1) {
                builder.append(Arrays.toString(buffer));
            }
            return builder.toString();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
