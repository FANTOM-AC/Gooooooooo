package sample;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import sample.DatabaseHandler;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class RegController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TextField country1;

    @FXML
    private TextField name1;

    @FXML
    private TextField secondname1;

    @FXML
    private TextField middlename1;

    @FXML
    private TextField mail1;

    @FXML
    private TextField city1;

    @FXML
    private CheckBox man1;

    @FXML
    private CheckBox women1;

    @FXML
    private PasswordField passwor1;

    @FXML
    private PasswordField password2;

    @FXML
    private Button registraciua1;

    @FXML
    void initialize() {
        registraciua1.setOnAction(event -> {
            signUpNewUser();
        });

    }

    private void signUpNewUser() {
        DatabaseHandler dbHandler = new DatabaseHandler();
        String firstname = name1.getText();
        String secondname = secondname1.getText();
        String middlename = middlename1.getText();
        String password = passwor1.getText();
        String mail = mail1.getText();
        String country = country1.getText();
        String city = city1.getText();
        String gender = "";
        if (man1.isSelected()){
            gender = "Мужчина";
        }else {
            gender = "Женский";
        }
        if (man1.isSelected() && women1.isSelected()){
            gender = "Пидарасина ебанная";
        }

        User user = new User(firstname,secondname,middlename,country,city,mail,password,gender);

        dbHandler.signUpUser(user);

        registraciua1.getScene().getWindow().hide();

        Parent root = null;
        try {
            root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        Scene scene = new Scene(root);

        Stage stage = new Stage();
        stage.setScene(scene);
        stage.show();
    }
}
