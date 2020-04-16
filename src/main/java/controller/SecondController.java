package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import model.BinaryCalculator;
import model.HexadecimalCalculator;

import java.io.IOException;

public class SecondController {

    @FXML
    private Label result;

    @FXML
    private TextField firstNumber;

    @FXML
    private TextField secondNumber;

    private HexadecimalCalculator hexadecimalCalculator;

    @FXML
    public void initialize() {
        hexadecimalCalculator = new HexadecimalCalculator();
    }

    public void add(ActionEvent actionEvent) {
        result.setText(hexadecimalCalculator.hexadecimalAdd(firstNumber.getText(), secondNumber.getText()));
    }

    public void subtract(ActionEvent actionEvent) {
        result.setText(hexadecimalCalculator.hexadecimalSubtract(firstNumber.getText(), secondNumber.getText()));
    }

    public void multiply(ActionEvent actionEvent) {
        result.setText(hexadecimalCalculator.hexadecimalMultiply(firstNumber.getText(), secondNumber.getText()));
    }

    public void divide(ActionEvent actionEvent) {
        result.setText(hexadecimalCalculator.hexadecimalDivide(firstNumber.getText(), secondNumber.getText()));
    }

    public void calculate(ActionEvent event) {
        Button button = (Button) event.getSource();

        if (button.getId().equals("addButton")) {
            result.setText(hexadecimalCalculator.hexadecimalAdd(firstNumber.getText(), secondNumber.getText()));
        } else if (button.getId().equals("subtractButton")) {
            result.setText(hexadecimalCalculator.hexadecimalSubtract(firstNumber.getText(), secondNumber.getText()));
        } else if (button.getId().equals("multiplyButton")) {
            result.setText(hexadecimalCalculator.hexadecimalMultiply(firstNumber.getText(), secondNumber.getText()));
        } else if (button.getId().equals("divideButton")) {
            result.setText(hexadecimalCalculator.hexadecimalDivide(firstNumber.getText(), secondNumber.getText()));
        }

    }

    public void switchToBinary(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("/fxml/test.fxml"));
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setScene(new Scene(root));
        stage.show();
    }
}
