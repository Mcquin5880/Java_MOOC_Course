package notifier;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class NotifierApplication extends Application {
 
    @Override
    public void start(Stage stage) throws Exception {
        TextField textField = new TextField();
        Button button = new Button("Update");
        Label text = new Label();
        
        VBox componentGroup = new VBox();
        componentGroup.getChildren().addAll(textField, button, text);
        button.setOnAction((event) -> {
            text.setText(textField.getText());
        });
        
        Scene viewport = new Scene(componentGroup);
 
        stage.setScene(viewport);
        stage.show();
    }
 
    public static void main(String[] args) {
        launch(NotifierApplication.class);
        System.out.println("Hello world!");
    }
 
}
