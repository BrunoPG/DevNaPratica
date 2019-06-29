/**
 * This is a generated file. DO NOT EDIT ANY CODE HERE, YOUR CHANGES WILL BE LOST.
 */
package br.com.senior.furb.basico;

import java.util.List;
import br.com.senior.furb.basico.Tipo.Id;
import br.com.senior.springbatchintegration.importer.CrudService;
import org.springframework.data.domain.Page;

public interface TipoCrudService extends CrudService<TipoEntity> {
	
	public TipoEntity createTipo(TipoEntity toCreate);
	
	@Deprecated
	public TipoEntity createMergeTipo(TipoEntity toCreateMerge);
	
	public TipoEntity updateTipo(TipoEntity toUpdate);
	
	@Deprecated
	public TipoEntity updateMergeTipo(TipoEntity toUpdateMerge);
	
	public void deleteTipo(Id id);
	
	public TipoEntity retrieveTipo(Id id);
	
	@Deprecated
	public List<TipoEntity> listTipo(int skip, int top);
	
	public Page<TipoEntity> listTipoPageable(int skip, int top);
	
	public Page<TipoEntity> listTipoPageable(int skip, int top, String orderBy);
	
	public Page<TipoEntity> listTipoPageable(int skip, int top, String orderBy, String filter);
	
	public void createBulkTipo(List<TipoEntity> entities);

	public TipoBaseRepository getRepository();
	
}
