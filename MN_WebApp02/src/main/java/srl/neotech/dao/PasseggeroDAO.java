package srl.neotech.dao;

import org.springframework.stereotype.Component;

import srl.neotech.model.Aereo;
import srl.neotech.model.SingletonAerei;

@Component
public class PasseggeroDAO {

	public Integer restituisciIlNumeroDiPasseggeri(String idAereo) {
	   Integer valoreRestituito=null;
		
		for(Aereo aereo: SingletonAerei.getInstance().getListaAerei()) {
			if(aereo.getId().equals(idAereo)) {
				valoreRestituito=aereo.getNumPasseggeri();
			}
		}
	return valoreRestituito;	
	}
}
