package com.ProyectF.ProyectF.Services;

import java.util.List;

import com.ProyectF.ProyectF.Models.Especialidad;

public interface EspecialidadService {

    Especialidad guardarEspecialidad(Especialidad especialidad);

    Especialidad obtenerEspecialidadPorId(Long id);

    List<Especialidad> obtenerTodasLasEspecialidades();

    Especialidad actualizarEspecialidad(Especialidad especialidad);

    void eliminarEspecialidad(Long id);
}
