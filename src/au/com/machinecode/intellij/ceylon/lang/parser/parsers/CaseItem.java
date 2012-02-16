package au.com.machinecode.intellij.ceylon.lang.parser.parsers;

import au.com.machinecode.intellij.ceylon.CeylonBundle;
import com.intellij.lang.PsiBuilder;

import static au.com.machinecode.intellij.ceylon.lang.CeylonElementTypes.CASE_ITEM;
import static au.com.machinecode.intellij.ceylon.lang.CeylonTokenTypes.CASE_CLAUSE;
import static au.com.machinecode.intellij.ceylon.lang.CeylonTokenTypes.LPAREN;
import static au.com.machinecode.intellij.ceylon.lang.CeylonTokenTypes.RPAREN;

/**
 * @author Brent Douglas <brent.n.douglas@gmail.com>
 */
public class CaseItem {

    /*
     * CaseItem: "case" "(" Case ")" Block
     */
    public static boolean parse(final PsiBuilder builder) {
        final PsiBuilder.Marker marker = builder.mark();

        if (!Util.find(builder, CASE_CLAUSE)) {
            marker.rollbackTo();
            return false;
        }

        Util.require(builder, LPAREN, CeylonBundle.message("parser.lparen.required"));

        if (!Case.parse(builder)) {
            builder.error(CeylonBundle.message("parser.expression.required"));
        }

        Util.require(builder, RPAREN, CeylonBundle.message("parser.rparen.required"));

        marker.done(CASE_ITEM);
        return true;
    }
}
