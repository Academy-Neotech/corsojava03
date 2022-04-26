package srl.neotech.acadermy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;

public class StartApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Automobile> parcoAuto=new ArrayList<Automobile>();
		Scanner scan=new Scanner(System.in);
		
		for(int i=0;i<5;i++) {
			Automobile auto=new Automobile();
			System.out.print("Digitare la targa:");
			String targa=scan.next();
			auto.setTarga(targa);
			System.out.print("Digitare il colore:");
			String colore=scan.next();
			auto.setColore(colore);
			parcoAuto.add(auto);
		}
		
		parcoAuto.get(4).setColore("Azzurrino");
		parcoAuto.get(4).getMotore().setAlimentazione("Benzinna");
		
		Automobile autoAggiunta=new Automobile();
		autoAggiunta.setTarga("--ROMA--");
		parcoAuto.add(1, autoAggiunta);
		parcoAuto.add(0, null);
		parcoAuto.remove(2);
		
		ArrayList<Automobile> parcoAutoAggiunto=new ArrayList<Automobile>();
		parcoAutoAggiunto.add(new Automobile());
		parcoAuto.addAll(parcoAutoAggiunto);
		System.out.println(parcoAuto);
		
	
		
		
		//Hasmap
		HashMap<String, Automobile> parcoAutoCasilino=new HashMap<String, Automobile>();
		Automobile autoCasilino=new Automobile();
		autoCasilino.setTarga("EFGTR5");
		autoCasilino.setColore("Blu");
		parcoAutoCasilino.put(autoCasilino.getTarga(), autoCasilino);
		Automobile autoAurelia=new Automobile();
		autoAurelia.setTarga("DDFCDS");
		autoAurelia.setColore("Rosso");
		parcoAutoCasilino.put(autoAurelia.getTarga(), autoAurelia);
		
		parcoAutoCasilino.get("EFGTR5").setStatoCorrente(Stato.DA_TAGLANDARE);
		System.out.println(parcoAutoCasilino.get("EFGTR5"));
	
		//scorrere un arraylist
		for(int i=0;i<parcoAuto.size();i++) {
			Automobile autoreciuperataDallArrayList=parcoAuto.get(i);			
		}
		
		Iterator<Automobile> iterator=parcoAuto.iterator();
		while(iterator.hasNext()) {
			iterator.next().setTarga("BLABLABLA");
		}
		
		
		
		
		
		
		
		
	}

}
