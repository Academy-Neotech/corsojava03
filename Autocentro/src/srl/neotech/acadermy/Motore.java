package srl.neotech.acadermy;

public class Motore {
	
	private String codiceSeriale;
	private int kmPercorsi;
	private String alimentazione;
	private int cilindrata;
	private Stato statoCorrente;
	
	
	
	
	public Stato getStatoCorrente() {
		return statoCorrente;
	}
	public void setStatoCorrente(Stato statoCorrente) {
		this.statoCorrente = statoCorrente;
	}
	public String getCodiceSeriale() {
		return codiceSeriale;
	}
	public void setCodiceSeriale(String codiceSeriale) {
		this.codiceSeriale = codiceSeriale;
	}
	public int getKmPercorsi() {
		return kmPercorsi;
	}
	public void setKmPercorsi(int kmPercorsi) {
		this.kmPercorsi = kmPercorsi;
	}
	public String getAlimentazione() {
		return alimentazione;
	}
	public void setAlimentazione(String alimentazione) {
		this.alimentazione = alimentazione;
	}
	public int getCilindrata() {
		return cilindrata;
	}
	public void setCilindrata(int cilindrata) {
		this.cilindrata = cilindrata;
	}

	
}
