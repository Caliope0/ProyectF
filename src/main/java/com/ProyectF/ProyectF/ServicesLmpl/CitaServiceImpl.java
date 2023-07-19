package com.ProyectF.ProyectF.ServicesLmpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ProyectF.ProyectF.Models.Cita;
import com.ProyectF.ProyectF.Repositories.CitaRepository;
import com.ProyectF.ProyectF.Services.CitaService;

import java.util.List;

@Service
public class CitaServiceImpl implements CitaService {

    @Autowired
    private CitaRepository citaRepository;

    @Override
    public Cita guardarCita(Cita cita) {
        return citaRepository.save(cita);
    }

    @Override
    public Cita obtenerCitaPorId(Long id) {
        return citaRepository.findById(id).orElse(null);
    }

    @Override
    public List<Cita> obtenerTodasLasCitas() {
        return (List<Cita>) citaRepository.findAll();
    }

    @Override
    public Cita actualizarCita(Cita cita) {
        return citaRepository.save(cita);
    }

    @Override
    public void eliminarCita(Long id) {
        citaRepository.deleteById(id);
    }
}
