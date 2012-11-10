package io.machinecode.intellij.ceylon.lang.psi.impl;

import io.machinecode.intellij.ceylon.lang.psi.api.CeylonObjectInheritance;
import com.intellij.lang.ASTNode;
import org.jetbrains.annotations.NotNull;

/**
 * @author Brent Douglas <brent.n.douglas@gmail.com>
 */
public class CeylonObjectInheritanceImpl extends CeylonElementImpl implements CeylonObjectInheritance {
    public CeylonObjectInheritanceImpl(@NotNull ASTNode astNode) {
        super(astNode);
    }
}
