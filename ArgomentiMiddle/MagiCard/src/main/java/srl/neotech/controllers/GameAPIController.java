package srl.neotech.controllers;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import srl.neotech.model.Message;
import srl.neotech.services.GameService;

@RestController
public class GameAPIController {
	
	@Autowired
	GameService gameService;
	
	
	@GetMapping(value = "/api/sendMessage/{msg}")
	public void sendMessage(@PathVariable("msg") String message) {
		gameService.sendMessage(message);
	}
	
	
	@MessageMapping("/message/")
	@SendTo("/topic/messages")
	public Message send(Message message) throws Exception {
	    String time = new SimpleDateFormat("HH:mm").format(new Date());
	    return new Message();
	}

}
