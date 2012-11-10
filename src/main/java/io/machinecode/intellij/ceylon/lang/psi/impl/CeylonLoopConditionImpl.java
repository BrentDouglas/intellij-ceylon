package io.machinecode.intellij.ceylon.lang.psi.impl;

import io.machinecode.intellij.ceylon.lang.psi.api.CeylonLoopCondition;
import com.intellij.lang.ASTNode;
import org.jetbrains.annotations.NotNull;

/**
 * @author Brent Douglas <brent.n.douglas@gmail.com>
 */
public class CeylonLoopConditionImpl extends CeylonElementImpl implements CeylonLoopCondition {
    public CeylonLoopConditionImpl(@NotNull ASTNode astNode) {
        super(astNode);
    }
}
