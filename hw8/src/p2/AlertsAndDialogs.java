package p2;

import java.util.Optional;

import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.TextInputDialog;

public class AlertsAndDialogs {

	public static void getAlert(String str) {
		Alert alert1 = new Alert(AlertType.ERROR);
		alert1.setTitle("Error Alert");
		alert1.setHeaderText("This is an  error alert");
		alert1.setContentText(str);
		alert1.showAndWait();
	}
	
	public static String getDialog(String str) {
		TextInputDialog dialog =  new TextInputDialog();
//		dialog.setTitle("Text Needed");
//		dialog.setHeaderText("header need to change");
		dialog.setContentText(str);
		
		Optional<String> result = dialog.showAndWait();
		return result.get();
	}
}
