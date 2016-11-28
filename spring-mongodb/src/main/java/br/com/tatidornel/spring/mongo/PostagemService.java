package br.com.tatidornel.spring.mongo;

import java.util.List;

import org.springframework.context.ApplicationContext;

import br.com.tatidornel.util.SpringUtil;

public class PostagemService {

	private PostagemRepository db;
	
	public PostagemService(){
	
		ApplicationContext context =SpringUtil.getContext();
		db =  context.getBean(PostagemRepository.class);
	}
	
	public void insert(Postagem e){
		db.save(e);
	}
	
	public Postagem findById(String id){
		
		return db.findOne(id);
	}
	public List<Postagem> getAll(){
		
		return db.findAll();
	}
	
	
	public void delete(Postagem usuario){
		db.delete(usuario);
	}
	
	

}

