package com.example.lessson3_fx;



import javafx.animation.TranslateTransition;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import javafx.util.Duration;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class WelcomeController implements Initializable {

    @FXML
    private ImageView Exit;
    Stage stage = null;
    @FXML
    private Label menu2;

    @FXML
    private AnchorPane Pane;
    @FXML
    private Label menu;

    @FXML
    private AnchorPane slider;

    @FXML
    private AnchorPane pane;
    private ActionEvent event;


    @Override
    public void initialize(URL location, ResourceBundle resources) {

        Exit.setOnMouseClicked(event -> {
            System.exit(0);
        });
        slider.setTranslateX(-176);








        menu.setOnMouseClicked(event -> {
            TranslateTransition slide = new TranslateTransition();
            slide.setDuration(Duration.seconds(0.4));
            slide.setNode(slider);

            slide.setToX(0);
            slide.play();

            slider.setTranslateX(-176);

            slide.setOnFinished((ActionEvent e) -> {
                menu.setVisible(false);
                menu2.setVisible(true);
            });
        });




        menu2.setOnMouseClicked(event -> {
            TranslateTransition slide = new TranslateTransition();
            slide.setDuration(Duration.seconds(0.4));
            slide.setNode(slider);

            slide.setToX(-176);
            slide.play();

            slider.setTranslateX(0);

            slide.setOnFinished((ActionEvent e) -> {
                menu.setVisible(true);
                menu2.setVisible(false);
            });
        });
    }





    @FXML
    private  void showDashboard(ActionEvent event) throws IOException{
        this.event = event;

        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("dashboard.fxml"));

        try {
            Pane registerPane = fxmlLoader.load();
            Pane.getChildren().clear();
            Pane.getChildren().add(registerPane);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    @FXML
    private  void showAdd(ActionEvent event) throws IOException{
        this.event = event;

        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("add.fxml"));

        try {
            Pane registerPane = fxmlLoader.load();
            Pane.getChildren().clear();
            Pane.getChildren().add(registerPane);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
    @FXML
    private  void showReport(ActionEvent event) throws IOException{
        this.event = event;

        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("report.fxml"));

        try {
            Pane registerPane = fxmlLoader.load();
            Pane.getChildren().clear();
            Pane.getChildren().add(registerPane);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
    @FXML
    private  void showBackUp(ActionEvent event) throws IOException{
        this.event = event;

        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("BackUp.fxml"));

        try {
            Pane registerPane = fxmlLoader.load();
            Pane.getChildren().clear();
            Pane.getChildren().add(registerPane);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }


    public ActionEvent getEvent() {
        return event;
    }

    public void setEvent(ActionEvent event) {
        this.event = event;
    }
}