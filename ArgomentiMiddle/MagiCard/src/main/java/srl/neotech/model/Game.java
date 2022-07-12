package srl.neotech.model;

import java.util.ArrayList;

public class Game {
	
	//for Singleton
	private Game instance;
	
	private String gameId;
	private Player localPlayer;
	private Player remotePlayer;
	private ArrayList<Card> fullDeck;
	private Status status;

	
	private Game() {
		generateFullDeck();
		
	}
	
	
	public Game getInstance() {
		if (instance==null) instance=new Game();
		return instance;
	}

	private void generateFullDeck(){
		fullDeck=new ArrayList<Card>();
		//generate Deck.....
	}

	
}
