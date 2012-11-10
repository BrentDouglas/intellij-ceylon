package io.machinecode.intellij.ceylon.lang.psi.impl;

import io.machinecode.intellij.ceylon.lang.psi.api.CeylonWhile;
import com.intellij.lang.ASTNode;
import org.jetbrains.annotations.NotNull;

/**
 * @author Brent Douglas <brent.n.douglas@gmail.com>
 */
public class CeylonWhileImpl extends CeylonElementImpl implements CeylonWhile {
    public CeylonWhileImpl(@NotNull ASTNode astNode) {
        super(astNode);
    }
}
