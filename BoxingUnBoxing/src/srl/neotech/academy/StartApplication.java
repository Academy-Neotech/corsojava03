package srl.neotech.academy;

public class StartApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Boxing
		int a=5;
		Integer b=new Integer(5);
		
		double c=67.8;
		Double d=new Double(67.8);
	
		//Unboxing
		if(a==b) {
			System.out.println("funziona!!!");
		}
		
		CartaDaGioco vampiro=new CartaDaGioco();
		vampiro.setIdDellaCarta(2234);
		vampiro.setNome("Dracula");
		
		
	}

}
