package srl.neotech.model;

import java.util.ArrayList;

import org.springframework.stereotype.Component;

@Component
public class SingletonAerei {
	
	private static SingletonAerei instance;

	private ArrayList<Aereo> listaAerei=new ArrayList<Aereo>();

	
	public static SingletonAerei getInstance() {
		if(instance == null) {
		instance = new SingletonAerei();
		}
		return instance;
		}


	public ArrayList<Aereo> getListaAerei() {
		return listaAerei;
	}


	public void setListaAerei(ArrayList<Aereo> listaAerei) {
		this.listaAerei = listaAerei;
	}
	
	
	
}
