package io.machinecode.intellij.ceylon.lang.psi.impl;

import io.machinecode.intellij.ceylon.lang.psi.api.CeylonSwitchCaseElse;
import com.intellij.lang.ASTNode;
import org.jetbrains.annotations.NotNull;

/**
 * @author Brent Douglas <brent.n.douglas@gmail.com>
 */
public class CeylonSwitchCaseElseImpl extends CeylonElementImpl implements CeylonSwitchCaseElse {
    public CeylonSwitchCaseElseImpl(@NotNull ASTNode astNode) {
        super(astNode);
    }
}
