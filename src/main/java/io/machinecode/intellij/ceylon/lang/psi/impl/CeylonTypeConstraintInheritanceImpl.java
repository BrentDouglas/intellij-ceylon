package io.machinecode.intellij.ceylon.lang.psi.impl;

import io.machinecode.intellij.ceylon.lang.psi.api.CeylonTypeConstraintInheritance;
import com.intellij.lang.ASTNode;
import org.jetbrains.annotations.NotNull;

/**
 * @author Brent Douglas <brent.n.douglas@gmail.com>
 */
public class CeylonTypeConstraintInheritanceImpl extends CeylonElementImpl implements CeylonTypeConstraintInheritance {
    public CeylonTypeConstraintInheritanceImpl(@NotNull ASTNode astNode) {
        super(astNode);
    }
}
