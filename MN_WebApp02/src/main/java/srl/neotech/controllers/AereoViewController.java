package srl.neotech.controllers;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import srl.neotech.services.AereoService;

@Controller
public class AereoViewController {

	  private static final Logger logger = LogManager.getLogger(AereoViewController.class);
	  

	//Rotta per Home.jsp
	@RequestMapping(value="/", method = RequestMethod.GET)
	public String home() {
		logger.info("Ciao Giovanni e Patrizio, qualcuno è entrato sulla Home!");
		return "home";
	}
	
	
	//Rotta per validazione-fe.jsp
	@RequestMapping(value="validazione-fe", method = RequestMethod.GET)
	public String validazioneFE() {
		return "validazione-fe";
	}
}
