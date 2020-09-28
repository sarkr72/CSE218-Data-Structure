package p5;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class ChangingColors {
	private static Button[] buttons = new Button[100];

	public static void getFxProgram(Stage primaryStage) {
		GridPane gridPane = new GridPane();
		gridPane.setAlignment(Pos.CENTER);
		gridPane.setVgap(10);
		gridPane.setHgap(10);
		for (int i = 0; i < 100; i++) {
			buttons[i] = new Button("Button " + i);
//			gridPane.add(buttons[i], i, i);
		}

		int row = 0;
		int col = 0;
		int i = 0;
		for (int j = 0; j < 10; j++) {
			for (int k = 0; k < 10; k++) {
				gridPane.add(buttons[i++], j, k);
			}
		}
		Button undoButton = new Button("Undo");
		gridPane.add(undoButton, 5, 11);
		Stack stack = new Stack();

		for (int k = 0; k < 100; k++) {
			final int l = k;
			buttons[l].setOnAction(s -> {
				buttons[l].setStyle("-fx-background-color: Red");
				stack.push(buttons[l]);
		});
		}
		
		undoButton.setOnAction(s1 -> {
//						if(buttons[r].getStyle().contains("-fx-background-color: Red")) {
					((Node)stack.pop()).setStyle("");
		});

		BorderPane root = new BorderPane();
		VBox box = new VBox(5);
		root.setMargin(box, new Insets(50));
		box.setAlignment(Pos.CENTER);
		box.getChildren().add(gridPane);

		root.setCenter(gridPane);
		primaryStage.setScene(new Scene(root, 900, 700));
		primaryStage.show();
	}
}
