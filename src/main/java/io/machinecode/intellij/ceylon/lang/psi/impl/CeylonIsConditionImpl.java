package io.machinecode.intellij.ceylon.lang.psi.impl;

import io.machinecode.intellij.ceylon.lang.psi.api.CeylonIsCondition;
import com.intellij.lang.ASTNode;
import org.jetbrains.annotations.NotNull;

/**
 * @author Brent Douglas <brent.n.douglas@gmail.com>
 */
public class CeylonIsConditionImpl extends CeylonElementImpl implements CeylonIsCondition {
    public CeylonIsConditionImpl(@NotNull ASTNode astNode) {
        super(astNode);
    }
}
