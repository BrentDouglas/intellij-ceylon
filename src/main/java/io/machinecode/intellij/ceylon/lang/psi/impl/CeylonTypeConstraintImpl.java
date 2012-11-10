package io.machinecode.intellij.ceylon.lang.psi.impl;

import io.machinecode.intellij.ceylon.lang.psi.api.CeylonTypeConstraint;
import com.intellij.lang.ASTNode;
import org.jetbrains.annotations.NotNull;

/**
 * @author Brent Douglas <brent.n.douglas@gmail.com>
 */
public class CeylonTypeConstraintImpl extends CeylonElementImpl implements CeylonTypeConstraint {
    public CeylonTypeConstraintImpl(@NotNull ASTNode astNode) {
        super(astNode);
    }
}
