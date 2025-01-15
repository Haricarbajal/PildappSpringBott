package com.hariom.pildapp.Controller;

import com.hariom.pildapp.Entities.Medicamento;
import com.hariom.pildapp.service.MedicamentoService;
import jakarta.persistence.Id;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/medicamentos")
public class MedicamentoController {
    @Autowired
    MedicamentoService medicamentoService;

    @GetMapping
    public List<Medicamento> obtenerMedicamentos(){
        return medicamentoService.getAllMedicamentos();
    }

    @PostMapping("/agregarMedicamento")
    public void agregarMedicamento(@RequestBody Medicamento medicamento){
        medicamentoService.agregarMedicamento(medicamento);
    }
}
