package controller;

import java.io.IOException;

import javax.swing.JOptionPane;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class Controller2{

//	private TreeMap<String, Account> treeMap;
//	private Account account;
	@FXML
    private TextArea textArea;
	
	@FXML
    private TextField textField;
	
	public void changeSceneTo1(ActionEvent event) throws IOException {
	
		Parent root = FXMLLoader.load(getClass().getResource("/view/Scene.fxml"));
		Scene scene = new Scene(root,400,400);
		Stage window = (Stage)((Node) event.getSource()).getScene().getWindow();
		window.setWidth(600);
		window.setHeight(600);
		window.setScene(scene);
		window.show();
//		textArea.appendText("you are successfully logged out");
	}
	
	@FXML
	public void logOut(ActionEvent e) throws IOException {
		int i = JOptionPane.showConfirmDialog(null, "Do you want to log out");
//		JOptionPane.showMessageDialog(null,  "You are logged out", "", JOptionPane.PLAIN_MESSAGE);
	if(i == 0) {
		changeSceneTo1(e);
	}else {	
	}
	}
}
