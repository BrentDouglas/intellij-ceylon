package au.com.machinecode.intellij.ceylon.lang.parser.parsers;

import au.com.machinecode.intellij.ceylon.CeylonBundle;
import com.intellij.lang.PsiBuilder;

import static au.com.machinecode.intellij.ceylon.lang.CeylonElementTypes.CALLABLE_VARIABLE;
import static au.com.machinecode.intellij.ceylon.lang.CeylonTokenTypes.VOID_MODIFIER;

/**
 * @author Brent Douglas <brent.n.douglas@gmail.com>
 */
public class CallableVariable {

    /*
     * CallableVariable: (UnionType | "void")? MemberName Params+
     */
    public static boolean parse(final PsiBuilder builder) {
        final PsiBuilder.Marker marker = builder.mark();

        if (UnionType.parse(builder) || Util.find(builder, VOID_MODIFIER));

        if (!MemberName.parse(builder)) {
            builder.error(CeylonBundle.message("parser.membername.required"));
        }

        if (Params.parse(builder)) {
            while (Params.parse(builder));
        } else {
            builder.error(CeylonBundle.message("parser.params.required"));
        }

        marker.done(CALLABLE_VARIABLE);
        return true;
    }
}
