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

import srl.neotech.requestresponse.RequestAddProdotto;
import srl.neotech.requestresponse.ResponseBase;
import srl.neotech.requestresponse.ResponseListaProdotti;
import srl.neotech.services.ProdottoService;

@RestController
public class ProdottoAPIController {

	private static final Logger logger = LogManager.getLogger(ProdottoAPIController.class);
	
	@Autowired
	ProdottoService prodottoService;
	
	@ResponseBody
	@PostMapping(value = "/api/addProdotto",produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseBase addProdotto(@RequestBody RequestAddProdotto request) {
	     ResponseBase response=new ResponseBase();			 
	     
	     try {
			prodottoService.addProdotto(request.getProdotto());
			response.setCode("OK");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			response.setCode("KO");
			response.setDescr(e.getMessage());
		}
	      
	return response;	
	}
	
	
	

	@ResponseBody
	@GetMapping(value = "/api/getListaProdotti",produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseListaProdotti getListaProdotti() {
		ResponseListaProdotti response=new ResponseListaProdotti();
		
		logger.info("Questo è un info");
		logger.debug("Questo è un debug");
		logger.error("Questo è un error");
		   
		try {
			response.setProdotti(prodottoService.getListaProdotti());
			response.setCode("OK");
		} catch (Exception e) {
			response.setCode("KO");
			response.setDescr(e.getMessage());
		}

	return response;	
	}
	

	@ResponseBody
	@GetMapping(value = "/api/getListaProdotti/{idTipologia}",produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseListaProdotti getListaProdotti(@PathVariable("idTipologia") String idTipologia) {
		ResponseListaProdotti response=new ResponseListaProdotti();
		   
		try {
			response.setProdotti(prodottoService.getListaProdotti(idTipologia));
			response.setCode("OK");
		} catch (Exception e) {
			response.setCode("KO");
			response.setDescr(e.getMessage());
		}

	return response;	
	}

	
	
	
}
