package sample;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.stage.Stage;

import java.io.IOException;

public class Controller {

    ObservableList<String> daysList = FXCollections.
            observableArrayList("Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday" );

    @FXML
    private TextField titleAddText;

    @FXML
    private ComboBox<String> comboBox1;

    @FXML
    private TextField bodyAddText;

    @FXML
    private Button addButton;

    @FXML
    private Button readButton;

    @FXML
    private RadioButton check1;

    @FXML
    private RadioButton check2;

    @FXML
    private RadioButton check3;

    @FXML
    private RadioButton check4;

    @FXML
    private RadioButton check5;

    @FXML
    private RadioButton check6;

    @FXML
    void initialize() {
        comboBox1.setValue("Monday");
        comboBox1.setItems(daysList);

        ToggleGroup group = new ToggleGroup();
        check1.setToggleGroup(group);
        check2.setToggleGroup(group);
        check3.setToggleGroup(group);
        check4.setToggleGroup(group);
        check5.setToggleGroup(group);
        check6.setToggleGroup(group);

        addButton.setOnAction(event -> {
            String titleText = titleAddText.getText().trim();
            String selectedValue = comboBox1.getValue();
            String bodyText = bodyAddText.getText().trim();

            switch (selectedValue){
                case "Monday":
                    data.titleMonday.add(titleText);
                    data.bodyMonday.add(bodyText);
                    break;
            }

            titleAddText.setText("");
            comboBox1.setValue("Monday");
            bodyAddText.setText("");


        });

        readButton.setOnAction(event -> {
            RadioButton selectedRadioButton = (RadioButton) group.getSelectedToggle();
            String toogleGroupValue = selectedRadioButton.getText();

            switch (toogleGroupValue){
                case "Monday":

            }


            readButton.getScene().getWindow().hide();

            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(getClass().getResource("/sample/app.fxml"));

            try {
                loader.load();
            } catch (IOException e) {
                e.printStackTrace();
            }

            Parent root = loader.getRoot();
            Stage stage = new Stage();
            stage.setScene(new Scene(root));
            stage.showAndWait();
        });


    }
}

