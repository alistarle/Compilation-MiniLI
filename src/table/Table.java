package table;

import ast.Ast;

import java.util.EmptyStackException;
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

    public void addTopBlock(AbstractIdentificateur i){
        try {
            Block b = blocks.peek();
            b.addIdentificateur(i);
        }catch(EmptyStackException e){
            System.out.println("EMPTY STACK");
        }
    }

    public void popBlock(){
        blocks.pop();
    }
}
