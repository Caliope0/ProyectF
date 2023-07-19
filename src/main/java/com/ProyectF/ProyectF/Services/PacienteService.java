package com.ProyectF.ProyectF.Services;

import java.util.List;

import com.ProyectF.ProyectF.Models.Paciente;

public interface PacienteService {

    Paciente guardarPaciente(Paciente paciente);

    Paciente obtenerPacientePorId(Long id);

    List<Paciente> obtenerTodosLosPacientes();

    Paciente actualizarPaciente(Paciente paciente);

    void eliminarPaciente(Long id);
}
