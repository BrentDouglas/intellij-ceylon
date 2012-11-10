package io.machinecode.intellij.ceylon.lang.psi.impl;

import io.machinecode.intellij.ceylon.lang.psi.api.CeylonImport;
import com.intellij.lang.ASTNode;
import org.jetbrains.annotations.NotNull;

/**
 * @author Brent Douglas <brent.n.douglas@gmail.com>
 */
public class CeylonImportImpl extends CeylonElementImpl implements CeylonImport {
    public CeylonImportImpl(@NotNull ASTNode astNode) {
        super(astNode);
    }
}
