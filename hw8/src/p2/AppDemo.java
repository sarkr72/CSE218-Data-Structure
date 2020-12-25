package p2;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class AppDemo extends Application{

	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage stage) throws Exception {
		AppDemo app = new AppDemo();
		ApiTreeMap map = new ApiTreeMap(app, stage);
		stage.setScene(new Scene(map.getPane(), 800, 500));
		stage.show();
	}

}
