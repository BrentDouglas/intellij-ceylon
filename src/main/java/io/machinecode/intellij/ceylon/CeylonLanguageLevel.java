package io.machinecode.intellij.ceylon;

import com.intellij.lang.PsiParser;
import com.intellij.lexer.FlexLexer;
import com.intellij.lexer.Lexer;
import io.machinecode.intellij.ceylon.lang.lexer.CeylonLexer;
import io.machinecode.intellij.ceylon.lang.lexer._CeylonLexerM1;
import io.machinecode.intellij.ceylon.lang.lexer._CeylonLexerM2;
import io.machinecode.intellij.ceylon.lang.lexer._CeylonLexerM3;
import io.machinecode.intellij.ceylon.lang.lexer._CeylonLexerM4;
import io.machinecode.intellij.ceylon.lang.parser.CeylonParserM1;
import io.machinecode.intellij.ceylon.lang.parser.CeylonParserM2;
import io.machinecode.intellij.ceylon.lang.parser.CeylonParserM3;
import io.machinecode.intellij.ceylon.lang.parser.CeylonParserM4;

import java.io.Reader;

/**
 * @author Brent Douglas <brent.n.douglas@gmail.com>
 */
public enum CeylonLanguageLevel {
    M1(_CeylonLexerM1.class, CeylonParserM1.INSTANCE),
    M2(_CeylonLexerM2.class, CeylonParserM2.INSTANCE),
    M3(_CeylonLexerM3.class, CeylonParserM3.INSTANCE),
    M4(_CeylonLexerM4.class, CeylonParserM4.INSTANCE);

    public static final String PERSISTENT_STORE_NAME = "CeylonLanguageLevel";

    private final PsiParser parser;
    private final Class<? extends FlexLexer> lexer;

    private CeylonLanguageLevel(final Class<? extends FlexLexer> lexer, final PsiParser parser) {
        this.lexer = lexer;
        this.parser = parser;
    }

    public PsiParser getParser() {
        return parser;
    }

    public Lexer getLexer() {
        try {
            return new CeylonLexer(lexer.getConstructor(Reader.class).newInstance((Reader) null));
        } catch (final Exception e) {
            throw new RuntimeException(e);
        }
    }
}
