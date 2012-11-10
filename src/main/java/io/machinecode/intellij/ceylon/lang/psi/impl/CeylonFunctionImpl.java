package io.machinecode.intellij.ceylon.lang.psi.impl;

import com.intellij.lang.ASTNode;
import io.machinecode.intellij.ceylon.lang.psi.api.CeylonFunction;
import org.jetbrains.annotations.NotNull;

/**
 * @author Brent Douglas <brent.n.douglas@gmail.com>
 */
public class CeylonFunctionImpl extends CeylonElementImpl implements CeylonFunction {
    public CeylonFunctionImpl(@NotNull ASTNode astNode) {
        super(astNode);
    }
}
