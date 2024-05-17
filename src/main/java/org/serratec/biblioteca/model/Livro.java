package org.serratec.biblioteca.model;

import java.util.Objects;

import jakarta.persistence.Column;
import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;

@Entity
@Table(name = "livro")
public class Livro {

		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY) //BD gera o ID
		private Long id; 
		
		
		@NotBlank(message = "Informe o título da obra")
		@Column(nullable = false)
		private String titulo;

		public Long getId() {
			return id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public String getTitulo() {
			return titulo;
		}

		public void setTitulo(String titulo) {
			this.titulo = titulo;
		}
		// como ele vai organizar a busca desses objetos numa list
		@Override
		public int hashCode() {
			return Objects.hash(id);
		}

		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			Livro other = (Livro) obj;
			return Objects.equals(id, other.id);
		} 
		
		@Embedded
		private InformacaoPublicacao informacaoPublicacao;

		public InformacaoPublicacao getInformacaoPublicacao() {
			return informacaoPublicacao;
		}

		public void setInformacaoPublicacao(InformacaoPublicacao informacaoPublicacao) {
			this.informacaoPublicacao = informacaoPublicacao;
		} 
}
