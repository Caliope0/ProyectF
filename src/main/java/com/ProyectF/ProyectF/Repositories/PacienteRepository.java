package com.ProyectF.ProyectF.Repositories;


import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.ProyectF.ProyectF.Models.Paciente;

 
@RepositoryRestResource(collectionResourceRel = "pacientes", path = "pacientes")
@CrossOrigin(origins="http://localhost:3000")

public interface PacienteRepository extends PagingAndSortingRepository <Paciente, Integer>, CrudRepository<Paciente, Integer> {
}
