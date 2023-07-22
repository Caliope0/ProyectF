package com.ProyectF.ProyectF.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.ProyectF.ProyectF.Models.Cita;
import com.ProyectF.ProyectF.Services.CitaService;

import java.util.List;

@RestController
@RequestMapping("/citas")
public class CitaController {

    @Autowired
    private CitaService citaService;

    @PostMapping
    public ResponseEntity<Cita> crearCita(@RequestBody Cita cita) {
        Cita nuevaCita = citaService.guardarCita(cita);
        return new ResponseEntity<>(nuevaCita, HttpStatus.CREATED);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Cita> obtenerCitaPorId(@PathVariable Long id) {
        Cita cita = citaService.obtenerCitaPorId(id);
        if (cita != null) {
            return new ResponseEntity<>(cita, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @GetMapping
    public ResponseEntity<List<Cita>> obtenerTodasLasCitas() {
        List<Cita> citas = citaService.obtenerTodasLasCitas();
        return new ResponseEntity<>(citas, HttpStatus.OK);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Cita> actualizarCita(@PathVariable Long id, @RequestBody Cita cita) {
        Cita citaExistente = citaService.obtenerCitaPorId(id);
        if (citaExistente != null) {
            cita.setId(id);
            Cita citaActualizada = citaService.actualizarCita(cita);
            return new ResponseEntity<>(citaActualizada, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> eliminarCita(@PathVariable Long id) {
        Cita cita = citaService.obtenerCitaPorId(id);
        if (cita != null) {
            citaService.eliminarCita(id);
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
}
