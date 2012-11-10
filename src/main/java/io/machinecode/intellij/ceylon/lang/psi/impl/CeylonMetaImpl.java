package io.machinecode.intellij.ceylon.lang.psi.impl;

import io.machinecode.intellij.ceylon.lang.psi.api.CeylonMeta;
import com.intellij.lang.ASTNode;
import org.jetbrains.annotations.NotNull;

/**
 * @author Brent Douglas <brent.n.douglas@gmail.com>
 */
public class CeylonMetaImpl extends CeylonElementImpl implements CeylonMeta {
    public CeylonMetaImpl(@NotNull ASTNode astNode) {
        super(astNode);
    }
}
