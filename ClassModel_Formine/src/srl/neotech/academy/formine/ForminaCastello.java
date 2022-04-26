package srl.neotech.academy.formine;

public class ForminaCastello implements IForminaEdificio{

	@Override
	public void creaForma() {
		System.out.println("Ho creato un castello!");
		
	}

	@Override
	public void aggiungiFinestre(int numeroFinestre) {
	System.out.println("Ho aggiunto:"+numeroFinestre+" finestre");
		
	}

}
