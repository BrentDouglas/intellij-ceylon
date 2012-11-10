package io.machinecode.intellij.ceylon.lang.psi.impl;

import io.machinecode.intellij.ceylon.lang.psi.api.CeylonObjectHeader;
import com.intellij.lang.ASTNode;
import org.jetbrains.annotations.NotNull;

/**
 * @author Brent Douglas <brent.n.douglas@gmail.com>
 */
public class CeylonObjectHeaderImpl extends CeylonElementImpl implements CeylonObjectHeader {
    public CeylonObjectHeaderImpl(@NotNull ASTNode astNode) {
        super(astNode);
    }
}
