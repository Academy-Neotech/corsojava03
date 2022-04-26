package srl.neotech.academy.automobile;

public class Automobile {

	private String targa;
	private String colore;
	private String marca;
	private String modello;
	
	private Motore motore;
	
	
	public Automobile() {
	   motore=new Motore();	  
	}
	
	
	
	public String getTarga() {
		return targa;
	}
	public void setTarga(String targa) {
		this.targa = targa;
	}
	public String getColore() {
		return colore;
	}
	public void setColore(String colore) {
		this.colore = colore;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getModello() {
		return modello;
	}
	public void setModello(String modello) {
		this.modello = modello;
	}
	
	public Motore getMotore() {
		return motore;
	}
	public void setMotore(Motore motore) {
		this.motore = motore;
	}
	
	
	
	
	
}
