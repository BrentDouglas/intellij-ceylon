package io.machinecode.intellij.ceylon.lang.psi.impl;

import io.machinecode.intellij.ceylon.lang.psi.api.CeylonSatisfiesCondition;
import com.intellij.lang.ASTNode;
import org.jetbrains.annotations.NotNull;

/**
 * @author Brent Douglas <brent.n.douglas@gmail.com>
 */
public class CeylonSatisfiesConditionImpl extends CeylonElementImpl implements CeylonSatisfiesCondition {
    public CeylonSatisfiesConditionImpl(@NotNull ASTNode astNode) {
        super(astNode);
    }
}
