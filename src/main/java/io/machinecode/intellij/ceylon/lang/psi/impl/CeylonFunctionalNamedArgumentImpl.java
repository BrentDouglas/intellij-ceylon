package io.machinecode.intellij.ceylon.lang.psi.impl;

import io.machinecode.intellij.ceylon.lang.psi.api.CeylonFunctionalNamedArgument;
import com.intellij.lang.ASTNode;
import org.jetbrains.annotations.NotNull;

/**
 * @author Brent Douglas <brent.n.douglas@gmail.com>
 */
public class CeylonFunctionalNamedArgumentImpl extends CeylonElementImpl implements CeylonFunctionalNamedArgument {
    public CeylonFunctionalNamedArgumentImpl(@NotNull ASTNode astNode) {
        super(astNode);
    }
}
