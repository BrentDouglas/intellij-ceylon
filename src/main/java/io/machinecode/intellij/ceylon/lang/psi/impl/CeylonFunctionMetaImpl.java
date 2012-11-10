package io.machinecode.intellij.ceylon.lang.psi.impl;

import io.machinecode.intellij.ceylon.lang.psi.api.CeylonFunctionMeta;
import com.intellij.lang.ASTNode;
import org.jetbrains.annotations.NotNull;

/**
 * @author Brent Douglas <brent.n.douglas@gmail.com>
 */
public class CeylonFunctionMetaImpl extends CeylonElementImpl implements CeylonFunctionMeta {
    public CeylonFunctionMetaImpl(@NotNull ASTNode astNode) {
        super(astNode);
    }
}
