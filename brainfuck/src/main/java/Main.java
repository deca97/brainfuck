import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import java.io.IOException;
import java.io.InputStream;

public class Main {
    public static void main(String args[]) throws IOException {
        ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
        InputStream inputStream = classLoader.getResourceAsStream(args[0]);
        CharStream charStream = CharStreams.fromStream(inputStream);

        gramLexer expLexer = new gramLexer(charStream);
        CommonTokenStream commonTokenStream = new CommonTokenStream(expLexer);
        gramParser expParser = new gramParser(commonTokenStream);

        Interpreter interpreter = new Interpreter();
        ParseTree parseTree = expParser.file();
        interpreter.visit(parseTree);
    }
}
