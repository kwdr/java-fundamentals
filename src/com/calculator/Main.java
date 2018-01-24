package com.calculator;

public class Main {

    public static void main(String[] args) {
//
//        MathEquation[] equations = new MathEquation[4];
//        equations[0] = create(100.0d, 50.0d, 'd');
//        equations[1] = create(25.0d, 92.0d, 'a');
//        equations[2] = create(225.0d, 17.0d, 's');
//        equations[3] = create(11.0d, 3.0d, 'm');


        MathEquation[] equations = new MathEquation[4];
        equations[0] = new MathEquation(100.0d, 50.0d, 'd');
        equations[1] = new MathEquation(25.0d, 92.0d, 'a');
        equations[2] = new MathEquation(225.0d, 17.0d, 's');
        equations[3] = new MathEquation(11.0d, 3.0d, 'm');

        for (MathEquation equation : equations) {
            equation.execute();
            System.out.print("result = ");
            System.out.println(equation.getResult());
        }

        System.out.println();
        System.out.println("Using Overloads");
        System.out.println();

        double leftDouble = 9.0d;
        double rightDouble = 4.0d;
        int leftInt = 9;
        int rightInt = 4;

        MathEquation equationOverload = new MathEquation('d');

        equationOverload.execute(leftDouble, rightDouble);
        System.out.print("result=");
        System.out.println(equationOverload.getResult());

        equationOverload.execute(leftInt, rightInt);
        System.out.print("result=");
        System.out.println(equationOverload.getResult());

    }

/*    public static MathEquation create(double leftVal, double rightVal, char opCode) {

        MathEquation equation = new MathEquation(leftVal, rightVal, opCode);

        return equation;
    }*/
}
