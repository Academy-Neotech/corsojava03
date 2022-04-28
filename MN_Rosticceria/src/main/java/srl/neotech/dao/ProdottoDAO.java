package srl.neotech.dao;

import java.util.ArrayList;

import org.springframework.stereotype.Component;

import srl.neotech.model.DatiRosticceria;
import srl.neotech.model.Prodotto;

@Component
public class ProdottoDAO {

	
	public void addProdotto(Prodotto prodotto) {
		
       DatiRosticceria.getInstance().getListino().add(prodotto);
		
	}
	
	
	public ArrayList<Prodotto> getListaProdotti(){
		return DatiRosticceria.getInstance().getListino();	
	}
	
}
