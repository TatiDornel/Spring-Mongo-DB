package br.com.tatidornel.spring.mongo;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="comentario")
public class Comentario {
	
	private Usuario usuario;
	private Postagem postagem;
	private String comentario;
	public Postagem getPostagem() {
		return postagem;
	}
	public void setPostagem(Postagem postagem) {
		this.postagem = postagem;
	}
	public Usuario getUsuario() {
		return usuario;
	}
	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
	public String getComentario() {
		return comentario;
	}
	public void setComentario(String comentario) {
		this.comentario = comentario;
	}
	
		
}
