package io.machinecode.intellij.ceylon;

import com.intellij.lang.PsiParser;
import com.intellij.lexer.Lexer;
import io.machinecode.intellij.ceylon.lang.lexer.CeylonLexer;
import io.machinecode.intellij.ceylon.lang.parser.CeylonParserM1;

/**
 * @author Brent Douglas <brent.n.douglas@gmail.com>
 */
public enum CeylonLanguageLevel {
    M1(CeylonLexer.class, CeylonParserM1.INSTANCE),
    M2(CeylonLexer.class, CeylonParserM1.INSTANCE),
    M3(CeylonLexer.class, CeylonParserM1.INSTANCE),
    M4(CeylonLexer.class, CeylonParserM1.INSTANCE);

    public static final String PERSISTENT_STORE_NAME = "CeylonLanguageLevel";

    private final PsiParser parser;
    private final Class<? extends Lexer> lexer;

    private CeylonLanguageLevel(final Class<? extends Lexer> lexer, final PsiParser parser) {
        this.lexer = lexer;
        this.parser = parser;
    }

    public PsiParser getParser() {
        return parser;
    }

    public Lexer getLexer() {
        try {
            return lexer.newInstance();
        } catch (final Exception e) {
            throw new RuntimeException(e);
        }
    }
}
