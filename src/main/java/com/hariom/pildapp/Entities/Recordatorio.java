package com.hariom.pildapp.Entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Setter
@Getter
@Entity
@Table(name = "recordatorios")
public class Recordatorio {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_recordatorio", nullable = false)
    private int idRecordatorio;

    @ManyToOne
    @JoinColumn(name = "id_cuidador")
    private Cuidador cuidador;

    @Column(name = "id_medicamento", nullable = false)
    private int idMedicamento;

    @Column(name = "id_paciente", nullable = false)
    private int idPaciente;

    @Column(name = "estado")
    private boolean estado;

    @Column(name = "nombre_medicamento")
    private String nombreMedicamento;

    @Column(name = "nombre_paciente")
    private String nombrePaciente;

    @Column(name = "fecha_vencimiento")
    private String fechaVencimiento;

    @Column(name = "dosis")
    private String dosis;

    @Column(name = "frecuencia")
    private String frecuencia;
}