package au.com.machinecode.intellij.ceylon.lang.parser.parsers;

import com.intellij.lang.PsiBuilder;

import static au.com.machinecode.intellij.ceylon.lang.CeylonElementTypes.CLASS_INHERITANCE;

/**
 * @author Brent Douglas <brent.n.douglas@gmail.com>
 */
public class ClassInheritance {

    /*
     * ClassInheritance: CaseTypes? Metatypes? ExtendedType? SatisfiedTypes?
     */
    public static boolean parse(final PsiBuilder builder) {
        final PsiBuilder.Marker marker = builder.mark();

        CaseTypes.parse(builder);
        MetaTypes.parse(builder);
        AdaptedTypes.parse(builder);
        SatisfiedTypes.parse(builder);

        marker.done(CLASS_INHERITANCE);
        return true;
    }
}
