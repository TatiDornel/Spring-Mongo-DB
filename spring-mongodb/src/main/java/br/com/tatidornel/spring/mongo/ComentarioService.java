package br.com.tatidornel.spring.mongo;

import java.util.List;

import org.springframework.context.ApplicationContext;

import br.com.tatidornel.util.SpringUtil;

public class ComentarioService {

	private ComentarioRepository db;
	
	public ComentarioService(){
	
		ApplicationContext context =SpringUtil.getContext();
		db =  context.getBean(ComentarioRepository.class);
	}
	
	public void insert(Comentario e){
		db.save(e);
	}
	
	public List<Comentario> getAll(){
		
		return db.findAll();
	}
	
	
	public void delete(Comentario comentario){
		db.delete(comentario);
	}
	
	

}

