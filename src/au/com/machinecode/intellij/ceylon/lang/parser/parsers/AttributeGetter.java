package au.com.machinecode.intellij.ceylon.lang.parser.parsers;

import au.com.machinecode.intellij.ceylon.CeylonBundle;
import com.intellij.lang.PsiBuilder;

import static au.com.machinecode.intellij.ceylon.lang.CeylonElementTypes.ATTRIBUTE_GETTER;

/**
 * @author Brent Douglas <brent.n.douglas@gmail.com>
 */
public class AttributeGetter {

    /*
     * AttributeGetter: AttributeHeader Block
     */
    public static boolean parse(final PsiBuilder builder) {
        final PsiBuilder.Marker marker = builder.mark();

        if (!AttributeHeader.parse(builder)) {
            marker.rollbackTo();
            return false;
        }

        if (!Block.parse(builder)) {
            builder.error(CeylonBundle.message("parser.block.required"));
        }

        marker.done(ATTRIBUTE_GETTER);
        return true;
    }
}
