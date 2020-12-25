package application;

import java.util.TreeMap;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class SampleController {
	private String userName;
	private String password;
	private TreeMap<String, Account> treeMap = new TreeMap<>();
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

	@FXML
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
		

		Account account = new Account(userName, password);
		treeMap.put(userName, account);
		userNameField.clear();
		passwordField.clear();
	}
	}

	@FXML
	void getUserName(ActionEvent event) {
	}

	@FXML
	void getPassword(ActionEvent event) {

	}

	@FXML
	public void logIn(ActionEvent event) {
		userName = userNameField.getText();
		password = passwordField.getText();
		userName = userName.toLowerCase();

		if (treeMap.containsKey(userName)) {
			if(treeMap.get(userName).getPassword().compareTo(password) == 0) {
			textArea.clear();
			textArea.appendText("You are successfully logged in \n");
			textArea.appendText(treeMap.firstEntry() + "");
			}else {
				textArea.clear();
				textArea.appendText("Password did not match");
			}

		}else {
			textArea.clear();
			textArea.appendText(("Username or password did not match!"));
		}
		userName = userNameField.getText();
		password = passwordField.getText();
	}

//	@Override
//	public void initialize(URL arg0, ResourceBundle arg1) {
//		
//	}
}
