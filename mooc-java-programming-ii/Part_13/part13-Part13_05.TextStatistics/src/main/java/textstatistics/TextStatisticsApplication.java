package textstatistics;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class TextStatisticsApplication extends Application {
 
    @Override
    public void start(Stage stage) throws Exception {
        BorderPane componentGroup = new BorderPane();
        componentGroup.setCenter(new TextArea());
        
        HBox hbox = new HBox();
        hbox.setSpacing(20);
        hbox.getChildren().add(new Label("Letters: 0"));
        hbox.getChildren().add(new Label("Words: 0"));
        hbox.getChildren().add(new Label("The longest word is: "));
        
        componentGroup.setBottom(hbox);
        
        Scene viewport = new Scene(componentGroup);
 
        stage.setScene(viewport);
        stage.show();
    }
 
    public static void main(String[] args) {
        launch(TextStatisticsApplication.class);
        System.out.println("Hello world!");
    }
 
}
