package srl.neotech.model;

import java.util.ArrayList;

public class BaseDatiBuster {
	
	//istanza privata statica
	private static BaseDatiBuster instance;
	
	
	private ArrayList<Video>  listaVideo=new ArrayList<Video>();
	private ArrayList<Utente> listaUtenti=new ArrayList<Utente>();
	
	
	//costruttore privato
	private BaseDatiBuster() {
		
	}
	
	//meotodo statico di accesso al singleton
	public static BaseDatiBuster getInstance() {
		if(instance==null) instance =new BaseDatiBuster();
	return instance;
	}

	public ArrayList<Video> getListaVideo() {
		return listaVideo;
	}

	public void setListaVideo(ArrayList<Video> listaVideo) {
		this.listaVideo = listaVideo;
	}

	public ArrayList<Utente> getListaUtenti() {
		return listaUtenti;
	}

	public void setListaUtenti(ArrayList<Utente> listaUtenti) {
		this.listaUtenti = listaUtenti;
	}
	
	
	

}
