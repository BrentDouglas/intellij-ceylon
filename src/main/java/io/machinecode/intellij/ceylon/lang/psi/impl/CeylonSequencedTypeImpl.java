package io.machinecode.intellij.ceylon.lang.psi.impl;

import io.machinecode.intellij.ceylon.lang.psi.api.CeylonSequencedType;
import com.intellij.lang.ASTNode;
import org.jetbrains.annotations.NotNull;

/**
 * @author Brent Douglas <brent.n.douglas@gmail.com>
 */
public class CeylonSequencedTypeImpl extends CeylonElementImpl implements CeylonSequencedType {
    public CeylonSequencedTypeImpl(@NotNull ASTNode astNode) {
        super(astNode);
    }
}
