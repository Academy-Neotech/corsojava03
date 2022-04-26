package srl.neotech.academy.formine;

public class ForminaPesciolino implements IForminaAnimale{

	@Override
	public void creaForma() {
		System.out.println("Ho stampato un pesciolino!");
		
	}

	@Override
	public void aggiungiCoda(int lunghezza) {
		System.out.println("Ho aggiunto una coda lunga:"+lunghezza+" centimetri");
		
	}
	
	

}
