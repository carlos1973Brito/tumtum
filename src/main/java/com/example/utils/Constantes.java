package com.example.utils;

public class Constantes {
	
	public static final String CONSULTA ="select a.nombre as nombre,a.ap_paterno as apellidopaterno, a.ap_materno as apellidomaterno,m.nombre as materia,c.calificacion as calificacion,to_char(c.fecha_registro, 'DD/MM/YYYY') as fecha,\"\r\n"
			+ "				+ \"c.id_t_usuarios as usuario  \"\r\n"
			+ "				+ \"from t_calificaciones c\\r\\n\"\r\n"
			+ "				+ \"left join t_alumnos a on (a.id_t_usuarios=c.id_t_usuarios)\\r\\n\"\r\n"
			+ "				+ \"left join t_materias m on (m.id_t_materias=c.id_t_materias)\\r\\n\"\r\n"
			+ "				+ \"where a.id_t_usuarios=";
	
	public static final String UPDATE ="update  t_calificaciones set  calificacion=?1 where id_t_usuarios=?2 and id_t_materias=?3";
	

}
