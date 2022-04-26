package srl.neotech.controllers;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import srl.neotech.model.Aereo;
import srl.neotech.model.SingletonAerei;
import srl.neotech.requestresponse.ResponseBase;
import srl.neotech.services.PasseggeroService;

@RestController
public class PasseggeroAPIController {

	 private static final Logger logger = LogManager.getLogger(AereoAPIController.class);
	 
	 @Autowired
	 PasseggeroService passeggeroService;
	 
	 /*
	  * Tramite un codice Aereo(String) deve ritornare il numero di passeggeri a bordo
	  */
	 @ResponseBody
	 @GetMapping(value = "/api/getNumPasseggeri/{idAereo}",produces = MediaType.APPLICATION_JSON_VALUE)
	 public ResponseBase getNumPasseggeri(@PathVariable("idAereo") String idAereo) {
		 
		 Aereo a1=new Aereo();
	     a1.setId("GGBH");
	     a1.setNumPasseggeri(67);
	     
	     SingletonAerei.getInstance().getListaAerei().add(a1);
	     
	     Aereo a2=new Aereo();
	     a2.setId("FFGR");
	     a2.setNumPasseggeri(367);
	     SingletonAerei.getInstance().getListaAerei().add(a2);
		 
		 
          ResponseBase response=new ResponseBase();		
          
          //logica di business tramite un service che accetta una Stringa idAereo e ritorna un numero
          Integer numeroPasseggeri=passeggeroService.getNumeroPasseggeri(idAereo);
          response.setSimpleData(numeroPasseggeri); 
          
     return response;
	 }
	
	
}
