package io.machinecode.intellij.ceylon.lang.psi.impl;

import io.machinecode.intellij.ceylon.lang.psi.api.CeylonTopLevelDeclaration;
import com.intellij.lang.ASTNode;
import org.jetbrains.annotations.NotNull;

/**
 * @author Brent Douglas <brent.n.douglas@gmail.com>
 */
public class CeylonTopLevelDeclarationImpl extends CeylonElementImpl implements CeylonTopLevelDeclaration {
    public CeylonTopLevelDeclarationImpl(@NotNull ASTNode astNode) {
        super(astNode);
    }
}
