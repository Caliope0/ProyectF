package com.ProyectF.ProyectF.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.ProyectF.ProyectF.Models.Medico;
import com.ProyectF.ProyectF.Services.MedicoService;

import java.util.List;

@RestController
@RequestMapping("/medicos")
public class MedicoController {

    @Autowired
    private MedicoService medicoService;

    @PostMapping
    public ResponseEntity<Medico> crearMedico(@RequestBody Medico medico) {
        Medico nuevoMedico = medicoService.guardarMedico(medico);
        return new ResponseEntity<>(nuevoMedico, HttpStatus.CREATED);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Medico> obtenerMedicoPorId(@PathVariable Long id) {
        Medico medico = medicoService.obtenerMedicoPorId(id);
        if (medico != null) {
            return new ResponseEntity<>(medico, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @GetMapping
    public ResponseEntity<List<Medico>> obtenerTodosLosMedicos() {
        List<Medico> medicos = medicoService.obtenerTodosLosMedicos();
        return new ResponseEntity<>(medicos, HttpStatus.OK);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Medico> actualizarMedico(@PathVariable Long id, @RequestBody Medico medico) {
        Medico medicoExistente = medicoService.obtenerMedicoPorId(id);
        if (medicoExistente != null) {
            medico.setId(id);
            Medico medicoActualizado = medicoService.actualizarMedico(medico);
            return new ResponseEntity<>(medicoActualizado, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> eliminarMedico(@PathVariable Long id) {
        Medico medico = medicoService.obtenerMedicoPorId(id);
        if (medico != null) {
            medicoService.eliminarMedico(id);
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
}
