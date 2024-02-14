package org.upn.pe.service;

import java.util.List;
import org.upn.pe.model.Incidencia;

public interface IncidenciaService {
	
	public List<Incidencia> findAll();
    public Incidencia save(Incidencia tarea);
    public Incidencia findById(Integer id);
    public void delete(Integer id);

}
