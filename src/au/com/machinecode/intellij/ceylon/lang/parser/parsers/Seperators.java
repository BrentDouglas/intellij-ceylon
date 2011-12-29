package au.com.machinecode.intellij.ceylon.lang.parser.parsers;

import com.intellij.lang.PsiBuilder;

import static au.com.machinecode.intellij.ceylon.lang.CeylonTokenType.SEMICOLON;

/**
 * @author Brent Douglas <brent.n.douglas@gmail.com>
 */
public class Seperators {

    /**
     * Parses and discards token separators until the current token is not
     * a token seperator.
     *
     * @return true if a token separator was encountered
     * @return false otherwise
     */
    public static boolean parse(final PsiBuilder builder) {
        if (SEMICOLON.equals(builder.getTokenType())) {
            builder.advanceLexer();
            while(SEMICOLON.equals(builder.getTokenType())) {
                builder.advanceLexer();
            }
            return true;
        }
        return false;
    }
}
