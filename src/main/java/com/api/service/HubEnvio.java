package com.api.service;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;


import com.api.controller.Controlador;


@Path("/ephyto") 
@Produces(MediaType.APPLICATION_JSON) 
public class HubEnvio {
	
	@GET
	@Path("/enviar")
	public Response envio() throws Exception {
		Controlador controlador = new Controlador();
		controlador.procesarRecepcion();
		return Response.ok().build();  
    }
	@GET 
	@Path("/hola") 
    public Response sayHello() {     
        return Response.ok("Consumo EPHYTO CON  API REST JAVA SENASAG Bolivia  ",MediaType.APPLICATION_JSON).build();   
    }
	
}
