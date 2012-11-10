package io.machinecode.intellij.ceylon.lang.psi.impl;

import io.machinecode.intellij.ceylon.lang.psi.api.CeylonMethodMeta;
import com.intellij.lang.ASTNode;
import org.jetbrains.annotations.NotNull;

/**
 * @author Brent Douglas <brent.n.douglas@gmail.com>
 */
public class CeylonMethodMetaImpl extends CeylonElementImpl implements CeylonMethodMeta {
    public CeylonMethodMetaImpl(@NotNull ASTNode astNode) {
        super(astNode);
    }
}
