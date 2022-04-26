package srl.neotech.academy;

public class PompaDiBenzina {
	private String indirizzo;
	
	
public Motocicletta faiIlPieno(Motocicletta motocicletta) {
	motocicletta.setLivelloBenzina(100);
	return motocicletta;	
}


public String getIndirizzo() {
	return this.indirizzo;
}


public void setIndirizzo(String indirizzo) {
	this.indirizzo = indirizzo;
}



}
