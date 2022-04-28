package srl.neotech.services;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import srl.neotech.dao.ProdottoDAO;
import srl.neotech.model.Prodotto;

@Service
public class ProdottoService {
	
	@Autowired
	ProdottoDAO prodottoDAO;


	public void addProdotto(Prodotto prodotto) {
 
		prodottoDAO.addProdotto(prodotto);
		
	}
	
	public  ArrayList<Prodotto> getListaProdotti() {
		return prodottoDAO.getListaProdotti();	
	}
	
	
   public  ArrayList<Prodotto> getListaProdotti(String idTipologia) {	
		
	   //tutta la lista dei prodotti
	   ArrayList<Prodotto>  listaProdotti=prodottoDAO.getListaProdotti();
		
	   //Lista che il metodo restituirà
	   ArrayList<Prodotto>  listaProdottiFiltrati=new ArrayList<Prodotto>();
		
	  for(Prodotto prodottoDaAnalizzare: listaProdotti) {
		     if(prodottoDaAnalizzare.getTipologia().toString().equals(idTipologia))  listaProdottiFiltrati.add(prodottoDaAnalizzare);    
	  }
  	    
	   return listaProdottiFiltrati;
		
	}
}
