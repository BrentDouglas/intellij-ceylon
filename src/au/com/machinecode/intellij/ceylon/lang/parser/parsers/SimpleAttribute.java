package au.com.machinecode.intellij.ceylon.lang.parser.parsers;

import au.com.machinecode.intellij.ceylon.CeylonBundle;
import com.intellij.lang.PsiBuilder;

import static au.com.machinecode.intellij.ceylon.lang.CeylonElementTypes.SIMPLE_ATTRIBUTE;
import static au.com.machinecode.intellij.ceylon.lang.CeylonTokenTypes.SEMICOLON;

/**
 * @author Brent Douglas <brent.n.douglas@gmail.com>
 */
public class SimpleAttribute {

    /*
     * SimpleAttribute: AttributeHeader ( (Specifier | Initializer)? ";" | NamedArguments )
     */
    public static boolean parse(final PsiBuilder builder) {
        final PsiBuilder.Marker marker = builder.mark();

        if (!AttributeHeader.parse(builder)) {
            marker.rollbackTo();
            return false;
        }

        if ((Specifier.parse(builder) || Initializer.parse(builder)) && Util.find(builder, SEMICOLON)) {
        } else if (NamedArguments.parse(builder)) {
        } else {
            builder.error(CeylonBundle.message("parser.specifierorinitializerwithsemicolonornamedarguments.required"));
        }

        marker.done(SIMPLE_ATTRIBUTE);
        return true;
    }
}
