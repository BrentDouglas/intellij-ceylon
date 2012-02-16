package au.com.machinecode.intellij.ceylon.lang.parser.parsers;

import com.intellij.lang.PsiBuilder;

import static au.com.machinecode.intellij.ceylon.lang.CeylonElementTypes.ATTRIBUTE;

/**
 * @author Brent Douglas <brent.n.douglas@gmail.com>
 */
public class Attribute {

    /*
     * Attribute: Annotation* (SimpleAttribute | AttributeGetter | AttributeSetter)
     */
    public static boolean parse(final PsiBuilder builder) {
        final PsiBuilder.Marker marker = builder.mark();

        while (Annotation.parse(builder));

        if (SimpleAttribute.parse(builder)) {
        } else if (AttributeGetter.parse(builder)) {
        } else if (AttributeSetter.parse(builder)) {
        } else {
            marker.rollbackTo();
            return false;
        }

        marker.done(ATTRIBUTE);

        return true;
    }
}
