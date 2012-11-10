package io.machinecode.intellij.ceylon.lang.psi.impl;

import io.machinecode.intellij.ceylon.lang.psi.api.CeylonSpecification;
import com.intellij.lang.ASTNode;
import org.jetbrains.annotations.NotNull;

/**
 * @author Brent Douglas <brent.n.douglas@gmail.com>
 */
public class CeylonSpecificationImpl extends CeylonElementImpl implements CeylonSpecification {
    public CeylonSpecificationImpl(@NotNull ASTNode astNode) {
        super(astNode);
    }
}
