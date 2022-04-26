package srl.neotech.model;

 //Bean
public class Aereo {
	
	private String id;
	private String nome;
	private Integer numPasseggeri;
	private String url_immagine;
	private Integer numStelline;
	
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
	public String getUrl_immagine() {
		return url_immagine;
	}
	public void setUrl_immagine(String url_immagine) {
		this.url_immagine = url_immagine;
	}
	public Integer getNumStelline() {
		return numStelline;
	}
	public void setNumStelline(Integer numStelline) {
		this.numStelline = numStelline;
	}

}
