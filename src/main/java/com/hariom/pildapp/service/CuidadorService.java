package com.hariom.pildapp.service;

import com.hariom.pildapp.Entities.Cuidador;
import com.hariom.pildapp.Entities.Usuario;

import java.util.List;

public interface CuidadorService {
    List<Usuario> obtenerUsuarios();

    Usuario obtenerUsuarioPorId(Long id);

    Cuidador agregarCuidador(Cuidador cuidador);
}
