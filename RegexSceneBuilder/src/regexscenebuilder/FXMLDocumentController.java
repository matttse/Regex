/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package regexscenebuilder;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
//import javafx.scene.control.TextField;

/**
 *
 * @author tsemd
 */
public class FXMLDocumentController implements Initializable {
    
    @FXML
    private Label label;
//    private TextField textFieldPhoneNumber;
//    private TextField textFieldEmailAddress;
    @FXML
    private void handleButtonActionExit(ActionEvent event) {
        System.exit(0);
    }
    @FXML
    private void handleButtonActionResetSelection(ActionEvent event) {
//        textFieldEmailAddress.setText("");
//        textFieldPhoneNumber.setText("");
        
    }
    @FXML
    private void handleButtonActionValidate(ActionEvent event) {
        System.exit(0);
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
