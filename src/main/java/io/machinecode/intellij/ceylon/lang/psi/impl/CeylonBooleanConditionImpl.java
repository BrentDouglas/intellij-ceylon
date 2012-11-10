package io.machinecode.intellij.ceylon.lang.psi.impl;

import io.machinecode.intellij.ceylon.lang.psi.api.CeylonBooleanCondition;
import com.intellij.lang.ASTNode;
import org.jetbrains.annotations.NotNull;

/**
 * @author Brent Douglas <brent.n.douglas@gmail.com>
 */
public class CeylonBooleanConditionImpl extends CeylonElementImpl implements CeylonBooleanCondition {
    public CeylonBooleanConditionImpl(@NotNull ASTNode astNode) {
        super(astNode);
    }
}
