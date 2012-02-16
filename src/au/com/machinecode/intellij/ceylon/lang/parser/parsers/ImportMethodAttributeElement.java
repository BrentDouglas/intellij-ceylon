package au.com.machinecode.intellij.ceylon.lang.parser.parsers;

import com.intellij.lang.PsiBuilder;

import static au.com.machinecode.intellij.ceylon.lang.CeylonElementTypes.IMPORT_METHOD_ATTRIBUTE_ELEMENT;

/**
 * @author Brent Douglas <brent.n.douglas@gmail.com>
 */
public class ImportMethodAttributeElement {

    /*
     * ImportMethodAttributeElement: MethodAttributeAlias? MemberName
     */
    public static boolean parse(final PsiBuilder builder) {
        final PsiBuilder.Marker marker = builder.mark();

        MethodAttributeAlias.parse(builder);

        if (!MemberName.parse(builder)) {
            marker.rollbackTo();
            return false;
        }

        marker.done(IMPORT_METHOD_ATTRIBUTE_ELEMENT);

        return true;
    }
}
