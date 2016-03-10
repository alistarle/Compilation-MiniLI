package table;

import ast.Ast;

import java.util.Stack;

/**
 * Created by max2 on 10/03/2016.
 */
public class Table {
    private Stack<Block> blocks;

    Table(){
        blocks = new Stack<Block>();
    }

    public  void pushBlock(Block b){
        blocks.push(b);
    }

    public Block popBlock(){
        return blocks.pop();
    }

    public void visitBuildAst(Ast root){

    }
}
