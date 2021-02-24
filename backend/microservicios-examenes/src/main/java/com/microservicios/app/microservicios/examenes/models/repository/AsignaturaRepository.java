package com.microservicios.app.microservicios.examenes.models.repository;

import org.springframework.data.repository.CrudRepository;

import com.microservicios.app.microservicios.commons.examenes.models.entity.Asignatura;

public interface AsignaturaRepository extends CrudRepository<Asignatura, Long> {

}
