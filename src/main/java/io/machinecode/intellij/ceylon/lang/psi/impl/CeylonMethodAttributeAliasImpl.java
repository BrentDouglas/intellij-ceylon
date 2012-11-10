package io.machinecode.intellij.ceylon.lang.psi.impl;

import io.machinecode.intellij.ceylon.lang.psi.api.CeylonMethodAttributeAlias;
import com.intellij.lang.ASTNode;
import org.jetbrains.annotations.NotNull;

/**
 * @author Brent Douglas <brent.n.douglas@gmail.com>
 */
public class CeylonMethodAttributeAliasImpl extends CeylonElementImpl implements CeylonMethodAttributeAlias {
    public CeylonMethodAttributeAliasImpl(@NotNull ASTNode astNode) {
        super(astNode);
    }
}
