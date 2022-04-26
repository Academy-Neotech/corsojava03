package srl.neotech.academy.formine;


/*Esempio di Ereditarietà e Poliformismo
 * 
 * gli oggetti nemo e castello eseguono metodi specializzati: aggiungicoda() e aggiungifinestra()
 * inoltre eseguono tutti e due il metodo creaForma() dell'interfaccia comune che viene specializzata
 * nell'implementazione
 */

public class StartApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		IForminaAnimale nemo=new ForminaPesciolino();
		nemo.aggiungiCoda(7);
		nemo.creaForma();
		
		IForminaEdificio castello=new ForminaCastello();
		castello.aggiungiFinestre(3);
		castello.creaForma();
	}

}
