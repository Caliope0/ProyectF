package com.ProyectF.ProyectF.Repositories;


import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.ProyectF.ProyectF.Models.Cita;



// Los Repositorios no son clases, son interfases 
@RepositoryRestResource(collectionResourceRel = "citas", path = "citas")
@CrossOrigin(origins="http://localhost:3000")

public interface CitaRepository extends PagingAndSortingRepository <Cita, Integer>, CrudRepository<Cita, Integer> {
}
