package io.machinecode.intellij.ceylon.lang.lexer;

import com.intellij.lexer.LayeredLexer;
import com.intellij.openapi.project.Project;
import io.machinecode.intellij.ceylon.lang.parser.CeylonParserDefinition;

/**
 * @author Brent Douglas <brent.n.douglas@gmail.com>
 */
public class CeylonHighlightingLexer extends LayeredLexer {
    public CeylonHighlightingLexer(final Project project) {
        super(CeylonParserDefinition.createLexerForProject(project));
        //TODO doc annotations, literals, regex
    }
}
