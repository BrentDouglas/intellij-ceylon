package au.com.machinecode.intellij.ceylon.lang.parser.parsers;

import au.com.machinecode.intellij.ceylon.CeylonBundle;
import com.intellij.lang.PsiBuilder;

import static au.com.machinecode.intellij.ceylon.lang.CeylonElementTypes.LOOP_CONDITION;
import static au.com.machinecode.intellij.ceylon.lang.CeylonTokenTypes.LPAREN;
import static au.com.machinecode.intellij.ceylon.lang.CeylonTokenTypes.RPAREN;
import static au.com.machinecode.intellij.ceylon.lang.CeylonTokenTypes.WHILE_CLAUSE;

/**
 * @author Brent Douglas <brent.n.douglas@gmail.com>
 */
public class LoopCondition {

    /*
     * LoopCondition: "while" "(" Condition ")"
     */
    public static boolean parse(final PsiBuilder builder) {
        final PsiBuilder.Marker marker = builder.mark();

        if (!Util.find(builder, WHILE_CLAUSE)) {
            marker.rollbackTo();
            return false;
        }

        Util.require(builder, LPAREN, CeylonBundle.message("parser.lparen.required"));

        if (!Condition.parse(builder)) {
            builder.error(CeylonBundle.message("parser.condition.required"));
        }

        Util.require(builder, RPAREN, CeylonBundle.message("parser.rparen.required"));

        marker.done(LOOP_CONDITION);
        return true;
    }
}
