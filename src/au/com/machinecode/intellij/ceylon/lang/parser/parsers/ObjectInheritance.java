package au.com.machinecode.intellij.ceylon.lang.parser.parsers;

import com.intellij.lang.PsiBuilder;

import static au.com.machinecode.intellij.ceylon.lang.CeylonElementTypes.OBJECT_INHERITANCE;

/**
 * @author Brent Douglas <brent.n.douglas@gmail.com>
 */
public class ObjectInheritance {

    /*
     * ObjectInheritance: ExtendedType? SatisfiedTypes?
     */
    public static boolean parse(final PsiBuilder builder) {
        final PsiBuilder.Marker marker = builder.mark();

        ExtendedType.parse(builder);

        SatisfiedTypes.parse(builder);

        marker.done(OBJECT_INHERITANCE);
        return true;
    }
}
