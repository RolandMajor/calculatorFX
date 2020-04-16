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

import java.io.IOException;

public class FirstController {

    @FXML
    private Label result;

    @FXML
    private TextField firstNumber;

    @FXML
    private TextField secondNumber;

    private BinaryCalculator binaryCalculator;

    @FXML
    public void initialize() {
        binaryCalculator = new BinaryCalculator();
    }

    public void add(ActionEvent actionEvent) {
        result.setText(binaryCalculator.binaryAdd(firstNumber.getText(), secondNumber.getText()));
    }

    public void subtract(ActionEvent actionEvent) {
        result.setText(binaryCalculator.binarySubtract(firstNumber.getText(), secondNumber.getText()));
    }

    public void multiply(ActionEvent actionEvent) {
        result.setText(binaryCalculator.binaryMultiply(firstNumber.getText(), secondNumber.getText()));
    }

    public void divide(ActionEvent actionEvent) {
        result.setText(binaryCalculator.binaryDivide(firstNumber.getText(), secondNumber.getText()));
    }

    public void calculate(ActionEvent event) {
        Button button = (Button) event.getSource();

        if (button.getId().equals("addButton")) {
            result.setText(binaryCalculator.binaryAdd(firstNumber.getText(), secondNumber.getText()));
        } else if (button.getId().equals("subtractButton")) {
            result.setText(binaryCalculator.binarySubtract(firstNumber.getText(), secondNumber.getText()));
        } else if (button.getId().equals("multiplyButton")) {
            result.setText(binaryCalculator.binaryMultiply(firstNumber.getText(), secondNumber.getText()));
        } else if (button.getId().equals("divideButton")) {
            result.setText(binaryCalculator.binaryDivide(firstNumber.getText(), secondNumber.getText()));
        }

    }

    public void switchToHexa(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("/fxml/hexa.fxml"));
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setScene(new Scene(root));
        stage.show();
    }
}
