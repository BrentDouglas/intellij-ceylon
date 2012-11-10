package io.machinecode.intellij.ceylon.lang.psi.api;

import com.intellij.psi.PsiClassOwner;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiFile;
import com.intellij.psi.PsiImportHolder;

/**
 * @author Brent Douglas <brent.n.douglas@gmail.com>
 */
public interface CeylonCompilationUnit extends PsiFile, PsiImportHolder, PsiClassOwner, PsiElement {
}
