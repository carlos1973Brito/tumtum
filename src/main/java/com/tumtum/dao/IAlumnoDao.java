package com.tumtum.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tumtum.entity.Alumnos;

@Repository
public interface IAlumnoDao extends JpaRepository<Alumnos,Long>{

}
