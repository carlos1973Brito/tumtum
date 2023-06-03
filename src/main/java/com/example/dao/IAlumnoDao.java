package com.example.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.entity.Alumnos;

@Repository
public interface IAlumnoDao extends JpaRepository<Alumnos,Long>{

}
