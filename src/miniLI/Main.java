package miniLI;

import ast.Ast;
import ast.Program;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import parser.MiniliLexer;
import parser.MiniliParser;
import parser.MiniliVisitor;

/**
 * Created by thomas on 29/02/16.
 */
public class Main {

    public static void main(String[] args) throws Exception {
        // FIRST STEP: analysis
        // Creation of the stream of characters
        ANTLRInputStream input = new ANTLRInputStream(System.in);
        // Creation of the lexer for pico programs
        MiniliLexer lexer = new MiniliLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        // Creation of the parser for pico programs
        MiniliParser parser = new MiniliParser(tokens);
        // Parse the input: the result is a parse tree
        ParseTree tree = parser.minili();
        // Walk the parse tree in order to create an
        // abstract syntax tree
        MiniliVisitor<Ast> buildAST = new BuildAST();
        Program program = (Program) buildAST.visit(tree);


        System.out.println("Test");
        System.out.println(program.toString());

    }
}
