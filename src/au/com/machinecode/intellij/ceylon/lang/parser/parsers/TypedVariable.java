package au.com.machinecode.intellij.ceylon.lang.parser.parsers;

import au.com.machinecode.intellij.ceylon.CeylonBundle;
import com.intellij.lang.PsiBuilder;

import static au.com.machinecode.intellij.ceylon.lang.CeylonElementTypes.TYPED_VARIABLE;

/**
 * @author Brent Douglas <brent.n.douglas@gmail.com>
 */
public class TypedVariable {

    /*
     * TypedVariable: UnionType MemberName
     */
    public static boolean parse(final PsiBuilder builder) {
        final PsiBuilder.Marker marker = builder.mark();

        if (!UnionType.parse(builder)) {
            marker.rollbackTo();
            return false;
        }

        if (!MemberName.parse(builder)) {
            builder.error(CeylonBundle.message("parser.membername.required"));
        }

        marker.done(TYPED_VARIABLE);
        return true;
    }
}
