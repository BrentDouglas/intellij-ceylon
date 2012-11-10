package io.machinecode.intellij.ceylon.lang.psi.impl;

import io.machinecode.intellij.ceylon.lang.psi.api.CeylonTry;
import com.intellij.lang.ASTNode;
import org.jetbrains.annotations.NotNull;

/**
 * @author Brent Douglas <brent.n.douglas@gmail.com>
 */
public class CeylonTryImpl extends CeylonElementImpl implements CeylonTry {
    public CeylonTryImpl(@NotNull ASTNode astNode) {
        super(astNode);
    }
}
