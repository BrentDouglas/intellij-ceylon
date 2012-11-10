package io.machinecode.intellij.ceylon.lang.psi.impl;

import io.machinecode.intellij.ceylon.lang.psi.api.CeylonUnionType;
import com.intellij.lang.ASTNode;
import org.jetbrains.annotations.NotNull;

/**
 * @author Brent Douglas <brent.n.douglas@gmail.com>
 */
public class CeylonUnionTypeImpl extends CeylonElementImpl implements CeylonUnionType {
    public CeylonUnionTypeImpl(@NotNull ASTNode astNode) {
        super(astNode);
    }
}
