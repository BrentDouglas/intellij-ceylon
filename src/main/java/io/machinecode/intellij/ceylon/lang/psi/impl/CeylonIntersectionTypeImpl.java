package io.machinecode.intellij.ceylon.lang.psi.impl;

import io.machinecode.intellij.ceylon.lang.psi.api.CeylonIntersectionType;
import com.intellij.lang.ASTNode;
import org.jetbrains.annotations.NotNull;

/**
 * @author Brent Douglas <brent.n.douglas@gmail.com>
 */
public class CeylonIntersectionTypeImpl extends CeylonElementImpl implements CeylonIntersectionType {
    public CeylonIntersectionTypeImpl(@NotNull ASTNode astNode) {
        super(astNode);
    }
}
