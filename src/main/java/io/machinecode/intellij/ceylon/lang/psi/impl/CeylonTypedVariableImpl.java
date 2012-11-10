package io.machinecode.intellij.ceylon.lang.psi.impl;

import io.machinecode.intellij.ceylon.lang.psi.api.CeylonTypedVariable;
import com.intellij.lang.ASTNode;
import org.jetbrains.annotations.NotNull;

/**
 * @author Brent Douglas <brent.n.douglas@gmail.com>
 */
public class CeylonTypedVariableImpl extends CeylonElementImpl implements CeylonTypedVariable {
    public CeylonTypedVariableImpl(@NotNull ASTNode astNode) {
        super(astNode);
    }
}
