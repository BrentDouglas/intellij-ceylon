package au.com.machinecode.intellij.ceylon.lang.parser.parsers;

import au.com.machinecode.intellij.ceylon.CeylonBundle;
import com.intellij.lang.PsiBuilder;

import static au.com.machinecode.intellij.ceylon.lang.CeylonElementTypes.IS_CONDITION;
import static au.com.machinecode.intellij.ceylon.lang.CeylonTokenTypes.IS_OP;

/**
 * @author Brent Douglas <brent.n.douglas@gmail.com>
 */
public class IsCondition {

    /*
     * IsCondition: "is" (TypedVariable Specifier | UnionType MemberName)
     */
    public static boolean parse(final PsiBuilder builder) {
        final PsiBuilder.Marker marker = builder.mark();

        if (!Util.find(builder, IS_OP)) {
            marker.rollbackTo();
            return false;
        }

        //TODO
        if (TypedVariable.parse(builder) && Specifier.parse(builder)) {
        } else if (UnionType.parse(builder) && MemberName.parse(builder)) {
        } else {
            builder.error(CeylonBundle.message("parser.typedvariableandspecifieroruniontypeandmembername.required"));
        }

        marker.done(IS_CONDITION);
        return true;
    }
}
