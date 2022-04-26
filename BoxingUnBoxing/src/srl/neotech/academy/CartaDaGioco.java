package srl.neotech.academy;

import java.io.Serializable;

public class CartaDaGioco implements Serializable{
	
	private Integer idDellaCarta;
	private String nome;
	private String stato;
	

	
	
	public Integer getIdDellaCarta() {
		return idDellaCarta;
	}
	public void setIdDellaCarta(Integer idDellaCarta) {
		this.idDellaCarta = idDellaCarta;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getStato() {
		return stato;
	}
	public void setStato(String stato) {
		this.stato = stato;
	}
	

}
