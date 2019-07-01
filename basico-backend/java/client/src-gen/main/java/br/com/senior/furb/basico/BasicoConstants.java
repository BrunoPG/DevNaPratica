/**
 * This is a generated file. DO NOT EDIT ANY CODE HERE, YOUR CHANGES WILL BE LOST.
 */
package br.com.senior.furb.basico;

public interface BasicoConstants {
    String DOMAIN = "furb";
    String SERVICE = "basico";
    
    interface Commands {
    	/**
    	 * @see GetQtdTipoInput the request payload
    	 */
    	String GET_QTD_TIPO = "getQtdTipo";
    	/**
    	 * The success response primitive for getQtdTipo.
    	 *
    	 * @see #GET_QTD_TIPO the request primitive
    	 * @see GetQtdTipoOutput the response payload
    	 */
    	String GET_QTD_TIPO_RESPONSE = "getQtdTipoResponse";
    	/**
    	 * An error response primitive for getQtdTipo.
    	 *
    	 * @see #GET_QTD_TIPO the request primitive
    	 */
    	String GET_QTD_TIPO_ERROR = "getQtdTipoError";
    	/**
    	 * @see GetDateEventoInput the request payload
    	 */
    	String GET_DATE_EVENTO = "getDateEvento";
    	/**
    	 * The success response primitive for getDateEvento.
    	 *
    	 * @see #GET_DATE_EVENTO the request primitive
    	 * @see GetDateEventoOutput the response payload
    	 */
    	String GET_DATE_EVENTO_RESPONSE = "getDateEventoResponse";
    	/**
    	 * An error response primitive for getDateEvento.
    	 *
    	 * @see #GET_DATE_EVENTO the request primitive
    	 */
    	String GET_DATE_EVENTO_ERROR = "getDateEventoError";
    	/**
    	 * @see GetSalasInput the request payload
    	 */
    	String GET_SALAS = "getSalas";
    	/**
    	 * The success response primitive for getSalas.
    	 *
    	 * @see #GET_SALAS the request primitive
    	 * @see GetSalasOutput the response payload
    	 */
    	String GET_SALAS_RESPONSE = "getSalasResponse";
    	/**
    	 * An error response primitive for getSalas.
    	 *
    	 * @see #GET_SALAS the request primitive
    	 */
    	String GET_SALAS_ERROR = "getSalasError";
    	/**
    	 * @see GetSetoresInput the request payload
    	 */
    	String GET_SETORES = "getSetores";
    	/**
    	 * The success response primitive for getSetores.
    	 *
    	 * @see #GET_SETORES the request primitive
    	 * @see GetSetoresOutput the response payload
    	 */
    	String GET_SETORES_RESPONSE = "getSetoresResponse";
    	/**
    	 * An error response primitive for getSetores.
    	 *
    	 * @see #GET_SETORES the request primitive
    	 */
    	String GET_SETORES_ERROR = "getSetoresError";
    	/**
    	 * Default 'getMetadata' query. Every service must handle this command and return metadata in the format requested.
    	 * @see GetMetadataInput the request payload
    	 */
    	String GET_METADATA = "getMetadata";
    	/**
    	 * The success response primitive for getMetadata.
    	 *
    	 * @see #GET_METADATA the request primitive
    	 * @see GetMetadataOutput the response payload
    	 */
    	String GET_METADATA_RESPONSE = "getMetadataResponse";
    	/**
    	 * An error response primitive for getMetadata.
    	 *
    	 * @see #GET_METADATA the request primitive
    	 */
    	String GET_METADATA_ERROR = "getMetadataError";
    	/**
    	 * @see ImportTipoInput the request payload
    	 */
    	String IMPORT_TIPO = "importTipo";
    	/**
    	 * The success response primitive for importTipo.
    	 *
    	 * @see #IMPORT_TIPO the request primitive
    	 * @see ImportTipoOutput the response payload
    	 */
    	String IMPORT_TIPO_RESPONSE = "importTipoResponse";
    	/**
    	 * An error response primitive for importTipo.
    	 *
    	 * @see #IMPORT_TIPO the request primitive
    	 */
    	String IMPORT_TIPO_ERROR = "importTipoError";
    	/**
    	 * @see ExportTipoInput the request payload
    	 */
    	String EXPORT_TIPO = "exportTipo";
    	/**
    	 * The success response primitive for exportTipo.
    	 *
    	 * @see #EXPORT_TIPO the request primitive
    	 * @see ExportTipoOutput the response payload
    	 */
    	String EXPORT_TIPO_RESPONSE = "exportTipoResponse";
    	/**
    	 * An error response primitive for exportTipo.
    	 *
    	 * @see #EXPORT_TIPO the request primitive
    	 */
    	String EXPORT_TIPO_ERROR = "exportTipoError";
    	/**
    	 * @see ImportEventoInput the request payload
    	 */
    	String IMPORT_EVENTO = "importEvento";
    	/**
    	 * The success response primitive for importEvento.
    	 *
    	 * @see #IMPORT_EVENTO the request primitive
    	 * @see ImportEventoOutput the response payload
    	 */
    	String IMPORT_EVENTO_RESPONSE = "importEventoResponse";
    	/**
    	 * An error response primitive for importEvento.
    	 *
    	 * @see #IMPORT_EVENTO the request primitive
    	 */
    	String IMPORT_EVENTO_ERROR = "importEventoError";
    	/**
    	 * @see ExportEventoInput the request payload
    	 */
    	String EXPORT_EVENTO = "exportEvento";
    	/**
    	 * The success response primitive for exportEvento.
    	 *
    	 * @see #EXPORT_EVENTO the request primitive
    	 * @see ExportEventoOutput the response payload
    	 */
    	String EXPORT_EVENTO_RESPONSE = "exportEventoResponse";
    	/**
    	 * An error response primitive for exportEvento.
    	 *
    	 * @see #EXPORT_EVENTO the request primitive
    	 */
    	String EXPORT_EVENTO_ERROR = "exportEventoError";
    	/**
    	 * @see ImportSalaInput the request payload
    	 */
    	String IMPORT_SALA = "importSala";
    	/**
    	 * The success response primitive for importSala.
    	 *
    	 * @see #IMPORT_SALA the request primitive
    	 * @see ImportSalaOutput the response payload
    	 */
    	String IMPORT_SALA_RESPONSE = "importSalaResponse";
    	/**
    	 * An error response primitive for importSala.
    	 *
    	 * @see #IMPORT_SALA the request primitive
    	 */
    	String IMPORT_SALA_ERROR = "importSalaError";
    	/**
    	 * @see ExportSalaInput the request payload
    	 */
    	String EXPORT_SALA = "exportSala";
    	/**
    	 * The success response primitive for exportSala.
    	 *
    	 * @see #EXPORT_SALA the request primitive
    	 * @see ExportSalaOutput the response payload
    	 */
    	String EXPORT_SALA_RESPONSE = "exportSalaResponse";
    	/**
    	 * An error response primitive for exportSala.
    	 *
    	 * @see #EXPORT_SALA the request primitive
    	 */
    	String EXPORT_SALA_ERROR = "exportSalaError";
    	/**
    	 * @see ImportSetorInput the request payload
    	 */
    	String IMPORT_SETOR = "importSetor";
    	/**
    	 * The success response primitive for importSetor.
    	 *
    	 * @see #IMPORT_SETOR the request primitive
    	 * @see ImportSetorOutput the response payload
    	 */
    	String IMPORT_SETOR_RESPONSE = "importSetorResponse";
    	/**
    	 * An error response primitive for importSetor.
    	 *
    	 * @see #IMPORT_SETOR the request primitive
    	 */
    	String IMPORT_SETOR_ERROR = "importSetorError";
    	/**
    	 * @see ExportSetorInput the request payload
    	 */
    	String EXPORT_SETOR = "exportSetor";
    	/**
    	 * The success response primitive for exportSetor.
    	 *
    	 * @see #EXPORT_SETOR the request primitive
    	 * @see ExportSetorOutput the response payload
    	 */
    	String EXPORT_SETOR_RESPONSE = "exportSetorResponse";
    	/**
    	 * An error response primitive for exportSetor.
    	 *
    	 * @see #EXPORT_SETOR the request primitive
    	 */
    	String EXPORT_SETOR_ERROR = "exportSetorError";
    	/**
    	 * The 'list' request primitive for the Tipo entity.
    	 * @see tipo.pageRequest the request payload
    	 */
    	String LIST_TIPO = "listTipo";
    	/**
    	 * The success response primitive for listTipo.
    	 *
    	 * @see #LIST_TIPO the request primitive
    	 * @see Tipo.PagedResults the response payload
    	 */
    	String LIST_TIPO_RESPONSE = "listTipoResponse";
    	/**
    	 * An error response primitive for listTipo.
    	 *
    	 * @see #LIST_TIPO the request primitive
    	 */
    	String LIST_TIPO_ERROR = "listTipoError";
    	/**
    	 * The 'list' request primitive for the Evento entity.
    	 * @see evento.pageRequest the request payload
    	 */
    	String LIST_EVENTO = "listEvento";
    	/**
    	 * The success response primitive for listEvento.
    	 *
    	 * @see #LIST_EVENTO the request primitive
    	 * @see Evento.PagedResults the response payload
    	 */
    	String LIST_EVENTO_RESPONSE = "listEventoResponse";
    	/**
    	 * An error response primitive for listEvento.
    	 *
    	 * @see #LIST_EVENTO the request primitive
    	 */
    	String LIST_EVENTO_ERROR = "listEventoError";
    	/**
    	 * The 'list' request primitive for the Sala entity.
    	 * @see sala.pageRequest the request payload
    	 */
    	String LIST_SALA = "listSala";
    	/**
    	 * The success response primitive for listSala.
    	 *
    	 * @see #LIST_SALA the request primitive
    	 * @see Sala.PagedResults the response payload
    	 */
    	String LIST_SALA_RESPONSE = "listSalaResponse";
    	/**
    	 * An error response primitive for listSala.
    	 *
    	 * @see #LIST_SALA the request primitive
    	 */
    	String LIST_SALA_ERROR = "listSalaError";
    	/**
    	 * The 'list' request primitive for the Setor entity.
    	 * @see setor.pageRequest the request payload
    	 */
    	String LIST_SETOR = "listSetor";
    	/**
    	 * The success response primitive for listSetor.
    	 *
    	 * @see #LIST_SETOR the request primitive
    	 * @see Setor.PagedResults the response payload
    	 */
    	String LIST_SETOR_RESPONSE = "listSetorResponse";
    	/**
    	 * An error response primitive for listSetor.
    	 *
    	 * @see #LIST_SETOR the request primitive
    	 */
    	String LIST_SETOR_ERROR = "listSetorError";
    	/**
    	 * Returns a list with all dependencies from this service, along with their respective versions
    	 */
    	String GET_DEPENDENCIES = "getDependencies";
    	/**
    	 * The success response primitive for getDependencies.
    	 *
    	 * @see #GET_DEPENDENCIES the request primitive
    	 * @see GetDependenciesOutput the response payload
    	 */
    	String GET_DEPENDENCIES_RESPONSE = "getDependenciesResponse";
    	/**
    	 * An error response primitive for getDependencies.
    	 *
    	 * @see #GET_DEPENDENCIES the request primitive
    	 */
    	String GET_DEPENDENCIES_ERROR = "getDependenciesError";
    	/**
    	 * The 'create' request primitive for the Tipo entity.
    	 * @see Tipo the request payload
    	 */
    	String CREATE_TIPO = "createTipo";
    	/**
    	 * The success response primitive for createTipo.
    	 *
    	 * @see #CREATE_TIPO the request primitive
    	 */
    	String CREATE_TIPO_RESPONSE = "createTipoResponse";
    	/**
    	 * An error response primitive for createTipo.
    	 *
    	 * @see #CREATE_TIPO the request primitive
    	 */
    	String CREATE_TIPO_ERROR = "createTipoError";
    	/**
    	 * The 'createBulk' request primitive for the Tipo entity.
    	 * @see CreateBulkTipoInput the request payload
    	 */
    	String CREATE_BULK_TIPO = "createBulkTipo";
    	/**
    	 * The success response primitive for createBulkTipo.
    	 *
    	 * @see #CREATE_BULK_TIPO the request primitive
    	 * @see CreateBulkTipoOutput the response payload
    	 */
    	String CREATE_BULK_TIPO_RESPONSE = "createBulkTipoResponse";
    	/**
    	 * An error response primitive for createBulkTipo.
    	 *
    	 * @see #CREATE_BULK_TIPO the request primitive
    	 */
    	String CREATE_BULK_TIPO_ERROR = "createBulkTipoError";
    	/**
    	 * The 'createMerge' request primitive for the Tipo entity.
    	 * @see Tipo the request payload
    	 */
    	String CREATE_MERGE_TIPO = "createMergeTipo";
    	/**
    	 * The success response primitive for createMergeTipo.
    	 *
    	 * @see #CREATE_MERGE_TIPO the request primitive
    	 */
    	String CREATE_MERGE_TIPO_RESPONSE = "createMergeTipoResponse";
    	/**
    	 * An error response primitive for createMergeTipo.
    	 *
    	 * @see #CREATE_MERGE_TIPO the request primitive
    	 */
    	String CREATE_MERGE_TIPO_ERROR = "createMergeTipoError";
    	/**
    	 * The 'retrieve' request primitive for the Tipo entity.
    	 * @see Tipo.Id the request payload
    	 */
    	String RETRIEVE_TIPO = "retrieveTipo";
    	/**
    	 * The success response primitive for retrieveTipo.
    	 *
    	 * @see #RETRIEVE_TIPO the request primitive
    	 */
    	String RETRIEVE_TIPO_RESPONSE = "retrieveTipoResponse";
    	/**
    	 * An error response primitive for retrieveTipo.
    	 *
    	 * @see #RETRIEVE_TIPO the request primitive
    	 */
    	String RETRIEVE_TIPO_ERROR = "retrieveTipoError";
    	/**
    	 * The 'update' request primitive for the Tipo entity.
    	 * @see Tipo the request payload
    	 */
    	String UPDATE_TIPO = "updateTipo";
    	/**
    	 * The success response primitive for updateTipo.
    	 *
    	 * @see #UPDATE_TIPO the request primitive
    	 */
    	String UPDATE_TIPO_RESPONSE = "updateTipoResponse";
    	/**
    	 * An error response primitive for updateTipo.
    	 *
    	 * @see #UPDATE_TIPO the request primitive
    	 */
    	String UPDATE_TIPO_ERROR = "updateTipoError";
    	/**
    	 * The 'updateMerge' request primitive for the Tipo entity.
    	 * @see Tipo the request payload
    	 */
    	String UPDATE_MERGE_TIPO = "updateMergeTipo";
    	/**
    	 * The success response primitive for updateMergeTipo.
    	 *
    	 * @see #UPDATE_MERGE_TIPO the request primitive
    	 */
    	String UPDATE_MERGE_TIPO_RESPONSE = "updateMergeTipoResponse";
    	/**
    	 * An error response primitive for updateMergeTipo.
    	 *
    	 * @see #UPDATE_MERGE_TIPO the request primitive
    	 */
    	String UPDATE_MERGE_TIPO_ERROR = "updateMergeTipoError";
    	/**
    	 * The 'delete' request primitive for the Tipo entity.
    	 * @see Tipo.Id the request payload
    	 */
    	String DELETE_TIPO = "deleteTipo";
    	/**
    	 * The success response primitive for deleteTipo.
    	 *
    	 * @see #DELETE_TIPO the request primitive
    	 */
    	String DELETE_TIPO_RESPONSE = "deleteTipoResponse";
    	/**
    	 * An error response primitive for deleteTipo.
    	 *
    	 * @see #DELETE_TIPO the request primitive
    	 */
    	String DELETE_TIPO_ERROR = "deleteTipoError";
    	/**
    	 * The 'create' request primitive for the Evento entity.
    	 * @see Evento the request payload
    	 */
    	String CREATE_EVENTO = "createEvento";
    	/**
    	 * The success response primitive for createEvento.
    	 *
    	 * @see #CREATE_EVENTO the request primitive
    	 */
    	String CREATE_EVENTO_RESPONSE = "createEventoResponse";
    	/**
    	 * An error response primitive for createEvento.
    	 *
    	 * @see #CREATE_EVENTO the request primitive
    	 */
    	String CREATE_EVENTO_ERROR = "createEventoError";
    	/**
    	 * The 'createBulk' request primitive for the Evento entity.
    	 * @see CreateBulkEventoInput the request payload
    	 */
    	String CREATE_BULK_EVENTO = "createBulkEvento";
    	/**
    	 * The success response primitive for createBulkEvento.
    	 *
    	 * @see #CREATE_BULK_EVENTO the request primitive
    	 * @see CreateBulkEventoOutput the response payload
    	 */
    	String CREATE_BULK_EVENTO_RESPONSE = "createBulkEventoResponse";
    	/**
    	 * An error response primitive for createBulkEvento.
    	 *
    	 * @see #CREATE_BULK_EVENTO the request primitive
    	 */
    	String CREATE_BULK_EVENTO_ERROR = "createBulkEventoError";
    	/**
    	 * The 'createMerge' request primitive for the Evento entity.
    	 * @see Evento the request payload
    	 */
    	String CREATE_MERGE_EVENTO = "createMergeEvento";
    	/**
    	 * The success response primitive for createMergeEvento.
    	 *
    	 * @see #CREATE_MERGE_EVENTO the request primitive
    	 */
    	String CREATE_MERGE_EVENTO_RESPONSE = "createMergeEventoResponse";
    	/**
    	 * An error response primitive for createMergeEvento.
    	 *
    	 * @see #CREATE_MERGE_EVENTO the request primitive
    	 */
    	String CREATE_MERGE_EVENTO_ERROR = "createMergeEventoError";
    	/**
    	 * The 'retrieve' request primitive for the Evento entity.
    	 * @see Evento.Id the request payload
    	 */
    	String RETRIEVE_EVENTO = "retrieveEvento";
    	/**
    	 * The success response primitive for retrieveEvento.
    	 *
    	 * @see #RETRIEVE_EVENTO the request primitive
    	 */
    	String RETRIEVE_EVENTO_RESPONSE = "retrieveEventoResponse";
    	/**
    	 * An error response primitive for retrieveEvento.
    	 *
    	 * @see #RETRIEVE_EVENTO the request primitive
    	 */
    	String RETRIEVE_EVENTO_ERROR = "retrieveEventoError";
    	/**
    	 * The 'update' request primitive for the Evento entity.
    	 * @see Evento the request payload
    	 */
    	String UPDATE_EVENTO = "updateEvento";
    	/**
    	 * The success response primitive for updateEvento.
    	 *
    	 * @see #UPDATE_EVENTO the request primitive
    	 */
    	String UPDATE_EVENTO_RESPONSE = "updateEventoResponse";
    	/**
    	 * An error response primitive for updateEvento.
    	 *
    	 * @see #UPDATE_EVENTO the request primitive
    	 */
    	String UPDATE_EVENTO_ERROR = "updateEventoError";
    	/**
    	 * The 'updateMerge' request primitive for the Evento entity.
    	 * @see Evento the request payload
    	 */
    	String UPDATE_MERGE_EVENTO = "updateMergeEvento";
    	/**
    	 * The success response primitive for updateMergeEvento.
    	 *
    	 * @see #UPDATE_MERGE_EVENTO the request primitive
    	 */
    	String UPDATE_MERGE_EVENTO_RESPONSE = "updateMergeEventoResponse";
    	/**
    	 * An error response primitive for updateMergeEvento.
    	 *
    	 * @see #UPDATE_MERGE_EVENTO the request primitive
    	 */
    	String UPDATE_MERGE_EVENTO_ERROR = "updateMergeEventoError";
    	/**
    	 * The 'delete' request primitive for the Evento entity.
    	 * @see Evento.Id the request payload
    	 */
    	String DELETE_EVENTO = "deleteEvento";
    	/**
    	 * The success response primitive for deleteEvento.
    	 *
    	 * @see #DELETE_EVENTO the request primitive
    	 */
    	String DELETE_EVENTO_RESPONSE = "deleteEventoResponse";
    	/**
    	 * An error response primitive for deleteEvento.
    	 *
    	 * @see #DELETE_EVENTO the request primitive
    	 */
    	String DELETE_EVENTO_ERROR = "deleteEventoError";
    	/**
    	 * The 'create' request primitive for the Sala entity.
    	 * @see Sala the request payload
    	 */
    	String CREATE_SALA = "createSala";
    	/**
    	 * The success response primitive for createSala.
    	 *
    	 * @see #CREATE_SALA the request primitive
    	 */
    	String CREATE_SALA_RESPONSE = "createSalaResponse";
    	/**
    	 * An error response primitive for createSala.
    	 *
    	 * @see #CREATE_SALA the request primitive
    	 */
    	String CREATE_SALA_ERROR = "createSalaError";
    	/**
    	 * The 'createBulk' request primitive for the Sala entity.
    	 * @see CreateBulkSalaInput the request payload
    	 */
    	String CREATE_BULK_SALA = "createBulkSala";
    	/**
    	 * The success response primitive for createBulkSala.
    	 *
    	 * @see #CREATE_BULK_SALA the request primitive
    	 * @see CreateBulkSalaOutput the response payload
    	 */
    	String CREATE_BULK_SALA_RESPONSE = "createBulkSalaResponse";
    	/**
    	 * An error response primitive for createBulkSala.
    	 *
    	 * @see #CREATE_BULK_SALA the request primitive
    	 */
    	String CREATE_BULK_SALA_ERROR = "createBulkSalaError";
    	/**
    	 * The 'createMerge' request primitive for the Sala entity.
    	 * @see Sala the request payload
    	 */
    	String CREATE_MERGE_SALA = "createMergeSala";
    	/**
    	 * The success response primitive for createMergeSala.
    	 *
    	 * @see #CREATE_MERGE_SALA the request primitive
    	 */
    	String CREATE_MERGE_SALA_RESPONSE = "createMergeSalaResponse";
    	/**
    	 * An error response primitive for createMergeSala.
    	 *
    	 * @see #CREATE_MERGE_SALA the request primitive
    	 */
    	String CREATE_MERGE_SALA_ERROR = "createMergeSalaError";
    	/**
    	 * The 'retrieve' request primitive for the Sala entity.
    	 * @see Sala.Id the request payload
    	 */
    	String RETRIEVE_SALA = "retrieveSala";
    	/**
    	 * The success response primitive for retrieveSala.
    	 *
    	 * @see #RETRIEVE_SALA the request primitive
    	 */
    	String RETRIEVE_SALA_RESPONSE = "retrieveSalaResponse";
    	/**
    	 * An error response primitive for retrieveSala.
    	 *
    	 * @see #RETRIEVE_SALA the request primitive
    	 */
    	String RETRIEVE_SALA_ERROR = "retrieveSalaError";
    	/**
    	 * The 'update' request primitive for the Sala entity.
    	 * @see Sala the request payload
    	 */
    	String UPDATE_SALA = "updateSala";
    	/**
    	 * The success response primitive for updateSala.
    	 *
    	 * @see #UPDATE_SALA the request primitive
    	 */
    	String UPDATE_SALA_RESPONSE = "updateSalaResponse";
    	/**
    	 * An error response primitive for updateSala.
    	 *
    	 * @see #UPDATE_SALA the request primitive
    	 */
    	String UPDATE_SALA_ERROR = "updateSalaError";
    	/**
    	 * The 'updateMerge' request primitive for the Sala entity.
    	 * @see Sala the request payload
    	 */
    	String UPDATE_MERGE_SALA = "updateMergeSala";
    	/**
    	 * The success response primitive for updateMergeSala.
    	 *
    	 * @see #UPDATE_MERGE_SALA the request primitive
    	 */
    	String UPDATE_MERGE_SALA_RESPONSE = "updateMergeSalaResponse";
    	/**
    	 * An error response primitive for updateMergeSala.
    	 *
    	 * @see #UPDATE_MERGE_SALA the request primitive
    	 */
    	String UPDATE_MERGE_SALA_ERROR = "updateMergeSalaError";
    	/**
    	 * The 'delete' request primitive for the Sala entity.
    	 * @see Sala.Id the request payload
    	 */
    	String DELETE_SALA = "deleteSala";
    	/**
    	 * The success response primitive for deleteSala.
    	 *
    	 * @see #DELETE_SALA the request primitive
    	 */
    	String DELETE_SALA_RESPONSE = "deleteSalaResponse";
    	/**
    	 * An error response primitive for deleteSala.
    	 *
    	 * @see #DELETE_SALA the request primitive
    	 */
    	String DELETE_SALA_ERROR = "deleteSalaError";
    	/**
    	 * The 'create' request primitive for the Setor entity.
    	 * @see Setor the request payload
    	 */
    	String CREATE_SETOR = "createSetor";
    	/**
    	 * The success response primitive for createSetor.
    	 *
    	 * @see #CREATE_SETOR the request primitive
    	 */
    	String CREATE_SETOR_RESPONSE = "createSetorResponse";
    	/**
    	 * An error response primitive for createSetor.
    	 *
    	 * @see #CREATE_SETOR the request primitive
    	 */
    	String CREATE_SETOR_ERROR = "createSetorError";
    	/**
    	 * The 'createBulk' request primitive for the Setor entity.
    	 * @see CreateBulkSetorInput the request payload
    	 */
    	String CREATE_BULK_SETOR = "createBulkSetor";
    	/**
    	 * The success response primitive for createBulkSetor.
    	 *
    	 * @see #CREATE_BULK_SETOR the request primitive
    	 * @see CreateBulkSetorOutput the response payload
    	 */
    	String CREATE_BULK_SETOR_RESPONSE = "createBulkSetorResponse";
    	/**
    	 * An error response primitive for createBulkSetor.
    	 *
    	 * @see #CREATE_BULK_SETOR the request primitive
    	 */
    	String CREATE_BULK_SETOR_ERROR = "createBulkSetorError";
    	/**
    	 * The 'createMerge' request primitive for the Setor entity.
    	 * @see Setor the request payload
    	 */
    	String CREATE_MERGE_SETOR = "createMergeSetor";
    	/**
    	 * The success response primitive for createMergeSetor.
    	 *
    	 * @see #CREATE_MERGE_SETOR the request primitive
    	 */
    	String CREATE_MERGE_SETOR_RESPONSE = "createMergeSetorResponse";
    	/**
    	 * An error response primitive for createMergeSetor.
    	 *
    	 * @see #CREATE_MERGE_SETOR the request primitive
    	 */
    	String CREATE_MERGE_SETOR_ERROR = "createMergeSetorError";
    	/**
    	 * The 'retrieve' request primitive for the Setor entity.
    	 * @see Setor.Id the request payload
    	 */
    	String RETRIEVE_SETOR = "retrieveSetor";
    	/**
    	 * The success response primitive for retrieveSetor.
    	 *
    	 * @see #RETRIEVE_SETOR the request primitive
    	 */
    	String RETRIEVE_SETOR_RESPONSE = "retrieveSetorResponse";
    	/**
    	 * An error response primitive for retrieveSetor.
    	 *
    	 * @see #RETRIEVE_SETOR the request primitive
    	 */
    	String RETRIEVE_SETOR_ERROR = "retrieveSetorError";
    	/**
    	 * The 'update' request primitive for the Setor entity.
    	 * @see Setor the request payload
    	 */
    	String UPDATE_SETOR = "updateSetor";
    	/**
    	 * The success response primitive for updateSetor.
    	 *
    	 * @see #UPDATE_SETOR the request primitive
    	 */
    	String UPDATE_SETOR_RESPONSE = "updateSetorResponse";
    	/**
    	 * An error response primitive for updateSetor.
    	 *
    	 * @see #UPDATE_SETOR the request primitive
    	 */
    	String UPDATE_SETOR_ERROR = "updateSetorError";
    	/**
    	 * The 'updateMerge' request primitive for the Setor entity.
    	 * @see Setor the request payload
    	 */
    	String UPDATE_MERGE_SETOR = "updateMergeSetor";
    	/**
    	 * The success response primitive for updateMergeSetor.
    	 *
    	 * @see #UPDATE_MERGE_SETOR the request primitive
    	 */
    	String UPDATE_MERGE_SETOR_RESPONSE = "updateMergeSetorResponse";
    	/**
    	 * An error response primitive for updateMergeSetor.
    	 *
    	 * @see #UPDATE_MERGE_SETOR the request primitive
    	 */
    	String UPDATE_MERGE_SETOR_ERROR = "updateMergeSetorError";
    	/**
    	 * The 'delete' request primitive for the Setor entity.
    	 * @see Setor.Id the request payload
    	 */
    	String DELETE_SETOR = "deleteSetor";
    	/**
    	 * The success response primitive for deleteSetor.
    	 *
    	 * @see #DELETE_SETOR the request primitive
    	 */
    	String DELETE_SETOR_RESPONSE = "deleteSetorResponse";
    	/**
    	 * An error response primitive for deleteSetor.
    	 *
    	 * @see #DELETE_SETOR the request primitive
    	 */
    	String DELETE_SETOR_ERROR = "deleteSetorError";
    }
    
    interface Events {
    	/**
    	 * Default 'serviceStarted' event.
    	 */
    	String SERVICE_STARTED = "serviceStarted";
    	/**
    	 * Default 'notifyUser' event.
    	 */
    	String NOTIFY_USER_EVENT = "notifyUserEvent";
    	String IMPORT_TIPO_EVENT = "importTipoEvent";
    	String EXPORT_TIPO_EVENT = "exportTipoEvent";
    	String IMPORT_EVENTO_EVENT = "importEventoEvent";
    	String EXPORT_EVENTO_EVENT = "exportEventoEvent";
    	String IMPORT_SALA_EVENT = "importSalaEvent";
    	String EXPORT_SALA_EVENT = "exportSalaEvent";
    	String IMPORT_SETOR_EVENT = "importSetorEvent";
    	String EXPORT_SETOR_EVENT = "exportSetorEvent";
    }
    
}
