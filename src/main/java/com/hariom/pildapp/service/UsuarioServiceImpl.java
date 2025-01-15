package com.hariom.pildapp.service;

import com.hariom.pildapp.Entities.Usuario;
import com.hariom.pildapp.Repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsuarioServiceImpl implements UsuarioService{

    @Autowired
    UsuarioRepository usuarioRepository;

    @Override
    public List<Usuario> getAllUsers() {
        List<Usuario> allUsers = usuarioRepository.findAll();
        return allUsers;
    }

    @Override
    public Usuario getUserById(Long id) {
        return usuarioRepository.findById(id).orElse(null);
    }

    @Override
    public Usuario agregarUsuario(Usuario usuario) {
        usuarioRepository.save(usuario);
        return usuario;
    }
}
