package com.tumtum.utils;

public class Constantes {
	
	public static final String CONSULTA ="select a.nombre as nombre,a.ap_paterno as apellidopaterno, a.ap_materno as apellidomaterno,m.nombre as materia,c.calificacion as calificacion,"
			+ "to_char(c.fecha_registro, 'DD/MM/YYYY') as fecha,"
			+ "	c.id_t_usuarios as usuario  "
			+ "	from t_calificaciones c"
			+ "	left join t_alumnos a on (a.id_t_usuarios=c.id_t_usuarios)"
			+ "	left join t_materias m on (m.id_t_materias=c.id_t_materias)"
			+ "	where a.id_t_usuarios=";
	
	public static final String UPDATE ="update  t_calificaciones set  calificacion=?1 where id_t_usuarios=?2 and id_t_materias=?3";
	

}
