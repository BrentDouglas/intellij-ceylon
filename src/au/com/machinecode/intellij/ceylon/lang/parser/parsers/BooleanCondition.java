package au.com.machinecode.intellij.ceylon.lang.parser.parsers;

import com.intellij.lang.PsiBuilder;

import static au.com.machinecode.intellij.ceylon.lang.CeylonElementTypes.BOOLEAN_CONDITION;

/**
 * @author Brent Douglas <brent.n.douglas@gmail.com>
 */
public class BooleanCondition {

    /*
     * BooleanCondition: Expression
     */
    public static boolean parse(final PsiBuilder builder) {
        final PsiBuilder.Marker marker = builder.mark();

        if (!Expression.parse(builder)) {
            marker.rollbackTo();
            return false;
        }

        marker.done(BOOLEAN_CONDITION);
        return true;
    }
}
