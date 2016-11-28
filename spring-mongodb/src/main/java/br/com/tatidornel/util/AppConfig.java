package br.com.tatidornel.util;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;


@Configuration
@ComponentScan({ "br.com.tatidornel.util", "br.com.tatidornel.spring.mongo"})
@EnableMongoRepositories("br.com.tatidornel.spring.mongo")
@Import({ MongoConfig.class })
public class AppConfig {

}
