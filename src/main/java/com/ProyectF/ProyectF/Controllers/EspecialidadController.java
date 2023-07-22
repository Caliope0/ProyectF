package com.ProyectF.ProyectF.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.ProyectF.ProyectF.Models.Especialidad;
import com.ProyectF.ProyectF.Services.EspecialidadService;

import java.util.List;

@RestController
@RequestMapping("/especialidades")
public class EspecialidadController {

    @Autowired
    private EspecialidadService especialidadService;

    @PostMapping
    public ResponseEntity<Especialidad> crearEspecialidad(@RequestBody Especialidad especialidad) {
        Especialidad nuevaEspecialidad = especialidadService.guardarEspecialidad(especialidad);
        return new ResponseEntity<>(nuevaEspecialidad, HttpStatus.CREATED);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Especialidad> obtenerEspecialidadPorId(@PathVariable Long id) {
        Especialidad especialidad = especialidadService.obtenerEspecialidadPorId(id);
        if (especialidad != null) {
            return new ResponseEntity<>(especialidad, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @GetMapping
    public ResponseEntity<List<Especialidad>> obtenerTodasLasEspecialidades() {
        List<Especialidad> especialidades = especialidadService.obtenerTodasLasEspecialidades();
        return new ResponseEntity<>(especialidades, HttpStatus.OK);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Especialidad> actualizarEspecialidad(@PathVariable Long id, @RequestBody Especialidad especialidad) {
        Especialidad especialidadExistente = especialidadService.obtenerEspecialidadPorId(id);
        if (especialidadExistente != null) {
            especialidad.setId(id);
            Especialidad especialidadActualizada = especialidadService.actualizarEspecialidad(especialidad);
            return new ResponseEntity<>(especialidadActualizada, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> eliminarEspecialidad(@PathVariable Long id) {
        Especialidad especialidad = especialidadService.obtenerEspecialidadPorId(id);
        if (especialidad != null) {
            especialidadService.eliminarEspecialidad(id);
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
}
