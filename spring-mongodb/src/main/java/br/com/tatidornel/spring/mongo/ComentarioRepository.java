package br.com.tatidornel.spring.mongo;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ComentarioRepository  extends MongoRepository<Comentario, String> {
	

}
