package io.machinecode.intellij.ceylon;

import com.intellij.execution.junit.JUnitUtil;
import com.intellij.ide.fileTemplates.FileTemplateDescriptor;
import com.intellij.lang.Language;
import com.intellij.openapi.diagnostic.Logger;
import com.intellij.openapi.projectRoots.ex.JavaSdkUtil;
import com.intellij.psi.PsiClass;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiMethod;
import com.intellij.psi.util.InheritanceUtil;
import com.intellij.testIntegration.JavaTestFramework;
import com.intellij.util.IncorrectOperationException;
import org.jetbrains.annotations.NotNull;

import javax.swing.Icon;

/**
 * @author Brent Douglas <brent.n.douglas@gmail.com>
 */
public class CeylonTestFramework extends JavaTestFramework {

  private static final Logger LOG = Logger.getInstance(CeylonTestFramework.class);

    @NotNull
    @Override
    public String getName() {
        return "Ceylon JUnit";
    }

    @NotNull
    @Override
    public Icon getIcon() {
        return CeylonIcon.CEYLON_ICON_16x16;
    }

    @NotNull
    @Override
    public String getLibraryPath() {
        return JavaSdkUtil.getJunit4JarPath();
    }

    @Override
    @NotNull
    public String getDefaultSuperClass() {
        return CeylonTestCase.class.getCanonicalName();
    }

    @Override
    public FileTemplateDescriptor getSetUpMethodFileTemplateDescriptor() {
        return new FileTemplateDescriptor("Ceylon JUnit SetUp Method.ceylon");
    }

    @Override
    public FileTemplateDescriptor getTearDownMethodFileTemplateDescriptor() {
        return new FileTemplateDescriptor("Ceylon JUnit TearDown Method.ceylon");
    }

    @Override
    public FileTemplateDescriptor getTestMethodFileTemplateDescriptor() {
        return new FileTemplateDescriptor("Ceylon JUnit Test Method.ceylon");
    }

    @Override
    public boolean isTestMethod(final PsiElement element) {
        return element instanceof PsiMethod && JUnitUtil.getTestMethod(element) != null;
    }

    @Override
    protected String getMarkerClassFQName() {
        return getDefaultSuperClass();
    }

    @Override
    protected boolean isTestClass(final PsiClass clazz, final boolean canBePotential) {
    return clazz.getLanguage() == CeylonLanguage.CEYLON_LANGUAGE &&
           JUnitUtil.isTestClass(clazz) &&
           InheritanceUtil.isInheritor(clazz, getDefaultSuperClass());
    }

    @Override
    protected PsiMethod findSetUpMethod(@NotNull final PsiClass clazz) {
        for (PsiMethod method : clazz.getMethods()) {
            if (method.getName().equals("setUp")) return method;
        }
        return null;
    }

    @Override
    protected PsiMethod findTearDownMethod(@NotNull final PsiClass clazz) {
        for (PsiMethod method : clazz.getMethods()) {
          if (method.getName().equals("tearDown")) return method;
        }
        return null;
    }

    @NotNull
    @Override
    public Language getLanguage() {
        return CeylonLanguage.CEYLON_LANGUAGE;
    }

    @Override
    protected PsiMethod findOrCreateSetUpMethod(final PsiClass clazz) throws IncorrectOperationException {
        LOG.assertTrue(clazz.getLanguage() == CeylonLanguage.CEYLON_LANGUAGE);
        //TODO
        return null;
    }
}
