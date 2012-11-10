package io.machinecode.intellij.ceylon.lang.psi.impl;

import io.machinecode.intellij.ceylon.lang.psi.api.CeylonImportElement;
import com.intellij.lang.ASTNode;
import org.jetbrains.annotations.NotNull;

/**
 * @author Brent Douglas <brent.n.douglas@gmail.com>
 */
public class CeylonImportElementImpl extends CeylonElementImpl implements CeylonImportElement {
    public CeylonImportElementImpl(@NotNull ASTNode astNode) {
        super(astNode);
    }
}
