package com.tumtum.services;

import java.util.List;

import com.tumtum.dto.ActualizaDTO;
import com.tumtum.dto.CalificacionesDTO;
import com.tumtum.dto.Response;
import com.tumtum.entity.Calificaciones;

public interface ICalificacionesService {
		
		public Response save(Calificaciones c);

		public List<CalificacionesDTO> calificacionesId(Long id);

		public Response actualizaCalificacion(ActualizaDTO dto,Long id);

		public Response borrar(Long id);
		
		public List<Calificaciones> calificacionesAll();


}
