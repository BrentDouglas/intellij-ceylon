package io.machinecode.intellij.ceylon.lang.psi.impl;

import io.machinecode.intellij.ceylon.lang.psi.api.CeylonImportTypeElement;
import com.intellij.lang.ASTNode;
import org.jetbrains.annotations.NotNull;

/**
 * @author Brent Douglas <brent.n.douglas@gmail.com>
 */
public class CeylonImportTypeElementImpl extends CeylonElementImpl implements CeylonImportTypeElement {
    public CeylonImportTypeElementImpl(@NotNull ASTNode astNode) {
        super(astNode);
    }
}
