package io.machinecode.intellij.ceylon.lang.psi.impl;

import io.machinecode.intellij.ceylon.lang.psi.api.CeylonValueMeta;
import com.intellij.lang.ASTNode;
import org.jetbrains.annotations.NotNull;

/**
 * @author Brent Douglas <brent.n.douglas@gmail.com>
 */
public class CeylonValueMetaImpl extends CeylonElementImpl implements CeylonValueMeta {
    public CeylonValueMetaImpl(@NotNull ASTNode astNode) {
        super(astNode);
    }
}
