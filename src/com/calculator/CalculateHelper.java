package com.calculator;

public class CalculateHelper {
    private static final char ADD_SYMBOL = '+';
    private static final char SUBTRACT_SYMBOL = '-';
    private static final char MULTIPLY_SYMBOL = '*';
    private static final char DIVIDE_SYMBOL = '/';

    MathCommand command;
    double leftValue;
    double rightValue;
    double result;

    public void process(String statement) {
        // add 1.0 2.0
        String[] parts = statement.split(" ");
        String commandString = parts[0]; // add divide subtract multiply
        leftValue = Double.parseDouble(parts[1]); // 1.0
        rightValue = Double.parseDouble(parts[2]); // 2.0

     setCommandFromString(commandString);

     CalculateBase calculator = null;
     switch (command) {
         case Add:
             calculator = new Adder(leftValue, rightValue);
             break;
         case Subtract:
             calculator = new Substracter(leftValue, rightValue);
             break;
         case Divide:
             calculator = new Divider(leftValue, rightValue);
             break;
         case Multiply:
             calculator = new Multiplier(leftValue, rightValue);
             break;

     }

     calculator.calculate();
     result = calculator.getResult();

    }

    private void  setCommandFromString(String commandString) {
        // add -> MathCommand.Add

        if(commandString.equalsIgnoreCase(MathCommand.Add.toString())) // Add
            command = MathCommand.Add;
        else if (commandString.equalsIgnoreCase(MathCommand.Subtract.toString()))
            command = MathCommand.Subtract;
        else if (commandString.equalsIgnoreCase(MathCommand.Divide.toString()))
            command = MathCommand.Divide;
        else if (commandString.equalsIgnoreCase(MathCommand.Multiply.toString()))
            command = MathCommand.Multiply;
        else
            System.out.println(" No Type ");
    }

    @Override
    public String toString() {


        char symbol = ' ';
        switch (command) {
            case Add:
                symbol = '+';
                break;
            case Subtract:
                symbol = '-';
                break;
            case Multiply:
                symbol = '*';
                break;
            case Divide:
                symbol = '/';
                break;
                default: symbol = '?';
        }

        StringBuilder sb = new StringBuilder(20);
        sb.append(leftValue);
        sb.append(" ");
        sb.append(symbol);
        sb.append(" ");
        sb.append(rightValue);
        sb.append(" = ");
        sb.append(result);

        return sb.toString();
    }
}
