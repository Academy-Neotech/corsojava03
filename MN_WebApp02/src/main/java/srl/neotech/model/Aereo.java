package srl.neotech.model;

 
public class Aereo {
	
	private String id;
	private String nome;
	private Integer numPasseggeri;
	
	
	public Aereo() {
		
	}
	
	public Aereo(String id, String nome, Integer numPasseggeri) {
		this.id=id;
		this.nome=nome;
		this.numPasseggeri=numPasseggeri;
	}
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Integer getNumPasseggeri() {
		return numPasseggeri;
	}
	public void setNumPasseggeri(Integer numPasseggeri) {
		this.numPasseggeri = numPasseggeri;
	}
	
	

}
