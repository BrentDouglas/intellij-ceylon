package io.machinecode.intellij.ceylon.lang.psi.impl;

import io.machinecode.intellij.ceylon.lang.psi.api.CeylonCaseTypes;
import com.intellij.lang.ASTNode;
import org.jetbrains.annotations.NotNull;

/**
 * @author Brent Douglas <brent.n.douglas@gmail.com>
 */
public class CeylonCaseTypesImpl extends CeylonElementImpl implements CeylonCaseTypes {
    public CeylonCaseTypesImpl(@NotNull ASTNode astNode) {
        super(astNode);
    }
}
