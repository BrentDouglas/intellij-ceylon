package au.com.machinecode.intellij.ceylon.lang.parser.parsers;

import com.intellij.lang.PsiBuilder;

import static au.com.machinecode.intellij.ceylon.lang.CeylonElementTypes.IMPORT_TYPE_ELEMENT;

/**
 * @author Brent Douglas <brent.n.douglas@gmail.com>
 */
public class ImportTypeElement {

    /*
     * ImportTypeElement: TypeAlias? TypeName
     */
    public static boolean parse(final PsiBuilder builder) {
        final PsiBuilder.Marker marker = builder.mark();

        TypeAlias.parse(builder);

        if (!TypeName.parse(builder)) {
            marker.rollbackTo();
            return false;
        }

        marker.done(IMPORT_TYPE_ELEMENT);
        return true;
    }
}
