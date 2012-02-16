package au.com.machinecode.intellij.ceylon.lang.parser.parsers;

import au.com.machinecode.intellij.ceylon.CeylonBundle;
import com.intellij.lang.PsiBuilder;

import static au.com.machinecode.intellij.ceylon.lang.CeylonElementTypes.SWITCH_CASE_ELSE;
import static au.com.machinecode.intellij.ceylon.lang.CeylonTokenTypes.LBRACE;
import static au.com.machinecode.intellij.ceylon.lang.CeylonTokenTypes.RBRACE;

/**
 * @author Brent Douglas <brent.n.douglas@gmail.com>
 */
public class SwitchCaseWhile {

    /*
     * SwitchCaseElse: Switch ( Cases | "{" Cases "}" )
     */
    public static boolean parse(final PsiBuilder builder) {
        final PsiBuilder.Marker marker = builder.mark();

        if (!Switch.parse(builder)) {
            marker.rollbackTo();
            return false;
        }

        //TODO:
        if (Cases.parse(builder)) {
        } else if (Util.find(builder, LBRACE) && Cases.parse(builder) && Util.find(builder, RBRACE)) {
        } else {
            builder.error(CeylonBundle.message("parser.caseorlbrace.required"));
        }

        marker.done(SWITCH_CASE_ELSE);
        return true;
    }
}
