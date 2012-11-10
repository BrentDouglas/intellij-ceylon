package io.machinecode.intellij.ceylon.lang.psi.impl;

import io.machinecode.intellij.ceylon.lang.psi.api.CeylonSatisfiedTypes;
import com.intellij.lang.ASTNode;
import org.jetbrains.annotations.NotNull;

/**
 * @author Brent Douglas <brent.n.douglas@gmail.com>
 */
public class CeylonSatisfiedTypesImpl extends CeylonElementImpl implements CeylonSatisfiedTypes {
    public CeylonSatisfiedTypesImpl(@NotNull ASTNode astNode) {
        super(astNode);
    }
}
