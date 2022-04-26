package srl.neotech.acadermy;

public class Automobile {

	private String targa;
	private String Colore;
	private Motore motore;
	private Stato statoCorrente;
	private GiorniDellaSettimana giornoDiRitiro;
	
	
	public Automobile() {
		motore=new Motore();
	}
	
	
	
	public GiorniDellaSettimana getGiornoDiRitiro() {
		return giornoDiRitiro;
	}



	public void setGiornoDiRitiro(GiorniDellaSettimana giornoDiRitiro) {
		this.giornoDiRitiro = giornoDiRitiro;
	}



	public Stato getStatoCorrente() {
		return statoCorrente;
	}


	public void setStatoCorrente(Stato statoCorrente) {
		this.statoCorrente = statoCorrente;
	}


	public String getTarga() {
		return targa;
	}
	public void setTarga(String targa) {
		this.targa = targa;
	}
	public String getColore() {
		return Colore;
	}
	public void setColore(String colore) {
		Colore = colore;
	}
	public Motore getMotore() {
		return motore;
	}
	public void setMotore(Motore motore) {
		this.motore = motore;
	}
	
	@Override
	public String toString() {
		return this.targa+"..."+this.Colore;
	}
	
	
	
	
}
