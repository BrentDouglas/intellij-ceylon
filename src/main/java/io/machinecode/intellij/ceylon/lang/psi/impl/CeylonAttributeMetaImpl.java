package io.machinecode.intellij.ceylon.lang.psi.impl;

import io.machinecode.intellij.ceylon.lang.psi.api.CeylonAttributeMeta;
import com.intellij.lang.ASTNode;
import org.jetbrains.annotations.NotNull;

/**
 * @author Brent Douglas <brent.n.douglas@gmail.com>
 */
public class CeylonAttributeMetaImpl extends CeylonElementImpl implements CeylonAttributeMeta {
    public CeylonAttributeMetaImpl(@NotNull ASTNode astNode) {
        super(astNode);
    }
}
