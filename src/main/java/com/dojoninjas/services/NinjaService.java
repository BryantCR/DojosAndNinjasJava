package com.dojoninjas.services;

import org.springframework.stereotype.Service;

import com.dojoninjas.model.Dojo;
import com.dojoninjas.model.Ninja;
import com.dojoninjas.repositories.DojoRepository;
import com.dojoninjas.repositories.NinjaRepository;

@Service
public class NinjaService {

	private final NinjaRepository ninjaRepository;
	private final DojoRepository dojoRepository;
	
	public NinjaService( NinjaRepository ninjaRepository, DojoRepository dojoRepository ) {
		this.ninjaRepository = ninjaRepository;
		this.dojoRepository = dojoRepository;
	}
	
	public Ninja createNinja(Ninja ninja) {
		return ninjaRepository.save(ninja);
	}
	
	
	// Va a DojoRepository
	public Dojo getDojoId(Long id) {
		return dojoRepository.findById(id).orElse(null);
	}
	
}
