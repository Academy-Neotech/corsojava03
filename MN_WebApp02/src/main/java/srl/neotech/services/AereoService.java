package srl.neotech.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import srl.neotech.dao.AereoDAO;
import srl.neotech.model.Aereo;

@Service
public class AereoService {

	@Autowired
	AereoDAO aereoDAO;
	
	
	public void addAereo(Aereo aereo) {
		aereoDAO.addAereo(aereo);
	}
	
	public Integer getNumeroAerei() {
		int numeroAerei=aereoDAO.getNumeroAerei();
		return Integer.valueOf(numeroAerei);
	}
	
	public Aereo getAereo(String id) {
		Aereo aereo=aereoDAO.getAereo(id);
		
		if(aereo==null) {
			aereo=new Aereo(); 
		}
		return aereo;
	}
}
