package au.com.machinecode.intellij.ceylon.lang.parser.parsers;

import au.com.machinecode.intellij.ceylon.CeylonBundle;
import au.com.machinecode.intellij.ceylon.lang.parser.parsers.Expression;
import au.com.machinecode.intellij.ceylon.lang.parser.parsers.Util;
import com.intellij.lang.PsiBuilder;

import static au.com.machinecode.intellij.ceylon.lang.CeylonElementTypes.EXPRESSION_CASE;
import static au.com.machinecode.intellij.ceylon.lang.CeylonTokenTypes.COMMA;

/**
 * @author Brent Douglas <brent.n.douglas@gmail.com>
 */
public class ExpressionCase {

    /*
     * ExpressionCase: Expression ("," Expression)*
     */
    public static boolean parse(final PsiBuilder builder) {
        final PsiBuilder.Marker marker = builder.mark();

        if (!Expression.parse(builder)) {
            marker.rollbackTo();
            return false;
        }

        while (true) {
            if (!Util.find(builder, COMMA)) {
                break;
            }
            if (!Expression.parse(builder)) {
                builder.error(CeylonBundle.message("parser.expression.required"));
            }
        }

        marker.done(EXPRESSION_CASE);
        return true;
    }
}
