package io.machinecode.intellij.ceylon.lang.psi.impl;

import com.intellij.lang.ASTNode;
import io.machinecode.intellij.ceylon.lang.psi.api.CeylonPositionalArgument;
import org.jetbrains.annotations.NotNull;

/**
 * @author Brent Douglas <brent.n.douglas@gmail.com>
 */
public class CeylonPositionalArgumentImpl extends CeylonElementImpl implements CeylonPositionalArgument {
    public CeylonPositionalArgumentImpl(@NotNull ASTNode astNode) {
        super(astNode);
    }
}
