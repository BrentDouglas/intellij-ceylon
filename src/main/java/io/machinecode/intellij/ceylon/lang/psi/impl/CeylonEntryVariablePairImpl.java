package io.machinecode.intellij.ceylon.lang.psi.impl;

import io.machinecode.intellij.ceylon.lang.psi.api.CeylonEntryVariablePair;
import com.intellij.lang.ASTNode;
import org.jetbrains.annotations.NotNull;

/**
 * @author Brent Douglas <brent.n.douglas@gmail.com>
 */
public class CeylonEntryVariablePairImpl extends CeylonElementImpl implements CeylonEntryVariablePair {
    public CeylonEntryVariablePairImpl(@NotNull ASTNode astNode) {
        super(astNode);
    }
}
