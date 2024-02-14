package org.upn.pe.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.upn.pe.model.Incidencia;
import org.upn.pe.repository.IncidenciaRepository;

@Service
public class incidenciaServiceImplement implements IncidenciaService {

	@Autowired
	 private IncidenciaRepository incidenciaRepository;
	
	@Override
	@Transactional(readOnly=true)
	public List<Incidencia> findAll() {
		return (List<Incidencia>)incidenciaRepository.findAll();
	}

	@Override
	@Transactional(readOnly=false)
	public Incidencia save(Incidencia tarea) {
		return incidenciaRepository.save(tarea);
	}

	@Override
	@Transactional(readOnly=true)
	public Incidencia findById(Integer id) {
		return incidenciaRepository.findById(id).orElse(null);
	}

	@Override
	@Transactional(readOnly=false)
	public void delete(Integer id) {
		incidenciaRepository.deleteById(id);
	}

}
