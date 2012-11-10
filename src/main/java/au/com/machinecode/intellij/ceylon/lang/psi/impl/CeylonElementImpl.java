package au.com.machinecode.intellij.ceylon.lang.psi.impl;

import au.com.machinecode.intellij.ceylon.lang.psi.api.CeylonElement;
import com.intellij.extapi.psi.ASTWrapperPsiElement;
import com.intellij.lang.ASTNode;
import org.jetbrains.annotations.NotNull;

/**
 * @author Brent Douglas <brent.n.douglas@gmail.com>
 */
public class CeylonElementImpl extends ASTWrapperPsiElement implements CeylonElement {

    public CeylonElementImpl(@NotNull ASTNode astNode) {
        super(astNode);
    }

}
