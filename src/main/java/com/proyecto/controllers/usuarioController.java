package com.proyecto.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.proyecto.models.usuario;
import com.proyecto.repository.usuarioDao;

@RestController
public class usuarioController {
	
	@Autowired
	private usuarioDao usuarioDao;
	
	@GetMapping("test")
	public String mensaje() {
		return "Hola Mundo";
	} 
	
	@GetMapping("usuarios")
	public List <String> listarPersonas(){
		return List.of("Luciano","Simon","Facundo","Lucas");
	}
	
	@GetMapping("usuario")
	public usuario listarUsuarios() {
		usuario usuario=new usuario();
		usuario.setNombre("Luciano");
		usuario.setApellido("Badilla");
		usuario.setEmail("lucianobadilla02estudiante@gmail.com");
		usuario.setTelefono("261000000");
		
		return usuario;
	 }
	
	@GetMapping("usuario/{id}")
	public usuario getUsuarios(@PathVariable Long id) {
		usuario usuario=new usuario();
		usuario.setId(id);
		usuario.setNombre("Luciano");
		usuario.setApellido("Badilla");
		usuario.setEmail("lucianobadilla02estudiante@gmail.com");
		usuario.setTelefono("261000000");
		
		return usuario;
	 }


	@GetMapping("usuario/lista_user")
	public List<usuario> listar_variosUsuarios() {
		
		List<usuario> usuarios=new ArrayList<>();
		
		usuario usuario1=new usuario();
		usuario1.setId((long) 1);
		usuario1.setNombre("Luciano");
		usuario1.setApellido("Badilla");
		usuario1.setEmail("lucianobadilla02estudiante@gmail.com");
		usuario1.setTelefono("261000000");
		
		usuario usuario2=new usuario();
		usuario2.setId((long) 2);
		usuario2.setNombre("Simon");
		usuario2.setApellido("Ramos");
		usuario2.setEmail("simonramos@gmail.com");
		usuario2.setTelefono("261000000");
	
		usuario usuario3=new usuario();
		usuario3.setId((long) 3);
		usuario3.setNombre("Gisela");
		usuario3.setApellido("Badilla");
		usuario3.setEmail("giselabadilla@gmail.com");
		usuario3.setTelefono("261000000");
		
		usuario usuario4=new usuario();
		usuario4.setId((long) 4);
		usuario4.setNombre("Facundo");
		usuario4.setApellido("Astudillo");
		usuario4.setEmail("facundoastudillo@gmail.com");
		usuario4.setTelefono("261000000");
		
		usuarios.add(usuario1);
		usuarios.add(usuario2);
		usuarios.add(usuario3);
		usuarios.add(usuario4);
		
		return usuarios;
	 }
	
	@GetMapping("api/usuarios")
	public List<usuario> getUsuario(){
		
		List<usuario> user=usuarioDao.getUsuarios();
		
		return user;
	}

}