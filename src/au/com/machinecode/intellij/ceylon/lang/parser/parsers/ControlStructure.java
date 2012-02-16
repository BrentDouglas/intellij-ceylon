package au.com.machinecode.intellij.ceylon.lang.parser.parsers;

import com.intellij.lang.PsiBuilder;

import static au.com.machinecode.intellij.ceylon.lang.CeylonElementTypes.CONTROL_STRUCTURE;
//import static au.com.machinecode.intellij.ceylon.lang.CeylonTokenTypes.*;

/**
 * @author Brent Douglas <brent.n.douglas@gmail.com>
 */
public class ControlStructure {

    /*
     * ControlStructure: IfElse | SwitchCaseElse | While | ForFail | TryCatchFinally
     */
    public static boolean parse(final PsiBuilder builder) {
        final PsiBuilder.Marker marker = builder.mark();

        if (IfElse.parse(builder)) {
        } else if (SwitchCaseWhile.parse(builder)) {
        } else if (While.parse(builder)) {
        } else if (ForFail.parse(builder)) {
        } else if (TryCatchFinally.parse(builder)) {
        } else {
            marker.rollbackTo();
            return false;
        }

        marker.done(CONTROL_STRUCTURE);
        return true;
    }
}
