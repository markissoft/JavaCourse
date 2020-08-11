package sample;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

import java.net.URL;
import java.util.ResourceBundle;

public class HomeController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button backButton;

    @FXML
    private Label title2;

    @FXML
    private Label title1;

    @FXML
    private Label title3;

    @FXML
    private Label body1;

    @FXML
    private Label body2;

    @FXML
    private Label body3;

    @FXML
    private Button updateButton;

    @FXML
    void initialize() {
        updateButton.setOnAction(event -> {
            title1.setText(data.titleMonday.get(0));
            body1.setText(data.bodyMonday.get(0));

            title2.setText(data.titleMonday.get(1));
            body2.setText(data.bodyMonday.get(1));

            title3.setText(data.titleMonday.get(2));
            body3.setText(data.bodyMonday.get(2));
        });




    }
}

