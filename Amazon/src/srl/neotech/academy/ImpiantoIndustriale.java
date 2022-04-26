package srl.neotech.academy;

import java.util.ArrayList;

public class ImpiantoIndustriale {
	
	private String citta;
	private int mQuadri;
	
	ArrayList<Capannone> capannoni;

	
	public ImpiantoIndustriale() {
		capannoni=new ArrayList<Capannone>();
		
	}
	public String getCitta() {
		return citta;
	}

	public void setCitta(String citta) {
		this.citta = citta;
	}

	public int getmQuadri() {
		return mQuadri;
	}

	public void setmQuadri(int mQuadri) {
		this.mQuadri = mQuadri;
	}

	public ArrayList<Capannone> getCapannoni() {
		return capannoni;
	}

	public void setCapannoni(ArrayList<Capannone> capannoni) {
		this.capannoni = capannoni;
	}
	
	
	

}
