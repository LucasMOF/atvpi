package ifrn.pi.atividades.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import ifrn.pi.atividades.models.Evento;

public interface EventoRepository extends JpaRepository<Evento, Long> {

}
