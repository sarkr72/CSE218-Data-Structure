package p3;

import java.io.FileNotFoundException;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class Demo {

	public static class Main extends Application {
		@Override
		public void start(Stage primaryStage) throws FileNotFoundException {
//			BookObjects.createBooks();
			
			ChangingColors.getFxProgram(primaryStage);
		}
		
		public static void main(String[] args) {
			launch(args);
		}

}
}
