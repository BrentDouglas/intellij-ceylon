package io.machinecode.intellij.ceylon.lang.psi.impl;

import io.machinecode.intellij.ceylon.lang.psi.api.CeylonAssignment;
import com.intellij.lang.ASTNode;
import org.jetbrains.annotations.NotNull;

/**
 * @author Brent Douglas <brent.n.douglas@gmail.com>
 */
public class CeylonAssignmentImpl extends CeylonElementImpl implements CeylonAssignment {
    public CeylonAssignmentImpl(@NotNull ASTNode astNode) {
        super(astNode);
    }

}
