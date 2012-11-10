package io.machinecode.intellij.ceylon.lang.psi.impl;

import io.machinecode.intellij.ceylon.lang.psi.api.CeylonInterfaceInheritance;
import com.intellij.lang.ASTNode;
import org.jetbrains.annotations.NotNull;

/**
 * @author Brent Douglas <brent.n.douglas@gmail.com>
 */
public class CeylonInterfaceInheritanceImpl extends CeylonElementImpl implements CeylonInterfaceInheritance {
    public CeylonInterfaceInheritanceImpl(@NotNull ASTNode astNode) {
        super(astNode);
    }
}
