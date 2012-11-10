package io.machinecode.intellij.ceylon.lang.psi.impl;

import io.machinecode.intellij.ceylon.lang.psi.api.CeylonMemberName;
import com.intellij.lang.ASTNode;
import org.jetbrains.annotations.NotNull;

/**
 * @author Brent Douglas <brent.n.douglas@gmail.com>
 */
public class CeylonMemberNameImpl extends CeylonElementImpl implements CeylonMemberName {
    public CeylonMemberNameImpl(@NotNull ASTNode astNode) {
        super(astNode);
    }
}
