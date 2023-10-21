package com.example.calculator;

import javafx.fxml.FXML;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.control.TextField;
import javafx.scene.control.Label;
import javafx.application.Platform;

public class CalculatorController {

    Calculator calc = new Calculator();

    @FXML
    private TextField weight;

    @FXML
    private TextField height;
    @FXML
    public Label label;

    @FXML
    public MenuBar menu;

    @FXML
    public MenuItem clear;

    @FXML
    public MenuItem exit;

    @FXML
    public MenuItem about;



    @FXML
    public Label lab1;




    @FXML
    protected void onButtonEngClick(){

        calc.setChoice(1);
        calc.calculate();


        String val = weight.getText(); // val = "21"
        // convert val to d double
        String vall = height.getText(); // val = "21"
        // convert val to d double


        double d = Double.parseDouble(val);
        double c = Double.parseDouble(vall);

        calc.setWeight(d);
        calc.setHeight(c);

        if(calc.getResult()<18.5){
            lab1.setText("Underweight");
        } else if (18.5 < calc.getResult() && calc.getResult() < 24.9) {
            lab1.setText("Normal");
        } else if (25 < calc.getResult() && calc.getResult() < 29.9) {
            lab1.setText("Overweight");
        } else{
            lab1.setText("Obese");
        }

        label.setText(String.valueOf(calc.getResult()));




    }
    @FXML
    protected void onButtonMetricClick(){

        calc.setChoice(2);
        calc.calculate();

        String val = weight.getText(); // val = "21"
        // convert val to d double
        String vall = height.getText(); // val = "21"

        double d = Double.parseDouble(val);
        double c = Double.parseDouble(vall);

        calc.setWeight(d);
        calc.setHeight(c);

        if(calc.getResult()<18.5){
            lab1.setText("Underweight");
        } else if (18.5 < calc.getResult() && calc.getResult() < 24.9) {
            lab1.setText("Normal");
        } else if (25 < calc.getResult() && calc.getResult() < 29.9) {
            lab1.setText("Overweight");
        } else if(29.9 < calc.getResult()){
            lab1.setText("Obese");
        }else{
            System.out.println("Invalid input");
        }


        label.setText(String.valueOf(calc.getResult()));

    }
    @FXML
    protected void onMenuClearClick(){
        weight.setText("");
        height.setText("");
        label.setText("");
        lab1.setText("");
    }

    @FXML
    protected void onMenuExitClick(){
        Platform.exit();



    }

    @FXML
    protected void onMenuAboutClick(){
        label.setText("Enter your weight and height, then click 'metric units' or 'English'");
        lab1.setText("The BMI and status will be displayed. Use 'File' menu to exit or clear the fields.");
    }




}