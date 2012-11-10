package io.machinecode.intellij.ceylon.lang.psi.impl;

import io.machinecode.intellij.ceylon.lang.psi.api.CeylonCase;
import com.intellij.lang.ASTNode;
import org.jetbrains.annotations.NotNull;

/**
 * @author Brent Douglas <brent.n.douglas@gmail.com>
 */
public class CeylonCaseImpl extends CeylonElementImpl implements CeylonCase {
    public CeylonCaseImpl(@NotNull ASTNode astNode) {
        super(astNode);
    }
}
