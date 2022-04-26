package srl.neotech;

import org.ajbrown.namemachine.NameGenerator;
import org.apache.commons.text.RandomStringGenerator;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class StartApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String convertitoInJson=null;
		
		int a=45;
		try {
		
		Biblioteca biblioteca=new Biblioteca();
		
		RandomStringGenerator generator = new RandomStringGenerator
				.Builder()
                .withinRange('0', 'z')
                .build();
		
		NameGenerator nameGenerator = new NameGenerator();
		
		for(int i=0;i<100;i++) {
			Libro libro=new Libro();
			libro.setGenere(Genere.GIALLO);
			libro.setIdLibro(i);
			libro.setAutore(nameGenerator.generateName().toString());
			libro.setTitolo(generator.generate(10));
			biblioteca.getListaLibri().add(libro);
		}
		
		ObjectMapper o=new ObjectMapper();
			convertitoInJson = o.writeValueAsString(biblioteca);
		
		} catch (JsonProcessingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(convertitoInJson);
		
	}

}
