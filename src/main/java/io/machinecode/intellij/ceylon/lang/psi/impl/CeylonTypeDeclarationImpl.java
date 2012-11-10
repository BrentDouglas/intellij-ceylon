package io.machinecode.intellij.ceylon.lang.psi.impl;

import io.machinecode.intellij.ceylon.lang.psi.api.CeylonTypeDeclaration;
import com.intellij.lang.ASTNode;
import org.jetbrains.annotations.NotNull;

/**
 * @author Brent Douglas <brent.n.douglas@gmail.com>
 */
public class CeylonTypeDeclarationImpl extends CeylonElementImpl implements CeylonTypeDeclaration {
    public CeylonTypeDeclarationImpl(@NotNull ASTNode astNode) {
        super(astNode);
    }
}
