package com.hariom.pildapp.service;

import com.hariom.pildapp.Entities.Cuidador;
import com.hariom.pildapp.Entities.Usuario;
import com.hariom.pildapp.Repository.CuidadorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class CuidadorServiceImpl implements CuidadorService{

    @Autowired
    CuidadorRepository cuidadorRepository;

    @Override
    public List<Usuario> obtenerUsuarios() {
        return cuidadorRepository.findAll().stream()
                .flatMap(cuidador -> cuidador.getUsuario().stream())
                .collect(Collectors.toList());
    }

    /*@Override
    public List<Usuario> obtenerUsuarios() {
        List<Cuidador> cuidadores = cuidadorRepository.findAll();
        List<Usuario> usuarios = new ArrayList<>();
        for(Cuidador cuidador : cuidadores){;
            for(Usuario usuario : cuidador.getUsuario()){
                usuarios.add(usuario);
            }
        }
        return usuarios;
    }*/

    @Override
    public Usuario obtenerUsuarioPorId(Long id) {
        return cuidadorRepository.findAll().stream()
                .flatMap(cuidador -> cuidador.getUsuario().stream())
                .filter(usuario -> usuario.getIdUsuario().equals(id))
                .findFirst()
                .orElse(null);
    }

    @Override
    public Cuidador agregarCuidador(Cuidador cuidador) {
        return null;
    }
}
