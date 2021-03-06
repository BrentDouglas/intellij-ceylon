package io.machinecode.intellij.ceylon.lang.psi.impl;

import io.machinecode.intellij.ceylon.lang.psi.api.CeylonTypeConstraints;
import com.intellij.lang.ASTNode;
import org.jetbrains.annotations.NotNull;

/**
 * @author Brent Douglas <brent.n.douglas@gmail.com>
 */
public class CeylonTypeConstraintsImpl extends CeylonElementImpl implements CeylonTypeConstraints {
    public CeylonTypeConstraintsImpl(@NotNull ASTNode astNode) {
        super(astNode);
    }
}
