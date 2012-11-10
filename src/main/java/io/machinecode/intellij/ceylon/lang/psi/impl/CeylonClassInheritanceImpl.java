package io.machinecode.intellij.ceylon.lang.psi.impl;

import io.machinecode.intellij.ceylon.lang.psi.api.CeylonClassInheritance;
import com.intellij.lang.ASTNode;
import org.jetbrains.annotations.NotNull;

/**
 * @author Brent Douglas <brent.n.douglas@gmail.com>
 */
public class CeylonClassInheritanceImpl extends CeylonElementImpl implements CeylonClassInheritance {
    public CeylonClassInheritanceImpl(@NotNull ASTNode astNode) {
        super(astNode);
    }
}
