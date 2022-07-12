package srl.neotech.model;

public enum Status {
	
	//Partita Creata
	GAME_CREATED("Game Created"),
	
	//Partita in attesa del secondo giocatore
	GAME_WAITFOR_PLAYER("Wait for player"),
	
	//Giocatore entrato
	PLAYER_LOGGEDIN("Player Logged"),
	
	//Giocatore abilitato a giovare
	PLAYER_ENABLE("Player Enable"),
	
	//Giocatore in attesa del lancio da parte dell'altro
	PLAYER_WAIT("Player Wait"),
	
	//Carta caricata nel deck del giocatore
	CARD_LOADED("Card loaded in Deck"),
	
	//Carta in gioco
	CARD_INGAME("Card in Play"),
	
	//Carta bruciata
	CARD_FIRED("Card fired"),
	UNKNOWN("");
	
	
	 private String status;

	
	Status(String status) {
        this.status = status;
    }

    public String getDescr() {
        return status;
    }
}
