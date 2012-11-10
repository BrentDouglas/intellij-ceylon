package io.machinecode.intellij.ceylon.lang.psi.impl;

import io.machinecode.intellij.ceylon.lang.psi.api.CeylonMethod;
import com.intellij.lang.ASTNode;
import org.jetbrains.annotations.NotNull;

/**
 * @author Brent Douglas <brent.n.douglas@gmail.com>
 */
public class CeylonMethodImpl extends CeylonElementImpl implements CeylonMethod {
    public CeylonMethodImpl(@NotNull ASTNode astNode) {
        super(astNode);
    }
}
