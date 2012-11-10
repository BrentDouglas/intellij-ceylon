package io.machinecode.intellij.ceylon;

import com.intellij.openapi.application.ApplicationManager;
import com.intellij.openapi.fileTypes.FileTypeManager;
import com.intellij.openapi.project.Project;
import com.intellij.psi.PsiFile;
import com.intellij.psi.PsiFileFactory;
import com.intellij.testFramework.PsiTestCase;
import com.intellij.testFramework.fixtures.IdeaProjectTestFixture;
import com.intellij.testFramework.fixtures.IdeaTestFixtureFactory;
import com.intellij.util.IncorrectOperationException;
import com.intellij.util.LocalTimeCounter;
import junit.framework.AssertionFailedError;

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
        } catch (AssertionFailedError ae) {
            // mute
        } catch (AssertionError ae) {
            // mute
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

    protected PsiFile getPsiFileFromLine(final Project project, final String text) throws IncorrectOperationException {
        final String filename = project.getBaseDir() + TEMP_FILENAME;
        return PsiFileFactory.getInstance(project).createFileFromText(filename,
                FileTypeManager.getInstance().getFileTypeByFileName(TEMP_FILENAME),
                text,
                LocalTimeCounter.currentTime(),
                true);
    }

    protected PsiFile getPsiFileFromFile(final Project project, final String fileName) throws IncorrectOperationException {
        return PsiFileFactory.getInstance(project).createFileFromText(fileName,
                FileTypeManager.getInstance().getFileTypeByFileName(fileName),
                readFile(getResourceDirectory() + '/' + fileName),
                LocalTimeCounter.currentTime(),
                true);
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
