package io.machinecode.intellij.ceylon.lang.psi.impl;

import io.machinecode.intellij.ceylon.lang.psi.api.CeylonForIterator;
import com.intellij.lang.ASTNode;
import org.jetbrains.annotations.NotNull;

/**
 * @author Brent Douglas <brent.n.douglas@gmail.com>
 */
public class CeylonForIteratorImpl extends CeylonElementImpl implements CeylonForIterator {
    public CeylonForIteratorImpl(@NotNull ASTNode astNode) {
        super(astNode);
    }
}
