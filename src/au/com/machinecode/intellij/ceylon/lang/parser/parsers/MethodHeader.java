package au.com.machinecode.intellij.ceylon.lang.parser.parsers;

import au.com.machinecode.intellij.ceylon.CeylonBundle;
import com.intellij.lang.PsiBuilder;

import static au.com.machinecode.intellij.ceylon.lang.CeylonTokenTypes.FUNCTION_MODIFIER;
import static au.com.machinecode.intellij.ceylon.lang.CeylonTokenTypes.VOID_MODIFIER;

import static au.com.machinecode.intellij.ceylon.lang.CeylonElementTypes.METHOD_HEADER;

/**
 * @author Brent Douglas <brent.n.douglas@gmail.com>
 */
public class MethodHeader {

    /*
     * MethodHeader: (UnionType | "function" | "void") MemberName TypeParams? Params+ Metatypes? TypeConstraints?
     */
    public static boolean parse(final PsiBuilder builder) {
        final PsiBuilder.Marker marker = builder.mark();

        if (UnionType.parse(builder)) {
        } else if (Util.find(builder, FUNCTION_MODIFIER)) {
        } else if (Util.find(builder, VOID_MODIFIER)) {
        } else {
            marker.rollbackTo();
            return false;
        }

        if (!MemberName.parse(builder)) {
            builder.error(CeylonBundle.message("parser.membername.required"));
        }

        TypeParams.parse(builder);

        if (Params.parse(builder)) {
            while (Params.parse(builder));
        } else {
            builder.error(CeylonBundle.message("parser.params.required"));
        }

        MetaTypes.parse(builder);

        TypeConstraints.parse(builder);

        marker.done(METHOD_HEADER);
        return true;
    }
}
