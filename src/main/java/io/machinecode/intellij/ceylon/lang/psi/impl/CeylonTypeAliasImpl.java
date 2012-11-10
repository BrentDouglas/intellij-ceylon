package io.machinecode.intellij.ceylon.lang.psi.impl;

import io.machinecode.intellij.ceylon.lang.psi.api.CeylonTypeAlias;
import com.intellij.lang.ASTNode;
import org.jetbrains.annotations.NotNull;

/**
 * @author Brent Douglas <brent.n.douglas@gmail.com>
 */
public class CeylonTypeAliasImpl extends CeylonElementImpl implements CeylonTypeAlias {
    public CeylonTypeAliasImpl(@NotNull ASTNode astNode) {
        super(astNode);
    }
}
