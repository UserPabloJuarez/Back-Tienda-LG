package org.upn.pe.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.upn.pe.model.InciIncidencia;
import org.upn.pe.service.InciIncidenciaService;

@RestController
@CrossOrigin(origins={"*"})
@RequestMapping("/v1")
public class InciIncidenciaControler {

	@Autowired
	private InciIncidenciaService service;
	
	//listar
    @GetMapping("/incidencias")
    public List<InciIncidencia> incidenciaRecord() {
		return service.findAll();
	}
	
}
