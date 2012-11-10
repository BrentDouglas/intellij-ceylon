package io.machinecode.intellij.ceylon.lang.psi.impl;

import io.machinecode.intellij.ceylon.lang.psi.api.CeylonAdaptedTypes;
import com.intellij.lang.ASTNode;
import org.jetbrains.annotations.NotNull;

/**
 * @author Brent Douglas <brent.n.douglas@gmail.com>
 */
public class CeylonAdaptedTypesImpl extends CeylonElementImpl implements CeylonAdaptedTypes {

    public CeylonAdaptedTypesImpl(@NotNull ASTNode astNode) {
        super(astNode);
    }

}
