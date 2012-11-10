package io.machinecode.intellij.ceylon.lang.psi.impl;

import io.machinecode.intellij.ceylon.lang.psi.api.CeylonSequencedTypeParam;
import com.intellij.lang.ASTNode;
import org.jetbrains.annotations.NotNull;

/**
 * @author Brent Douglas <brent.n.douglas@gmail.com>
 */
public class CeylonSequencedTypeParamImpl extends CeylonElementImpl implements CeylonSequencedTypeParam {
    public CeylonSequencedTypeParamImpl(@NotNull ASTNode astNode) {
        super(astNode);
    }
}
