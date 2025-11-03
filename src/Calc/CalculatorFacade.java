package Calc;

public class CalculatorFacade {
    private String currentOperand = "";
    private String previousOperand = "";
    private String operation = "";

    public void clear() {
        currentOperand = "";
        previousOperand = "";
        operation = "";
    }

    public void appendNumber(String number) {
        if (currentOperand.equals("0") && number.equals("0")) return;
        if (number.equals(".") && currentOperand.contains(".")) return;
        if (currentOperand.equals("0") && !number.equals("0") && !number.equals(".")) {
            currentOperand = "";
        }
        currentOperand += number;
    }

    public void chooseOperation(String operation) {
        if (currentOperand.equals("") && !previousOperand.equals("")) {
            this.operation = operation;
            return;
        }
        if (currentOperand.equals("")) return;
        if (!previousOperand.equals("")) compute();
        this.operation = operation;
        previousOperand = currentOperand;
        currentOperand = "";
    }

    public void compute() {
        if (currentOperand.equals("") || previousOperand.equals("")) return;
        try {
            float curr = Float.parseFloat(currentOperand);
            float prev = Float.parseFloat(previousOperand);
            float computation = 0;

            switch (operation) {
                case "+" -> computation = prev + curr;
                case "-" -> computation = prev - curr;
                case "×" -> computation = prev * curr;
                case "÷" -> {
                    if (curr == 0) {
                        clear();
                        currentOperand = "Error";
                        return;
                    }
                    computation = prev / curr;
                }
                default -> { return; }
            }

            currentOperand = (computation - (int) computation) != 0
                    ? Float.toString(computation)
                    : Integer.toString((int) computation);
            previousOperand = "";
            operation = "";
        } catch (Exception e) {
            clear();
            currentOperand = "Error";
        }
    }

    // Getters to display data
    public String getCurrentOperand() { return currentOperand; }
    public String getPreviousOperand() { return previousOperand; }
    public String getOperation() { return operation; }

    // To handle sign toggle (+/-)
    public void toggleSign() {
        if (!currentOperand.isBlank()) {
            float tmp = -Float.parseFloat(currentOperand);
            currentOperand = (tmp - (int) tmp) != 0 ? Float.toString(tmp) : Integer.toString((int) tmp);
        }
    }
}
