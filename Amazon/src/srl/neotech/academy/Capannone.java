package srl.neotech.academy;

import java.util.ArrayList;

public class Capannone {
	
	private int mq;
	private int piani;
	
	
	ArrayList<String> listaStringhe;
	ArrayList<Integer> listaInteri;
	ArrayList<Prodotto> listaProdotti;
	
	public Capannone() {
		listaProdotti=new ArrayList<Prodotto>();
	}

	public int getMq() {
		return mq;
	}

	public void setMq(int mq) {
		this.mq = mq;
	}

	public int getPiani() {
		return piani;
	}

	public void setPiani(int piani) {
		this.piani = piani;
	}

	public ArrayList<Prodotto> getListaProdotti() {
		return listaProdotti;
	}

	public void setListaProdotti(ArrayList<Prodotto> listaProdotti) {
		this.listaProdotti = listaProdotti;
	}
	
	

}
