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


public class inserimentoController {

	ArrayList<Contatto> contatti;

	@FXML

	TextField nome;

	@FXML

	TextField cognome;

	@FXML

	TextField mail;

	@FXML
	void initialize() {

		try {
			FileInputStream fileInputStream = new FileInputStream("contatti.ser");
			ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
			contatti = (ArrayList<Contatto>)objectInputStream.readObject();

			System.out.println(contatti);

		} catch (IOException | ClassNotFoundException e) {
			contatti = new ArrayList<>();

		}
	}

	@FXML
	private void salva(){

		String n = nome.getText();
		String c = cognome.getText();
		String m = mail.getText();

		Contatto contatto = new Contatto(n, c, m);

		contatti.add(contatto);

		try {
			FileOutputStream fileOutputStream = new FileOutputStream("contatti.ser");
			ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
			objectOutputStream.writeObject(contatti);
			objectOutputStream.close();
		} catch (IOException e) {


			e.printStackTrace();
		}





	}



}
