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
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * @author Brent Douglas <brent.n.douglas@gmail.com>
 */
public abstract class CeylonTestCase extends PsiTestCase {

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

    /*
     * Parse file and return all lines that do not parse correctly
     */

    protected Set<String> parseFile(final String fileName, final CeylonElementType type) {
        final String text = readFile(getResourceDirectory() + '/' + fileName);
        final PsiElement parent = CeylonPsiCreator.createElement(new CompositeElement(type));
        final PsiElement result = ((PsiFileFactoryImpl)PsiFileFactory.getInstance(myProject)).createElementFromText(
                text,
                CeylonLanguage.CEYLON_LANGUAGE,
                type,
                parent);
        if (result == null || parent == result) {
            return Collections.singleton(text);
        }
        return Collections.emptySet();
    }

    protected Set<String> parseLine(final String line, final CeylonElementType type) {
        final PsiElement parent = CeylonPsiCreator.createElement(new CompositeElement(type));
        final PsiElement result = ((PsiFileFactoryImpl)PsiFileFactory.getInstance(myProject)).createElementFromText(
                line,
                CeylonLanguage.CEYLON_LANGUAGE,
                type,
                parent);
        if (result == null || parent == result) {
            return Collections.singleton(line);
        }
        return Collections.emptySet();
    }

    protected Set<String> parseLines(final String filename, final CeylonElementType type) {
        final Set<String> failed = new HashSet<String>();
        for (final String line : readFileLines(getResourceDirectory() + '/' + filename)) {
            final PsiElement parent = CeylonPsiCreator.createElement(new CompositeElement(type));
            final PsiElement result = ((PsiFileFactoryImpl)PsiFileFactory.getInstance(myProject)).createElementFromText(
                    line,
                    CeylonLanguage.CEYLON_LANGUAGE,
                    type,
                    parent);
            if (result == null || parent == result) {
                failed.add(line);
            }
        }
        return failed;
    }

    protected Set<String> parseFileSections(final String filename, final CeylonElementType type) {
        final Set<String> failed = new HashSet<String>();
        final List<String> lines = readFileLines(getResourceDirectory() + '/' + filename);
        String text;
        StringBuilder builder = new StringBuilder();
        for (final String line : lines) {
            if ("---".equals(line)) {
                text = builder.toString();
                final PsiElement parent = CeylonPsiCreator.createElement(new CompositeElement(type));
                final PsiElement result = ((PsiFileFactoryImpl)PsiFileFactory.getInstance(myProject)).createElementFromText(
                        text,
                        CeylonLanguage.CEYLON_LANGUAGE,
                        type,
                        parent);
                if (result == null || parent == result) {
                    failed.add(text);
                }
                builder = new StringBuilder();
            } else {
                builder.append('\n').append(line);
            }
        }
        text = builder.toString();
        final PsiElement parent = CeylonPsiCreator.createElement(new CompositeElement(type));
        final PsiElement result = ((PsiFileFactoryImpl)PsiFileFactory.getInstance(myProject)).createElementFromText(
                text,
                CeylonLanguage.CEYLON_LANGUAGE,
                type,
                parent);
        if (result == null || parent == result) {
            failed.add(text);
        }
        return failed;
    }

    /*
     * Parse file and return all lines that parse correctly
     */

    protected Set<String> failParseFile(final String fileName, final CeylonElementType type) {
        final String text = readFile(getResourceDirectory() + '/' + fileName);
        try {
            final PsiElement parent = CeylonPsiCreator.createElement(new CompositeElement(type));
            final PsiElement result = ((PsiFileFactoryImpl)PsiFileFactory.getInstance(myProject)).createElementFromText(
                    text,
                    CeylonLanguage.CEYLON_LANGUAGE,
                    type,
                    parent);
            if (result != null && parent != result) {
                return Collections.singleton(text);
            }
        } catch (final Throwable throwable) {
            return Collections.emptySet();
        }
        return Collections.singleton(text);
    }

    protected Set<String> failParseLine(final String line, final CeylonElementType type) {
        try {
            final PsiElement parent = CeylonPsiCreator.createElement(new CompositeElement(type));
            final PsiElement result = ((PsiFileFactoryImpl)PsiFileFactory.getInstance(myProject)).createElementFromText(
                    line,
                    CeylonLanguage.CEYLON_LANGUAGE,
                    type,
                    parent);
            if (result != null && parent != result) {
                return Collections.singleton(line);
            }
        } catch (final Throwable throwable) {
            return Collections.emptySet();
        }
        return Collections.singleton(line);
    }

    protected Set<String> failParseLines(final String filename, final CeylonElementType type) {
        final Set<String> failed = new HashSet<String>();
        final List<String> lines = readFileLines(getResourceDirectory() + '/' + filename);
        for (final String line : lines) {
            try {
                final PsiElement parent = CeylonPsiCreator.createElement(new CompositeElement(type));
                final PsiElement result = ((PsiFileFactoryImpl)PsiFileFactory.getInstance(myProject)).createElementFromText(
                        line,
                        CeylonLanguage.CEYLON_LANGUAGE,
                        type,
                        parent);
                if (result != null && parent != result) {
                    failed.add(line);
                }
            } catch (final Throwable throwable) {
                //
            }
        }
        return failed;
    }

    protected Set<String> failParseFileSections(final String filename, final CeylonElementType type) {
        final Set<String> failed = new HashSet<String>();
        final List<String> lines = readFileLines(getResourceDirectory() + '/' + filename);

        StringBuilder builder = new StringBuilder();
        for (final String line : lines) {
            if ("---".equals(line)) {
                final String section = builder.toString();
                try {
                    final PsiElement parent = CeylonPsiCreator.createElement(new CompositeElement(type));
                    final PsiElement result = ((PsiFileFactoryImpl)PsiFileFactory.getInstance(myProject)).createElementFromText(
                            section,
                            CeylonLanguage.CEYLON_LANGUAGE,
                            type,
                            parent);
                    if (result != null && parent != result) {
                        failed.add(section);
                    }
                } catch (final Throwable throwable) {
                    //
                }
                builder = new StringBuilder();
            } else {
                builder.append('\n').append(line);
            }
        }

        final String section = builder.toString();
        try {
            final PsiElement parent = CeylonPsiCreator.createElement(new CompositeElement(type));
            final PsiElement result = ((PsiFileFactoryImpl)PsiFileFactory.getInstance(myProject)).createElementFromText(
                    section,
                    CeylonLanguage.CEYLON_LANGUAGE,
                    type,
                    parent);
            if (result != null && parent != result) {
                failed.add(section);
            }
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
    private static List<String> readFileLines(final String path) {
        try {
            final InputStream stream = CeylonTestCase.class.getClassLoader().getResourceAsStream(path);
            final BufferedReader reader = new BufferedReader(new InputStreamReader(stream));
            final List<String> lines = new ArrayList<String>();
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
