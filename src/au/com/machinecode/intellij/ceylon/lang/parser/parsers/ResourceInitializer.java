package au.com.machinecode.intellij.ceylon.lang.parser.parsers;

import com.intellij.lang.PsiBuilder;

import static au.com.machinecode.intellij.ceylon.lang.CeylonElementTypes.RESOURCE_INITIALIZER;

/**
 * @author Brent Douglas <brent.n.douglas@gmail.com>
 */
public class ResourceInitializer {

    /*
     * ResourceInitializer: InitializerReference Arguments
     */

    public static boolean parse(final PsiBuilder builder) {
        final PsiBuilder.Marker marker = builder.mark();

        if (!InitializerReference.parse(builder)) {
        } else if (!Arguments.parse(builder)) {
        } else {
            marker.rollbackTo();
            return false;
        }

        marker.done(RESOURCE_INITIALIZER);
        return true;
    }
}
