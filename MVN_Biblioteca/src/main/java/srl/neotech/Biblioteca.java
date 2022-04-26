package srl.neotech;

import java.util.ArrayList;

public class Biblioteca {
	
	private String idirizzo;
	private ArrayList<Libro> listaLibri=new ArrayList<Libro>();
	
	
	public String getIdirizzo() {
		return idirizzo;
	}
	public void setIdirizzo(String idirizzo) {
		this.idirizzo = idirizzo;
	}
	
	public ArrayList<Libro> getListaLibri() {
		return listaLibri;
	}
	public void setListaLibri(ArrayList<Libro> listaLibri) {
		this.listaLibri = listaLibri;
	}
	
	
}
