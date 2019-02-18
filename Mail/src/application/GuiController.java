package application;

import javafx.fxml.FXML;




public class GuiController {
	@FXML
	String name;
	@FXML
	String surname;
	@FXML
	String mail;

	Persona p = new Persona();

	void readName(){
		p.setName(name);


	}

	void readSurname(){
		p.setSurname(surname);

	}

	void readMail(){
		p.setMail(mail);

	}

	void Save(){
/* salva(p,file)    */

	}



}
