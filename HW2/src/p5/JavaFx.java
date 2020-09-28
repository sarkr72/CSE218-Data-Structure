package p5;

import java.io.FileNotFoundException;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;
import p4.BookObjects;

public class JavaFx {

	public static class Main extends Application {
		@Override
		public void start(Stage primaryStage) throws FileNotFoundException {
//			BookObjects.createBooks();
			
			ChangingColors.getFxProgram(primaryStage);
//			try {
//				BorderPane root = new BorderPane();
//			
//				root.getChildren().addAll();
//				Scene scene = new Scene(root,400,400);
//				primaryStage.setScene(scene);
//				primaryStage.show();
				
//			} catch(Exception e) {
//				e.printStackTrace();
//			}
		}
		
		public static void main(String[] args) {
			launch(args);
		}

}
}
