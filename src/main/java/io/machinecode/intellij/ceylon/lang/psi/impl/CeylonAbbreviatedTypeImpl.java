package io.machinecode.intellij.ceylon.lang.psi.impl;

import io.machinecode.intellij.ceylon.lang.psi.api.CeylonAbbreviatedType;
import com.intellij.lang.ASTNode;
import org.jetbrains.annotations.NotNull;

/**
 * @author Brent Douglas <brent.n.douglas@gmail.com>
 */
public class CeylonAbbreviatedTypeImpl extends CeylonElementImpl implements CeylonAbbreviatedType {

    public CeylonAbbreviatedTypeImpl(@NotNull ASTNode astNode) {
        super(astNode);
    }
}
