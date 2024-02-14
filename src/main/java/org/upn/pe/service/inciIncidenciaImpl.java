package org.upn.pe.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.upn.pe.model.InciIncidencia;
import org.upn.pe.repository.InciIncidenciaRepository;

@Service
public class inciIncidenciaImpl implements InciIncidenciaService{
	
	@Autowired
	 private InciIncidenciaRepository incidnecia;

	@Override
	public List<InciIncidencia> findAll() {
		return (List<InciIncidencia>) incidnecia.findAll();
	}

}
