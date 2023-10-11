package com.example.calculator;

public class Calculator {

    private double op1;
    private double op2;
    private char operator;
    private double result;



    public void setOp1(double op1) {
        this.op1 = op1;
    }

    public void setOp2(double op2) {
        this.op2 = op2;
    }

    public void setOperator(char operator) {
        this.operator = operator;
    }

    public double getResult() {
        return result;
    }



    public void reset(){
        op1 = 0.0;
        op2 = 0.0;
        operator = '\0';
        result = 0.0;
    }
    public void calculate() {
        // Perform calculation based on operator
        switch (operator) {
            case '+':
                result = op1 + op2;
                break;
            case '-':
                result = op1 - op2;
                break;
            case '*':
                result = op1 * op2;
                break;
            case '/':
                // Check for division by zero
                if (op2 != 0) {
                    result = op1 / op2;
                } else {

                    result = Double.NaN; // Use NaN for an undefined result
                }
                break;
        }
    }
}