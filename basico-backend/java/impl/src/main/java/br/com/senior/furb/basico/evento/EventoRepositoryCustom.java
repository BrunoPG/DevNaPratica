package br.com.senior.furb.basico.evento;


import java.sql.Time;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Date;

import antlr.collections.List;
import br.com.senior.furb.basico.Evento;
import br.com.senior.furb.basico.EventoEntity;
import br.com.senior.furb.basico.Tipo;
import br.com.senior.furb.basico.TipoEntity;
import br.com.senior.furb.basico.Sala;
import br.com.senior.furb.basico.SalaEntity;
import br.com.senior.furb.basico.Setor;
import br.com.senior.furb.basico.SetorEntity;
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
	 //java.util.List<EventoEntity> getAll();
	///**
	 Date getDateEvento(String idEvento);
	 int getQtdTipo(TipoEntity tipo);
	 java.util.List<SalaEntity> getSalas(String id);
	 java.util.List<SetorEntity> getSetores(String id);
	 //EventoEntity getEvento(String id);
	  
	//  */
	 
	 //Void InsertEvento(Evento e);//String id,LocalDate data, Time hora, String descricao, Tipo tipo);

	//Void UpdateEvento(String id,LocalDate data, LocalTime hora, String descricao, TipoEntity tipo);
}
