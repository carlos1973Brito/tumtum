package com.example.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.dto.CalificacionesDTO;
import com.example.entity.Calificaciones;

@Repository
public interface ICalificacionesDao extends JpaRepository<Calificaciones,Long>{
	
	@Query(value = "select c.id_t_usuarios as usuario,a.nombre as nombre,a.ap_paterno as apellidoPaterno, a.ap_materno as apellidoMaterno,\r\n"
			+ "m.nombre as materia,c.calificacion as calificacion, \r\n"
			+ "c.fecha_registro as fecha from t_calificaciones c\r\n"
			+ "left join t_alumnos a on (a.id_t_usuarios=c.id_t_usuarios)\r\n"
			+ "left join t_materias m on (m.id_t_materias=c.id_t_materias)\r\n"
			+ "where a.id_t_usuarios=?1", nativeQuery = true)
	List<CalificacionesDTO> findByCalif(Long id_t_usuario);

}
