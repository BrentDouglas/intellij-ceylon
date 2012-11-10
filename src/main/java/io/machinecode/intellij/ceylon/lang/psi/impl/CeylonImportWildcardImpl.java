package io.machinecode.intellij.ceylon.lang.psi.impl;

import io.machinecode.intellij.ceylon.lang.psi.api.CeylonImportWildcard;
import com.intellij.lang.ASTNode;
import org.jetbrains.annotations.NotNull;

/**
 * @author Brent Douglas <brent.n.douglas@gmail.com>
 */
public class CeylonImportWildcardImpl extends CeylonElementImpl implements CeylonImportWildcard {
    public CeylonImportWildcardImpl(@NotNull ASTNode astNode) {
        super(astNode);
    }
}
