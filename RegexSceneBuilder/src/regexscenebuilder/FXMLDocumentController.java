/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package regexscenebuilder;

import java.net.URL;
import java.util.ResourceBundle;
import java.util.regex.Pattern;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

/**
 *
 * @author tsemd
 */
public class FXMLDocumentController implements Initializable {
    
    @FXML
    private Label label;
    @FXML
    private TextField textFieldPhoneNumber;
    @FXML
    private TextField textFieldEmailAddress;
    @FXML
    private TextField ResultDisplay;
    @FXML
    private void handleButtonActionExit(ActionEvent event) {
        System.exit(0);
    }
    @FXML
    private void handleButtonActionResetSelection(ActionEvent event) {
        textFieldEmailAddress.setText("");        
        textFieldPhoneNumber.setText("");
        
    }
    @FXML
    private void handleButtonActionValidate(ActionEvent event) {
      String emailContent = textFieldEmailAddress.getText();
      String phoneContent = textFieldPhoneNumber.getText();
      String emailPattern = "^((\"[\\w-\\s]+\")|([\\w-]+(?:\\.[\\w-]+)*)|(\"[\\w-\\s]+\")([\\w-]+(?:\\.[\\w-]+)*))(@((?:[\\w-]+\\.)*\\w[\\w-]{0,66})\\.([a-z]{2,6}(?:\\.[a-z]{2})?)$)|(@\\[?((25[0-5]\\.|2[0-4][0-9]\\.|1[0-9]{2}\\.|[0-9]{1,2}\\.))((25[0-5]|2[0-4][0-9]|1[0-9]{2}|[0-9]{1,2})\\.){2}(25[0-5]|2[0-4][0-9]|1[0-9]{2}|[0-9]{1,2})\\]?$)";
      String phonePattern = "^(?:(?:\\+?1\\s*(?:[.-]\\s*)?)?(?:\\(\\s*([2-9]1[02-9]|[2-9][02-8]1|[2-9][02-8][02-9])\\s*\\)|([2-9]1[02-9]|[2-9][02-8]1|[2-9][02-8][02-9]))\\s*(?:[.-]\\s*)?)?([2-9]1[02-9]|[2-9][02-9]1|[2-9][02-9]{2})\\s*(?:[.-]\\s*)?([0-9]{4})(?:\\s*(?:#|x\\.?|ext\\.?|extension)\\s*(\\d+))?$";
      
      boolean emailMatch = Pattern.matches(emailPattern, emailContent);
      boolean phoneMatch = Pattern.matches(phonePattern, phoneContent);
      
      ResultDisplay.setVisible(true);
      
      if (emailMatch == true && phoneMatch == true) {
          ResultDisplay.setText("Valid Fields");
      } else {
          ResultDisplay.setText("Invalid");
          if (emailMatch == false) {
              ResultDisplay.setText(ResultDisplay.getText()+" Email");
          }
          if (phoneMatch == false) {
              ResultDisplay.setText(ResultDisplay.getText()+" Phone Number");
          }
          
      }
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
