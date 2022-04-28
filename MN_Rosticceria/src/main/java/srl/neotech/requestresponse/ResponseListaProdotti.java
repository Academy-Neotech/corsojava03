package srl.neotech.requestresponse;

import java.util.ArrayList;

import srl.neotech.model.Prodotto;

public class ResponseListaProdotti extends ResponseBase{
	
	private ArrayList<Prodotto> prodotti=new ArrayList<Prodotto>();

	public ArrayList<Prodotto> getProdotti() {
		return prodotti;
	}

	public void setProdotti(ArrayList<Prodotto> prodotti) {
		this.prodotti = prodotti;
	}

	
	
	
}
