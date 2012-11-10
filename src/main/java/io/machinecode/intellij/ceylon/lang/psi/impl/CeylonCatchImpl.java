package io.machinecode.intellij.ceylon.lang.psi.impl;

import io.machinecode.intellij.ceylon.lang.psi.api.CeylonCatch;
import com.intellij.lang.ASTNode;
import org.jetbrains.annotations.NotNull;

/**
 * @author Brent Douglas <brent.n.douglas@gmail.com>
 */
public class CeylonCatchImpl extends CeylonElementImpl implements CeylonCatch {
    public CeylonCatchImpl(@NotNull ASTNode astNode) {
        super(astNode);
    }
}
