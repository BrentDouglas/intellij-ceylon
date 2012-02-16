package au.com.machinecode.intellij.ceylon.lang.parser.parsers;

import au.com.machinecode.intellij.ceylon.CeylonBundle;
import com.intellij.lang.PsiBuilder;

import static au.com.machinecode.intellij.ceylon.lang.CeylonElementTypes.COMPILATION_UNIT;

/**
 * @author Brent Douglas <brent.n.douglas@gmail.com>
 */
public class CompilationUnit {

    /*
     * Import* ToplevelDeclaration+
     */
    public static boolean parse(final PsiBuilder builder) {
        final PsiBuilder.Marker marker = builder.mark();

        while (Import.parse(builder)) ;

        if (!TopLevelDeclaration.parse(builder)) {
            builder.error(CeylonBundle.message("parser.topleveldeclaration.required"));
        }

        while (TopLevelDeclaration.parse(builder));

        marker.done(COMPILATION_UNIT);

        return true;
    }

}
