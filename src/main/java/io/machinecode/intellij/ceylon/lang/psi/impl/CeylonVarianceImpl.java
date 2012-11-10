package io.machinecode.intellij.ceylon.lang.psi.impl;

import io.machinecode.intellij.ceylon.lang.psi.api.CeylonVariance;
import com.intellij.lang.ASTNode;
import org.jetbrains.annotations.NotNull;

/**
 * @author Brent Douglas <brent.n.douglas@gmail.com>
 */
public class CeylonVarianceImpl extends CeylonElementImpl implements CeylonVariance {
    public CeylonVarianceImpl(@NotNull ASTNode astNode) {
        super(astNode);
    }
}
