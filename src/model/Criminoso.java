package model;

public class Criminoso extends Pessoa {
	private int id;
	private String apelido;

	public String getApelido() {
		return apelido;
	}

	public void setApelido(String apelido) {
		this.apelido = apelido;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	} 
}
