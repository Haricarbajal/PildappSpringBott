package com.hariom.pildapp.Entities;

import jakarta.persistence.*;
import lombok.*;
import org.antlr.v4.runtime.misc.NotNull;
import org.hibernate.annotations.BatchSize;
import org.springframework.context.annotation.Primary;

import java.util.List;

@AllArgsConstructor
@Setter
@Getter
@Entity
@Table(name = "usuarios")
public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "usuario_id", nullable = false)
    private Long idUsuario;

    @Column(name = "nombre", length = 30)
    private String nombre;

    @Column(name = "edad")
    private int edad;

    @Column(name = "email", length = 40)
    private String email;

    @Column(name = "fecha_nacimiento")
    private String fechaNacimiento;

    @Column(name = "telefono")
    private String telefono;

    @OneToMany(mappedBy = "usuario", cascade = CascadeType.ALL)
    private List<Medicamento> medicamentos;

    @ManyToOne
    @JoinColumn(name = "id_cuidador")
    private Cuidador cuidador;
}