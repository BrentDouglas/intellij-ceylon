package io.machinecode.intellij.ceylon.lang.psi.impl;

import io.machinecode.intellij.ceylon.lang.psi.api.CeylonArguments;
import com.intellij.lang.ASTNode;
import org.jetbrains.annotations.NotNull;

/**
 * @author Brent Douglas <brent.n.douglas@gmail.com>
 */
public class CeylonArgumentsImpl extends CeylonElementImpl implements CeylonArguments {

    public CeylonArgumentsImpl(@NotNull ASTNode astNode) {
        super(astNode);
    }

}
