package p2;

import java.util.TreeMap;

import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class ApiTreeMap {

	BorderPane pane = new BorderPane();
	private TextField userNameField;
	private TextField passwordField;
	private TextField numberField;

	private Button createAccBtn;
	private Button logInBtn;
	private Button logOutBtn;

	private TextArea textArea;
	private HBox createAccBox;
	private HBox buttonBox;
	private HBox textFieldBox;
	private VBox root;

	Account account;
	private String userName;
	private String password;

	TreeMap<String, Account> treeMap;
	private Stage stage;
	private AppDemo app;

	public ApiTreeMap(AppDemo app, Stage stage) {
		treeMap = new TreeMap<>();
		buildTextFields();
		buildButtons();
		buildHboxes();
		buildVBox();
		handleEvent();
		this.stage = stage;
		this.app = app;
	}

	private void handleEvent() {
		createAccBtn.setOnAction(e -> {
			userName = userNameField.getText();
			int i = 0;
			int digit = 0;
			int letter = 0;
			boolean b = true;
			while (b == true) {
				for (int j = 0; j < userName.length(); j++) {
					if ((userName.charAt(i) + "").matches("^[a-zA-Z0-9]*$")) {
						i++;
					}
					if(Character.isLetter(userName.charAt(j))){
						letter++;
					}
					if(Character.isDigit(userName.charAt(j))) {
						digit++;
					}
				}
				if (i < 5 || digit < 1 || letter < 1) {
					AlertsAndDialogs.getAlert("UserName did not meet the requirements");
					userName = userNameField.getText();
				} else {
					break;
				}
			}
			password = passwordField.getText();
			int k = 0;
			while (b == true) {
				for (int j = 0; j < userName.length(); j++) {
					if ((userName.charAt(j) + "").matches("^[a-zA-Z0-9]*$")) {
						k++;
					}
				}
				if (k < 5) {
					AlertsAndDialogs.getAlert("Password did not meet the requirements");
					password = passwordField.getText();
				} else {
					b = false;
				}
			}
			userName = userName.toLowerCase();
			account = new Account(userName, password);
			treeMap.put(userName, account);

			userNameField.clear();
			passwordField.clear();
		});

		logInBtn.setOnAction(e1 -> {
			userName = userNameField.getText();
			password = passwordField.getText();
			userName = userName.toLowerCase();
			
			if (treeMap.get(userName).getPassword().compareTo(password) == 0) {
//				AlertsAndDialogs.getDialog("You are successfully logged in");
				root = new VBox();
				textArea = new TextArea();
				textArea.setMaxHeight(100);
				textArea.setMaxWidth(100);
				textArea.appendText("You are successfully logged in");
				root.getChildren().addAll(logOutBtn, textArea);
				try {
					app.start(stage);
				} catch (Exception e3) {
					e3.printStackTrace();
				}
				logOutBtn.setOnAction(e2 -> {
					AlertsAndDialogs.getDialog("You are successfully logged out");
				});
			} else {
				AlertsAndDialogs.getAlert("Username or assword did not match!");
				userName = userNameField.getText();
				password = passwordField.getText();
			}

		});
	}

	private void buildVBox() {
		root = new VBox(10);
		root.setAlignment(Pos.CENTER);

		Label label = new Label("welcome to dark world");
		label.setAlignment(Pos.CENTER);
		root.getChildren().addAll(label, createAccBox, textFieldBox, buttonBox);
	}

	private void buildHboxes() {
		textFieldBox = new HBox(10);
		buttonBox = new HBox(50);
		createAccBox = new HBox(10);
		createAccBox.setAlignment(Pos.TOP_RIGHT);
		textFieldBox.setAlignment(Pos.CENTER);
		buttonBox.setAlignment(Pos.CENTER);

		textFieldBox.getChildren().addAll(userNameField, passwordField, numberField);
		buttonBox.getChildren().addAll(logInBtn);
		createAccBox.getChildren().add(createAccBtn);
	}

	private void buildTextFields() {
		userNameField = new TextField();
		userNameField.setPromptText("username");
		passwordField = new TextField();
		passwordField.setPromptText("password");
		numberField = new TextField();
		numberField.setPromptText("phone number");
		createAccBtn = new Button("Create Account");
	}

	private void buildButtons() {
		createAccBtn = new Button("Create Account");
		logInBtn = new Button("Log In");
		logOutBtn = new Button("Log Out");
	}
	
	public Pane getPane() {
		return root;
	}
}
