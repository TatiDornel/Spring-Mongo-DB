package br.com.tatidornel.rest;

import java.util.HashMap;
import java.util.Map;

import javax.ws.rs.core.Application;

import org.springframework.stereotype.Component;

public class SpringMongoRestApp extends Application {

	

	@Override
	public Map<String, Object> getProperties() {
		Map<String, Object> properties = new HashMap<>();
		properties
				.put("jersey.config.server.provider.packages", "br.com.tatidornel.rest");
		return properties;
	}
}
