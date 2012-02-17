package au.com.machinecode.intellij.ceylon.lang.lexer;

import com.intellij.lexer.Lexer;
import com.intellij.lexer.LexerPosition;
import com.intellij.psi.tree.IElementType;
import org.antlr.runtime.ANTLRStringStream;
import org.antlr.runtime.CommonToken;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.Token;

import java.util.LinkedList;
import java.util.List;

/**
 * @author Brent Douglas <brent.n.douglas@gmail.com>
 */
public class CeylonAdaptedLexer extends Lexer {

    private final List<CommonToken> tokens = new LinkedList<CommonToken>();
    private CharSequence buffer;
    private Token token;
    private int state;
    private int length;
    private int end;

    @Override
    public void start(final CharSequence buffer, final int start, final int end, final int state) {
        this.buffer = buffer;
        this.end = end;
        this.state = state;
        final com.redhat.ceylon.compiler.typechecker.parser.CeylonLexer lexer = new com.redhat.ceylon.compiler.typechecker.parser.CeylonLexer(new ANTLRStringStream(this.buffer.subSequence(start, end).toString()));
        final CommonTokenStream tokenStream = new CommonTokenStream(lexer);
        tokens.clear();
        tokens.addAll(tokenStream.getTokens());
        this.length = tokens.size();
    }

    private boolean isValidIndex(final int index) {
        return !tokens.isEmpty() && index >= 0 && index < length;
    }

    @Override
    public void advance() {
        if (isValidIndex(state + 1)) {
            token = tokens.get(state++);
        }
    }

    @Override
    public int getState() {
        return state;
    }

    @Override
    public IElementType getTokenType() {
        return null;
        //return CeylonTokenType.fromOp(token.getType());
    }

    @Override
    public int getTokenStart() {
        return token.getCharPositionInLine();
    }

    @Override
    public int getTokenEnd() {
        return getTokenStart() + token.getText().length();
    }

    @Override
    public LexerPosition getCurrentPosition() {
        return new CeylonDelegateLexerPosition(getTokenStart(), getState());
    }

    @Override
    public void restore(final LexerPosition position) {
        start(buffer, position.getOffset(), end, position.getState());
    }

    @Override
    public CharSequence getBufferSequence() {
        return buffer;
    }

    @Override
    public int getBufferEnd() {
        return end;
    }

    protected static class CeylonDelegateLexerPosition implements LexerPosition {
        final int state;
        final int offset;

        public CeylonDelegateLexerPosition(final int offset, final int state) {
            this.offset = offset;
            this.state = state;
        }

        public int getOffset() {
            return offset;
        }

        public int getState() {
            return state;
        }
    }
}
