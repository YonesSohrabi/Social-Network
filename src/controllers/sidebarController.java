package controllers;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.image.Image;
import javafx.scene.paint.ImagePattern;
import javafx.scene.shape.Circle;

import java.net.URL;
import java.util.ResourceBundle;


public class sidebarController implements Initializable {
    @FXML
    private Circle circle;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        Image img = new Image(getClass().getResource("images/user-photo.jpg").toExternalForm());
        circle.setFill(new ImagePattern(img));
    }

}
