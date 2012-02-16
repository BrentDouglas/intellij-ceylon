package au.com.machinecode.intellij.ceylon.lang.parser.parsers;

import com.intellij.lang.PsiBuilder;

import static au.com.machinecode.intellij.ceylon.lang.CeylonElementTypes.IMPORT_WILDCARD;
import static au.com.machinecode.intellij.ceylon.lang.CeylonTokenTypes.ELLIPSIS;

/**
 * @author Brent Douglas <brent.n.douglas@gmail.com>
 */
public class ImportWildcard {

    /*
     * ...
     */
    public static boolean parse(final PsiBuilder builder) {
        final PsiBuilder.Marker marker = builder.mark();

        if (!Util.find(builder, ELLIPSIS)) {
            return false;
        }

        marker.done(IMPORT_WILDCARD);
        return true;
    }
}
