package table;

import ast.Ast;
import ast.Type;

import java.util.EmptyStackException;
import java.util.Stack;

/**
 * Created by max2 on 10/03/2016.
 */
public class Table {
    private Stack<Block> blocks;
    private Stack<Block> globals;

    public Table(){
        blocks = new Stack<Block>();
        globals = new Stack<Block>();
    }

    public  void pushBlock(Block b){
        blocks.push(b);
    }

    public void addTopBlock(AbstractIdentificateur i,boolean isGlobal){
        if(!isGlobal) {
            try {
                Block b = blocks.peek();
                b.addIdentificateur(i);
            } catch (EmptyStackException e) {
                System.out.println("EMPTY STACK");
            }
        }else{
            try {
                Block b = globals.peek();
                b.addIdentificateur(i);
            } catch (EmptyStackException e) {
                System.out.println("EMPTY STACK, creating block");
                globals.add(new Block());
            }
        }
    }

    public boolean lookUp(String n,boolean isFunction){
        boolean exists = false;
        try {
            Block b = blocks.peek();
            if(b.exists(n,isFunction) != null){
                exists = true;
            }
        }catch(EmptyStackException e) {
            System.out.println("EMPTY STACK");
        }
        return exists;
    }



    public void popBlock(){
        blocks.pop();
    }
}
