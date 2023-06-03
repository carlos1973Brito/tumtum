package com.example.services;

import java.util.List;

import com.example.entity.Alumnos;

public interface IAlumnoService {
		
		public List<Alumnos> findAll();

		public Alumnos findById(Long id);
}
