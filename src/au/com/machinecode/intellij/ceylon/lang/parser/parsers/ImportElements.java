package au.com.machinecode.intellij.ceylon.lang.parser.parsers;

import au.com.machinecode.intellij.ceylon.CeylonBundle;
import com.intellij.lang.PsiBuilder;

import static au.com.machinecode.intellij.ceylon.lang.CeylonTokenTypes.COMMA;

import static au.com.machinecode.intellij.ceylon.lang.CeylonElementTypes.IMPORT_ELEMENTS;

/**
 * @author Brent Douglas <brent.n.douglas@gmail.com>
 */
public class ImportElements {

    /*
     * ImportElements: ImportElement ("," ImportElement)* ("," ImportWildcard)? | ImportWildcard
     */
    public static boolean parse(final PsiBuilder builder) {
        final PsiBuilder.Marker marker = builder.mark();
        if (ImportElement.parse(builder)) {
            while (Util.find(builder, COMMA)) {
                if (!ImportElement.parse(builder)) {
                    builder.error(CeylonBundle.message("parser.comma.required"));
                }
            }

            if (Util.find(builder, COMMA)) {
                if (!ImportWildcard.parse(builder)) {
                    builder.error(CeylonBundle.message("parser.comma.required"));
                }
            }
        } else {
            if (!ImportWildcard.parse(builder)) {
                marker.rollbackTo();
                return false;
            }
        }

        marker.done(IMPORT_ELEMENTS);

        return true;
    }
}
