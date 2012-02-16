package au.com.machinecode.intellij.ceylon.lang.parser.parsers;

import au.com.machinecode.intellij.ceylon.CeylonBundle;
import com.intellij.lang.PsiBuilder;

import static au.com.machinecode.intellij.ceylon.lang.CeylonElementTypes.EXPRESSION_STATEMENT;
import static au.com.machinecode.intellij.ceylon.lang.CeylonTokenTypes.SEMICOLON;

/**
 * @author Brent Douglas <brent.n.douglas@gmail.com>
 */
public class ExpressionStatement {

    /*
     * ExpressionStatement: ( Assignment | IncrementOrDecrement | Invocation ) ";"
     */
    public static boolean parse(final PsiBuilder builder) {
        final PsiBuilder.Marker marker = builder.mark();

        if (Assignment.parse(builder)) {
        } else if (IncrementOrDecrement.parse(builder)) {
        } else if (Invocation.parse(builder)) {
        } else {
            marker.rollbackTo();
            return false;
        }

        Util.require(builder, SEMICOLON, CeylonBundle.message("parser.semicolon.required"));

        marker.done(EXPRESSION_STATEMENT);
        return true;
    }
}
