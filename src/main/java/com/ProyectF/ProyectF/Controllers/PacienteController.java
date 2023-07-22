package com.ProyectF.ProyectF.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.ProyectF.ProyectF.Models.Paciente;
import com.ProyectF.ProyectF.Services.PacienteService;

import java.util.List;

@RestController
@RequestMapping("/pacientes")
public class PacienteController {

    @Autowired
    private PacienteService pacienteService;

    @PostMapping
    public ResponseEntity<Paciente> crearPaciente(@RequestBody Paciente paciente) {
        Paciente nuevoPaciente = pacienteService.guardarPaciente(paciente);
        return new ResponseEntity<>(nuevoPaciente, HttpStatus.CREATED);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Paciente> obtenerPacientePorId(@PathVariable Long id) {
        Paciente paciente = pacienteService.obtenerPacientePorId(id);
        if (paciente != null) {
            return new ResponseEntity<>(paciente, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @GetMapping
    public ResponseEntity<List<Paciente>> obtenerTodosLosPacientes() {
        List<Paciente> pacientes = pacienteService.obtenerTodosLosPacientes();
        return new ResponseEntity<>(pacientes, HttpStatus.OK);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Paciente> actualizarPaciente(@PathVariable Long id, @RequestBody Paciente paciente) {
        Paciente pacienteExistente = pacienteService.obtenerPacientePorId(id);
        if (pacienteExistente != null) {
            paciente.setId(id);
            Paciente pacienteActualizado = pacienteService.actualizarPaciente(paciente);
            return new ResponseEntity<>(pacienteActualizado, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> eliminarPaciente(@PathVariable Long id) {
        Paciente paciente = pacienteService.obtenerPacientePorId(id);
        if (paciente != null) {
            pacienteService.eliminarPaciente(id);
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
}
