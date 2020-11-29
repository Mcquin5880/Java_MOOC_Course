package buttonandlabel;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;
import javafx.scene.control.Button;

public class ButtonAndLabelApplication extends Application {
 
    @Override
    public void start(Stage stage) throws Exception {
        Button button = new Button("Button");
        Label text = new Label("Text");
 
        FlowPane componentGroup = new FlowPane();
        componentGroup.getChildren().add(button);
        componentGroup.getChildren().add(text);
 
        Scene view = new Scene(componentGroup);
 
        stage.setScene(view);
        stage.show();
    }
 
    public static void main(String[] args) {
        launch(ButtonAndLabelApplication.class);
        System.out.println("Hello world!");
    }
 
}
