package io.machinecode.intellij.ceylon.lang.psi.impl;

import io.machinecode.intellij.ceylon.lang.psi.api.CeylonDefaultCaseItem;
import com.intellij.lang.ASTNode;
import org.jetbrains.annotations.NotNull;

/**
 * @author Brent Douglas <brent.n.douglas@gmail.com>
 */
public class CeylonDefaultCaseItemImpl extends CeylonElementImpl implements CeylonDefaultCaseItem {
    public CeylonDefaultCaseItemImpl(@NotNull ASTNode astNode) {
        super(astNode);
    }
}
