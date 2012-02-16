package au.com.machinecode.intellij.ceylon.lang.parser.parsers;

import au.com.machinecode.intellij.ceylon.CeylonBundle;
import com.intellij.lang.PsiBuilder;

import static au.com.machinecode.intellij.ceylon.lang.CeylonElementTypes.DIRECTIVE_STATEMENT;
import static au.com.machinecode.intellij.ceylon.lang.CeylonTokenTypes.SEMICOLON;

/**
 * @author Brent Douglas <brent.n.douglas@gmail.com>
 */
public class DirectiveStatement {

    /*
     * DirectiveStatement: Directive ";"
     */
    public static boolean parse(final PsiBuilder builder) {
        final PsiBuilder.Marker marker = builder.mark();

        if (!Directive.parse(builder)) {
            marker.rollbackTo();
            return false;
        }

        Util.require(builder, SEMICOLON, CeylonBundle.message("parser.semicolon.required"));

        marker.done(DIRECTIVE_STATEMENT);
        return true;
    }
}
