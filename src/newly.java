import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TitledPane;
import javafx.scene.layout.TilePane;
import javafx.stage.Stage;
public class newly extends Application{
    public void start(Stage s) {
        s.setTitle("JavaFX Introduction");
        TilePane t=new TilePane();
        Button b=new Button();
        Label l=new Label();
        t.getChildren().add(b);
        t.getChildren().add(l);
        Scene sc=new Scene(t,200,200);
        s.setScene(sc);
        s.show();
    }
    public static void main(String args[]) {
        launch(args);
    }
}