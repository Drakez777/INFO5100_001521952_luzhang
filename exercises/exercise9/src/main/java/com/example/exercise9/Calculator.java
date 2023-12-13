package com.example.exercise9;

import javafx.geometry.Insets;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class Calculator extends Application {

    private TextField display;
    private String operator = "";
    private double num1 = 0;
    private boolean start = true;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Calculator");

        GridPane grid = new GridPane();
        grid.setPadding(new Insets(20, 20, 20, 20));
        grid.setVgap(10);
        grid.setHgap(10);

        display = new TextField();
        display.setEditable(false);
        display.setMinWidth(200);
        grid.add(display, 0, 0, 4, 1);

        String[] buttonLabels = {
                "7", "8", "9", "/",
                "4", "5", "6", "*",
                "1", "2", "3", "-",
                "0", "C", "=", "+"
        };

        for (int i = 0; i < buttonLabels.length; i++) {
            final String label = buttonLabels[i];
            Button button = new Button(label);
            button.setMinSize(40, 40);
            button.setOnAction(e -> buttonClick(label));
            grid.add(button, i % 4, i / 4 + 1);
        }

        Scene scene = new Scene(grid, 240, 320);
        primaryStage.setScene(scene);

        primaryStage.show();
    }

    private void buttonClick(String label) {
        if (label.matches("[0-9]")) {
            if (start) {
                display.setText(label);
                start = false;
            } else {
                display.appendText(label);
            }
        } else if (label.equals("C")) {
            display.clear();
            num1 = 0;
            start = true;
        } else if (label.matches("[+\\-*/]")) {
            if (!start) {
                num1 = Double.parseDouble(display.getText());
                operator = label;
                start = true;
            }
        } else if (label.equals("=")) {
            if (!start) {
                double num2 = Double.parseDouble(display.getText());
                double result = performOperation(num1, num2, operator);
                display.setText(String.valueOf(result));
                start = true;
            }
        }
    }

    private double performOperation(double num1, double num2, String operator) {
        switch (operator) {
            case "+":
                return num1 + num2;
            case "-":
                return num1 - num2;
            case "*":
                return num1 * num2;
            case "/":
                if (num2 != 0) {
                    return num1 / num2;
                } else {
                    display.setText("Error");
                    return 0;
                }
            default:
                return 0;
        }
    }
}

