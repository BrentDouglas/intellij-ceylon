package au.com.machinecode.intellij.ceylon.lang.psi.impl;

import au.com.machinecode.intellij.ceylon.CeylonFileType;
import au.com.machinecode.intellij.ceylon.CeylonLanguage;
import au.com.machinecode.intellij.ceylon.lang.psi.api.CeylonCompilationUnit;
import com.intellij.extapi.psi.PsiFileBase;
import com.intellij.openapi.fileTypes.FileType;
import com.intellij.psi.FileViewProvider;
import com.intellij.psi.PsiClass;
import com.intellij.util.IncorrectOperationException;
import org.jetbrains.annotations.NotNull;

/**
 * @author Brent Douglas <brent.n.douglas@gmail.com>
 */
public class CeylonCompilationUnitImpl extends PsiFileBase implements CeylonCompilationUnit {

    public CeylonCompilationUnitImpl(final @NotNull FileViewProvider fileViewProvider) {
        super(fileViewProvider, CeylonLanguage.CEYLON_LANGUAGE);
    }

    @NotNull
    @Override
    public PsiClass[] getClasses() {
        return new PsiClass[0];  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    @NotNull
    public String getPackageName() {
        return "";
    }

    @Override
    public void setPackageName(final String packageName) throws IncorrectOperationException {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public boolean importClass(final PsiClass psiClass) {
        return false;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @NotNull
    @Override
    public FileType getFileType() {
        return CeylonFileType.CEYLON_FILE_TYPE;
    }
}
