package io.machinecode.intellij.ceylon.lang.psi.impl;

import io.machinecode.intellij.ceylon.lang.psi.api.CeylonSequenceInstantiation;
import com.intellij.lang.ASTNode;
import org.jetbrains.annotations.NotNull;

/**
 * @author Brent Douglas <brent.n.douglas@gmail.com>
 */
public class CeylonSequenceInstantiationImpl extends CeylonElementImpl implements CeylonSequenceInstantiation {
    public CeylonSequenceInstantiationImpl(@NotNull ASTNode astNode) {
        super(astNode);
    }
}
