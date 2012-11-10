package io.machinecode.intellij.ceylon.lang.psi.impl;

import io.machinecode.intellij.ceylon.lang.psi.api.CeylonContinue;
import com.intellij.lang.ASTNode;
import org.jetbrains.annotations.NotNull;

/**
 * @author Brent Douglas <brent.n.douglas@gmail.com>
 */
public class CeylonContinueImpl extends CeylonElementImpl implements CeylonContinue {
    public CeylonContinueImpl(@NotNull ASTNode astNode) {
        super(astNode);
    }
}
