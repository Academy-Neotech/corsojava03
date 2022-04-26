package srl.neotech.academy;

public class Automobile {

	
	
	public void accellera() throws AcademyException{
		
		System.out.println("sto in accellera ma lancio una mia eccezione");
		try {
			int a=5;
			int b=0;
			int c=a/b;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			throw new AcademyException();
		}
		
	}
}
