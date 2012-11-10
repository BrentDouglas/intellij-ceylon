package io.machinecode.intellij.ceylon.lang.psi.impl;

import io.machinecode.intellij.ceylon.lang.psi.api.CeylonPositionalArguments;
import com.intellij.lang.ASTNode;
import org.jetbrains.annotations.NotNull;

/**
 * @author Brent Douglas <brent.n.douglas@gmail.com>
 */
public class CeylonPositionalArgumentsImpl extends CeylonElementImpl implements CeylonPositionalArguments {
    public CeylonPositionalArgumentsImpl(@NotNull ASTNode astNode) {
        super(astNode);
    }
}
