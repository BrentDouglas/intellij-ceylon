package io.machinecode.intellij.ceylon.highlighter;

import com.intellij.openapi.fileTypes.SyntaxHighlighter;
import com.intellij.openapi.fileTypes.SyntaxHighlighterFactory;
import com.intellij.openapi.project.Project;
import com.intellij.openapi.vfs.VirtualFile;
import io.machinecode.intellij.ceylon.lang.lexer.CeylonHighlightingLexer;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * @author Brent Douglas <brent.n.douglas@gmail.com>
 */
public class CeylonSyntaxHighlighterFactory extends SyntaxHighlighterFactory {
    @NotNull
    @Override
    public SyntaxHighlighter getSyntaxHighlighter(@Nullable final Project project, @Nullable final VirtualFile virtualFile) {
        return new CeylonSyntaxHighlighter(new CeylonHighlightingLexer(project));
    }
}
