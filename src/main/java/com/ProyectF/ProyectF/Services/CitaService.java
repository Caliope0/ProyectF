package com.ProyectF.ProyectF.Services;

import java.util.List;

import com.ProyectF.ProyectF.Models.Cita;

public interface CitaService {

    Cita guardarCita(Cita cita);

    Cita obtenerCitaPorId(Long id);

    List<Cita> obtenerTodasLasCitas();

    Cita actualizarCita(Cita cita);

    void eliminarCita(Long id);
}
