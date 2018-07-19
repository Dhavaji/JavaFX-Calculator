package application;

import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;


public class Main extends Application {

	@Override
    public void start(Stage stage) throws Exception {
		Parent root = FXMLLoader.load(this.getClass().getResource("Calc.fxml"));

		Scene scene = new Scene(root, 250, 300);

		stage.setTitle("Calculator");
		stage.setMinHeight(300.0);
		stage.setMinWidth(250.0);
		stage.setScene(scene);
		stage.show();
    }

	public static void main(String[] args) {
		launch(args);
	}
}
