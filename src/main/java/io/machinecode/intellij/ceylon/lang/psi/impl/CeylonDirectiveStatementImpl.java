package io.machinecode.intellij.ceylon.lang.psi.impl;

import io.machinecode.intellij.ceylon.lang.psi.api.CeylonDirectiveStatement;
import com.intellij.lang.ASTNode;
import org.jetbrains.annotations.NotNull;

/**
 * @author Brent Douglas <brent.n.douglas@gmail.com>
 */
public class CeylonDirectiveStatementImpl extends CeylonElementImpl implements CeylonDirectiveStatement {
    public CeylonDirectiveStatementImpl(@NotNull ASTNode astNode) {
        super(astNode);
    }
}
