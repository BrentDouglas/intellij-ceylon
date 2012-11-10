package io.machinecode.intellij.ceylon.lang.psi.impl;

import io.machinecode.intellij.ceylon.lang.psi.api.CeylonNamedArgument;
import com.intellij.lang.ASTNode;
import org.jetbrains.annotations.NotNull;

/**
 * @author Brent Douglas <brent.n.douglas@gmail.com>
 */
public class CeylonNamedArgumentImpl extends CeylonElementImpl implements CeylonNamedArgument {
    public CeylonNamedArgumentImpl(@NotNull ASTNode astNode) {
        super(astNode);
    }
}
