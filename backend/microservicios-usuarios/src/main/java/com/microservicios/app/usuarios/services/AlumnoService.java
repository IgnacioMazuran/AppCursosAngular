package com.microservicios.app.usuarios.services;

import java.util.List;


import com.microservicios.app.commons.alumnos.models.entity.Alumno;
import com.microsevicios.commons.services.CommonService;

public interface AlumnoService extends CommonService<com.microservicios.app.commons.alumnos.models.entity.Alumno> {

	public List<Alumno> findByNombreOrApellido(String term);
	
	public Iterable<Alumno> findAllById(Iterable<Long> ids);
	
	public void eliminarCursoAlumnoPorId(Long id);

}
