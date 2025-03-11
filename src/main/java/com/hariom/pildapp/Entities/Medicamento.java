package com.hariom.pildapp.Entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "medicamentos")
public class Medicamento {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_medicamento", nullable = false)
    private Long idMedicamento;

    @Column(name = "nombre_medicamento")
    private String nombreMedicamento;

    @Column(name = "info_medicamento")
    private String infoMedicamento;

    @Column(name = "concentracion")
    private String concentracion;

    @Column(name = "fecha_vencimiento")
    private String fechaVencimiento;

    @ManyToOne
    @JoinColumn(name = "usuario_id", nullable = false)
    private Usuario usuario;
}
