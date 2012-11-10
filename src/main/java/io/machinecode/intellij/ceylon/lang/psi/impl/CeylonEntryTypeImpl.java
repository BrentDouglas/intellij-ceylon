package io.machinecode.intellij.ceylon.lang.psi.impl;

import io.machinecode.intellij.ceylon.lang.psi.api.CeylonEntryType;
import com.intellij.lang.ASTNode;
import org.jetbrains.annotations.NotNull;

/**
 * @author Brent Douglas <brent.n.douglas@gmail.com>
 */
public class CeylonEntryTypeImpl extends CeylonElementImpl implements CeylonEntryType {
    public CeylonEntryTypeImpl(@NotNull ASTNode astNode) {
        super(astNode);
    }
}
