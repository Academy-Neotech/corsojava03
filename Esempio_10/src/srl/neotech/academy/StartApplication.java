package srl.neotech.academy;

import java.util.Scanner;

public class StartApplication {

	static int a=0;
	static double f=32.6;
	static String s="01234556789";	
	static byte v=128;
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
// questa è una riga inm italiano di commento
/*		System.out.println("ciao");
		System.out.println("ciao2");
		a=91;
		f=193.67;
		System.out.println(v);
		
		if(a<10) {
			System.out.println("a è maggiore di 10");
		}else {
			System.out.println("a è mimore di 10");
		}
		
		for(int i=0;i<100;i++) {
			int r=91;
	    	System.out.println("siamo al ciclo:"+i);	
	    }
		System.out.println(a);
		
		Scanner s=new Scanner(System.in);
		System.out.print("Inserire un numero:");
		int valoreInserito=s.nextInt();
		
		while(valoreInserito<1000) {
			System.out.println("il valore è minore di 1000");
			System.out.print("Inserire un numero:");
			valoreInserito=s.nextInt();
		}
*/		
	
		Scanner s=new Scanner(System.in);
		int a=1;
		while(a%2!=0) {
			System.out.println("è un numero dispari");
			a=s.nextInt();
		}

	}

}
