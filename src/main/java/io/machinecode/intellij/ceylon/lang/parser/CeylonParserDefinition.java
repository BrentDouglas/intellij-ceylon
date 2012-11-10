package io.machinecode.intellij.ceylon.lang.parser;

import com.intellij.ide.util.PropertiesComponent;
import io.machinecode.intellij.ceylon.CeylonLanguageLevel;
import io.machinecode.intellij.ceylon.lang.lexer.CeylonLexer;
import io.machinecode.intellij.ceylon.lang.lexer.CeylonTokenSets;
import io.machinecode.intellij.ceylon.lang.psi.CeylonPsiCreator;
import io.machinecode.intellij.ceylon.lang.psi.impl.CeylonCompilationUnitImpl;
import io.machinecode.intellij.ceylon.lang.psi.stub.CeylonStubFileElementType;
import com.intellij.lang.ASTNode;
import com.intellij.lang.LanguageUtil;
import com.intellij.lang.ParserDefinition;
import com.intellij.lang.PsiParser;
import com.intellij.lexer.Lexer;
import com.intellij.openapi.project.Project;
import com.intellij.psi.FileViewProvider;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiFile;
import com.intellij.psi.tree.IFileElementType;
import com.intellij.psi.tree.IStubFileElementType;
import com.intellij.psi.tree.TokenSet;
import org.jetbrains.annotations.NotNull;

/**
 * @author Brent Douglas <brent.n.douglas@gmail.com>
 */
public class CeylonParserDefinition implements ParserDefinition {
    public static final IStubFileElementType CEYLON_FILE = new CeylonStubFileElementType();

    @NotNull
    public Lexer createLexer(final Project project) {
        return CeylonLanguageLevel.valueOf(
                PropertiesComponent.getInstance(project).getValue(
                        CeylonLanguageLevel.PERSISTENT_STORE_NAME, CeylonLanguageLevel.M4.name()
                )
        ).getLexer();
    }

    public PsiParser createParser(final Project project) {
        return CeylonLanguageLevel.valueOf(
                PropertiesComponent.getInstance(project).getValue(
                        CeylonLanguageLevel.PERSISTENT_STORE_NAME, CeylonLanguageLevel.M4.name()
                )
        ).getParser();
    }

    public IFileElementType getFileNodeType() {
        return CEYLON_FILE;
    }

    @NotNull
    public TokenSet getWhitespaceTokens() {
        return CeylonTokenSets.WHITE_SPACE_TOKENS;
    }

    @NotNull
    public TokenSet getCommentTokens() {
        return CeylonTokenSets.COMMENT_TOKENS;
    }

    @NotNull
    public TokenSet getStringLiteralElements() {
        return CeylonTokenSets.STRING_LITERAL_TOKENS;
    }

    @NotNull
    public PsiElement createElement(final ASTNode node) {
        return CeylonPsiCreator.createElement(node);
    }

    public PsiFile createFile(final FileViewProvider viewProvider) {
        return new CeylonCompilationUnitImpl(viewProvider);
    }

    public SpaceRequirements spaceExistanceTypeBetweenTokens(final ASTNode left, final ASTNode right) {
        return LanguageUtil.canStickTokensTogetherByLexer(left, right, new CeylonLexer());
    }
}
