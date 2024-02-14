package org.upn.pe.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.upn.pe.model.Incidencia;
import org.upn.pe.service.IncidenciaService;

@RestController
@CrossOrigin(origins={"*"})
@RequestMapping("/api")
public class IncidenciaController {
	
	@Autowired
    private IncidenciaService incidenciaService;
	
	//listar
	@GetMapping("/incidencias")
    public List<Incidencia> listar(){
		return incidenciaService.findAll();
	}
	
	//guardar
	@PostMapping("/incidencias")
	public Incidencia guardar(@RequestBody Incidencia data) {
		return incidenciaService.save(data);
	} 
	
	@GetMapping("/incidencias/{id}")
    public Incidencia getUnAlumno(@PathVariable Integer id) {
		return incidenciaService.findById(id);
	}
	
	//Modeficar
    @PutMapping("/incidencias/{id}")
    public Incidencia modifecar(@RequestBody Incidencia tarea,@PathVariable Integer id)
    {
    	Incidencia tareaActual= incidenciaService.findById(id);
        tareaActual.setFalla(tarea.getFalla());
        tareaActual.setElectrodomestico(tarea.getElectrodomestico());
        tareaActual.setMarca(tarea.getMarca());
        tareaActual.setModelos(tarea.getModelos());
        
        return incidenciaService.save(tareaActual);
    }
    
    @DeleteMapping("/incidencias/{id}")
    public void eliminar(@PathVariable Integer id)
    {
    	incidenciaService.delete(id);
    }

}
