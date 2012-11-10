package io.machinecode.intellij.ceylon.lang.psi.impl;

import io.machinecode.intellij.ceylon.lang.psi.api.CeylonCondition;
import com.intellij.lang.ASTNode;
import org.jetbrains.annotations.NotNull;

/**
 * @author Brent Douglas <brent.n.douglas@gmail.com>
 */
public class CeylonConditionImpl extends CeylonElementImpl implements CeylonCondition {
    public CeylonConditionImpl(@NotNull ASTNode astNode) {
        super(astNode);
    }
}
