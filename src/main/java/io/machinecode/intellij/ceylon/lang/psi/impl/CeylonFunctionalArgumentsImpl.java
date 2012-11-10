package io.machinecode.intellij.ceylon.lang.psi.impl;

import io.machinecode.intellij.ceylon.lang.psi.api.CeylonFunctionalArguments;
import com.intellij.lang.ASTNode;
import org.jetbrains.annotations.NotNull;

/**
 * @author Brent Douglas <brent.n.douglas@gmail.com>
 */
public class CeylonFunctionalArgumentsImpl extends CeylonElementImpl implements CeylonFunctionalArguments {
    public CeylonFunctionalArgumentsImpl(@NotNull ASTNode astNode) {
        super(astNode);
    }
}
