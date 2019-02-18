package application;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

import javafx.fxml.FXML;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;


public class LeggiController {

	@FXML
	TextArea area;

	String name,surn,mail;
	String contattistring="";

	ArrayList<Contatto> contatti;

	@FXML
	void initialize() {

		try {
			FileInputStream fileInStream = new FileInputStream("contatti.ser");
			ObjectInputStream objectInStream = new ObjectInputStream(fileInStream);
			contatti = (ArrayList<Contatto>)objectInStream.readObject();
			stampa();
		} catch (IOException | ClassNotFoundException e) {
			contatti = new ArrayList<>();

		}

	}
	private void stampa(){
			contattistring = "";
			int c = 0;
			contattistring+="\tNome\t\tCognome\t\tMail\n";
		for (Contatto contatto : contatti) {
			name = contatto.getName();
			surn = contatto.getSurname();
			mail = contatto.getMail();
			contattistring += c+"\t"+name+"\t\t"+surn+"\t\t"+mail+"\n";
		}
		System.out.println(contattistring);
		area.setText(contattistring);
	}
void refresh(){
	initialize();

}


}
