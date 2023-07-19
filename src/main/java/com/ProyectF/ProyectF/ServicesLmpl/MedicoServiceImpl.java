package com.ProyectF.ProyectF.ServicesLmpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ProyectF.ProyectF.Models.Medico;
import com.ProyectF.ProyectF.Repositories.MedicoRepository;
import com.ProyectF.ProyectF.Services.MedicoService;

import java.util.List;

@Service
public class MedicoServiceImpl implements MedicoService {

    @Autowired
    private MedicoRepository medicoRepository;

    @Override
    public Medico guardarMedico(Medico medico) {
        return medicoRepository.save(medico);
    }

    @Override
    public Medico obtenerMedicoPorId(Long id) {
        return medicoRepository.findById(id).orElse(null);
    }

    @Override
    public List<Medico> obtenerTodosLosMedicos() {
        return (List<Medico>) medicoRepository.findAll();
    }

    @Override
    public Medico actualizarMedico(Medico medico) {
        return medicoRepository.save(medico);
    }

    @Override
    public void eliminarMedico(Long id) {
        medicoRepository.deleteById(id);
    }
}
