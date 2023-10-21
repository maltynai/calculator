package com.example.calculator;

public class Calculator {

    private double weight;
    private double height;

    private double result;

    private double choice;




    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }



    public double getChoice() {
        return choice;
    }

    public void setChoice(double choice) {
        this.choice = choice;
    }

    public void calculate() {
        if(choice == 1){
            result = 703.0 * weight/(height*height);

        }else if(choice == 2){
            result = weight/(height*height);
        }


    }
    public double getResult() {
        return result;
    }
    public void setResult(double result) {
        this.result = result;
    }
}