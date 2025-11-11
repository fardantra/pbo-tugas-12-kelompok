/**
 * Class Calculator - Logika perhitungan kalkulator
 * 
 * @author 
 */
public class Calculator {
    private double num1;
    private double num2;
    private String operator;
    private boolean startNewNumber;
    private String history;
    
    /**
     * Constructor
     */
    public Calculator() {
        this.num1 = 0;
        this.num2 = 0;
        this.operator = "";
        this.startNewNumber = true;
        this.history = "";
    }
    
    // Getters and Setters
    public double getNum1() {
        return num1;
    }
    
    public void setNum1(double num1) {
        this.num1 = num1;
    }
    
    public double getNum2() {
        return num2;
    }
    
    public void setNum2(double num2) {
        this.num2 = num2;
    }
    
    public String getOperator() {
        return operator;
    }
    
    public void setOperator(String operator) {
        this.operator = operator;
    }
    
    public boolean isStartNewNumber() {
        return startNewNumber;
    }
    
    public void setStartNewNumber(boolean startNewNumber) {
        this.startNewNumber = startNewNumber;
    }
    
    public String getHistory() {
        return history;
    }
    
    public void setHistory(String history) {
        this.history = history;
    }
    
    public void appendToHistory(String value) {
        if (history.isEmpty() || history.endsWith(" = ")) {
            history = value;
        } else {
            history += value;
        }
    }

    public void appendOperatorToHistory(String op) {
        history += " " + op + " ";
    }
    
    public void appendEqualsToHistory() {
        history += " = ";
    }

    public void syncHistoryWithDisplay(String currentDisplay) {
        String[] parts = history.split(" ");
        if (parts.length > 0) {
            String lastPart = parts[parts.length - 1];
            
            if (!lastPart.matches("[+\\-*/^]")) {
                history = history.substring(0, history.length() - lastPart.length()) + currentDisplay;
            }
        }
    }

    public double calculate() throws ArithmeticException {
        double result = 0;
        
        switch (operator) {
            case "+":
                result = num1 + num2;
                break;
            case "-":
                result = num1 - num2;
                break;
            case "*":
                result = num1 * num2;
                break;
            case "/":
                if (num2 == 0) {
                    throw new ArithmeticException("Tidak bisa dibagi nol");
                }
                result = num1 / num2;
                break;
            case "^":
                result = Math.pow(num1, num2);
                break;
            default:
                result = num1;
        }
        
        return result;
    }

    public double calculateTrig(String function, double value) {
        double radians = Math.toRadians(value);
        double result = 0;
        
        switch (function) {
            case "sin":
                result = Math.sin(radians);
                break;
            case "cos":
                result = Math.cos(radians);
                break;
            case "tan":
                result = Math.tan(radians);
                break;
            case "sinh":
                result = Math.sinh(radians);
                break;
            case "cosh":
                result = Math.cosh(radians);
                break;
            case "tanh":
                result = Math.tanh(radians);
                break;
        }
        
        history = function + "(" + value + ")";
        return result;
    }

    public double calculatePower(double value, int power) {
        history = value + "^" + power;
        return Math.pow(value, power);
    }

    public double calculateRoot(double value) throws ArithmeticException {
        if (value < 0) {
            throw new ArithmeticException("Tidak bisa akar dari bilangan negatif");
        }
        history = "√(" + value + ")";
        return Math.sqrt(value);
    }

    public double calculateLog(double value) throws ArithmeticException {
        if (value <= 0) {
            throw new ArithmeticException("Log hanya untuk bilangan positif");
        }
        history = "log(" + value + ")";
        return Math.log10(value);
    }

    public double calculateExp(double value) {
        history = "e^(" + value + ")";
        return Math.exp(value);
    }

    public long calculateFactorial(int value) throws ArithmeticException {
        if (value < 0) {
            throw new ArithmeticException("Faktorial hanya untuk bilangan positif");
        }
        if (value > 20) {
            throw new ArithmeticException("Angka terlalu besar (max 20)");
        }
        
        long result = 1;
        for (int i = 2; i <= value; i++) {
            result *= i;
        }
        
        history = value + "!";
        return result;
    }

    public double calculateReciprocal(double value) throws ArithmeticException {
        if (value == 0) {
            throw new ArithmeticException("Tidak bisa dibagi nol");
        }
        history = "1/(" + value + ")";
        return 1 / value;
    }

    public double calculatePercent(double value) {
        history = value + "%";
        return value / 100;
    }

    public double toggleSign(double value) {
        return -value;
    }

    public String formatResult(double result) {
        if (result == (long) result) {
            return String.valueOf((long) result);
        } else {
            return String.format("%.10f", result)
                    .replaceAll("0*$", "")
                    .replaceAll("\\.$", "");
        }
    }

    public void clear() {
        num1 = 0;
        num2 = 0;
        operator = "";
        startNewNumber = true;
        history = "";
    }

    public void updateHistoryForToggleSign(String newValue) {
        if (!history.isEmpty()) {
            history = history.replaceAll("[0-9.\\-]+$", newValue);
        }
    }
}