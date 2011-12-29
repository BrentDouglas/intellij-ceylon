package au.com.machinecode.intellij.ceylon.lang.parser.parsers;

import au.com.machinecode.intellij.ceylon.CeylonBundle;
import com.intellij.lang.PsiBuilder;

/**
 * @author Brent Douglas <brent.n.douglas@gmail.com>
 */
public class CompilationUnit {

    public static boolean parse(final PsiBuilder builder) {

        while (Import.parse(builder)) ;

        if (!TopLevelDeclaration.parse(builder)) {
            builder.mark().error(CeylonBundle.message("parser.compilationunit.required"));
            return false;
        }
        while (TopLevelDeclaration.parse(builder)) ;

        return true;
    }

}
