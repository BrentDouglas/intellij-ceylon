package io.machinecode.intellij.ceylon.lang.psi.impl;

import io.machinecode.intellij.ceylon.lang.psi.api.CeylonCallableVariable;
import com.intellij.lang.ASTNode;
import org.jetbrains.annotations.NotNull;

/**
 * @author Brent Douglas <brent.n.douglas@gmail.com>
 */
public class CeylonCallableVariableImpl extends CeylonElementImpl implements CeylonCallableVariable {
    public CeylonCallableVariableImpl(@NotNull ASTNode astNode) {
        super(astNode);
    }
}
