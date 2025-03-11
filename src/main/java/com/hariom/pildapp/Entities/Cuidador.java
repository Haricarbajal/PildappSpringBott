package com.hariom.pildapp.Entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@AllArgsConstructor
@Setter
@Getter
@Table(name = "cuidadores")
@Entity
public class Cuidador {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_cuidador")
    private int idCuidador;

    @Column(name = "nombre_cuidador")
    private String nombreCuidador;

    @OneToMany(mappedBy = "cuidador")
    private List<Usuario> usuario;

}
