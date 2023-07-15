package com.ProyectF.ProyectF.Repositories;


import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.ProyectF.ProyectF.Models.Medico;



// Los Repositorios no son clases, son interfases 
@RepositoryRestResource(collectionResourceRel = "medicos", path = "medicos")
@CrossOrigin(origins="http://localhost:3000")

public interface MedicoRepository extends PagingAndSortingRepository <Medico, Integer>, CrudRepository<Medico, Integer> {
}
