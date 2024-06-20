/********************************************************************************************
 *   COPYRIGHT (C) 2022 TONAL INC
 *   The reproduction, transmission or use of this document/file or its
 *   contents is not permitted without  written authorization.
 *   Offenders will be liable for damages. All rights reserved.
 *---------------------------------------------------------------------------
 *   Purpose:  Below code perform the action by using scene builder
 *   Project:  MainController
 *   Platform: JavaSE-22.0.1
 *   IDE:	   Eclipse IDE for Enterprise Java and Web Developers (includes Incubating components)

 *			   Version: 2024-03 (4.31.0)
 *             Build id: 20240307-1437
 ********************************************************************************************/



package application;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.Button;

/**
 * The MainController class controls the user interactions in the application.
 */
public class MainController {
    
    @FXML
    private Label result;
    private long number1 = 0;
    private String operator = "";
    private boolean start = true;
    private Modal modal = new Modal();
    
    /**
     * Processes the numbers entered by the user.
     * 
     * @param event The event triggered by pressing a number button.
     */
    @FXML 
    public void processNumbers(ActionEvent event) {
        if (start) {
            result.setText("");
            start = false;
        }
        String value = ((Button) event.getSource()).getText();
        result.setText(result.getText() + value);
    }
    
    /**
     * Processes the operators entered by the user.
     * 
     * @param event The event triggered by pressing an operator button.
     */
    @FXML
    public void processOperators(ActionEvent event) {
        String value = ((Button) event.getSource()).getText();
        if (!value.equals("=")) {
            if (!operator.isEmpty())
                return;
            operator = value;
            number1 = Long.parseLong(result.getText());
            result.setText("");
        } else {
            if (operator.isEmpty())
                return;
            long number2 = Long.parseLong(result.getText());
            float output = modal.calculate(number1, number2, operator);
            result.setText(String.valueOf(output));
            operator = "";
            start = true;
        }
    }
}