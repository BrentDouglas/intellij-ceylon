package au.com.machinecode.intellij.ceylon.lang.parser.parsers;

import au.com.machinecode.intellij.ceylon.CeylonBundle;
import com.intellij.lang.PsiBuilder;

import static au.com.machinecode.intellij.ceylon.lang.CeylonElementTypes.ATTRIBUTE_HEADER;
import static au.com.machinecode.intellij.ceylon.lang.CeylonTokenTypes.VALUE_MODIFIER;

/**
 * @author Brent Douglas <brent.n.douglas@gmail.com>
 */
public class AttributeHeader {

    /*
     * AttributeHeader: (UnionType | "value") MemberName
     */
    public static boolean parse(final PsiBuilder builder) {
        final PsiBuilder.Marker marker = builder.mark();

        if (UnionType.parse(builder)) {
        } else if (Util.find(builder, VALUE_MODIFIER)) {
        } else {
            marker.rollbackTo();
            return false;
        }

        if (!MemberName.parse(builder)) {
            builder.error(CeylonBundle.message("parser.membername.required"));
        }

        marker.done(ATTRIBUTE_HEADER);
        return true;
    }
}
