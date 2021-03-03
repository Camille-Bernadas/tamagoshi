package toto;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.stage.Stage;
 
public class test extends Application {
	   public static void main(String[] args) {
	        launch(args);
	    }
	 
	    @Override
	    public void start(Stage primaryStage) {
	        primaryStage.setTitle("Drawing Operations Test");
	        Group root = new Group();
	        TotoPane tp = new TotoPane(10000,10000);
	        tp.drawAll();
	        primaryStage.setScene(new Scene(root));
	        primaryStage.show();
	    }
}
