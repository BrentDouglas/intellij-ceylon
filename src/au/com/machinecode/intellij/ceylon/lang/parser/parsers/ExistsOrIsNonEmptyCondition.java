package au.com.machinecode.intellij.ceylon.lang.parser.parsers;

import au.com.machinecode.intellij.ceylon.CeylonBundle;
import com.intellij.lang.PsiBuilder;

import static au.com.machinecode.intellij.ceylon.lang.CeylonElementTypes.EXISTS_OR_IS_NONEMPTY_CONDITION;
import static au.com.machinecode.intellij.ceylon.lang.CeylonTokenTypes.EXISTS;
import static au.com.machinecode.intellij.ceylon.lang.CeylonTokenTypes.NONEMPTY;

/**
 * @author Brent Douglas <brent.n.douglas@gmail.com>
 */
public class ExistsOrIsNonEmptyCondition {

    /*
     * ExistsOrNonemptyCondition: ("exists" | "nonempty") (Variable Specifier | MemberName)
     */
    public static boolean parse(final PsiBuilder builder) {
        final PsiBuilder.Marker marker = builder.mark();

        if (Util.find(builder, EXISTS)) {
        } else if (Util.find(builder, NONEMPTY)) {
        } else {
            marker.rollbackTo();
            return false;
        }

        //TODO
        if (Variable.parse(builder) && Specifier.parse(builder)) {
        } else if (MemberName.parse(builder)) {
        } else {
            builder.error(CeylonBundle.message("parser.variableandspecifierormembername.required"));
        }

        marker.done(EXISTS_OR_IS_NONEMPTY_CONDITION);
        return true;
    }
}
