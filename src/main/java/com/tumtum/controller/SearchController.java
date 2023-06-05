package com.tumtum.controller;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.zkoss.zk.ui.Component;
import org.zkoss.zk.ui.select.annotation.WireVariable;
import org.zkoss.zul.Button;
import org.zkoss.zul.ListModelList;
import org.zkoss.zul.Listbox;
import org.zkoss.zul.Window;

import com.tumtum.entity.Calificaciones;
import com.tumtum.render.ListBoxRender;
import com.tumtum.services.CalificacionesService;

import jakarta.annotation.Resource;


@EntityScan("com")
@EnableJpaRepositories("com")
@ComponentScan("com")
public class SearchController extends  Controller{

	protected Button search;
	
	protected Listbox lbCalificaciones;

	@Resource
    @Qualifier
	private CalificacionesService calificacionesService;
	

	private static final long serialVersionUID = 1L;
	
	protected Window win; 
	
	//omit codes to get components
    public void onClick$search(){
     System.out.println("HOLA");
     calificacionesService.calificacionesAll();
     llenarListBox();
    }
    
	@Override
	public void doAfterCompose(Component comp) throws Exception {
		super.doAfterCompose(comp);
	     llenarListBox();

	}
    private void llenarListBox() {
    	List<Calificaciones> calificacionesList = new ArrayList<>();
    	Calificaciones c =  new Calificaciones();
    	c.setCalificacion(10.0);
    	c.setId(1);
    	c.setIdMaterias(1);
    	c.setIdUsuario(1);
    	c.setFechaRegistro(new Date());
    	calificacionesList.add(c);

    	Calificaciones c2 =  new Calificaciones();
    	c2.setCalificacion(10.0);
    	c2.setId(1);
    	c2.setIdMaterias(1);
    	c2.setIdUsuario(1);
    	c2.setFechaRegistro(new Date());
    	calificacionesList.add(c2);
    	ListModelList model = new ListModelList(calificacionesList);
    	lbCalificaciones.setModel(model);
    	lbCalificaciones.setItemRenderer(new ListBoxRender());
    }
}
