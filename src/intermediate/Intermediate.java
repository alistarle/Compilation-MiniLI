package intermediate;

import ast.*;
import intermediate.instruction.Label;
import table.Table;

import java.util.ArrayList;

/**
 * Created by alistarle on 22/04/2016.
 */
public class Intermediate {

    public static ArrayList<Frame> frameList = new ArrayList<>();

    public static int reg_index = -1;
    public static int lbl_index = -1;

    public static void genIntermediate(Program program)
    {
        for(Function func : program.function)
        {
            Label entry_label = new Label(fresh_lbl());
            Table.getInstance().getFunc(func.id).setIndex(entry_label.getIndex());

            ArrayList<Integer> params = new ArrayList<>();
            for(DeclareVar param : func.params)
            {
                params.add(param.getIndex());
            }

            frameList.add(new Frame(entry_label,new Label(fresh_lbl()),params,fresh_reg()));

            ArrayList<Instruction> instructions = new ArrayList<>();
            for(ast.Instruction instruction : func.ins)
            {
                instructions.addAll(instruction.genIntermediate());
            }

        }
    }

    public static int fresh_reg()
    {
        return reg_index++;
    }

    public static int fresh_lbl()
    {
        return lbl_index++;
    }

}
