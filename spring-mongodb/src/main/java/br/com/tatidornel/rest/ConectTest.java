package br.com.tatidornel.rest;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/conecttest")
@Produces(MediaType.APPLICATION_JSON + ";charset=utf-8")
@Consumes(MediaType.APPLICATION_JSON + ";charset=utf-8")
public class ConectTest {
	
	@GET
	@Path("/executeConectTest/{nome}")
	public String executeConectTest(){
		
		return "All successfully executed";
	}

	@GET
	@Path("/changeConfig1/")
	public String changeConfig1(){
		
		return "teste de configuração";
	}
}
