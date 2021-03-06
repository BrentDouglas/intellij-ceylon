package io.machinecode.intellij.ceylon.lang.psi.impl;

import io.machinecode.intellij.ceylon.lang.psi.api.CeylonThrow;
import com.intellij.lang.ASTNode;
import org.jetbrains.annotations.NotNull;

/**
 * @author Brent Douglas <brent.n.douglas@gmail.com>
 */
public class CeylonThrowImpl extends CeylonElementImpl implements CeylonThrow {
    public CeylonThrowImpl(@NotNull ASTNode astNode) {
        super(astNode);
    }
}
