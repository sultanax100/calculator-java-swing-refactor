package Calc;
import javax.swing.JTextField;

public class ComputeCommand implements Command{
    private final Calculator calc;
    private final Operation operation;
    
    // قيم قبل العملية
    private final String beforePrev;
    private final String beforeCurr;
    private final String beforeOp;

    // قيم بعد العملية (النتيجة)
    private final String afterCurr;

    public ComputeCommand(
            Calculator calc, 
            Operation operation, 
            String beforePrev,
            String beforeCurr,
            String beforeOp,
            String afterCurr) {

        this.calc = calc;
        this.operation = operation;

        this.beforePrev = beforePrev;
        this.beforeCurr = beforeCurr;
        this.beforeOp = beforeOp;
        this.afterCurr = afterCurr;
    }

    @Override
    public void execute() {
        calc.applyRedo(afterCurr);
        HistoryOperation.addEntry("Redo : " + afterCurr);

    }

    @Override
    public void undo() {
        // إعادة حالة قبل العملية
        calc.applyUndo(beforePrev, beforeCurr, beforeOp);
        HistoryOperation.addEntry("Undo → " 
                + beforePrev + " " + beforeOp + " " + beforeCurr);
    }
}
