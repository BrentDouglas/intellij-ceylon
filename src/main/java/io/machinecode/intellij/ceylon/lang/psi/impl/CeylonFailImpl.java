package io.machinecode.intellij.ceylon.lang.psi.impl;

import io.machinecode.intellij.ceylon.lang.psi.api.CeylonFail;
import com.intellij.lang.ASTNode;
import org.jetbrains.annotations.NotNull;

/**
 * @author Brent Douglas <brent.n.douglas@gmail.com>
 */
public class CeylonFailImpl extends CeylonElementImpl implements CeylonFail {
    public CeylonFailImpl(@NotNull ASTNode astNode) {
        super(astNode);
    }
}
