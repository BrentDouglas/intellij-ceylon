package au.com.machinecode.intellij.ceylon.lang.parser.parsers;

import com.intellij.lang.PsiBuilder;

import static au.com.machinecode.intellij.ceylon.lang.CeylonElementTypes.CASE;

/**
 * @author Brent Douglas <brent.n.douglas@gmail.com>
 */
public class Case {

    /*
     * Case: ExpressionCase | IsCase | SatisfiesCase
     */
    public static boolean parse(final PsiBuilder builder) {
        final PsiBuilder.Marker marker = builder.mark();

        if (ExpressionCase.parse(builder)) {
        } else if (IsCase.parse(builder)) {
        } else if (SatisfiesCase.parse(builder)) {
        } else {
            marker.rollbackTo();
            return false;
        }

        marker.done(CASE);
        return true;
    }
}
