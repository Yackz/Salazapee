import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("/startRecommendItem.fxml"));
        primaryStage.setTitle("Slazapee");
        primaryStage.setScene(new Scene(root, 960, 720));
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
//        ItemController controller = new ItemController();
//        controller.addData("snack","E",600,150,"E");
//        controller.showData();;
    }
}
