package srl.neotech.controllers;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import srl.neotech.model.Aereo;
import srl.neotech.requestresponse.RequestAddAereo;
import srl.neotech.requestresponse.ResponseGetAereo;
import srl.neotech.requestresponse.ResponseBase;
import srl.neotech.services.AereoService;

@RestController
public class AereoAPIController {

	 private static final Logger logger = LogManager.getLogger(AereoAPIController.class);
	 
	 //Strato Service di business
	 @Autowired
	 AereoService aereoService;
	 
	 
	 @ResponseBody
	 @GetMapping(value = "/api/getNumAerei",produces = MediaType.APPLICATION_JSON_VALUE)
	 public ResponseBase getNumAerei() {
		ResponseBase response=new ResponseBase();
		
		
		 try {
			Integer numAerei=aereoService.getNumeroAerei();
			
			
			response.setCode("OK");
			response.setSimpleData(numAerei);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			response.setCode("KO");
			response.setDescr(e.getMessage());
		} 
		 
		 return response;
	 }
	 
	 
	 @ResponseBody
	 @GetMapping(value = "/api/getAereo/{id}",produces = MediaType.APPLICATION_JSON_VALUE)
	 public ResponseGetAereo getAereo(@PathVariable("id") String idAereo) {
		 ResponseGetAereo response=new ResponseGetAereo();
		 
		 try {
			Aereo aereo=aereoService.getAereo(idAereo);
			 response.setAereo(aereo);
			 response.setCode("OK");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			response.setCode("KO");
			response.setDescr(e.getMessage());
		} 
		 return response;		 
	 }
	 
	 
	 
	 @ResponseBody
	 @PostMapping(value = "/api/addAereo",produces = MediaType.APPLICATION_JSON_VALUE)
	 public ResponseBase addAereo(@RequestBody RequestAddAereo request) {
		 ResponseBase response=new ResponseBase();
		 
		 try {
			aereoService.addAereo(request.getAereo());
			response.setCode("OK");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			response.setCode("KO");
			response.setDescr(e.getMessage());
		}

	return response;	 
	 }

}
