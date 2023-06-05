package com.tumtum.entity;

import java.util.Date;

import jakarta.persistence.*;


@Entity
@Table(name = "t_calificaciones")
public class Calificaciones {
	
	@Column(name = "id_t_calificaciones")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
    @Id
	int id;
	
	@Column(name = "id_t_materias")
	int idMaterias;
	
	@Column(name = "id_t_usuarios")
	int idUsuario;

	@Column(name = "calificacion")
	double calificacion;
	
	@Column(name = "fecha_registro")
	Date fechaRegistro;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getIdMaterias() {
		return idMaterias;
	}

	public void setIdMaterias(int idMaterias) {
		this.idMaterias = idMaterias;
	}

	public int getIdUsuario() {
		return idUsuario;
	}

	public void setIdUsuario(int idUsuario) {
		this.idUsuario = idUsuario;
	}

	public double getCalificacion() {
		return calificacion;
	}

	public void setCalificacion(double calificacion) {
		this.calificacion = calificacion;
	}

	public Date getFechaRegistro() {
		return fechaRegistro;
	}

	public void setFechaRegistro(Date fechaRegistro) {
		this.fechaRegistro = fechaRegistro;
	}
	
	

	
}
