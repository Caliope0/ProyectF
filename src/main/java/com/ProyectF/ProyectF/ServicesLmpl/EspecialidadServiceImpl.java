package com.ProyectF.ProyectF.ServicesLmpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ProyectF.ProyectF.Models.Especialidad;
import com.ProyectF.ProyectF.Repositories.EspecialidadRepository;
import com.ProyectF.ProyectF.Services.EspecialidadService;

import java.util.List;

@Service
public class EspecialidadServiceImpl implements EspecialidadService {

    @Autowired
    private EspecialidadRepository especialidadRepository;

    @Override
    public Especialidad guardarEspecialidad(Especialidad especialidad) {
        return especialidadRepository.save(especialidad);
    }

    @Override
    public Especialidad obtenerEspecialidadPorId(Long id) {
        return especialidadRepository.findById(id).orElse(null);
    }

    @Override
    public List<Especialidad> obtenerTodasLasEspecialidades() {
        return (List<Especialidad>) especialidadRepository.findAll();
    }

    @Override
    public Especialidad actualizarEspecialidad(Especialidad especialidad) {
        return especialidadRepository.save(especialidad);
    }

    @Override
    public void eliminarEspecialidad(Long id) {
        especialidadRepository.deleteById(id);
    }
}
