package com.hariom.pildapp.Controller;

import com.hariom.pildapp.Entities.Usuario;
import com.hariom.pildapp.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/usuarios")
public class UsuarioController {

    @Autowired
    private UsuarioService usuarioService;

    @GetMapping
    public List<Usuario> getAllUsers(){
        return usuarioService.getAllUsers();
    }

    /*@PostMapping("/agregarUsuario")fun AgregarMedicamento() {
}
    public void agregarUsuario(String nombre, int edad, String email, String fechaNacimiento, String telefono){
        Usuario usuario = new Usuario();
        usuario.setNombre(nombre);
        usuario.setEdad(edad);
        usuario.setEmail(email);
        usuario.setTelefono(telefono);
        usuario.setFechaNacimiento(fechaNacimiento);
        usuarioService.agregarUsuario(usuario);
    }*/

    /*@PostMapping("/agregarUsuario")
    public void agregarUsuario(@RequestBody Usuario usuario){
        usuarioService.agregarUsuario(usuario);
    }*/


    @PostMapping("/agregarUsuario")
    public ResponseEntity<Usuario> agregarUsuario(@RequestBody Usuario usuario){
        Usuario usuarioSaved = usuarioService.agregarUsuario(usuario);
        return new ResponseEntity<Usuario>(usuarioSaved, HttpStatus.CREATED);
    }
}