package srl.neotech.academy;

import java.util.Scanner;

public class StartApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


 		Amazon amazonItalia=new Amazon();
		
		Scanner scanner=new Scanner(System.in);
		String scelta=new String();		
		
		while(!scelta.equals("esci")) {
			System.out.print("Quanti impianti vuoi creare?:");
			int numeroElementiDaCreare=scanner.nextInt();
			for (int i=0;i<numeroElementiDaCreare;i++) {
				ImpiantoIndustriale impianto=new ImpiantoIndustriale();
				amazonItalia.getImpiantiIndustriali().add(impianto);
			}
			System.out.println("Ho aggiunto "+numeroElementiDaCreare+" impianti");
			System.out.println("se vuoi uscire digita esci altrimenti invio");
			scelta=scanner.next();
		}
		System.out.println("Ho creato in tutto:"+amazonItalia.getImpiantiIndustriali().size()+" impianti");
	}

}
