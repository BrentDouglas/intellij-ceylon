package au.com.machinecode.intellij.ceylon.lang.parser.parsers;

import au.com.machinecode.intellij.ceylon.CeylonBundle;
import com.intellij.lang.PsiBuilder;

import static au.com.machinecode.intellij.ceylon.lang.CeylonElementTypes.CLASS_BODY;
import static au.com.machinecode.intellij.ceylon.lang.CeylonTokenTypes.LBRACE;
import static au.com.machinecode.intellij.ceylon.lang.CeylonTokenTypes.RBRACE;

/**
 * @author Brent Douglas <brent.n.douglas@gmail.com>
 */
public class ClassBody {

    /*
     * ClassBody: "{" (Declaration | Statement)* "}"
     */
    public static boolean parse(final PsiBuilder builder) {
        final PsiBuilder.Marker marker = builder.mark();

        if (!Util.find(builder, LBRACE)) {
            return false;
        }

        while (Declaration.parse(builder) || Statement.parse(builder));

        Util.require(builder, RBRACE, CeylonBundle.message("parser.rbrace.required"));

        marker.done(CLASS_BODY);
        return true;
    }
}
