package io.machinecode.intellij.ceylon.lang.psi.impl;

import io.machinecode.intellij.ceylon.lang.psi.api.CeylonMethodHeader;
import com.intellij.lang.ASTNode;
import org.jetbrains.annotations.NotNull;

/**
 * @author Brent Douglas <brent.n.douglas@gmail.com>
 */
public class CeylonMethodHeaderImpl extends CeylonElementImpl implements CeylonMethodHeader {
    public CeylonMethodHeaderImpl(@NotNull ASTNode astNode) {
        super(astNode);
    }
}
