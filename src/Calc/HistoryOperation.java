/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Calc;

import java.util.ArrayList;
import java.util.List;
public class HistoryOperation extends OperationDecorator{
    private static final List<String> history = new ArrayList<>();

    public HistoryOperation(Operation decoratedOperation) {
        super(decoratedOperation);
    }

    @Override
    public float apply(float a, float b) {
        float result = super.apply(a, b);
        history.add(a + " " + getSymbol(decoratedOperation) + " " + b + " = " + result);
        return result;
    }

    private String getSymbol(Operation op) {
        if (op instanceof AddOperation) return "+";
        if (op instanceof SubOperation) return "-";
        if (op instanceof MultOperation) return "×";
        if (op instanceof DivOperation) return "÷";
        return "?";
    }

    public static List<String> getHistory() {
        return history;
    }
}
