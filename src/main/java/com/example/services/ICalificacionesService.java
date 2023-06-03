package com.example.services;

import java.util.List;

import com.example.dto.ActualizaDTO;
import com.example.dto.CalificacionesDTO;
import com.example.dto.Response;
import com.example.entity.Calificaciones;

public interface ICalificacionesService {
		
		public Response save(Calificaciones c);

		public List<CalificacionesDTO> calificacionesId(Long id);

		public Response actualizaCalificacion(ActualizaDTO dto,Long id);

		public Response borrar(Long id);

}
