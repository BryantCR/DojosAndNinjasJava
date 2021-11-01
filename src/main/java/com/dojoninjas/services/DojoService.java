package com.dojoninjas.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.dojoninjas.model.*;
import com.dojoninjas.repositories.*;

@Service
public class DojoService {

	private final DojoRepository dojoRepository;
	private final NinjaRepository ninjaRepository;
	
	public DojoService( DojoRepository dojoRepository, NinjaRepository ninjaRepository ) {
		this.dojoRepository = dojoRepository;
		this.ninjaRepository = ninjaRepository;
	}

	public List<Dojo> getAllDojos(){
		return (List<Dojo>) dojoRepository.findAll();
	}
	
	public Dojo createDojo( Dojo dojo ) {
		return dojoRepository.save( dojo );
	}
	
	public Dojo findDojo(Long id) {
		return dojoRepository.findById(id).orElse(null);
	}
	
	public List<Ninja> getAllNinjas() {
		return ninjaRepository.findAll();
	}
	
	public Dojo getDojoId(Long id) {
		return dojoRepository.findById(id).orElse(null);
	}
	
}
