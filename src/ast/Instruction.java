/**
 * 
 */
package ast;

import java.util.ArrayList;

public abstract class Instruction extends Ast {
    public abstract ArrayList<intermediate.Instruction> genIntermediate();
}
