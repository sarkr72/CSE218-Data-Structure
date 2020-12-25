package p3_app;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import p3_model.BookStore;

public class Main3 extends Application{

	private static BookStore bStore;
	
	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		bStore  = new BookStore();
		Parent root = FXMLLoader.load(getClass().getResource("/view/View2.fxml"));
		Scene scene = new Scene(root,400,400);
		primaryStage.setScene(scene);
		primaryStage.setWidth(600);
		primaryStage.setHeight(600);
		primaryStage.show();
	}
	
	public static BookStore getBookStore() {
		return bStore;
	}

}
