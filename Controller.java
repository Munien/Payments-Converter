package sample;

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

    private final double monthtofort = 2.17262;
    NumberFormat formatter = new DecimalFormat("#0.00");
    private String currencyConvert;
    private double currencyInt;
    private double convertedInt;
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

    public boolean checkInput() {
        String text = convert.getText();
        boolean isNumber = true;
//        for (int i = 0; i < text.length(); i++) {
//            if (text.length() >= 1) {
//                if(text.charAt(i) != '1' || text.charAt(i) != '2' || text.charAt(i) != '3' || text.charAt(i) != '4') {
//                    System.out.println("Char at : " + text.charAt(i));
//                    isNumber = false;
//                    convert.clear();
//                } else {
//                    System.out.println("Char at : " + text.charAt(i));
//                }
//            }
//        }
        if(isNumber) {
            return true;
        } else {
            alert.showAndWait();
            return false;
        }
    }
}
