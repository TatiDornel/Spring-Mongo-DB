package br.com.tatidornel.spring.mongo;

import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Document(collection="usuario")
public class Usuario {
	@Id
	@Field("_id")
	private String id;
	
	@Field("Nome")
	private String nome;
	@Field("email")
	private String email;
	
	
	private List<Postagem> postagens;

	public String getId() {
		return id;
	}
	
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public List<Postagem> getPostagens() {
		return postagens;
	}
	public void setPostagens(List<Postagem> postagens) {
		this.postagens = postagens;
	}
	
	
}
