package io.machinecode.intellij.ceylon.lang.psi.impl;

import io.machinecode.intellij.ceylon.lang.psi.api.CeylonDeclaration;
import com.intellij.lang.ASTNode;
import org.jetbrains.annotations.NotNull;

/**
 * @author Brent Douglas <brent.n.douglas@gmail.com>
 */
public class CeylonDeclarationImpl extends CeylonElementImpl implements CeylonDeclaration {
    public CeylonDeclarationImpl(@NotNull ASTNode astNode) {
        super(astNode);
    }
}
