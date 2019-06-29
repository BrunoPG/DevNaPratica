/**
 * This is a generated file. DO NOT EDIT ANY CODE HERE, YOUR CHANGES WILL BE LOST.
 */
package br.com.senior.furb.basico;

import java.util.List;
import br.com.senior.furb.basico.Evento.Id;
import br.com.senior.messaging.customspringdata.EntityInfo;
import br.com.senior.springbatchintegration.importer.CrudService;
import org.springframework.data.domain.Page;

public interface EventoCrudService extends CrudService<EventoEntity> {
	
	public EventoEntity createEvento(EventoEntity toCreate);
	
	@Deprecated
	public EventoEntity createMergeEvento(EventoEntity toCreateMerge);
	
	public EventoEntity updateEvento(EventoEntity toUpdate);
	
	@Deprecated
	public EventoEntity updateMergeEvento(EventoEntity toUpdateMerge);
	
	public void deleteEvento(Id id);
	
	public EventoEntity retrieveEvento(Id id);
	
	@Deprecated
	public List<EventoEntity> listEvento(int skip, int top);
	
	public Page<EventoEntity> listEventoPageable(int skip, int top);
	
	public Page<EventoEntity> listEventoPageable(int skip, int top, String orderBy);
	
	public Page<EventoEntity> listEventoPageable(int skip, int top, String orderBy, String filter);
	
	public Page<EventoEntity> listEventoPageable(int skip, int top, String orderBy, String filter, EntityInfo parentEntity);
	
	public void createBulkEvento(List<EventoEntity> entities);

	public EventoBaseRepository getRepository();
	
}
