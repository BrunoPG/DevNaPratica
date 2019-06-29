/**
 * This is a generated file. DO NOT EDIT ANY CODE HERE, YOUR CHANGES WILL BE LOST.
 */
package br.com.senior.furb.basico;

import java.util.List;
import br.com.senior.furb.basico.Setor.Id;
import br.com.senior.messaging.customspringdata.EntityInfo;
import br.com.senior.springbatchintegration.importer.CrudService;
import org.springframework.data.domain.Page;

public interface SetorCrudService extends CrudService<SetorEntity> {
	
	public SetorEntity createSetor(SetorEntity toCreate);
	
	@Deprecated
	public SetorEntity createMergeSetor(SetorEntity toCreateMerge);
	
	public SetorEntity updateSetor(SetorEntity toUpdate);
	
	@Deprecated
	public SetorEntity updateMergeSetor(SetorEntity toUpdateMerge);
	
	public void deleteSetor(Id id);
	
	public SetorEntity retrieveSetor(Id id);
	
	@Deprecated
	public List<SetorEntity> listSetor(int skip, int top);
	
	public Page<SetorEntity> listSetorPageable(int skip, int top);
	
	public Page<SetorEntity> listSetorPageable(int skip, int top, String orderBy);
	
	public Page<SetorEntity> listSetorPageable(int skip, int top, String orderBy, String filter);
	
	public Page<SetorEntity> listSetorPageable(int skip, int top, String orderBy, String filter, EntityInfo parentEntity);
	
	public void createBulkSetor(List<SetorEntity> entities);

	public SetorBaseRepository getRepository();
	
}
