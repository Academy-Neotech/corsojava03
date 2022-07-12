package srl.neotech.model;

public enum MessageType {

	  GAME_CRETED("Gme Created"),
	  PLAYER_JOINED("Player Joined"),
	  
	  UNKNOWN("");
	
	 private String type;

	
	MessageType(String type) {
	        this.type = type;
	    }

	    public String getDescr() {
	        return type;
	    }
}
