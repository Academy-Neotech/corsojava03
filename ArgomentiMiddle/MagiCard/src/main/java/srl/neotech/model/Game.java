package srl.neotech.model;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Game {
	
	//for Singleton
	private Game instance;
	
	private String gameId;
	private Player localPlayer;
	private Player remotePlayer;
	private ArrayList<Card> fullDeck;
	private Status status;
	private static Stream messageStream;

	
	private Game() {
		generateFullDeck();
	}
	
	
	public Game getInstance() {
		if (instance==null) instance=new Game();
		return instance;
	}

	private void generateFullDeck(){
		fullDeck=new ArrayList<Card>();
		Card witcher=new Card();
		witcher.setCardId("witcher");
		witcher.setAttacco(9);
		witcher.setStamina(140);
		witcher.setImgPath("/img/witcher.jpg");
		fullDeck.add(witcher);
		
		
		
		
	}
	
	
	
	public static <T> Stream<T> insertInStream( T elem, int index) {
	    @SuppressWarnings("unchecked")
		List<T> result = (List<T>) messageStream.collect(Collectors.toList());
	    result.add(index, elem);
	    return result.stream();
	}

	
}
