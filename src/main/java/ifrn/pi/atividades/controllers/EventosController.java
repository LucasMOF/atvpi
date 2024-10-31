package ifrn.pi.atividades.controllers;

import org.hibernate.metamodel.internal.EntityInstantiatorDynamicMap;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import ifrn.pi.atividades.models.Evento;
import ifrn.pi.atividades.repositories.EventoRepository;


@Controller

public class EventosController {

	@Autowired
	private EventoRepository er;
	
	@RequestMapping("/atividades/form")
	public String form() {
		return "formEvento";
	}
	@PostMapping("/eventos")
	public String adicionar(Evento evento) {
		
		System.out.println(evento);
		er.save(evento);
		return "evento-adicionado";
	}
}
