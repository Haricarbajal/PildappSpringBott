package com.hariom.pildapp.service;

import com.hariom.pildapp.Entities.Medicamento;
import com.hariom.pildapp.Repository.MedicamentoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MedicamentoServiceImpl implements MedicamentoService {

    @Autowired
    MedicamentoRepository medicamentoRepository;

    @Override
    public List<Medicamento> getAllMedicamentos() {
        List<Medicamento> medicamentos = medicamentoRepository.findAll();
        return  medicamentos;
    }

    @Override
    public void agregarMedicamento(Medicamento medicamento) {
        medicamentoRepository.save(medicamento);
    }

    @Override
    public Medicamento getMedicamentoById(Long id) {
        Medicamento medicamento = medicamentoRepository.findById(id).orElse(null);
        return medicamento;
    }
}
