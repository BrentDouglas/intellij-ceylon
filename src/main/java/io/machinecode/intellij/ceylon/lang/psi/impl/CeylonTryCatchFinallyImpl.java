package io.machinecode.intellij.ceylon.lang.psi.impl;

import io.machinecode.intellij.ceylon.lang.psi.api.CeylonTryCatchFinally;
import com.intellij.lang.ASTNode;
import org.jetbrains.annotations.NotNull;

/**
 * @author Brent Douglas <brent.n.douglas@gmail.com>
 */
public class CeylonTryCatchFinallyImpl extends CeylonElementImpl implements CeylonTryCatchFinally {
    public CeylonTryCatchFinallyImpl(@NotNull ASTNode astNode) {
        super(astNode);
    }
}
