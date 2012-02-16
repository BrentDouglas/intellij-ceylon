package au.com.machinecode.intellij.ceylon.lang.parser.parsers;

import au.com.machinecode.intellij.ceylon.CeylonBundle;
import com.intellij.lang.PsiBuilder;

import static au.com.machinecode.intellij.ceylon.lang.CeylonElementTypes.METHOD;
import static au.com.machinecode.intellij.ceylon.lang.CeylonTokenTypes.SEMICOLON;

/**
 * @author Brent Douglas <brent.n.douglas@gmail.com>
 */
public class Method {

    /*
     * Method: Annotation* MethodHeader (Block | NamedArguments | Specifier? ";")
     */
    public static boolean parse(final PsiBuilder builder) {
        final PsiBuilder.Marker marker = builder.mark();

        while (Annotation.parse(builder));

        if (!MethodHeader.parse(builder)) {
            marker.rollbackTo();
            return false;
        }

        if (Block.parse(builder)) {

        } else if (NamedArguments.parse(builder)) {

        } else {
            Specifier.parse(builder);
            if (!Util.require(builder, SEMICOLON, CeylonBundle.message("parser.semicolon.required"))) {
                builder.error(CeylonBundle.message("parser.blockornamedargumentsorspecifierandsemicolon.required"));
            }
        }

        marker.done(METHOD);
        return true;
    }
}
