package com.briki.ciudadano;

import com.briki.ciudadano.models.Usuario;
import com.briki.ciudadano.repositories.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CiudadanoApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(CiudadanoApplication.class, args);
	}

	@Autowired
	private UsuarioRepository repositorio;
	@Override
	public void run(String... args) throws Exception {
	/*	Usuario usuario1 = new Usuario();
		usuario1.setCedula("086589558");
		usuario1.setCorreo("carpinteriadebarcos@gmail.com");
		usuario1.setEstado(true);
		usuario1.setNombre("Franky el carpintero");

		repositorio.save(usuario1);

	 */
	}
}
