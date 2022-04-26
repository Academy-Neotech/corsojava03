package srl.neotech.academy;

public class StartApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int giorniTotaliCalcolati=0;
		//ciclo delle cisterne
		for(int=0;i<cantina.getCisterne().size();i++) {		
			cisterna=cantina.getCisterne().get(i);
			int thresoldCisternaCorrente=100;
			//ciclo per calcolare i giorni di una cisterna
			while(thresoldCisternaCorrente>30) {
				giorniTotaliCalcolati=giorniTotaliCalcolati+1;		
				thresoldCisternaCorrente=thresoldCisternaCorrente-cisterna.evapoDay();
			}
		}
		
	}

}
