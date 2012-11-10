package io.machinecode.intellij.ceylon.lang.psi.impl;

import io.machinecode.intellij.ceylon.lang.psi.api.CeylonControlStructure;
import com.intellij.lang.ASTNode;
import org.jetbrains.annotations.NotNull;

/**
 * @author Brent Douglas <brent.n.douglas@gmail.com>
 */
public class CeylonControlStructureImpl extends CeylonElementImpl implements CeylonControlStructure {
    public CeylonControlStructureImpl(@NotNull ASTNode astNode) {
        super(astNode);
    }
}
