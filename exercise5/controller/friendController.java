package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.image.ImageView;
import model.*;

public class friendController {

    @FXML
    ImageView Arjay, Jasper, Justin, Rica, Terrence; 

    @FXML
    Button terBtn, perBtn, riBtn, tinBtn, jayBtn;

    Rica ri = new Rica();
    Justin tin = new Justin();
    Terrence ter = new Terrence();
    Arjay jay = new Arjay(); 
    Jasper per = new Jasper(); 


    public void initialize() {

        ri.setRating("wow");
        ri.setTaste("Maganda");

        tin.setRating("sheesh");
        tin.setTaste("Pogi");

        ter.setRating("is tall");
        ter.setTaste("Pogi");

        jay.setRating("pogi");
        jay.setTaste("laki etits");

        per.setRating("shish ");
        per.setTaste("Pogi");
      
    }

    public void showInfo(ActionEvent event) {

        Button sourceButton = (Button) event.getSource();
        Alert alert = new Alert(AlertType.INFORMATION);

        if (sourceButton.equals(terBtn)) {
            alert.setContentText("Terrence " + ter.getRating() + " and " + ter.getTaste());
        }

        if (sourceButton == perBtn) {
            alert.setContentText("Jasper " + per.getRating() + " and " + per.getTaste());
        }

        if (sourceButton == riBtn) {
            alert.setContentText("Rica " + ri.getRating() + " and " + ri.getTaste());
        }

        if (sourceButton == tinBtn) {
            alert.setContentText("Justin " + tin.getRating() + " and " + tin.getTaste());
        }

        if (sourceButton == jayBtn) {
            alert.setContentText("Arjay " + jay.getRating() + " and " + jay.getTaste());
        }

        alert.showAndWait();

    }

}
