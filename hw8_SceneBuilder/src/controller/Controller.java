package controller;

import java.io.IOException;
import java.util.TreeMap;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import p2_app.Account;
import p2_app.Main;

public class Controller{
	private String userName;
	private String password;
	private static Account account;
	
	private TreeMap<String, Account> treeMap = Main.getTreeMap();
	@FXML
	private TextField userNameField;

	@FXML
	private TextField passwordField;

	@FXML
	private Button logInBtn;

	@FXML
	private Button CreateAcc;

	@FXML
	private TextArea textArea;

	@FXML
	private Button logOutBtn;

	public void changeScene(ActionEvent event) throws IOException {
		Parent root = FXMLLoader.load(getClass().getResource("/view/Scene2.fxml"));
		Scene scene = new Scene(root,400,400);
		Stage window = (Stage)((Node) event.getSource()).getScene().getWindow();
		window.setTitle("logged out");
		window.setWidth(600);
		window.setHeight(600);
		window.setScene(scene);
		window.show();
		
	}
	
	public void createAccount(ActionEvent event) {
		userName = userNameField.getText();
		int i = 0;
		int digit = 0;
		int letter = 0;
		for (int j = 0; j < userName.length(); j++) {
			if ((userName.charAt(j) + "").matches("^[a-zA-Z0-9]*$")) {
				i++;
				if (Character.isLetter(userName.charAt(j))) {
					letter++;
				}
				if (Character.isDigit(userName.charAt(j))) {
					digit++;
				}
			}
		}
		if (i < 5 || digit < 1 || letter < 1) {
			textArea.clear();
			textArea.appendText(("UserName did not meet the requirements"));
			userName = userNameField.getText();
		} else {
			userName.toLowerCase();
			password = passwordField.getText();
			int k = 0;
			for (int j = 0; j < password.length(); j++) {
				if ((password.charAt(j) + "").matches("^[a-zA-Z0-9]*$")) {
					k++;
				}
			}
			if (k < 5) {
				textArea.clear();
				textArea.appendText(("Password did not meet the requirements"));
			} else {
				password = passwordField.getText();
			}

			 account = new Account(userName, password);
			treeMap.put(userName, account);
			userNameField.clear();
			passwordField.clear();
		}
	}

	public void logIn(ActionEvent event) throws IOException {
		userName = userNameField.getText();
		password = passwordField.getText();
		userName = userName.toLowerCase();

		if (treeMap.containsKey(userName)) {
			if (treeMap.get(userName).getPassword().compareTo(password) == 0) {
				textArea.clear();
				textArea.appendText("You are successfully logged in \n");
				textArea.appendText(treeMap.firstEntry() + "");
				changeScene(event);
			} else {
				textArea.clear();
				textArea.appendText("Password did not match");
			}

		} else {
			textArea.clear();
			textArea.appendText(("Username or password did not match!"));
		}
		userName = userNameField.getText();
		password = passwordField.getText();
	}

	public static Account getAccount() {
		return account;
	}
	
	public TreeMap<String, Account> getTreeMap() {
		return this.treeMap;
	}


//	@Override
//	public void initialize(URL arg0, ResourceBundle arg1) {
//		
//	}
}
