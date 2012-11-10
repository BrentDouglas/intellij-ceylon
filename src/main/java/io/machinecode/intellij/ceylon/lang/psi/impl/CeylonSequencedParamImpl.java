package io.machinecode.intellij.ceylon.lang.psi.impl;

import io.machinecode.intellij.ceylon.lang.psi.api.CeylonSequencedParam;
import com.intellij.lang.ASTNode;
import org.jetbrains.annotations.NotNull;

/**
 * @author Brent Douglas <brent.n.douglas@gmail.com>
 */
public class CeylonSequencedParamImpl extends CeylonElementImpl implements CeylonSequencedParam {
    public CeylonSequencedParamImpl(@NotNull ASTNode astNode) {
        super(astNode);
    }
}
