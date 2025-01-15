package com.hariom.pildapp.service;

import com.hariom.pildapp.Entities.Medicamento;

import java.util.List;

public interface MedicamentoService {
    List<Medicamento> getAllMedicamentos();

    void agregarMedicamento(Medicamento medicamento);

    Medicamento getMedicamentoById(Long id);
}
