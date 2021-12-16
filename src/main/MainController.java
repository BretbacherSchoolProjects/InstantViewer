package main;

import javafx.beans.binding.Bindings;
import javafx.beans.binding.DoubleBinding;
import javafx.beans.binding.NumberBinding;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.Slider;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;
import java.io.IOException;


public class MainController{

    @FXML
    TextField txtf_in;

    @FXML
    ImageView imgV_out;

    private static Stage scaleStage;

    @FXML
    public void initialize() {
        ImageBinding imgB = new ImageBinding(txtf_in.textProperty());
        imgV_out.imageProperty().bind(imgB);
        imgV_out.fitWidthProperty().bind(scaleStage.widthProperty().subtract(50));
        imgV_out.fitHeightProperty().bind(scaleStage.heightProperty().subtract(150));
    }

    public static void show(Stage stage) {
        try {
            scaleStage = stage;
            FXMLLoader fxmlLoader = new FXMLLoader(MainController.class.getResource("main.fxml"));
            Parent root = fxmlLoader.load();

            scaleStage.setTitle("Main");
            scaleStage.setWidth(600);
            scaleStage.setHeight(500);
            scaleStage.setScene(new Scene(root));
            scaleStage.show();
        }
        catch (IOException ex) {
            System.err.println("Something wrong with main.fxml!");
            ex.printStackTrace(System.err);
            System.exit(1);
        }
    }
}
