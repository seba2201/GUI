package application;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;


public class Main extends Application {
	private AnchorPane inserimentoPane;
	private AnchorPane visPane;

	@Override
	public void start(Stage primaryStage) {
		try {

			//caricamento delle gui
			BorderPane root ;
			FXMLLoader loader = new FXMLLoader();
			loader.setLocation(Main.class.getResource("Menu.fxml"));
			root = loader.load();

			completeController completeCtrller =  loader.getController();
			completeCtrller.setRoot(root);
			completeCtrller.setMain(this);

			FXMLLoader loader2 = new FXMLLoader();
			loader2.setLocation(Main.class.getResource("InserimentoContatto.fxml"));
			inserimentoPane = loader2.load();

			root.setCenter(inserimentoPane);

			FXMLLoader loader3 = new FXMLLoader();
			loader3.setLocation(Main.class.getResource("LeggiContatto.fxml"));
			visPane = loader3.load();


			Scene scene = new Scene(root,400,400);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setScene(scene);
			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		launch(args);
	}

	Node getInserimentoGUI() {
		// TODO Auto-generated method stub
		return inserimentoPane;
	}

	Node getLeggiGUI() {
		return visPane;
	}
}
