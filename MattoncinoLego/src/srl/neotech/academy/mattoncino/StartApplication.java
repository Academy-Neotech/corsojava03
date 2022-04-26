package srl.neotech.academy.mattoncino;

import java.util.Scanner;

public class StartApplication {

	/*
	 Creare una classe MattoncinoLego con 3 attributi: colore, larghezza, lunghezza
     Chiedere all'utente il numero di elementi che vuole.
     Per ogni numero, creare una oggetto di tipo MattoncinoLego con valori statici e stamparla. 
     Non cè bisogno di metterla in un Array.
	 */
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.print("Inserire il numero di elementi:");
		int numeroElementi=scan.nextInt();
		
		for(int i=0;i<numeroElementi;i++) {
			MattoncinoLego m=new MattoncinoLego();
			m.setColore("Blu");
			m.setLarghezza(23);
			m.setLunghezza(12);
			System.out.println("Loggetto è di colore:"+m.getColore());
			System.out.println("Loggetto è lungo:"+m.getLunghezza());
			System.out.println("Loggetto è largo:"+m.getLarghezza());
		}
	}

}
