/**
 * This is a generated file. DO NOT EDIT ANY CODE HERE, YOUR CHANGES WILL BE LOST.
 */
package br.com.senior.furb.basico;

import java.util.concurrent.CompletableFuture;

import br.com.senior.furb.basico.GetQtdTipoInput;
import br.com.senior.furb.basico.GetQtdTipoOutput;
import br.com.senior.furb.basico.GetDateEventoInput;
import br.com.senior.furb.basico.GetDateEventoOutput;
import br.com.senior.furb.basico.GetSalasInput;
import br.com.senior.furb.basico.GetSalasOutput;
import br.com.senior.furb.basico.GetSetoresInput;
import br.com.senior.furb.basico.GetSetoresOutput;
import br.com.senior.furb.basico.GetMetadataInput;
import br.com.senior.furb.basico.GetMetadataOutput;
import br.com.senior.furb.basico.ImportTipoInput;
import br.com.senior.furb.basico.ImportTipoOutput;
import br.com.senior.furb.basico.ExportTipoInput;
import br.com.senior.furb.basico.ExportTipoOutput;
import br.com.senior.furb.basico.ImportEventoInput;
import br.com.senior.furb.basico.ImportEventoOutput;
import br.com.senior.furb.basico.ExportEventoInput;
import br.com.senior.furb.basico.ExportEventoOutput;
import br.com.senior.furb.basico.ImportSalaInput;
import br.com.senior.furb.basico.ImportSalaOutput;
import br.com.senior.furb.basico.ExportSalaInput;
import br.com.senior.furb.basico.ExportSalaOutput;
import br.com.senior.furb.basico.ImportSetorInput;
import br.com.senior.furb.basico.ImportSetorOutput;
import br.com.senior.furb.basico.ExportSetorInput;
import br.com.senior.furb.basico.ExportSetorOutput;
import br.com.senior.furb.basico.GetDependenciesOutput;
import br.com.senior.furb.basico.Tipo;
import br.com.senior.furb.basico.CreateBulkTipoInput;
import br.com.senior.furb.basico.CreateBulkTipoOutput;
import br.com.senior.furb.basico.Evento;
import br.com.senior.furb.basico.CreateBulkEventoInput;
import br.com.senior.furb.basico.CreateBulkEventoOutput;
import br.com.senior.furb.basico.Sala;
import br.com.senior.furb.basico.CreateBulkSalaInput;
import br.com.senior.furb.basico.CreateBulkSalaOutput;
import br.com.senior.furb.basico.Setor;
import br.com.senior.furb.basico.CreateBulkSetorInput;
import br.com.senior.furb.basico.CreateBulkSetorOutput;
import br.com.senior.furb.basico.ServiceStartedPayload;
import br.com.senior.furb.basico.NotifyUserEventPayload;
import br.com.senior.furb.basico.ImportTipoEventPayload;
import br.com.senior.furb.basico.ExportTipoEventPayload;
import br.com.senior.furb.basico.ImportEventoEventPayload;
import br.com.senior.furb.basico.ExportEventoEventPayload;
import br.com.senior.furb.basico.ImportSalaEventPayload;
import br.com.senior.furb.basico.ExportSalaEventPayload;
import br.com.senior.furb.basico.ImportSetorEventPayload;
import br.com.senior.furb.basico.ExportSetorEventPayload;

/**
* 
*/
public interface BasicoStub {

	/**
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * 
	 * Chamada síncrona, o valor de timeout deve ser informado em ms 
	 */
	GetQtdTipoOutput getQtdTipo(GetQtdTipoInput input, long timeout);
	
	/**
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * 
	 * Chamada assíncrona
	 */
	void getQtdTipo(GetQtdTipoInput input);
	
	/**
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * 
	 * Chamada assíncrona utilizando request
	 */
	CompletableFuture<GetQtdTipoOutput> getQtdTipoRequest(GetQtdTipoInput input);
	
	/**
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * 
	 * Chamada síncrona, o valor de timeout deve ser informado em ms 
	 */
	GetDateEventoOutput getDateEvento(GetDateEventoInput input, long timeout);
	
	/**
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * 
	 * Chamada assíncrona
	 */
	void getDateEvento(GetDateEventoInput input);
	
	/**
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * 
	 * Chamada assíncrona utilizando request
	 */
	CompletableFuture<GetDateEventoOutput> getDateEventoRequest(GetDateEventoInput input);
	
	/**
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * 
	 * Chamada síncrona, o valor de timeout deve ser informado em ms 
	 */
	GetSalasOutput getSalas(GetSalasInput input, long timeout);
	
	/**
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * 
	 * Chamada assíncrona
	 */
	void getSalas(GetSalasInput input);
	
	/**
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * 
	 * Chamada assíncrona utilizando request
	 */
	CompletableFuture<GetSalasOutput> getSalasRequest(GetSalasInput input);
	
	/**
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * 
	 * Chamada síncrona, o valor de timeout deve ser informado em ms 
	 */
	GetSetoresOutput getSetores(GetSetoresInput input, long timeout);
	
	/**
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * 
	 * Chamada assíncrona
	 */
	void getSetores(GetSetoresInput input);
	
	/**
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * 
	 * Chamada assíncrona utilizando request
	 */
	CompletableFuture<GetSetoresOutput> getSetoresRequest(GetSetoresInput input);
	
	/**
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * Default 'getMetadata' query. Every service must handle this command and return metadata in the format requested.
	 * Chamada síncrona, o valor de timeout deve ser informado em ms 
	 */
	GetMetadataOutput getMetadata(GetMetadataInput input, long timeout);
	
	/**
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * Default 'getMetadata' query. Every service must handle this command and return metadata in the format requested.
	 * Chamada assíncrona
	 */
	void getMetadata(GetMetadataInput input);
	
	/**
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * Default 'getMetadata' query. Every service must handle this command and return metadata in the format requested.
	 * Chamada assíncrona utilizando request
	 */
	CompletableFuture<GetMetadataOutput> getMetadataRequest(GetMetadataInput input);
	
	/**
	 * This is a public operation
	 * 
	 * Chamada síncrona, o valor de timeout deve ser informado em ms 
	 */
	ImportTipoOutput importTipo(ImportTipoInput input, long timeout);
	
	/**
	 * This is a public operation
	 * 
	 * Chamada assíncrona
	 */
	void importTipo(ImportTipoInput input);
	
	/**
	 * This is a public operation
	 * 
	 * Chamada assíncrona utilizando request
	 */
	CompletableFuture<ImportTipoOutput> importTipoRequest(ImportTipoInput input);
	
	/**
	 * This is a public operation
	 * 
	 * Chamada síncrona, o valor de timeout deve ser informado em ms 
	 */
	ExportTipoOutput exportTipo(ExportTipoInput input, long timeout);
	
	/**
	 * This is a public operation
	 * 
	 * Chamada assíncrona
	 */
	void exportTipo(ExportTipoInput input);
	
	/**
	 * This is a public operation
	 * 
	 * Chamada assíncrona utilizando request
	 */
	CompletableFuture<ExportTipoOutput> exportTipoRequest(ExportTipoInput input);
	
	/**
	 * This is a public operation
	 * 
	 * Chamada síncrona, o valor de timeout deve ser informado em ms 
	 */
	ImportEventoOutput importEvento(ImportEventoInput input, long timeout);
	
	/**
	 * This is a public operation
	 * 
	 * Chamada assíncrona
	 */
	void importEvento(ImportEventoInput input);
	
	/**
	 * This is a public operation
	 * 
	 * Chamada assíncrona utilizando request
	 */
	CompletableFuture<ImportEventoOutput> importEventoRequest(ImportEventoInput input);
	
	/**
	 * This is a public operation
	 * 
	 * Chamada síncrona, o valor de timeout deve ser informado em ms 
	 */
	ExportEventoOutput exportEvento(ExportEventoInput input, long timeout);
	
	/**
	 * This is a public operation
	 * 
	 * Chamada assíncrona
	 */
	void exportEvento(ExportEventoInput input);
	
	/**
	 * This is a public operation
	 * 
	 * Chamada assíncrona utilizando request
	 */
	CompletableFuture<ExportEventoOutput> exportEventoRequest(ExportEventoInput input);
	
	/**
	 * This is a public operation
	 * 
	 * Chamada síncrona, o valor de timeout deve ser informado em ms 
	 */
	ImportSalaOutput importSala(ImportSalaInput input, long timeout);
	
	/**
	 * This is a public operation
	 * 
	 * Chamada assíncrona
	 */
	void importSala(ImportSalaInput input);
	
	/**
	 * This is a public operation
	 * 
	 * Chamada assíncrona utilizando request
	 */
	CompletableFuture<ImportSalaOutput> importSalaRequest(ImportSalaInput input);
	
	/**
	 * This is a public operation
	 * 
	 * Chamada síncrona, o valor de timeout deve ser informado em ms 
	 */
	ExportSalaOutput exportSala(ExportSalaInput input, long timeout);
	
	/**
	 * This is a public operation
	 * 
	 * Chamada assíncrona
	 */
	void exportSala(ExportSalaInput input);
	
	/**
	 * This is a public operation
	 * 
	 * Chamada assíncrona utilizando request
	 */
	CompletableFuture<ExportSalaOutput> exportSalaRequest(ExportSalaInput input);
	
	/**
	 * This is a public operation
	 * 
	 * Chamada síncrona, o valor de timeout deve ser informado em ms 
	 */
	ImportSetorOutput importSetor(ImportSetorInput input, long timeout);
	
	/**
	 * This is a public operation
	 * 
	 * Chamada assíncrona
	 */
	void importSetor(ImportSetorInput input);
	
	/**
	 * This is a public operation
	 * 
	 * Chamada assíncrona utilizando request
	 */
	CompletableFuture<ImportSetorOutput> importSetorRequest(ImportSetorInput input);
	
	/**
	 * This is a public operation
	 * 
	 * Chamada síncrona, o valor de timeout deve ser informado em ms 
	 */
	ExportSetorOutput exportSetor(ExportSetorInput input, long timeout);
	
	/**
	 * This is a public operation
	 * 
	 * Chamada assíncrona
	 */
	void exportSetor(ExportSetorInput input);
	
	/**
	 * This is a public operation
	 * 
	 * Chamada assíncrona utilizando request
	 */
	CompletableFuture<ExportSetorOutput> exportSetorRequest(ExportSetorInput input);
	
	/**
	 * This is a public operation
	 * The 'list' request primitive for the Tipo entity.
	 * Chamada síncrona, o valor de timeout deve ser informado em ms 
	 */
	Tipo.PagedResults listTipo(Tipo.PageRequest input, long timeout);
	
	/**
	 * This is a public operation
	 * The 'list' request primitive for the Tipo entity.
	 * Chamada assíncrona
	 */
	void listTipo(Tipo.PageRequest input);
	
	/**
	 * This is a public operation
	 * The 'list' request primitive for the Tipo entity.
	 * Chamada assíncrona utilizando request
	 */
	CompletableFuture<Tipo.PagedResults> listTipoRequest(Tipo.PageRequest input);
	
	/**
	 * This is a public operation
	 * The 'list' request primitive for the Evento entity.
	 * Chamada síncrona, o valor de timeout deve ser informado em ms 
	 */
	Evento.PagedResults listEvento(Evento.PageRequest input, long timeout);
	
	/**
	 * This is a public operation
	 * The 'list' request primitive for the Evento entity.
	 * Chamada assíncrona
	 */
	void listEvento(Evento.PageRequest input);
	
	/**
	 * This is a public operation
	 * The 'list' request primitive for the Evento entity.
	 * Chamada assíncrona utilizando request
	 */
	CompletableFuture<Evento.PagedResults> listEventoRequest(Evento.PageRequest input);
	
	/**
	 * This is a public operation
	 * The 'list' request primitive for the Sala entity.
	 * Chamada síncrona, o valor de timeout deve ser informado em ms 
	 */
	Sala.PagedResults listSala(Sala.PageRequest input, long timeout);
	
	/**
	 * This is a public operation
	 * The 'list' request primitive for the Sala entity.
	 * Chamada assíncrona
	 */
	void listSala(Sala.PageRequest input);
	
	/**
	 * This is a public operation
	 * The 'list' request primitive for the Sala entity.
	 * Chamada assíncrona utilizando request
	 */
	CompletableFuture<Sala.PagedResults> listSalaRequest(Sala.PageRequest input);
	
	/**
	 * This is a public operation
	 * The 'list' request primitive for the Setor entity.
	 * Chamada síncrona, o valor de timeout deve ser informado em ms 
	 */
	Setor.PagedResults listSetor(Setor.PageRequest input, long timeout);
	
	/**
	 * This is a public operation
	 * The 'list' request primitive for the Setor entity.
	 * Chamada assíncrona
	 */
	void listSetor(Setor.PageRequest input);
	
	/**
	 * This is a public operation
	 * The 'list' request primitive for the Setor entity.
	 * Chamada assíncrona utilizando request
	 */
	CompletableFuture<Setor.PagedResults> listSetorRequest(Setor.PageRequest input);
	
	/**
	 * This is a public operation
	 * Returns a list with all dependencies from this service, along with their respective versions
	 * Chamada síncrona, o valor de timeout deve ser informado em ms 
	 */
	GetDependenciesOutput getDependencies(long timeout);
	
	/**
	 * This is a public operation
	 * Returns a list with all dependencies from this service, along with their respective versions
	 * Chamada assíncrona
	 */
	void getDependencies();
	
	/**
	 * This is a public operation
	 * Returns a list with all dependencies from this service, along with their respective versions
	 * Chamada assíncrona utilizando request
	 */
	CompletableFuture<GetDependenciesOutput> getDependenciesRequest();
	
	/**
	 * This is a public operation
	 * The 'create' request primitive for the Tipo entity.
	 * Chamada síncrona, o valor de timeout deve ser informado em ms 
	 */
	Tipo createTipo(Tipo input, long timeout);
	
	/**
	 * This is a public operation
	 * The 'create' request primitive for the Tipo entity.
	 * Chamada assíncrona
	 */
	void createTipo(Tipo input);
	
	/**
	 * This is a public operation
	 * The 'create' request primitive for the Tipo entity.
	 * Chamada assíncrona utilizando request
	 */
	CompletableFuture<Tipo> createTipoRequest(Tipo input);
	
	/**
	 * This is a public operation
	 * The 'createBulk' request primitive for the Tipo entity.
	 * Chamada síncrona, o valor de timeout deve ser informado em ms 
	 */
	CreateBulkTipoOutput createBulkTipo(CreateBulkTipoInput input, long timeout);
	
	/**
	 * This is a public operation
	 * The 'createBulk' request primitive for the Tipo entity.
	 * Chamada assíncrona
	 */
	void createBulkTipo(CreateBulkTipoInput input);
	
	/**
	 * This is a public operation
	 * The 'createBulk' request primitive for the Tipo entity.
	 * Chamada assíncrona utilizando request
	 */
	CompletableFuture<CreateBulkTipoOutput> createBulkTipoRequest(CreateBulkTipoInput input);
	
	/**
	 * This is a public operation
	 * The 'createMerge' request primitive for the Tipo entity.
	 * Chamada síncrona, o valor de timeout deve ser informado em ms 
	 */
	Tipo createMergeTipo(Tipo input, long timeout);
	
	/**
	 * This is a public operation
	 * The 'createMerge' request primitive for the Tipo entity.
	 * Chamada assíncrona
	 */
	void createMergeTipo(Tipo input);
	
	/**
	 * This is a public operation
	 * The 'createMerge' request primitive for the Tipo entity.
	 * Chamada assíncrona utilizando request
	 */
	CompletableFuture<Tipo> createMergeTipoRequest(Tipo input);
	
	/**
	 * This is a public operation
	 * The 'retrieve' request primitive for the Tipo entity.
	 * Chamada síncrona, o valor de timeout deve ser informado em ms 
	 */
	Tipo retrieveTipo(Tipo.Id input, long timeout);
	
	/**
	 * This is a public operation
	 * The 'retrieve' request primitive for the Tipo entity.
	 * Chamada assíncrona
	 */
	void retrieveTipo(Tipo.Id input);
	
	/**
	 * This is a public operation
	 * The 'retrieve' request primitive for the Tipo entity.
	 * Chamada assíncrona utilizando request
	 */
	CompletableFuture<Tipo> retrieveTipoRequest(Tipo.Id input);
	
	/**
	 * This is a public operation
	 * The 'update' request primitive for the Tipo entity.
	 * Chamada síncrona, o valor de timeout deve ser informado em ms 
	 */
	Tipo updateTipo(Tipo input, long timeout);
	
	/**
	 * This is a public operation
	 * The 'update' request primitive for the Tipo entity.
	 * Chamada assíncrona
	 */
	void updateTipo(Tipo input);
	
	/**
	 * This is a public operation
	 * The 'update' request primitive for the Tipo entity.
	 * Chamada assíncrona utilizando request
	 */
	CompletableFuture<Tipo> updateTipoRequest(Tipo input);
	
	/**
	 * This is a public operation
	 * The 'updateMerge' request primitive for the Tipo entity.
	 * Chamada síncrona, o valor de timeout deve ser informado em ms 
	 */
	Tipo updateMergeTipo(Tipo input, long timeout);
	
	/**
	 * This is a public operation
	 * The 'updateMerge' request primitive for the Tipo entity.
	 * Chamada assíncrona
	 */
	void updateMergeTipo(Tipo input);
	
	/**
	 * This is a public operation
	 * The 'updateMerge' request primitive for the Tipo entity.
	 * Chamada assíncrona utilizando request
	 */
	CompletableFuture<Tipo> updateMergeTipoRequest(Tipo input);
	
	/**
	 * This is a public operation
	 * The 'delete' request primitive for the Tipo entity.
	 * Chamada síncrona, o valor de timeout deve ser informado em ms 
	 */
	void deleteTipo(Tipo.Id input, long timeout);
	
	/**
	 * This is a public operation
	 * The 'delete' request primitive for the Tipo entity.
	 * Chamada assíncrona
	 */
	void deleteTipo(Tipo.Id input);
	
	/**
	 * This is a public operation
	 * The 'create' request primitive for the Evento entity.
	 * Chamada síncrona, o valor de timeout deve ser informado em ms 
	 */
	Evento createEvento(Evento input, long timeout);
	
	/**
	 * This is a public operation
	 * The 'create' request primitive for the Evento entity.
	 * Chamada assíncrona
	 */
	void createEvento(Evento input);
	
	/**
	 * This is a public operation
	 * The 'create' request primitive for the Evento entity.
	 * Chamada assíncrona utilizando request
	 */
	CompletableFuture<Evento> createEventoRequest(Evento input);
	
	/**
	 * This is a public operation
	 * The 'createBulk' request primitive for the Evento entity.
	 * Chamada síncrona, o valor de timeout deve ser informado em ms 
	 */
	CreateBulkEventoOutput createBulkEvento(CreateBulkEventoInput input, long timeout);
	
	/**
	 * This is a public operation
	 * The 'createBulk' request primitive for the Evento entity.
	 * Chamada assíncrona
	 */
	void createBulkEvento(CreateBulkEventoInput input);
	
	/**
	 * This is a public operation
	 * The 'createBulk' request primitive for the Evento entity.
	 * Chamada assíncrona utilizando request
	 */
	CompletableFuture<CreateBulkEventoOutput> createBulkEventoRequest(CreateBulkEventoInput input);
	
	/**
	 * This is a public operation
	 * The 'createMerge' request primitive for the Evento entity.
	 * Chamada síncrona, o valor de timeout deve ser informado em ms 
	 */
	Evento createMergeEvento(Evento input, long timeout);
	
	/**
	 * This is a public operation
	 * The 'createMerge' request primitive for the Evento entity.
	 * Chamada assíncrona
	 */
	void createMergeEvento(Evento input);
	
	/**
	 * This is a public operation
	 * The 'createMerge' request primitive for the Evento entity.
	 * Chamada assíncrona utilizando request
	 */
	CompletableFuture<Evento> createMergeEventoRequest(Evento input);
	
	/**
	 * This is a public operation
	 * The 'retrieve' request primitive for the Evento entity.
	 * Chamada síncrona, o valor de timeout deve ser informado em ms 
	 */
	Evento retrieveEvento(Evento.Id input, long timeout);
	
	/**
	 * This is a public operation
	 * The 'retrieve' request primitive for the Evento entity.
	 * Chamada assíncrona
	 */
	void retrieveEvento(Evento.Id input);
	
	/**
	 * This is a public operation
	 * The 'retrieve' request primitive for the Evento entity.
	 * Chamada assíncrona utilizando request
	 */
	CompletableFuture<Evento> retrieveEventoRequest(Evento.Id input);
	
	/**
	 * This is a public operation
	 * The 'update' request primitive for the Evento entity.
	 * Chamada síncrona, o valor de timeout deve ser informado em ms 
	 */
	Evento updateEvento(Evento input, long timeout);
	
	/**
	 * This is a public operation
	 * The 'update' request primitive for the Evento entity.
	 * Chamada assíncrona
	 */
	void updateEvento(Evento input);
	
	/**
	 * This is a public operation
	 * The 'update' request primitive for the Evento entity.
	 * Chamada assíncrona utilizando request
	 */
	CompletableFuture<Evento> updateEventoRequest(Evento input);
	
	/**
	 * This is a public operation
	 * The 'updateMerge' request primitive for the Evento entity.
	 * Chamada síncrona, o valor de timeout deve ser informado em ms 
	 */
	Evento updateMergeEvento(Evento input, long timeout);
	
	/**
	 * This is a public operation
	 * The 'updateMerge' request primitive for the Evento entity.
	 * Chamada assíncrona
	 */
	void updateMergeEvento(Evento input);
	
	/**
	 * This is a public operation
	 * The 'updateMerge' request primitive for the Evento entity.
	 * Chamada assíncrona utilizando request
	 */
	CompletableFuture<Evento> updateMergeEventoRequest(Evento input);
	
	/**
	 * This is a public operation
	 * The 'delete' request primitive for the Evento entity.
	 * Chamada síncrona, o valor de timeout deve ser informado em ms 
	 */
	void deleteEvento(Evento.Id input, long timeout);
	
	/**
	 * This is a public operation
	 * The 'delete' request primitive for the Evento entity.
	 * Chamada assíncrona
	 */
	void deleteEvento(Evento.Id input);
	
	/**
	 * This is a public operation
	 * The 'create' request primitive for the Sala entity.
	 * Chamada síncrona, o valor de timeout deve ser informado em ms 
	 */
	Sala createSala(Sala input, long timeout);
	
	/**
	 * This is a public operation
	 * The 'create' request primitive for the Sala entity.
	 * Chamada assíncrona
	 */
	void createSala(Sala input);
	
	/**
	 * This is a public operation
	 * The 'create' request primitive for the Sala entity.
	 * Chamada assíncrona utilizando request
	 */
	CompletableFuture<Sala> createSalaRequest(Sala input);
	
	/**
	 * This is a public operation
	 * The 'createBulk' request primitive for the Sala entity.
	 * Chamada síncrona, o valor de timeout deve ser informado em ms 
	 */
	CreateBulkSalaOutput createBulkSala(CreateBulkSalaInput input, long timeout);
	
	/**
	 * This is a public operation
	 * The 'createBulk' request primitive for the Sala entity.
	 * Chamada assíncrona
	 */
	void createBulkSala(CreateBulkSalaInput input);
	
	/**
	 * This is a public operation
	 * The 'createBulk' request primitive for the Sala entity.
	 * Chamada assíncrona utilizando request
	 */
	CompletableFuture<CreateBulkSalaOutput> createBulkSalaRequest(CreateBulkSalaInput input);
	
	/**
	 * This is a public operation
	 * The 'createMerge' request primitive for the Sala entity.
	 * Chamada síncrona, o valor de timeout deve ser informado em ms 
	 */
	Sala createMergeSala(Sala input, long timeout);
	
	/**
	 * This is a public operation
	 * The 'createMerge' request primitive for the Sala entity.
	 * Chamada assíncrona
	 */
	void createMergeSala(Sala input);
	
	/**
	 * This is a public operation
	 * The 'createMerge' request primitive for the Sala entity.
	 * Chamada assíncrona utilizando request
	 */
	CompletableFuture<Sala> createMergeSalaRequest(Sala input);
	
	/**
	 * This is a public operation
	 * The 'retrieve' request primitive for the Sala entity.
	 * Chamada síncrona, o valor de timeout deve ser informado em ms 
	 */
	Sala retrieveSala(Sala.Id input, long timeout);
	
	/**
	 * This is a public operation
	 * The 'retrieve' request primitive for the Sala entity.
	 * Chamada assíncrona
	 */
	void retrieveSala(Sala.Id input);
	
	/**
	 * This is a public operation
	 * The 'retrieve' request primitive for the Sala entity.
	 * Chamada assíncrona utilizando request
	 */
	CompletableFuture<Sala> retrieveSalaRequest(Sala.Id input);
	
	/**
	 * This is a public operation
	 * The 'update' request primitive for the Sala entity.
	 * Chamada síncrona, o valor de timeout deve ser informado em ms 
	 */
	Sala updateSala(Sala input, long timeout);
	
	/**
	 * This is a public operation
	 * The 'update' request primitive for the Sala entity.
	 * Chamada assíncrona
	 */
	void updateSala(Sala input);
	
	/**
	 * This is a public operation
	 * The 'update' request primitive for the Sala entity.
	 * Chamada assíncrona utilizando request
	 */
	CompletableFuture<Sala> updateSalaRequest(Sala input);
	
	/**
	 * This is a public operation
	 * The 'updateMerge' request primitive for the Sala entity.
	 * Chamada síncrona, o valor de timeout deve ser informado em ms 
	 */
	Sala updateMergeSala(Sala input, long timeout);
	
	/**
	 * This is a public operation
	 * The 'updateMerge' request primitive for the Sala entity.
	 * Chamada assíncrona
	 */
	void updateMergeSala(Sala input);
	
	/**
	 * This is a public operation
	 * The 'updateMerge' request primitive for the Sala entity.
	 * Chamada assíncrona utilizando request
	 */
	CompletableFuture<Sala> updateMergeSalaRequest(Sala input);
	
	/**
	 * This is a public operation
	 * The 'delete' request primitive for the Sala entity.
	 * Chamada síncrona, o valor de timeout deve ser informado em ms 
	 */
	void deleteSala(Sala.Id input, long timeout);
	
	/**
	 * This is a public operation
	 * The 'delete' request primitive for the Sala entity.
	 * Chamada assíncrona
	 */
	void deleteSala(Sala.Id input);
	
	/**
	 * This is a public operation
	 * The 'create' request primitive for the Setor entity.
	 * Chamada síncrona, o valor de timeout deve ser informado em ms 
	 */
	Setor createSetor(Setor input, long timeout);
	
	/**
	 * This is a public operation
	 * The 'create' request primitive for the Setor entity.
	 * Chamada assíncrona
	 */
	void createSetor(Setor input);
	
	/**
	 * This is a public operation
	 * The 'create' request primitive for the Setor entity.
	 * Chamada assíncrona utilizando request
	 */
	CompletableFuture<Setor> createSetorRequest(Setor input);
	
	/**
	 * This is a public operation
	 * The 'createBulk' request primitive for the Setor entity.
	 * Chamada síncrona, o valor de timeout deve ser informado em ms 
	 */
	CreateBulkSetorOutput createBulkSetor(CreateBulkSetorInput input, long timeout);
	
	/**
	 * This is a public operation
	 * The 'createBulk' request primitive for the Setor entity.
	 * Chamada assíncrona
	 */
	void createBulkSetor(CreateBulkSetorInput input);
	
	/**
	 * This is a public operation
	 * The 'createBulk' request primitive for the Setor entity.
	 * Chamada assíncrona utilizando request
	 */
	CompletableFuture<CreateBulkSetorOutput> createBulkSetorRequest(CreateBulkSetorInput input);
	
	/**
	 * This is a public operation
	 * The 'createMerge' request primitive for the Setor entity.
	 * Chamada síncrona, o valor de timeout deve ser informado em ms 
	 */
	Setor createMergeSetor(Setor input, long timeout);
	
	/**
	 * This is a public operation
	 * The 'createMerge' request primitive for the Setor entity.
	 * Chamada assíncrona
	 */
	void createMergeSetor(Setor input);
	
	/**
	 * This is a public operation
	 * The 'createMerge' request primitive for the Setor entity.
	 * Chamada assíncrona utilizando request
	 */
	CompletableFuture<Setor> createMergeSetorRequest(Setor input);
	
	/**
	 * This is a public operation
	 * The 'retrieve' request primitive for the Setor entity.
	 * Chamada síncrona, o valor de timeout deve ser informado em ms 
	 */
	Setor retrieveSetor(Setor.Id input, long timeout);
	
	/**
	 * This is a public operation
	 * The 'retrieve' request primitive for the Setor entity.
	 * Chamada assíncrona
	 */
	void retrieveSetor(Setor.Id input);
	
	/**
	 * This is a public operation
	 * The 'retrieve' request primitive for the Setor entity.
	 * Chamada assíncrona utilizando request
	 */
	CompletableFuture<Setor> retrieveSetorRequest(Setor.Id input);
	
	/**
	 * This is a public operation
	 * The 'update' request primitive for the Setor entity.
	 * Chamada síncrona, o valor de timeout deve ser informado em ms 
	 */
	Setor updateSetor(Setor input, long timeout);
	
	/**
	 * This is a public operation
	 * The 'update' request primitive for the Setor entity.
	 * Chamada assíncrona
	 */
	void updateSetor(Setor input);
	
	/**
	 * This is a public operation
	 * The 'update' request primitive for the Setor entity.
	 * Chamada assíncrona utilizando request
	 */
	CompletableFuture<Setor> updateSetorRequest(Setor input);
	
	/**
	 * This is a public operation
	 * The 'updateMerge' request primitive for the Setor entity.
	 * Chamada síncrona, o valor de timeout deve ser informado em ms 
	 */
	Setor updateMergeSetor(Setor input, long timeout);
	
	/**
	 * This is a public operation
	 * The 'updateMerge' request primitive for the Setor entity.
	 * Chamada assíncrona
	 */
	void updateMergeSetor(Setor input);
	
	/**
	 * This is a public operation
	 * The 'updateMerge' request primitive for the Setor entity.
	 * Chamada assíncrona utilizando request
	 */
	CompletableFuture<Setor> updateMergeSetorRequest(Setor input);
	
	/**
	 * This is a public operation
	 * The 'delete' request primitive for the Setor entity.
	 * Chamada síncrona, o valor de timeout deve ser informado em ms 
	 */
	void deleteSetor(Setor.Id input, long timeout);
	
	/**
	 * This is a public operation
	 * The 'delete' request primitive for the Setor entity.
	 * Chamada assíncrona
	 */
	void deleteSetor(Setor.Id input);
	


	/**
	* Chamada assíncrona para o método publishServiceStarted 
	* Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	*/
	void publishServiceStarted( ServiceStartedPayload input );
			
	
	/**
	* Chamada assíncrona para o método publishNotifyUserEvent 
	* Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	*/
	void publishNotifyUserEvent( NotifyUserEventPayload input );
			
	
	/**
	* Chamada assíncrona para o método publishImportTipoEvent 
	* This is a public operation
	*/
	void publishImportTipoEvent( ImportTipoEventPayload input );
			
	
	/**
	* Chamada assíncrona para o método publishExportTipoEvent 
	* This is a public operation
	*/
	void publishExportTipoEvent( ExportTipoEventPayload input );
			
	
	/**
	* Chamada assíncrona para o método publishImportEventoEvent 
	* This is a public operation
	*/
	void publishImportEventoEvent( ImportEventoEventPayload input );
			
	
	/**
	* Chamada assíncrona para o método publishExportEventoEvent 
	* This is a public operation
	*/
	void publishExportEventoEvent( ExportEventoEventPayload input );
			
	
	/**
	* Chamada assíncrona para o método publishImportSalaEvent 
	* This is a public operation
	*/
	void publishImportSalaEvent( ImportSalaEventPayload input );
			
	
	/**
	* Chamada assíncrona para o método publishExportSalaEvent 
	* This is a public operation
	*/
	void publishExportSalaEvent( ExportSalaEventPayload input );
			
	
	/**
	* Chamada assíncrona para o método publishImportSetorEvent 
	* This is a public operation
	*/
	void publishImportSetorEvent( ImportSetorEventPayload input );
			
	
	/**
	* Chamada assíncrona para o método publishExportSetorEvent 
	* This is a public operation
	*/
	void publishExportSetorEvent( ExportSetorEventPayload input );
			
	

}
