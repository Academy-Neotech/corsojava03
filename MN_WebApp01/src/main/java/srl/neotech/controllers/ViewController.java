package srl.neotech.controllers;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class ViewController {

	
	//Rotta per home.jsp
	@RequestMapping(value="/", method = RequestMethod.GET)
	public String Home() {
		return "home";
	}
}
