package br.com.senior.furb.basico.evento;

import java.sql.Date;
import java.sql.Time;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.querydsl.jpa.impl.JPAQuery;

import br.com.senior.furb.basico.Evento;
import br.com.senior.furb.basico.EventoDTOConverter;
import br.com.senior.furb.basico.EventoEntity;
import br.com.senior.furb.basico.QEventoEntity;
import br.com.senior.furb.basico.Tipo;
import br.com.senior.furb.basico.TipoEntity;
import br.com.senior.furb.basico.core.RepositoryBaseJpa;

@Repository
public class EventoRepositoryCustomImpl extends RepositoryBaseJpa implements EventoRepositoryCustom {

	@Autowired
	EventoRepository eventoRepository;
	
	@Autowired
	EventoDTOConverter eventoConverter;
	
	@Override
	public List<EventoEntity> getAll() {
		// TODO Auto-generated method stub
		QEventoEntity eventos = QEventoEntity.eventoEntity;
		JPAQuery<EventoEntity> query = select(eventos).from(eventos);
		return query.fetch();
	}
/*
	@Override
	public EventoEntity getEvento(String id) {
		// TODO Auto-generated method stub
		UUID uuidToFind = UUID.fromString(id);
		QEventoEntity eventos = QEventoEntity.eventoEntity;
		JPAQuery<EventoEntity> query = select(eventos).from(eventos).where(eventos.id.eq(uuidToFind));
		return query.fetch().get(0);
	}

	@Override
	public Void InsertEvento(Evento e) {
			//String id, LocalDate data, Time hora, String descricao, Tipo tipo
		// TODO Auto-generated method stub
		QEventoEntity eventos = QEventoEntity.eventoEntity;
		eventoConverter.mergeToEntity(e, eventos);
		return null;
	}*/


}
