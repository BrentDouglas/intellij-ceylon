package io.machinecode.intellij.ceylon.lang.psi.impl;

import io.machinecode.intellij.ceylon.lang.psi.api.CeylonImportElements;
import com.intellij.lang.ASTNode;
import org.jetbrains.annotations.NotNull;

/**
 * @author Brent Douglas <brent.n.douglas@gmail.com>
 */
public class CeylonImportElementsImpl extends CeylonElementImpl implements CeylonImportElements {
    public CeylonImportElementsImpl(@NotNull ASTNode astNode) {
        super(astNode);
    }
}
