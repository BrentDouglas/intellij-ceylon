package au.com.machinecode.intellij.ceylon.lang.parser.parsers;

import com.intellij.lang.PsiBuilder;

import static au.com.machinecode.intellij.ceylon.lang.CeylonElementTypes.IMPORT_ELEMENT;

/**
 * @author Brent Douglas <brent.n.douglas@gmail.com>
 */
public class ImportElement {

    /*
     * ImportElement: ImportTypeElement | ImportMethodAttributeElement
     */
    public static boolean parse(final PsiBuilder builder) {
        final PsiBuilder.Marker marker = builder.mark();

        if (ImportTypeElement.parse(builder)) {
        } else if (ImportMethodAttributeElement.parse(builder)) {
        } else {
            marker.rollbackTo();
            return false;
        }

        marker.done(IMPORT_ELEMENT);
        return true;
    }
}
