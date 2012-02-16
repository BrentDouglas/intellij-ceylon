package au.com.machinecode.intellij.ceylon.lang.parser.parsers;

import com.intellij.lang.PsiBuilder;

import static au.com.machinecode.intellij.ceylon.lang.CeylonElementTypes.STATEMENT;

/**
 * @author Brent Douglas <brent.n.douglas@gmail.com>
 */
public class Statement {

    /*
     * Statement: ExpressionStatement | Specification | DirectiveStatement | ControlStructure
     */
    public static boolean parse(final PsiBuilder builder) {
        final PsiBuilder.Marker marker = builder.mark();

        if (ExpressionStatement.parse(builder)) {
        } else if (Specification.parse(builder)) {
        } else if(DirectiveStatement.parse(builder)) {
        } else if (ControlStructure.parse(builder)) {
        } else {
            marker.rollbackTo();
            return false;
        }

        marker.done(STATEMENT);
        return true;
    }
}
