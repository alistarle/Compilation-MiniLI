package intermediate;

import ast.DeclareVar;
import ast.ExpVar;
import ast.Function;
import ast.Program;
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

    //Use to process return calculation
    public static Label return_label;
    public static int return_reg = fresh_reg();

    public static void genIntermediate(Program program)
    {
        ExpVar.FLAG_REG = true; //Flag the ExpVar class to use the regIndex representaiton and no longer name representation in toString

        //On ajoute les fonctions du programme
        for(Function func : program.function)
        {
            Label entry_label = new Label(fresh_lbl());
            return_label = new Label(fresh_lbl());
            return_reg = fresh_reg();

            Table.getInstance().getFunc(func.id).setIndex(entry_label.getIndex());

            ArrayList<Integer> params = new ArrayList<>();
            for(DeclareVar param : func.params)
            {
                params.add(param.getIndex());
            }

            Frame frame = new Frame(entry_label,return_label,params,return_reg);

            ArrayList<Instruction> instructions = new ArrayList<>();
            instructions.add(entry_label);
            for(ast.Instruction instruction : func.ins)
            {
                instructions.addAll(instruction.genIntermediate());
            }
            instructions.add(return_label);
            frame.setInstructions(instructions);
            frameList.add(frame);
        }
    }

    public static String printIntermediate()
    {
        StringBuilder sb = new StringBuilder();
        for(Frame frame : frameList)
        {
            sb.append(frame.toString());
        }

        return sb.toString();
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
