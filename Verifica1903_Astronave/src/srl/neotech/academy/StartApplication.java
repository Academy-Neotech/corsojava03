package srl.neotech.academy;

import java.util.Scanner;

public class StartApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("sto sul brach1!!!!");
		System.out.println("sto sul brach1!!!!");
		System.out.println("sto sul brach1!!!!");
		System.out.println("sto sul brach1!!!!");
		System.out.println("sto sul brach1!!!!");
		System.out.println("sto sul brach1!!!!");
		System.out.println("sto sul brach1!!!!");
		Astronave xwing=new Astronave();
		Scanner scan=new Scanner(System.in);
		System.out.println("sto sul brach1!!!!");
		System.out.println("sto sul brach1!!!!");
		System.out.println("sto sul brach1!!!!");
		System.out.println("sto sul brach1!!!!");
		System.out.println("sto sul brach1!!!!");
		
		
		System.out.print("Impostare la velocita iniziale:");
		int velocitaIniziale=scan.nextInt();
		String risultatoDelDecollo=xwing.decolla(velocitaIniziale);
		System.out.println(risultatoDelDecollo);
		System.out.print("Impostare il numero di manovre:");
		int numeroManovre=scan.nextInt();
		for(int i=0;i<numeroManovre;i++) {
			
			//ciclo finche non inserisci A oppure D
			System.out.print("premere A per accellerare - D per decellerare:");
		    String manovra=scan.next();
		    while(!(manovra.equals("A")|| manovra.equals("D"))) {
		    	System.out.println("Ha sbagliato !!! La manovra deve essere A oppure D");
		    	System.out.print("premere A per accellerare - D per decellerare:");
		    	manovra=scan.next();;	
		    }
		    
		    
		    //ciclo finche un numero non è maggiore di 0
		    System.out.print("impostare la velocita della manovra:");
		    int velocitaDaImpostare=scan.nextInt();	
		    while(velocitaDaImpostare<0) {
		    	System.out.println("Ha sbagliato !!! La velocità deve essere >0 !!");
		    	 System.out.print("impostare la velocita della manovra:");
			    velocitaDaImpostare=scan.nextInt();	
		    }
		    //fine ciclo
		    
		    
		    String risultatoManovra=null;
		    if(manovra.equals("A")) risultatoManovra= xwing.accellera(velocitaDaImpostare);
		    if(manovra.equals("D")) risultatoManovra= xwing.decellera(velocitaDaImpostare);
		    System.out.println(risultatoManovra);
		}
		System.out.println("La velocita finale dell'astronave è:"+xwing.getVelocita());
		
	}

}
