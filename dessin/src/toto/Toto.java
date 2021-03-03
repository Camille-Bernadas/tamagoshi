package toto;

import javafx.application.Application;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
/**
 * 
 * @author bernadasc
 *
 */
public class Toto extends Application {
    public static void main(String[] args) {
        launch(args);
    }
    
    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Hello World!");
        TotoPane ttp = new TotoPane(400,400);
        
        Pane root = new Pane();
        root.getChildren().add(ttp);


        primaryStage.setScene(new Scene(root, 400, 400));
        
        
        primaryStage.show();
    }
}
