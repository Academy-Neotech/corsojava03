package srl.neotech.controllers;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import srl.neotech.model.SingleListaAerei;
import srl.neotech.requestresponse.RequestSearchAereo;
import srl.neotech.requestresponse.ResponseSearchAereo;
import srl.neotech.requestresponse.StatusCode;

@RestController
public class APIController {

	
	@ResponseBody
	@GetMapping(value = "/api/delete/{id}",produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseSearchAereo delete(@PathVariable("id") String idAereo) {
		ResponseSearchAereo response=new ResponseSearchAereo();
		try {
			SingleListaAerei.getInstance().getListaAerei().removeIf(aereo->aereo.getId().equals(idAereo));		
			response.setAerei(SingleListaAerei.getInstance().getListaAerei());
			response.setCode(StatusCode.OK.toString());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			response.setCode(StatusCode.ERROR.toString());
			response.setMsg(e.getMessage());
			e.printStackTrace();
		}
		return response;
	
	}
	
	
	@ResponseBody
	@PostMapping(value = "/api/add",produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseSearchAereo search(@RequestBody RequestSearchAereo request) {
		ResponseSearchAereo response=new ResponseSearchAereo();
		
		try {
			SingleListaAerei.getInstance().getListaAerei().add(request.getAereo());
			response.setAerei(SingleListaAerei.getInstance().getListaAerei());
			response.setCode(StatusCode.OK.toString());
		} catch (Exception e) {
			response.setCode(StatusCode.ERROR.toString());
			response.setMsg(e.getMessage());
			e.printStackTrace();
		}
		return response;
	
	}
	
}
