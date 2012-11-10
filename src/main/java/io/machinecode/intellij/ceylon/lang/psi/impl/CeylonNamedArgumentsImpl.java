package io.machinecode.intellij.ceylon.lang.psi.impl;

import io.machinecode.intellij.ceylon.lang.psi.api.CeylonNamedArguments;
import com.intellij.lang.ASTNode;
import org.jetbrains.annotations.NotNull;

/**
 * @author Brent Douglas <brent.n.douglas@gmail.com>
 */
public class CeylonNamedArgumentsImpl extends CeylonElementImpl implements CeylonNamedArguments {
    public CeylonNamedArgumentsImpl(@NotNull ASTNode astNode) {
        super(astNode);
    }
}
