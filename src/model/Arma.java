package model;

public class Arma {
	
	private int id;
	private int calibre;
	private String tipo;
	private String modelo;
	private String fabricante;	
	
	public int getCalibre() {
		return calibre;
	}
	public void setCalibre(int calibre) {
		this.calibre = calibre;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public String getFabricante() {
		return fabricante;
	}
	public void setFabricante(String fabricante) {
		this.fabricante = fabricante;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
}
