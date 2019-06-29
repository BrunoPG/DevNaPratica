/**
 * This is a generated file. DO NOT EDIT ANY CODE HERE, YOUR CHANGES WILL BE LOST.
 */
package br.com.senior.furb.basico;

import java.util.List;
import br.com.senior.furb.basico.Sala.Id;
import br.com.senior.messaging.customspringdata.EntityInfo;
import br.com.senior.springbatchintegration.importer.CrudService;
import org.springframework.data.domain.Page;

public interface SalaCrudService extends CrudService<SalaEntity> {
	
	public SalaEntity createSala(SalaEntity toCreate);
	
	@Deprecated
	public SalaEntity createMergeSala(SalaEntity toCreateMerge);
	
	public SalaEntity updateSala(SalaEntity toUpdate);
	
	@Deprecated
	public SalaEntity updateMergeSala(SalaEntity toUpdateMerge);
	
	public void deleteSala(Id id);
	
	public SalaEntity retrieveSala(Id id);
	
	@Deprecated
	public List<SalaEntity> listSala(int skip, int top);
	
	public Page<SalaEntity> listSalaPageable(int skip, int top);
	
	public Page<SalaEntity> listSalaPageable(int skip, int top, String orderBy);
	
	public Page<SalaEntity> listSalaPageable(int skip, int top, String orderBy, String filter);
	
	public Page<SalaEntity> listSalaPageable(int skip, int top, String orderBy, String filter, EntityInfo parentEntity);
	
	public void createBulkSala(List<SalaEntity> entities);

	public SalaBaseRepository getRepository();
	
}
