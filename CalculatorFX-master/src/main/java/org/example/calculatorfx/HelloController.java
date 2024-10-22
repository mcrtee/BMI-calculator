package org.example.calculatorfx;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.stage.Modality;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloController {
    //some values from the inputs
    @FXML
    private Label resultLabel;

    @FXML
    private TextField heightTextField;

    @FXML
    private TextField weightTextField;

    @FXML
    private RadioButton unitSwitcher;

    @FXML
    private Label BMIValueLabel;


    //methods

    //exits the application after clicking "Exit"
    @FXML
    protected void onExitClick()
    {
        javafx.application.Platform.exit();
    }

    @FXML
    //method to clear all the values
    protected void onClearClick()
    {
        weightTextField.clear();
        heightTextField.clear();
        resultLabel.setText("");
        BMIValueLabel.setText("");
        BMIValueLabel.setStyle("");
    }

    @FXML
    //method to open a new window with help
    protected void onHelpClick()
    {
        //exception
        try {
            // Load the FXML for the help window
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("help.fxml"));
            Parent root = fxmlLoader.load();

            // Create a new stage for the help window
            Stage helpStage = new Stage();
            helpStage.setTitle("Help Instructions");
            helpStage.setScene(new Scene(root, 300, 200));

            // Make the new window modal (blocks input to other windows until closed)
            helpStage.initModality(Modality.APPLICATION_MODAL);

            // Show the help window
            helpStage.show();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    //calculates the BMI
    @FXML
    protected void onCalculateBMIClick()
    {
        //exception
        try {
            double weight = Double.parseDouble(weightTextField.getText());
            double height = Double.parseDouble(heightTextField.getText());

            //calculate BMI and show in the resultLabel
            double bmi;
            if (!unitSwitcher.isSelected()) {
                bmi = weight / (height * height);
            } else {
                bmi = 703 * weight / (height * height);
            }
            resultLabel.setText(String.format("Your BMI is: %.2f", bmi));

            //show the value of your BMI
            if (bmi < 18.5)
            {
                BMIValueLabel.setText("Underweight");
                BMIValueLabel.setStyle("-fx-background-color: lightblue;");
            }
            else if (bmi < 25)
            {
                BMIValueLabel.setText("Normal");
                BMIValueLabel.setStyle("-fx-background-color: green;");
            }
            else if(bmi < 30)
            {
                BMIValueLabel.setText("Overweight");
                BMIValueLabel.setStyle("-fx-background-color: orange;");
            }
            else
            {
                BMIValueLabel.setText("Obese");
                BMIValueLabel.setStyle("-fx-background-color: red;");
            }

        } catch (NumberFormatException e)
        {
            resultLabel.setText("Please enter valid values");
        }
    }


}