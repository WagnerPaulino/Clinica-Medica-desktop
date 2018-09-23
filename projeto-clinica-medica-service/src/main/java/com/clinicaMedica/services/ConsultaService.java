package com.clinicaMedica.services;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.clinicaMedica.domain.Consulta;
import com.clinicaMedica.repositorys.ConsultaRepository;

@Service
public class ConsultaService {
	
	@Autowired
	private ConsultaRepository repository;

	@Cacheable(value = "consulta")
	public Page<Consulta> findAll(Pageable pageable) {
		return repository.findAll(pageable);
	}

	public Consulta findOne(Long id) {
		return repository.findById(id).orElse(new Consulta());
	}

	public boolean exists(Long id) {
		return repository.existsById(id);
	}

	@Transactional
	@CacheEvict(value = "consulta", allEntries = true)
	public void delete(Long id) {
		repository.delete(repository.findById(id).orElse(new Consulta()));
	}

	@Transactional
	@CachePut(value = "consulta")
	@CacheEvict(value = "consulta", allEntries = true)
	public Consulta insert(Consulta newConsulta) {
		return repository.save(newConsulta);
	}

	@Transactional
	@CachePut(value = "consulta")
	@CacheEvict(value = "consulta", allEntries = true)
	public Consulta update(Consulta newConsulta) {
		return repository.save(newConsulta);
	}
}