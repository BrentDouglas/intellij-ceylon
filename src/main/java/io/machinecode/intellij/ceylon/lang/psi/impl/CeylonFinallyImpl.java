package io.machinecode.intellij.ceylon.lang.psi.impl;

import io.machinecode.intellij.ceylon.lang.psi.api.CeylonFinally;
import com.intellij.lang.ASTNode;
import org.jetbrains.annotations.NotNull;

/**
 * @author Brent Douglas <brent.n.douglas@gmail.com>
 */
public class CeylonFinallyImpl extends CeylonElementImpl implements CeylonFinally {
    public CeylonFinallyImpl(@NotNull ASTNode astNode) {
        super(astNode);
    }
}
