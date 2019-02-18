package application;

import java.io.Serializable;

public class Contatto implements Serializable {

	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	private String nome;
	private String cognome;
	private String mail;

	public Contatto(String nome, String cognome, String mail) {
		this.nome = nome;
		this.cognome = cognome;
		this.mail = mail;
	}

	@Override
	public String toString() {
		return "Contatto [nome=" + nome + ", cognome=" + cognome + ", mail=" + mail + "]";
	}

	public String getName() {
		return this.nome;
	}
public String getSurname() {
		return this.cognome;
	}
	public String getMail() {
		return this.mail;
	}






}
