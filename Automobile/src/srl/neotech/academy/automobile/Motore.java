package srl.neotech.academy.automobile;

public class Motore {
	
	private int cilindrata;
	private String modello;
	private String alimentazione;
	
	private Cilindro cilindro;
	
	
	public Motore() {
		cilindro=new Cilindro();
	}
	
	public int getCilindrata() {
		return cilindrata;
	}
	public void setCilindrata(int cilindrata) {
		this.cilindrata = cilindrata;
	}
	public String getModello() {
		return modello;
	}
	public void setModello(String modello) {
		this.modello = modello;
	}
	public String getAlimentazione() {
		return alimentazione;
	}
	public void setAlimentazione(String alimentazione) {
		this.alimentazione = alimentazione;
	}
	public Cilindro getCilindro() {
		return cilindro;
	}
	public void setCilindro(Cilindro cilindro) {
		this.cilindro = cilindro;
	}
	
	
	
	

}
