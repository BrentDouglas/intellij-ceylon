package io.machinecode.intellij.ceylon.lang.psi.impl;

import io.machinecode.intellij.ceylon.lang.psi.api.CeylonInvocation;
import com.intellij.lang.ASTNode;
import org.jetbrains.annotations.NotNull;

/**
 * @author Brent Douglas <brent.n.douglas@gmail.com>
 */
public class CeylonInvocationImpl extends CeylonElementImpl implements CeylonInvocation {
    public CeylonInvocationImpl(@NotNull ASTNode astNode) {
        super(astNode);
    }
}
