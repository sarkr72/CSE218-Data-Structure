package p2_app;
	
import java.io.IOException;
import java.util.TreeMap;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.fxml.FXMLLoader;


public class Main extends Application {
	private static TreeMap<String, Account> treeMap = new TreeMap<>();
	@Override
	public void start(Stage primaryStage) throws IOException {
		
			Parent root = FXMLLoader.load(getClass().getResource("/view/Scene.fxml"));
			Scene scene = new Scene(root,400,400);
			primaryStage.setScene(scene);
			primaryStage.setWidth(600);
			primaryStage.setHeight(600);
			primaryStage.show();
	}
	public static void main(String[] args) {
		launch(args);
	}
	
	public static TreeMap<String, Account> getTreeMap() {
		return treeMap;
	}
}
