package srl.neotech.academy;
import static com.diogonunes.jcolor.Ansi.colorize;
import static com.diogonunes.jcolor.Attribute.MAGENTA_BACK;
import static com.diogonunes.jcolor.Attribute.YELLOW_TEXT;

import java.util.ArrayList;
public class StartApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		
		Motocicletta ducatiMonster=new Motocicletta();
		ducatiMonster.setMarca("Ducati");
		ducatiMonster.setModello("Monster");
		
		ArrayList<Motocicletta> motociclette=new ArrayList<Motocicletta>();
		
		PompaDiBenzina benzinaioCentocelle=new PompaDiBenzina();
		benzinaioCentocelle.faiIlPieno(ducatiMonster);
		
		//System.out.println(ducatiMonster.getMarca());
		//System.out.println(ducatiMonster.getLivelloBenzina());
		
		DepositoGiudiziario deposito=new DepositoGiudiziario();
		
		motociclette.add(ducatiMonster);

		
		for(String pippo : deposito.getTarghe()) {
			System.out.println(pippo);
		}
		
		for(Motocicletta pippo: motociclette) {
			System.out.println(pippo.getMarca());
		}
		
		
	}

}
