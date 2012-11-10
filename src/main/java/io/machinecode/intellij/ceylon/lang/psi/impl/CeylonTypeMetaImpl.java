package io.machinecode.intellij.ceylon.lang.psi.impl;

import io.machinecode.intellij.ceylon.lang.psi.api.CeylonTypeMeta;
import com.intellij.lang.ASTNode;
import org.jetbrains.annotations.NotNull;

/**
 * @author Brent Douglas <brent.n.douglas@gmail.com>
 */
public class CeylonTypeMetaImpl extends CeylonElementImpl implements CeylonTypeMeta {
    public CeylonTypeMetaImpl(@NotNull ASTNode astNode) {
        super(astNode);
    }
}
