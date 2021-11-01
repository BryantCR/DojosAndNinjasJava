package com.dojoninjas.repositories;


import java.util.List;
import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import com.dojoninjas.model.*;

public interface DojoRepository extends CrudRepository<Dojo, Long>{	
	
	List<Dojo> findAll();
	
	Optional<Dojo> findById(Long id); // Convierte el ID a objeto dojo
}
