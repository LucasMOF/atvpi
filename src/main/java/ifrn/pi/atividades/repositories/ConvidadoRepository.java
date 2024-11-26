package ifrn.pi.atividades.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import ifrn.pi.atividades.models.Convidado;
import ifrn.pi.atividades.models.Evento;

public interface ConvidadoRepository extends JpaRepository<Convidado, Long>{

	List<Convidado> findByEvento(Evento evento);
	
}
