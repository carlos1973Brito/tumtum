package com.tumtum.services;

import java.util.List;

import com.tumtum.entity.Alumnos;

public interface IAlumnoService {
		
		public List<Alumnos> findAll();

		public Alumnos findById(Long id);
}
