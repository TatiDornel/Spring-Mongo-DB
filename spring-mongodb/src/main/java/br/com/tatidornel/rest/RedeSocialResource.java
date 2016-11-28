package br.com.tatidornel.rest;

import java.util.ArrayList;
import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.ws.rs.Consumes;
import javax.ws.rs.FormParam;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

import br.com.tatidornel.spring.mongo.Comentario;
import br.com.tatidornel.spring.mongo.ComentarioService;
import br.com.tatidornel.spring.mongo.Postagem;
import br.com.tatidornel.spring.mongo.PostagemService;
import br.com.tatidornel.spring.mongo.Usuario;
import br.com.tatidornel.spring.mongo.UsuarioService;

@Path("/redesocial")
@Produces(MediaType.APPLICATION_JSON + ";charset=utf-8")
@Consumes(MediaType.APPLICATION_JSON + ";charset=utf-8")
public class RedeSocialResource {

	UsuarioService service = new UsuarioService();
	PostagemService servicePostagem = new PostagemService();
	ComentarioService serviceComentario = new ComentarioService();
	
	@GET
	public List<Usuario> get() {

		return service.getAll();
		
	}
	
	@GET
	@Path("/posts/")
	public List<Postagem> getPosts() {
		return servicePostagem.getAll();	
	}
	
	@GET
	@Path("/comments/")
	public List<Comentario> getComments() {
		return serviceComentario.getAll();	
	}
	
	@GET
	@Path("/usuario/{id}")
	public Usuario usuario(@PathParam("id") String id) {
		
		return service.findById(id);
		
	}

		
	@GET
	@Path("/postagens/")
	public List<Postagem> getPostagem() {
//		return service.getAll();
		return null;
	}
	
	@POST
	@Path("/save")
	public void save(@QueryParam("nome") String nome, @QueryParam("email") String email){
		Usuario u = new Usuario();
		u.setEmail(email);
		u.setNome(nome);
		service.insert(u);
		
	}
	
	@POST
	@Path("/savepost")
	public void savePost(@QueryParam("idUsuario") String idUsuario, 
			@QueryParam("conteudo") String conteudo) 
	{
		Usuario usuario = service.findById(idUsuario);
//		if (usuario==null) throw new Exception("Usuário não encontrado") ;
		
		Postagem p = new Postagem();
		p.setConteudo(conteudo);
		p.setUsuario(usuario);
		servicePostagem.insert(p);
//		if (usuario.getPostagens()==null)
//			usuario.setPostagens(new ArrayList<Postagem>());
//		
//		usuario.getPostagens().add(p);
//		
//		service.update(usuario);
//		return Response.Ok("Postagem atualizado com sucesso");
	}
	
	@POST
	@Path("/savecomment")
	public void saveComment(@QueryParam("idPost") String idPost,
			@QueryParam("idUsuario") String idUsuario,
			@QueryParam("comentario") String comentario) 
	{
		Usuario usuario = service.findById(idUsuario);
//		if (usuario==null) throw new Exception("Usuário não encontrado") ;
		
		Postagem p = servicePostagem.findById(idPost);
		
		
//		if (p.getComentarios()==null)
//			p.setComentarios(new ArrayList<Comentario>());
		
		Comentario c = new Comentario();
		c.setComentario(comentario);
		c.setUsuario(usuario);
		c.setPostagem(p);
		serviceComentario.insert(c);
//		p.getComentarios().add(c);
		
//		servicePostagem.insert(p);
//		service.update(usuario);
//		return Response.Ok("Postagem atualizado com sucesso");
	}
}
