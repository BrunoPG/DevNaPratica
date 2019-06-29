package br.com.senior.furb.basico.evento;

import java.sql.Date;
import java.sql.Time;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;

import antlr.collections.List;
import br.com.senior.furb.basico.Evento;
import br.com.senior.furb.basico.EventoEntity;
import br.com.senior.furb.basico.Tipo;
import br.com.senior.furb.basico.TipoEntity;

public interface EventoRepositoryCustom {

	/**
	 * Quantidade de itens
	 * @param id
	 * @return
get  all
get  individual
set  individual 
	 */
	//Long findQuantityById(String id);
	 java.util.List<EventoEntity> getAll();
	 
	 //EventoEntity getEvento(String id);
	 
	 //Void InsertEvento(Evento e);//String id,LocalDate data, Time hora, String descricao, Tipo tipo);

	//Void UpdateEvento(String id,LocalDate data, LocalTime hora, String descricao, TipoEntity tipo);
}
