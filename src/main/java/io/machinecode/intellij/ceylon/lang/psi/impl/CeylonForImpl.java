package io.machinecode.intellij.ceylon.lang.psi.impl;

import io.machinecode.intellij.ceylon.lang.psi.api.CeylonFor;
import com.intellij.lang.ASTNode;
import org.jetbrains.annotations.NotNull;

/**
 * @author Brent Douglas <brent.n.douglas@gmail.com>
 */
public class CeylonForImpl extends CeylonElementImpl implements CeylonFor {
    public CeylonForImpl(@NotNull ASTNode astNode) {
        super(astNode);
    }
}
