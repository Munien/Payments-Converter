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
    @FXML private ChoiceBox currency1;
    @FXML private ChoiceBox currency;

    NumberFormat formatter = new DecimalFormat("#0.00");

    // Months Conversion
    private final double monthtofort = 2.17262;
    private final double monthtoweek = 4.34524;
    private final double monthtoyear = 0.0833334;
    private final double monthtoquarter = 0.33333336;

    // Weeks Conversion
    private final double weektofortnight = 0.5;
    private final double weektomonth = 5.29314;
    private final double weektoquarter = 0.0767124;
    private final double weektoyear = 0.0191781;

    // Fortnights Conversion
    private final double fortnighttoweek = 2.00000185714;
    private final double fortnighttomonth = 0.4602738955895939;
    private final double fortnighttoyear = 0.038356199999945203571;
    private final double fortnighttoquarter = 0.153424799999780814284;

    // Quarterly Conversion
    private final double quartertoweek = 13.03572;
    private final double quartertofortnight = 6.51786;
    private final double quartertomonth = 3.3333336;
    private final double quartertoyear = 0.2500002;

    // Yearly Conversion
    private final double yeartoweek = 52.142905561149994753;
    private final double yeartofortnight = 26.071452780574997377;
    private final double yeartomonth = 11.999997992157268811;
    private final double yeartoquarter = 0.333334008153809535636;


    private String currencyConvert;
    private double currencyInt, convertedInt;
    private ArrayList<Character> characters = new ArrayList<Character>();
    private Alert alert = new Alert(Alert.AlertType.ERROR, "Cannot use text");

    public void convert() {
        if(checkInput() == true) {
            checkTimePeriods();
        }
    }

    public void checkTimePeriods() {
        switch (currency.getValue().toString()) {
            case "Months":
                switch(currency1.getValue().toString()) {
                    case "Fortnights":
                        currencyInt = Integer.parseInt(convert.getText());
                        convertedInt = currencyInt / monthtofort;
                        currencyConvert = "" + convertedInt;
                        converted.setText("" + formatter.format(convertedInt));
                        break;
                    case "Yearly":
                        currencyInt = Integer.parseInt(convert.getText());
                        convertedInt = currencyInt / monthtoyear;
                        currencyConvert = "" + convertedInt;
                        converted.setText("" + formatter.format(convertedInt));
                        break;
                    case "Weeks":
                        currencyInt = Integer.parseInt(convert.getText());
                        convertedInt = currencyInt / monthtoweek;
                        currencyConvert = "" + convertedInt;
                        converted.setText("" + formatter.format(convertedInt));
                        break;
                    case "Quarterly":
                        currencyInt = Integer.parseInt(convert.getText());
                        convertedInt = currencyInt / monthtoquarter;
                        currencyConvert = "" + convertedInt;
                        converted.setText("" + formatter.format(convertedInt));
                        break;
                }
                break;
            case "Fortnights":
                switch(currency1.getValue().toString()) {
                    case "Months":
                        currencyInt = Integer.parseInt(convert.getText());
                        convertedInt = currencyInt / fortnighttomonth;
                        currencyConvert = "" + convertedInt;
                        converted.setText("" + formatter.format(convertedInt));
                        break;
                    case "Yearly":
                        currencyInt = Integer.parseInt(convert.getText());
                        convertedInt = currencyInt / fortnighttoyear;
                        currencyConvert = "" + convertedInt;
                        converted.setText("" + formatter.format(convertedInt));
                        break;
                    case "Weeks":
                        currencyInt = Integer.parseInt(convert.getText());
                        convertedInt = currencyInt / fortnighttoweek;
                        currencyConvert = "" + convertedInt;
                        converted.setText("" + formatter.format(convertedInt));
                        break;
                    case "Quarterly":
                        currencyInt = Integer.parseInt(convert.getText());
                        convertedInt = currencyInt / fortnighttoquarter;
                        currencyConvert = "" + convertedInt;
                        converted.setText("" + formatter.format(convertedInt));
                        break;
                }
                break;
            case "Weeks":
                switch(currency1.getValue().toString()) {
                    case "Fortnights":
                        currencyInt = Integer.parseInt(convert.getText());
                        convertedInt = currencyInt / weektofortnight;
                        currencyConvert = "" + convertedInt;
                        converted.setText("" + formatter.format(convertedInt));
                        break;
                    case "Yearly":
                        currencyInt = Integer.parseInt(convert.getText());
                        convertedInt = currencyInt / weektoyear;
                        currencyConvert = "" + convertedInt;
                        converted.setText("" + formatter.format(convertedInt));
                        break;
                    case "Months":
                        currencyInt = Integer.parseInt(convert.getText());
                        convertedInt = currencyInt / weektomonth;
                        currencyConvert = "" + convertedInt;
                        converted.setText("" + formatter.format(convertedInt));
                        break;
                    case "Quarterly":
                        currencyInt = Integer.parseInt(convert.getText());
                        convertedInt = currencyInt / weektoquarter;
                        currencyConvert = "" + convertedInt;
                        converted.setText("" + formatter.format(convertedInt));
                        break;
                }
                break;
            case "Quarterly":
                switch(currency1.getValue().toString()) {
                    case "Fortnights":
                        currencyInt = Integer.parseInt(convert.getText());
                        convertedInt = currencyInt / quartertofortnight;
                        currencyConvert = "" + convertedInt;
                        converted.setText("" + formatter.format(convertedInt));
                        break;
                    case "Yearly":
                        currencyInt = Integer.parseInt(convert.getText());
                        convertedInt = currencyInt / quartertoyear;
                        currencyConvert = "" + convertedInt;
                        converted.setText("" + formatter.format(convertedInt));
                        break;
                    case "Weeks":
                        currencyInt = Integer.parseInt(convert.getText());
                        convertedInt = currencyInt / quartertoweek;
                        currencyConvert = "" + convertedInt;
                        converted.setText("" + formatter.format(convertedInt));
                        break;
                    case "Months":
                        currencyInt = Integer.parseInt(convert.getText());
                        convertedInt = currencyInt / quartertomonth;
                        currencyConvert = "" + convertedInt;
                        converted.setText("" + formatter.format(convertedInt));
                        break;
                }
                break;
            case "Yearly":
                switch(currency1.getValue().toString()) {
                    case "Fortnights":
                        currencyInt = Integer.parseInt(convert.getText());
                        convertedInt = currencyInt / yeartofortnight;
                        currencyConvert = "" + convertedInt;
                        converted.setText("" + formatter.format(convertedInt));
                        break;
                    case "Quarterly":
                        currencyInt = Integer.parseInt(convert.getText());
                        convertedInt = currencyInt / yeartoquarter;
                        currencyConvert = "" + convertedInt;
                        converted.setText("" + formatter.format(convertedInt));
                        break;
                    case "Weeks":
                        currencyInt = Integer.parseInt(convert.getText());
                        convertedInt = currencyInt / yeartoweek;
                        currencyConvert = "" + convertedInt;
                        converted.setText("" + formatter.format(convertedInt));
                        break;
                    case "Months":
                        currencyInt = Integer.parseInt(convert.getText());
                        convertedInt = currencyInt / yeartomonth;
                        currencyConvert = "" + convertedInt;
                        converted.setText("" + formatter.format(convertedInt));
                        break;
                }
                break;

        }

        System.out.println(currency.getValue());
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
