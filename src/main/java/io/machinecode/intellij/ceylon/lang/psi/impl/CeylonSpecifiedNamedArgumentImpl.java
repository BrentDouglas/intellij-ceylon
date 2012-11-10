package io.machinecode.intellij.ceylon.lang.psi.impl;

import io.machinecode.intellij.ceylon.lang.psi.api.CeylonSpecifiedNamedArgument;
import com.intellij.lang.ASTNode;
import org.jetbrains.annotations.NotNull;

/**
 * @author Brent Douglas <brent.n.douglas@gmail.com>
 */
public class CeylonSpecifiedNamedArgumentImpl extends CeylonElementImpl implements CeylonSpecifiedNamedArgument {
    public CeylonSpecifiedNamedArgumentImpl(@NotNull ASTNode astNode) {
        super(astNode);
    }
}
