package srl.neotech.services;

import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class GameService {
	
	@Autowired
	private  KafkaTemplate<String, String> kafkaTemplate;
	
	public void sendMessage(String message) {
	  kafkaTemplate.send("magiCard",UUID.randomUUID().toString(), message);
	}

}
