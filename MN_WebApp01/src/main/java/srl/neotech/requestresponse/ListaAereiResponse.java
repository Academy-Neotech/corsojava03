package srl.neotech.requestresponse;

import java.util.ArrayList;

import srl.neotech.model.Aereo;

public class ListaAereiResponse {
	
	ArrayList<Aereo> listaAereiRestituiti=new ArrayList<Aereo>();

	public ArrayList<Aereo> getListaAereiRestituiti() {
		return listaAereiRestituiti;
	}

	public void setListaAereiRestituiti(ArrayList<Aereo> listaAereiRestituiti) {
		this.listaAereiRestituiti = listaAereiRestituiti;
	}
	
	

}
