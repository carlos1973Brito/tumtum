package com.example.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.dto.ActualizaDTO;
import com.example.dto.CalificacionesDTO;
import com.example.dto.Response;
import com.example.entity.Calificaciones;
import com.example.services.CalificacionesService;


@RestController
@RequestMapping("/escuela")
@EnableAutoConfiguration
public class EsuelaServiceController {


	@Autowired
	private CalificacionesService calificacionesService;
	
	@GetMapping(value="/calificacionAlumno/{id}")
	public List<CalificacionesDTO> getCalificaciones(@PathVariable Long id) {		
		List<CalificacionesDTO> alumnos =calificacionesService.calificacionesId(id); ;
	
		return alumnos;
	}

	@PostMapping(value="/calificacion")
	public Response save(@RequestBody Calificaciones c) {
		Response response =	calificacionesService.save(c);	
		return response;
	}
	
	@PutMapping(value="/actualiza/{id}")
	public Response actualiza(@RequestBody ActualizaDTO dto,@PathVariable Long id) {
		Response response =	calificacionesService.actualizaCalificacion(dto,id);	
		return response;
	}
	
	@DeleteMapping(value="/borra/{id}")
	public Response borrar(@PathVariable Long id) {
		Response response =	calificacionesService.borrar(id);	
		return response;
	}
}
