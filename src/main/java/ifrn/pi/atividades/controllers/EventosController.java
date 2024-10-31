package ifrn.pi.atividades.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import ifrn.pi.atividades.models.Evento;


@Controller

public class EventosController {
	
	@RequestMapping("/atividades/form")
	public String form() {
		return "formEvento";
	}
	@PostMapping("/eventos")
	public String adicionar(Evento evento) {
		
		System.out.println(evento);
		return "evento-adicionado";
	}
}
