package au.com.machinecode.intellij.ceylon.lang.parser.parsers;

import au.com.machinecode.intellij.ceylon.CeylonBundle;
import com.intellij.lang.PsiBuilder;

import static au.com.machinecode.intellij.ceylon.lang.CeylonElementTypes.SWITCH;
import static au.com.machinecode.intellij.ceylon.lang.CeylonTokenTypes.LPAREN;
import static au.com.machinecode.intellij.ceylon.lang.CeylonTokenTypes.RPAREN;
import static au.com.machinecode.intellij.ceylon.lang.CeylonTokenTypes.SWITCH_CLAUSE;

/**
 * @author Brent Douglas <brent.n.douglas@gmail.com>
 */
public class Switch {

    /*
     * Switch: "switch" "(" Expression ")"
     */
    public static boolean parse(final PsiBuilder builder) {
        final PsiBuilder.Marker marker = builder.mark();

        if (!Util.find(builder, SWITCH_CLAUSE)) {
            marker.rollbackTo();
            return false;
        }

        Util.require(builder, LPAREN, CeylonBundle.message("parser.lparen.required"));

        if (!Expression.parse(builder)) {
            builder.error(CeylonBundle.message("parser.expression.required"));
        }

        Util.require(builder, RPAREN, CeylonBundle.message("parser.rparen.required"));

        marker.done(SWITCH);
        return true;
    }
}
