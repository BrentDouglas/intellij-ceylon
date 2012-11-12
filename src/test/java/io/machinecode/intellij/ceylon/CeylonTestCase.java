package io.machinecode.intellij.ceylon;

import com.intellij.openapi.application.ApplicationManager;
import com.intellij.openapi.project.Project;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiFileFactory;
import com.intellij.psi.impl.PsiFileFactoryImpl;
import com.intellij.psi.impl.source.tree.CompositeElement;
import com.intellij.testFramework.PsiTestCase;
import com.intellij.testFramework.fixtures.IdeaProjectTestFixture;
import com.intellij.testFramework.fixtures.IdeaTestFixtureFactory;
import io.machinecode.intellij.ceylon.lang.CeylonElementType;
import io.machinecode.intellij.ceylon.lang.psi.CeylonPsiCreator;
import junit.framework.Assert;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

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

    protected PsiElement parseFile(final String fileName, final CeylonElementType type, final CeylonElementType parent) {
        final String text = readFile(getResourceDirectory() + '/' + fileName);
        return ((PsiFileFactoryImpl)PsiFileFactory.getInstance(myProject)).createElementFromText(
                text,
                CeylonLanguage.CEYLON_LANGUAGE,
                type,
                CeylonPsiCreator.createElement(new CompositeElement(parent)));
    }

    protected PsiElement parseLine(final String line, final CeylonElementType type, final CeylonElementType parent) {
        return ((PsiFileFactoryImpl)PsiFileFactory.getInstance(myProject)).createElementFromText(
                line,
                CeylonLanguage.CEYLON_LANGUAGE,
                type,
                CeylonPsiCreator.createElement(new CompositeElement(parent)));
    }

    protected Set<PsiElement> parseLines(final String filename, final CeylonElementType type, final CeylonElementType parent) {
        final Set<PsiElement> elements = new HashSet<PsiElement>();
        for (final String line : readFileLines(getResourceDirectory() + '/' + filename)) {
            elements.add(((PsiFileFactoryImpl)PsiFileFactory.getInstance(myProject)).createElementFromText(
                    line,
                    CeylonLanguage.CEYLON_LANGUAGE,
                    type,
                    CeylonPsiCreator.createElement(new CompositeElement(parent))));
        }
        return elements;
    }

    protected Set<PsiElement> parseFileSections(final String filename, final CeylonElementType type, final CeylonElementType parent) {
        final Set<PsiElement> elements = new HashSet<PsiElement>();
        final Set<String> lines = readFileLines(getResourceDirectory() + '/' + filename);
        StringBuilder builder = new StringBuilder();
        for (final String line : lines) {
            if ("---".equals(line)) {
                elements.add(((PsiFileFactoryImpl)PsiFileFactory.getInstance(myProject)).createElementFromText(
                        builder.toString(),
                        CeylonLanguage.CEYLON_LANGUAGE,
                        type,
                        CeylonPsiCreator.createElement(new CompositeElement(parent))));
                builder = new StringBuilder();
            } else {
                builder.append(line);
            }
        }
        elements.add(((PsiFileFactoryImpl)PsiFileFactory.getInstance(myProject)).createElementFromText(
                builder.toString(),
                CeylonLanguage.CEYLON_LANGUAGE,
                type,
                CeylonPsiCreator.createElement(new CompositeElement(parent))));
        return elements;
    }

    protected boolean failParseFile(final String fileName, final CeylonElementType type, final CeylonElementType parent) {
        final String text = readFile(getResourceDirectory() + '/' + fileName);
        try {
            ((PsiFileFactoryImpl)PsiFileFactory.getInstance(myProject)).createElementFromText(
                    text,
                    CeylonLanguage.CEYLON_LANGUAGE,
                    type,
                    CeylonPsiCreator.createElement(new CompositeElement(parent)));
        } catch (final Throwable throwable) {
            return true;
        }
        return false;
    }

    protected boolean failParseLine(final String line, final CeylonElementType type, final CeylonElementType parent) {
        try {
            ((PsiFileFactoryImpl)PsiFileFactory.getInstance(myProject)).createElementFromText(
                    line,
                    CeylonLanguage.CEYLON_LANGUAGE,
                    type,
                    CeylonPsiCreator.createElement(new CompositeElement(parent)));
        } catch (final Throwable throwable) {
            return true;
        }
        return false;
    }

    protected Set<String> failParseLines(final String filename, final CeylonElementType type, final CeylonElementType parent) {
        final Set<String> failed = new HashSet<String>();
        final Set<String> lines = readFileLines(getResourceDirectory() + '/' + filename);
        for (final String line : lines) {
            try {
                ((PsiFileFactoryImpl)PsiFileFactory.getInstance(myProject)).createElementFromText(
                        line,
                        CeylonLanguage.CEYLON_LANGUAGE,
                        type,
                        CeylonPsiCreator.createElement(new CompositeElement(parent)));
                failed.add(line);
            } catch (final Throwable throwable) {
                //
            }
        }
        return failed;
    }

    protected Set<String> failParseFileSections(final String filename, final CeylonElementType type, final CeylonElementType parent) {
        final Set<String> failed = new HashSet<String>();
        final Set<String> lines = readFileLines(getResourceDirectory() + '/' + filename);

        StringBuilder builder = new StringBuilder();
        for (final String line : lines) {
            if ("---".equals(line)) {
                final String section = builder.toString();
                try {
                    ((PsiFileFactoryImpl)PsiFileFactory.getInstance(myProject)).createElementFromText(
                            section,
                            CeylonLanguage.CEYLON_LANGUAGE,
                            type,
                            CeylonPsiCreator.createElement(new CompositeElement(parent)));
                    failed.add(section);
                } catch (final Throwable throwable) {
                    //
                }
                builder = new StringBuilder();
            } else {
                builder.append(line);
            }
        }

        final String section = builder.toString();
        try {
            ((PsiFileFactoryImpl)PsiFileFactory.getInstance(myProject)).createElementFromText(
                    section,
                    CeylonLanguage.CEYLON_LANGUAGE,
                    type,
                    CeylonPsiCreator.createElement(new CompositeElement(parent)));
            failed.add(section);
        } catch (final Throwable throwable) {
            //
        }

        return failed;
    }
    protected void assertEmpty(final Set<String> failed) {
        if (!failed.isEmpty()) {
            Assert.fail(getFailureMessage(failed));
        }
    }

    protected String getFailureMessage(final Set<String> failed) {
        final StringBuilder builder = new StringBuilder();
        for (final String failure : failed) {
            builder.append("Failed code section: \n---\n")
                    .append(failure)
                    .append("\n---\n");
        }
        return builder.toString();
    }

    /**
     * @param path The path to the resource file
     * @return The entire text of the resource file
     */
    private static String readFile(final String path) {
        try {
            final InputStream stream = CeylonTestCase.class.getClassLoader().getResourceAsStream(path);
            final BufferedReader reader = new BufferedReader(new InputStreamReader(stream));
            final StringBuilder builder = new StringBuilder();
            String line;
            while ((line = reader.readLine()) != null) {
                builder.append(line);
            }
            return builder.toString();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    /**
     * @param path The path to the resource file
     * @return The lines of the resource file
     */
    private static Set<String> readFileLines(final String path) {
        try {
            final InputStream stream = CeylonTestCase.class.getClassLoader().getResourceAsStream(path);
            final BufferedReader reader = new BufferedReader(new InputStreamReader(stream));
            final Set<String> lines = new HashSet<String>();
            String line;
            while ((line = reader.readLine()) != null) {
                lines.add(line);
            }
            return lines;
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
