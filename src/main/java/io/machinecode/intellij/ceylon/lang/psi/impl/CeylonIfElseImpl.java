package io.machinecode.intellij.ceylon.lang.psi.impl;

import io.machinecode.intellij.ceylon.lang.psi.api.CeylonIfElse;
import com.intellij.lang.ASTNode;
import org.jetbrains.annotations.NotNull;

/**
 * @author Brent Douglas <brent.n.douglas@gmail.com>
 */
public class CeylonIfElseImpl extends CeylonElementImpl implements CeylonIfElse {
    public CeylonIfElseImpl(@NotNull ASTNode astNode) {
        super(astNode);
    }
}
