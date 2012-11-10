package io.machinecode.intellij.ceylon.lang.psi.impl;

import io.machinecode.intellij.ceylon.lang.psi.api.CeylonAnnotation;
import com.intellij.lang.ASTNode;
import org.jetbrains.annotations.NotNull;

/**
 * @author Brent Douglas <brent.n.douglas@gmail.com>
 */
public class CeylonAnnotationImpl extends CeylonElementImpl implements CeylonAnnotation {
    public CeylonAnnotationImpl(@NotNull ASTNode astNode) {
        super(astNode);
    }

}
