package com.nestorms.saludoserver;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SaludoController {

	@Autowired
	private Environment environment;

	@GetMapping("/saludo/{nombre}")
	public String saludo(@PathVariable String nombre) {
		String puerto = environment.getProperty("local.server.port");
		return "PUERTO SERVIDOR: " + puerto + ". Hola " + nombre + ".";
	}
}
