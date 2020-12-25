package p2;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Demo extends Application{

	@Override
	public void start(Stage primaryStage) throws Exception {
		
//		Run.start(primaryStage);
		Parent root = FXMLLoader.load(getClass().getResource("Graph1.fxml"));
		Scene scene = new Scene(root);
		primaryStage.setScene(scene);
		System.out.println("scene good");
		primaryStage.show();
		System.out.println("stage");
	}

	public static void main(String[] args) {
		launch(args);
	}
}
