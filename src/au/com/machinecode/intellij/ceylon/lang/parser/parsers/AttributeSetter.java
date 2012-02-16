package au.com.machinecode.intellij.ceylon.lang.parser.parsers;

import au.com.machinecode.intellij.ceylon.CeylonBundle;
import com.intellij.lang.PsiBuilder;

import static au.com.machinecode.intellij.ceylon.lang.CeylonElementTypes.ATTRIBUTE_SETTER;
import static au.com.machinecode.intellij.ceylon.lang.CeylonTokenTypes.ASSIGN;

/**
 * @author Brent Douglas <brent.n.douglas@gmail.com>
 */
public class AttributeSetter {

    /*
     * AttributeSetter: "assign" MemberName Block
     */
    public static boolean parse(final PsiBuilder builder) {
        final PsiBuilder.Marker marker = builder.mark();

        if (!Util.find(builder, ASSIGN)) {
            return false;
        }

        if (!MemberName.parse(builder)) {
            builder.error(CeylonBundle.message("parser.membername.required"));
        }

        if (!Block.parse(builder)) {
            builder.error(CeylonBundle.message("parser.block.required"));
        }

        marker.done(ATTRIBUTE_SETTER);
        return true;
    }
}
