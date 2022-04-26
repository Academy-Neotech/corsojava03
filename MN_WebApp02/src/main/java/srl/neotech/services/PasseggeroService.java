package srl.neotech.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import srl.neotech.dao.PasseggeroDAO;

@Service
public class PasseggeroService {

	@Autowired
	PasseggeroDAO passeggeroDAO;
	
	public Integer getNumeroPasseggeri(String idAereo) {
		
		Integer numeroPasseggeri=null;
		if(idAereo.equals("0000")) {
			numeroPasseggeri=0;
		}
		else if(idAereo.equals("9999")) {
			    numeroPasseggeri=9999;
		}
		else {
		    numeroPasseggeri=passeggeroDAO.restituisciIlNumeroDiPasseggeri(idAereo);
		    }
		
	return numeroPasseggeri;
	}
	
	
}
