package io.machinecode.intellij.ceylon.lang.psi.impl;

import io.machinecode.intellij.ceylon.lang.psi.api.CeylonIncrementOrDecrement;
import com.intellij.lang.ASTNode;
import org.jetbrains.annotations.NotNull;

/**
 * @author Brent Douglas <brent.n.douglas@gmail.com>
 */
public class CeylonIncrementOrDecrementImpl extends CeylonElementImpl implements CeylonIncrementOrDecrement {
    public CeylonIncrementOrDecrementImpl(@NotNull ASTNode astNode) {
        super(astNode);
    }
}
