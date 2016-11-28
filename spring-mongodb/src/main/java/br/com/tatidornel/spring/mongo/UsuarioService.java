package br.com.tatidornel.spring.mongo;

import java.util.List;

import org.springframework.context.ApplicationContext;

import br.com.tatidornel.util.SpringUtil;

public class UsuarioService {

	private UsuarioRepository db;
	
	public UsuarioService(){
	
		ApplicationContext context =SpringUtil.getContext();
		db =  context.getBean(UsuarioRepository.class);
	}
	
	public void insert(Usuario e){
		db.save(e);
	}
	
	public void update(Usuario e){
		db.save(e);
	}
	public List<Usuario> getAll(){
		
		return db.findAll();
	}
	
	public Usuario findById(String id){
		
		return db.findOne(id);
	}
	
	
	public void delete(Usuario usuario){
		db.delete(usuario);
	}
	
	

}

