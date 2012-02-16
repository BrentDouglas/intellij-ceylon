package au.com.machinecode.intellij.ceylon.lang.parser.parsers;

import au.com.machinecode.intellij.ceylon.CeylonBundle;
import com.intellij.lang.PsiBuilder;

import static au.com.machinecode.intellij.ceylon.lang.CeylonTokenTypes.CATCH_CLAUSE;
import static au.com.machinecode.intellij.ceylon.lang.CeylonTokenTypes.LPAREN;
import static au.com.machinecode.intellij.ceylon.lang.CeylonTokenTypes.RPAREN;

import static au.com.machinecode.intellij.ceylon.lang.CeylonElementTypes.CATCH;

/**
 * @author Brent Douglas <brent.n.douglas@gmail.com>
 */
public class Catch {

    /*
     * Catch: "catch" "(" Variable ")" Block
     */
    public static boolean parse(final PsiBuilder builder) {
        final PsiBuilder.Marker marker = builder.mark();

        if (!Util.find(builder, CATCH_CLAUSE)) {
            marker.rollbackTo();
            return false;
        }

        Util.require(builder, LPAREN, CeylonBundle.message("parser.lparen.required"));

        if (!Variable.parse(builder)) {
            builder.error(CeylonBundle.message("parser.variable.required"));
        }

        Util.require(builder, RPAREN, CeylonBundle.message("parser.rparen.required"));

        if (!Block.parse(builder)) {
            builder.error(CeylonBundle.message("parser.block.required"));
        }

        marker.done(CATCH);
        return true;
    }
}
