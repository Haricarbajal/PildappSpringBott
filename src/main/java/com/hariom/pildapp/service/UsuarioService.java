package com.hariom.pildapp.service;

import com.hariom.pildapp.Entities.Usuario;

import java.util.List;

public interface UsuarioService {
    List<Usuario> getAllUsers();

    Usuario getUserById(Long id);

    Usuario agregarUsuario(Usuario usuario);
}