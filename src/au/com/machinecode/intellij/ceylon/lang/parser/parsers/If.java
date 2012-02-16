package au.com.machinecode.intellij.ceylon.lang.parser.parsers;

import au.com.machinecode.intellij.ceylon.CeylonBundle;
import com.intellij.lang.PsiBuilder;

import static au.com.machinecode.intellij.ceylon.lang.CeylonElementTypes.IF;
import static au.com.machinecode.intellij.ceylon.lang.CeylonTokenTypes.IF_CLAUSE;
import static au.com.machinecode.intellij.ceylon.lang.CeylonTokenTypes.LPAREN;
import static au.com.machinecode.intellij.ceylon.lang.CeylonTokenTypes.RPAREN;

/**
 * @author Brent Douglas <brent.n.douglas@gmail.com>
 */
public class If {

    /*
     * If: "if" "(" Condition ")" Block
     */
    public static boolean parse(final PsiBuilder builder) {
        final PsiBuilder.Marker marker = builder.mark();

        if (!Util.find(builder, IF_CLAUSE)) {
            marker.rollbackTo();
            return false;
        }

        Util.require(builder, LPAREN, CeylonBundle.message("parser.lparen.required"));

        if (!Condition.parse(builder)) {
            builder.error(CeylonBundle.message("parser.condition.required"));
        }

        Util.require(builder, RPAREN, CeylonBundle.message("parser.rparen.required"));

        if (!Block.parse(builder)) {
            builder.error(CeylonBundle.message("parser.block.required"));
        }

        marker.done(IF);
        return true;
    }
}
