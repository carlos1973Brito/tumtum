package com.tumtum.services;

import java.util.List;

import org.hibernate.transform.AliasToBeanResultTransformer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

import com.tumtum.dao.IAlumnoDao;
import com.tumtum.dao.ICalificacionesDao;
import com.tumtum.dto.ActualizaDTO;
import com.tumtum.dto.CalificacionesDTO;
import com.tumtum.dto.Response;
import com.tumtum.entity.Alumnos;
import com.tumtum.entity.Calificaciones;
import com.tumtum.utils.Constantes;

import jakarta.persistence.EntityManager;
import jakarta.persistence.Query;
import jakarta.transaction.Transactional;

@Service("calificacionesService")
public class CalificacionesService implements ICalificacionesService {

	@Autowired
	private ICalificacionesDao calificacionesDao;

	@Autowired
	private IAlumnoDao alumnoDao;

	@Autowired
	private EntityManager em;

	@Override
	public Response save(Calificaciones c) {
		Response response = new Response();
		 
		 List<Calificaciones> calificacion = (List<Calificaciones>) calificacionesDao.findByMateriaUsuario(c.getIdMaterias(), c.getIdUsuario());
		if (calificacion.isEmpty()) {
			calificacionesDao.save(c);
			response = response("Calificacion registrada", "OK");
		} else {
			response = response("ya se tiene registrada la calificación para la materia:"+c.getIdMaterias() +" del alumno:" +c.getIdUsuario(), "ERROR");
		}

		return response;
	}

	@Override
	public List<CalificacionesDTO> calificacionesId(Long id) {
		String searchQuery = Constantes.CONSULTA + id;
		Query query = em.createNativeQuery(searchQuery).unwrap(org.hibernate.query.Query.class)
				.setResultTransformer(new AliasToBeanResultTransformer(CalificacionesDTO.class));
		List<CalificacionesDTO> result = (List<CalificacionesDTO>) query.getResultList();

		return result;
	}

	@Override
	@Transactional
	public Response actualizaCalificacion(ActualizaDTO dto, Long id) {
		Response response = new Response();
		String query = Constantes.UPDATE;
		int bandera = em.createNativeQuery(query).setParameter(1, dto.getCalificacion()).setParameter(2, id)
				.setParameter(3, dto.getMateria()).executeUpdate();
		// em.createNativeQuery(searchQuery).executeUpdate();
		if (bandera == 1) {
			response = response("calificacion actualizada", "OK");
		} else {
			response = response("no hay registro para actualizada", "ERROR");
		}
		return response;
	}

	@Override
	public Response borrar(Long id) {
		Response response = new Response();
		if (!calificacionesDao.findById(id).isEmpty()) {
			calificacionesDao.deleteById(id);
			response = response("calificacion eliminada", "OK");
		} else {
			response = response("No hay calificación para borrar", "ERROR");

		}
		return response;
	}

	private Response response(String msg, String success) {
		Response response = new Response();
		response.setMsg(msg);
		response.setSuccess(success);
		return response;
	}

	@Override
	public List<Calificaciones> calificacionesAll() {
		
		return calificacionesDao.findAll();
	}

}
