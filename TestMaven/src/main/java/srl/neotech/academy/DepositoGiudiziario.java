package srl.neotech.academy;

import java.util.ArrayList;

public class DepositoGiudiziario {

	private ArrayList<String> targhe=new ArrayList<String>();
	
	
	public void rilasciaTarga(String targa) {
		this.targhe.add(targa);
	}


	public ArrayList<String> getTarghe() {
		return targhe;
	}


	public void setTarghe(ArrayList<String> targhe) {
		this.targhe = targhe;
	}
	
	
	
	
}
