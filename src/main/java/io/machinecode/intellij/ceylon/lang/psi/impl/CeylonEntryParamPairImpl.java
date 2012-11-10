package io.machinecode.intellij.ceylon.lang.psi.impl;

import io.machinecode.intellij.ceylon.lang.psi.api.CeylonEntryParamPair;
import com.intellij.lang.ASTNode;
import org.jetbrains.annotations.NotNull;

/**
 * @author Brent Douglas <brent.n.douglas@gmail.com>
 */
public class CeylonEntryParamPairImpl extends CeylonElementImpl implements CeylonEntryParamPair {
    public CeylonEntryParamPairImpl(@NotNull ASTNode astNode) {
        super(astNode);
    }

}
