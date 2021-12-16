import javafx.application.Application;
import javafx.stage.Stage;
import main.*;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        MainController.show(primaryStage);
    }

    public static void main(String[] args) {
        launch(args);
    }
}
