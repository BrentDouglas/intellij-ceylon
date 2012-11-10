package io.machinecode.intellij.ceylon.lang.psi.impl;

import io.machinecode.intellij.ceylon.lang.psi.api.CeylonLocalNamedArgument;
import com.intellij.lang.ASTNode;
import org.jetbrains.annotations.NotNull;

/**
 * @author Brent Douglas <brent.n.douglas@gmail.com>
 */
public class CeylonLocalNamedArgumentImpl extends CeylonElementImpl implements CeylonLocalNamedArgument {
    public CeylonLocalNamedArgumentImpl(@NotNull ASTNode astNode) {
        super(astNode);
    }
}
