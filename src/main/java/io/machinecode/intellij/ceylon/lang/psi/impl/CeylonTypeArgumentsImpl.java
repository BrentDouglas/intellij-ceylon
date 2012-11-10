package io.machinecode.intellij.ceylon.lang.psi.impl;

import io.machinecode.intellij.ceylon.lang.psi.api.CeylonTypeArguments;
import com.intellij.lang.ASTNode;
import org.jetbrains.annotations.NotNull;

/**
 * @author Brent Douglas <brent.n.douglas@gmail.com>
 */
public class CeylonTypeArgumentsImpl extends CeylonElementImpl implements CeylonTypeArguments {
    public CeylonTypeArgumentsImpl(@NotNull ASTNode astNode) {
        super(astNode);
    }
}
