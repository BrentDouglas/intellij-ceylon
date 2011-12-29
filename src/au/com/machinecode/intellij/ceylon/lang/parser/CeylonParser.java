package au.com.machinecode.intellij.ceylon.lang.parser;

import au.com.machinecode.intellij.ceylon.lang.parser.parsers.CompilationUnit;
import com.intellij.lang.ASTNode;
import com.intellij.lang.PsiBuilder;
import com.intellij.lang.PsiParser;
import com.intellij.psi.tree.IElementType;
import org.jetbrains.annotations.NotNull;

/**
 * @author Brent Douglas <brent.n.douglas@gmail.com>
 */
public class CeylonParser implements PsiParser {
    @NotNull
    public ASTNode parse(final IElementType root, final PsiBuilder builder) {
        final PsiBuilder.Marker marker = builder.mark();
        CompilationUnit.parse(builder);
        marker.done(root);
        return builder.getTreeBuilt();
    }
}
