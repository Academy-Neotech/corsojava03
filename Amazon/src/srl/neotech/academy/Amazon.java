package srl.neotech.academy;

import java.util.ArrayList;

public class Amazon {

	String piva;
	String urlDelSito;
	
	ArrayList<ImpiantoIndustriale> impiantiIndustriali;

	public Amazon() {
		impiantiIndustriali=new ArrayList<ImpiantoIndustriale>();
		
		
	}
	public String getPiva() {
		return piva;
	}

	public void setPiva(String piva) {
		this.piva = piva;
	}

	public String getUrlDelSito() {
		return urlDelSito;
	}

	public void setUrlDelSito(String urlDelSito) {
		this.urlDelSito = urlDelSito;
	}

	public ArrayList<ImpiantoIndustriale> getImpiantiIndustriali() {
		return impiantiIndustriali;
	}

	public void setImpiantiIndustriali(ArrayList<ImpiantoIndustriale> impiantiIndustriali) {
		this.impiantiIndustriali = impiantiIndustriali;
	}
	
	
	
	
}
