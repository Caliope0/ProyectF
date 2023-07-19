package com.ProyectF.ProyectF.Services;

import java.util.List;

import com.ProyectF.ProyectF.Models.Medico;

public interface MedicoService {

    Medico guardarMedico(Medico medico);

    Medico obtenerMedicoPorId(Long id);

    List<Medico> obtenerTodosLosMedicos();

    Medico actualizarMedico(Medico medico);

    void eliminarMedico(Long id);
}
