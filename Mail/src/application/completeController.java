package application;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;


public class completeController {

	private Main main;
	private BorderPane root;

	@FXML
	void showPrint(){
        /* apri la finestra della stampa  */

		root.setCenter(main.getLeggiGUI());
        }
    @FXML
	void showInput(){
        /* apri la finestra dell'inserimeto  */
    	root.setCenter(main.getInserimentoGUI());
        }

	void setRoot(BorderPane root) {
		this.root = root;

	}
	void setMain(Main main) {
		this.main = main;
	}

}
