package org.serratec.biblioteca.model;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

@Embeddable
public class InformacaoPublicacao {


	
	@NotBlank(message = "Informe o nome do autor")
	@Column(nullable = false)
	private String autor; 
	
	@Column
	@Size(max = 4)
	private String anoPublicacao;
	
	
	@Column
	private String editora;


	public String getAutor() {
		return autor;
	}


	public void setAutor(String autor) {
		this.autor = autor;
	}


	public String getAnoPublicacao() {
		return anoPublicacao;
	}


	public void setAnoPublicacao(String anoPublicacao) {
		this.anoPublicacao = anoPublicacao;
	}


	public String getEditora() {
		return editora;
	}


	public void setEditora(String editora) {
		this.editora = editora;
	} 
	
	
}
