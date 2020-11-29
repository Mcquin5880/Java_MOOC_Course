package buttonandtextfield;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class ButtonAndTextFieldApplication extends Application {
 
    @Override
    public void start(Stage stage) throws Exception {
        Button button = new Button("Button");
        TextField textfield = new TextField("Text");
 
        FlowPane componentGroup = new FlowPane();
        componentGroup.getChildren().add(button);
        componentGroup.getChildren().add(textfield);
 
        Scene view = new Scene(componentGroup);
 
        stage.setScene(view);
        stage.show();
    }
 
    public static void main(String[] args) {
        launch(ButtonAndTextFieldApplication.class);
        System.out.println("Hello world!");
    }
 
}
