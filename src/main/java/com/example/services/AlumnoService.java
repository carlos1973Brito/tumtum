package com.example.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.dao.IAlumnoDao;
import com.example.entity.Alumnos;

import jakarta.transaction.Transactional;

@Service
public class AlumnoService implements IAlumnoService {

	@Autowired
	private IAlumnoDao alumnoDao;
	
	@Transactional
	@Override
	public List<Alumnos> findAll() {
		// TODO Auto-generated method stub
		return alumnoDao.findAll();
	}

	@Override
	public Alumnos findById(Long id) {

		
		return alumnoDao.findById(id).orElse(null);
	}

}
