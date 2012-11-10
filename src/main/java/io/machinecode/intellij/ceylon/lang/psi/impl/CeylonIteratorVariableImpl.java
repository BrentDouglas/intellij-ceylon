package io.machinecode.intellij.ceylon.lang.psi.impl;

import io.machinecode.intellij.ceylon.lang.psi.api.CeylonIteratorVariable;
import com.intellij.lang.ASTNode;
import org.jetbrains.annotations.NotNull;

/**
 * @author Brent Douglas <brent.n.douglas@gmail.com>
 */
public class CeylonIteratorVariableImpl extends CeylonElementImpl implements CeylonIteratorVariable {
    public CeylonIteratorVariableImpl(@NotNull ASTNode astNode) {
        super(astNode);
    }
}
