package io.machinecode.intellij.ceylon.lang.psi.impl;

import io.machinecode.intellij.ceylon.lang.psi.api.CeylonResourceDeclaration;
import com.intellij.lang.ASTNode;
import org.jetbrains.annotations.NotNull;

/**
 * @author Brent Douglas <brent.n.douglas@gmail.com>
 */
public class CeylonResourceDeclarationImpl extends CeylonElementImpl implements CeylonResourceDeclaration {
    public CeylonResourceDeclarationImpl(@NotNull ASTNode astNode) {
        super(astNode);
    }
}
