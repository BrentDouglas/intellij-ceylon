package io.machinecode.intellij.ceylon.lang.psi.impl;

import io.machinecode.intellij.ceylon.lang.psi.api.CeylonSatisfiesCase;
import com.intellij.lang.ASTNode;
import org.jetbrains.annotations.NotNull;

/**
 * @author Brent Douglas <brent.n.douglas@gmail.com>
 */
public class CeylonSatisfiesCaseImpl extends CeylonElementImpl implements CeylonSatisfiesCase {
    public CeylonSatisfiesCaseImpl(@NotNull ASTNode astNode) {
        super(astNode);
    }
}
