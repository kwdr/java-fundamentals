package com.calculator;

public abstract class CalculateBase {

    private double leftVal;
    private double rightVal;
    private double result;

    public CalculateBase(double leftVal, double rightVal){
        this.leftVal = leftVal;
        this.rightVal = rightVal;
    }

    public CalculateBase() {

    }

    public abstract void calculate();

    public double getLeftVal() {
        return leftVal;
    }

    public double getRightVal() {
        return rightVal;
    }

    public double getResult() {
        return result;
    }


    public void setResult(double result){
        this.result = result;
    }
}
