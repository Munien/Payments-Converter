package com.munien;

import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.TextField;

import java.awt.*;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.ArrayList;

public class Controller {
    @FXML private TextField convert;
    @FXML private TextField converted;
    @FXML private ChoiceBox currency;

    NumberFormat formatter = new DecimalFormat("#0.00");
    private final double monthtofort = 2.17262;
    private String currencyConvert;
    private double currencyInt, convertedInt;
    private ArrayList<Character> characters = new ArrayList<Character>();
    private Alert alert = new Alert(Alert.AlertType.ERROR, "Cannot use text");

    public void convert() {
        if(checkInput() == true) {
            currencyInt = Integer.parseInt(convert.getText());
            convertedInt = currencyInt / monthtofort;
            currencyConvert = "" + convertedInt;
            converted.setText("" + formatter.format(convertedInt));
        }
    }

    public boolean testChar(char c) {
        if(c == '0' || c == '1' || c == '2' || c == '3' || c == '4' || c == '5' || c == '6' || c == '7' || c == '8' || c == '9')
            return true;
        else
            return false;
    }

    public boolean checkInput() {
        String text = convert.getText();
        boolean isNumber = true;
        characters.clear();
        for (int i = 0; i < text.length(); i++) {
            characters.add(text.charAt(i));
            for (char c : characters
                 ) {
                if(testChar(c) == false) {
                    convert.clear();
                    isNumber = false;
                } else {
                    isNumber = true;
                }
            }
        }
        if(isNumber) {
            return true;
        } else {
            alert.showAndWait();
            return false;
        }
    }
}
