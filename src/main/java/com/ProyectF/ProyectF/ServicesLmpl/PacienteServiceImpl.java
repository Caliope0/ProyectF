package com.ProyectF.ProyectF.ServicesLmpl;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ProyectF.ProyectF.Models.Paciente;
import com.ProyectF.ProyectF.Repositories.PacienteRepository;
import com.ProyectF.ProyectF.Services.PacienteService;

import java.util.List;

@Service
public class PacienteServiceImpl implements PacienteService {

    @Autowired
    private PacienteRepository pacienteRepository;

    @Override
    public Paciente guardarPaciente(Paciente paciente) {
        return pacienteRepository.save(paciente);
    }

    @Override
    public Paciente obtenerPacientePorId(Long id) {
        return pacienteRepository.findById(id).orElse(null);
    }

    @Override
    public List<Paciente> obtenerTodosLosPacientes() {
        return (List<Paciente>) pacienteRepository.findAll();
    }

    @Override
    public Paciente actualizarPaciente(Paciente paciente) {
        return pacienteRepository.save(paciente);
    }

    @Override
    public void eliminarPaciente(Long id) {
        pacienteRepository.deleteById(id);
    }
}
