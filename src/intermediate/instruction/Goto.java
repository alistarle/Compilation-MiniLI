package intermediate.instruction;

/**
 * Created by alistarle on 22/04/2016.
 */
public class Goto {

    private Label label;

    public Goto(Label label) {
        this.label = label;
    }

    public Label getLabel() {
        return label;
    }

    @Override
    public String toString() {
        return "goto " + label;
    }
}
