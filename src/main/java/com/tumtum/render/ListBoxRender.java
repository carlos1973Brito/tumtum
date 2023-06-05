package com.tumtum.render;

import org.zkoss.zul.Listcell;
import org.zkoss.zul.Listitem;
import org.zkoss.zul.ListitemRenderer;

import com.tumtum.entity.Calificaciones;

public class ListBoxRender implements ListitemRenderer{

	@Override
	public void render(Listitem l, Object t, int index) throws Exception {
		Calificaciones u = (Calificaciones) t;
		Listcell nombre = new Listcell(String.valueOf(u.getIdUsuario()));
		l.appendChild(nombre);
		Listcell calificacion = new Listcell(String.valueOf(u.getCalificacion()));
		l.appendChild(calificacion);
		Listcell materia = new Listcell(String.valueOf(u.getIdUsuario()));
		l.appendChild(materia);


	}

}
