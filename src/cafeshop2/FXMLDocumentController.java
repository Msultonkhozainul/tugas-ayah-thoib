/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXML2.java to edit this template
 */
package cafeshop2;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.animation.TranslateTransition;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Hyperlink;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.util.Duration;

/**
 *
 * @author user
 */
public class FXMLDocumentController implements Initializable {

    @FXML
    private Button si_login;

    @FXML
    private AnchorPane si_loginfrom;

    @FXML
    private Hyperlink si_lupakan;

    @FXML
    private PasswordField si_password;

    @FXML
    private TextField si_username;

    @FXML
    private Button side_alreadyhave;

    @FXML
    private Button side_buat;

    @FXML
    private AnchorPane side_from;

    @FXML
    private TextField su_answere;

    @FXML
    private AnchorPane su_frommasuk;

    @FXML
    private Button su_masuk;

    @FXML
    private PasswordField su_password;

    @FXML
    private ComboBox<?> su_question;

    @FXML
    private TextField su_username;

    public void switchFrom(ActionEvent event) {

        TranslateTransition slider = new TranslateTransition();

        if (event.getSource() == side_buat) {
            slider.setNode(side_from);
            slider.setToX(300);
            slider.setDuration(Duration.seconds(.5));

            slider.setOnFinished((ActionEvent e) -> {
                side_alreadyhave.setVisible(true);
                side_buat.setVisible(false);
            });

            slider.play();
        } else if (event.getSource() == side_alreadyhave) {
            slider.setNode(side_from);
            slider.setToX(0);
            slider.setDuration(Duration.seconds(.5));

            slider.setOnFinished((ActionEvent e) -> {
                side_alreadyhave.setVisible(false);
                side_buat.setVisible(true);
            });

            slider.play();
        }

    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

}
