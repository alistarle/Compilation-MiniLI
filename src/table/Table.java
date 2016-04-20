package table;

import ast.Ast;
import ast.Type;

import java.util.EmptyStackException;
import java.util.Stack;

/**
 * Created by max2 on 10/03/2016.
 */
public class Table {

    public static Table instance;
    private Stack<Block> blocks;
    private Stack<Block> globals;

    private Table(){
        blocks = new Stack<Block>();
        globals = new Stack<Block>();
    }

    public static Table getInstance(){
        if(instance == null){
            instance = new Table();
        }
        return instance;
    }

    public void pushBlock(Block b){
        blocks.push(b);
    }

    public void newBlock(){
        blocks.push(new Block());
    }

    public void addTopBlock(AbstractIdentificateur i,boolean isGlobal){
        if(!isGlobal) {
            try {
                Block b = blocks.peek();
                b.addIdentificateur(i);
            } catch (EmptyStackException e) {
                System.out.println("EMPTY STACK, creating block");
                blocks.add(new Block());
                blocks.peek().addIdentificateur(i);
            }
        }else{
            try {
                Block b = globals.peek();
                b.addIdentificateur(i);
            } catch (EmptyStackException e) {
                System.out.println("EMPTY STACK, creating block");
                globals.add(new Block());
                globals.peek().addIdentificateur(i);
            }
        }
    }

    public Type.EnumType lookUp(String n,boolean isFunction) {
        try {
            Type.EnumType exists;
            for (Block b : blocks) {
                exists = b.exists(n, isFunction);
                if (b.exists(n, isFunction) != null) {
                    return exists;
                }
            }
            exists = globals.peek().exists(n, isFunction);
            if(exists != null){
                return exists;
            }
        } catch (EmptyStackException e) {
            System.out.println("EMPTY STACK");
        }

        return null;
    }

    public void popBlock(){
        try {
            blocks.pop();
        }catch(EmptyStackException e){
            System.out.println("Pile vide");
        }
    }

    public FunctionIdentificateur getFunc(String n){
        return globals.peek().getFunc(n);
    }

}
