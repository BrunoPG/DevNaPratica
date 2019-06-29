/**
 * This is a generated file. DO NOT EDIT ANY CODE HERE, YOUR CHANGES WILL BE LOST.
 */
package br.com.senior.furb.basico;

public interface BasicoConstants {
    String DOMAIN = "furb";
    String SERVICE = "basico";
    
    interface Commands {
    	/**
    	 * @see HelloWorldInput the request payload
    	 */
    	String HELLO_WORLD = "helloWorld";
    	/**
    	 * The success response primitive for helloWorld.
    	 *
    	 * @see #HELLO_WORLD the request primitive
    	 * @see HelloWorldOutput the response payload
    	 */
    	String HELLO_WORLD_RESPONSE = "helloWorldResponse";
    	/**
    	 * An error response primitive for helloWorld.
    	 *
    	 * @see #HELLO_WORLD the request primitive
    	 */
    	String HELLO_WORLD_ERROR = "helloWorldError";
    	/**
    	 * Obtém a quantidade de itens no estoque de acordo com um pedido
    	 * @see RetornaEstoqueInput the request payload
    	 */
    	String RETORNA_ESTOQUE = "retornaEstoque";
    	/**
    	 * The success response primitive for retornaEstoque.
    	 *
    	 * @see #RETORNA_ESTOQUE the request primitive
    	 * @see RetornaEstoqueOutput the response payload
    	 */
    	String RETORNA_ESTOQUE_RESPONSE = "retornaEstoqueResponse";
    	/**
    	 * An error response primitive for retornaEstoque.
    	 *
    	 * @see #RETORNA_ESTOQUE the request primitive
    	 */
    	String RETORNA_ESTOQUE_ERROR = "retornaEstoqueError";
    	/**
    	 * Obtém a URL para upload da foto
    	 * @see ObterUrlUploadFotoInput the request payload
    	 */
    	String OBTER_URL_UPLOAD_FOTO = "obterUrlUploadFoto";
    	/**
    	 * The success response primitive for obterUrlUploadFoto.
    	 *
    	 * @see #OBTER_URL_UPLOAD_FOTO the request primitive
    	 * @see ObterUrlUploadFotoOutput the response payload
    	 */
    	String OBTER_URL_UPLOAD_FOTO_RESPONSE = "obterUrlUploadFotoResponse";
    	/**
    	 * An error response primitive for obterUrlUploadFoto.
    	 *
    	 * @see #OBTER_URL_UPLOAD_FOTO the request primitive
    	 */
    	String OBTER_URL_UPLOAD_FOTO_ERROR = "obterUrlUploadFotoError";
    	/**
    	 * Grava a foto que foi upada
    	 * @see GravarFotoInput the request payload
    	 */
    	String GRAVAR_FOTO = "gravarFoto";
    	/**
    	 * The success response primitive for gravarFoto.
    	 *
    	 * @see #GRAVAR_FOTO the request primitive
    	 * @see GravarFotoOutput the response payload
    	 */
    	String GRAVAR_FOTO_RESPONSE = "gravarFotoResponse";
    	/**
    	 * An error response primitive for gravarFoto.
    	 *
    	 * @see #GRAVAR_FOTO the request primitive
    	 */
    	String GRAVAR_FOTO_ERROR = "gravarFotoError";
    	/**
    	 * Obtém a URL para download da foto
    	 * @see ObterUrlDownloadFotoInput the request payload
    	 */
    	String OBTER_URL_DOWNLOAD_FOTO = "obterUrlDownloadFoto";
    	/**
    	 * The success response primitive for obterUrlDownloadFoto.
    	 *
    	 * @see #OBTER_URL_DOWNLOAD_FOTO the request primitive
    	 * @see ObterUrlDownloadFotoOutput the response payload
    	 */
    	String OBTER_URL_DOWNLOAD_FOTO_RESPONSE = "obterUrlDownloadFotoResponse";
    	/**
    	 * An error response primitive for obterUrlDownloadFoto.
    	 *
    	 * @see #OBTER_URL_DOWNLOAD_FOTO the request primitive
    	 */
    	String OBTER_URL_DOWNLOAD_FOTO_ERROR = "obterUrlDownloadFotoError";
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
    	 * @see ImportClienteInput the request payload
    	 */
    	String IMPORT_CLIENTE = "importCliente";
    	/**
    	 * The success response primitive for importCliente.
    	 *
    	 * @see #IMPORT_CLIENTE the request primitive
    	 * @see ImportClienteOutput the response payload
    	 */
    	String IMPORT_CLIENTE_RESPONSE = "importClienteResponse";
    	/**
    	 * An error response primitive for importCliente.
    	 *
    	 * @see #IMPORT_CLIENTE the request primitive
    	 */
    	String IMPORT_CLIENTE_ERROR = "importClienteError";
    	/**
    	 * @see ExportClienteInput the request payload
    	 */
    	String EXPORT_CLIENTE = "exportCliente";
    	/**
    	 * The success response primitive for exportCliente.
    	 *
    	 * @see #EXPORT_CLIENTE the request primitive
    	 * @see ExportClienteOutput the response payload
    	 */
    	String EXPORT_CLIENTE_RESPONSE = "exportClienteResponse";
    	/**
    	 * An error response primitive for exportCliente.
    	 *
    	 * @see #EXPORT_CLIENTE the request primitive
    	 */
    	String EXPORT_CLIENTE_ERROR = "exportClienteError";
    	/**
    	 * @see ImportItemInput the request payload
    	 */
    	String IMPORT_ITEM = "importItem";
    	/**
    	 * The success response primitive for importItem.
    	 *
    	 * @see #IMPORT_ITEM the request primitive
    	 * @see ImportItemOutput the response payload
    	 */
    	String IMPORT_ITEM_RESPONSE = "importItemResponse";
    	/**
    	 * An error response primitive for importItem.
    	 *
    	 * @see #IMPORT_ITEM the request primitive
    	 */
    	String IMPORT_ITEM_ERROR = "importItemError";
    	/**
    	 * @see ExportItemInput the request payload
    	 */
    	String EXPORT_ITEM = "exportItem";
    	/**
    	 * The success response primitive for exportItem.
    	 *
    	 * @see #EXPORT_ITEM the request primitive
    	 * @see ExportItemOutput the response payload
    	 */
    	String EXPORT_ITEM_RESPONSE = "exportItemResponse";
    	/**
    	 * An error response primitive for exportItem.
    	 *
    	 * @see #EXPORT_ITEM the request primitive
    	 */
    	String EXPORT_ITEM_ERROR = "exportItemError";
    	/**
    	 * @see ImportPedidoInput the request payload
    	 */
    	String IMPORT_PEDIDO = "importPedido";
    	/**
    	 * The success response primitive for importPedido.
    	 *
    	 * @see #IMPORT_PEDIDO the request primitive
    	 * @see ImportPedidoOutput the response payload
    	 */
    	String IMPORT_PEDIDO_RESPONSE = "importPedidoResponse";
    	/**
    	 * An error response primitive for importPedido.
    	 *
    	 * @see #IMPORT_PEDIDO the request primitive
    	 */
    	String IMPORT_PEDIDO_ERROR = "importPedidoError";
    	/**
    	 * @see ExportPedidoInput the request payload
    	 */
    	String EXPORT_PEDIDO = "exportPedido";
    	/**
    	 * The success response primitive for exportPedido.
    	 *
    	 * @see #EXPORT_PEDIDO the request primitive
    	 * @see ExportPedidoOutput the response payload
    	 */
    	String EXPORT_PEDIDO_RESPONSE = "exportPedidoResponse";
    	/**
    	 * An error response primitive for exportPedido.
    	 *
    	 * @see #EXPORT_PEDIDO the request primitive
    	 */
    	String EXPORT_PEDIDO_ERROR = "exportPedidoError";
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
    	 * The 'list' request primitive for the Cliente entity.
    	 * @see cliente.pageRequest the request payload
    	 */
    	String LIST_CLIENTE = "listCliente";
    	/**
    	 * The success response primitive for listCliente.
    	 *
    	 * @see #LIST_CLIENTE the request primitive
    	 * @see Cliente.PagedResults the response payload
    	 */
    	String LIST_CLIENTE_RESPONSE = "listClienteResponse";
    	/**
    	 * An error response primitive for listCliente.
    	 *
    	 * @see #LIST_CLIENTE the request primitive
    	 */
    	String LIST_CLIENTE_ERROR = "listClienteError";
    	/**
    	 * The 'list' request primitive for the Item entity.
    	 * @see item.pageRequest the request payload
    	 */
    	String LIST_ITEM = "listItem";
    	/**
    	 * The success response primitive for listItem.
    	 *
    	 * @see #LIST_ITEM the request primitive
    	 * @see Item.PagedResults the response payload
    	 */
    	String LIST_ITEM_RESPONSE = "listItemResponse";
    	/**
    	 * An error response primitive for listItem.
    	 *
    	 * @see #LIST_ITEM the request primitive
    	 */
    	String LIST_ITEM_ERROR = "listItemError";
    	/**
    	 * The 'list' request primitive for the Pedido entity.
    	 * @see pedido.pageRequest the request payload
    	 */
    	String LIST_PEDIDO = "listPedido";
    	/**
    	 * The success response primitive for listPedido.
    	 *
    	 * @see #LIST_PEDIDO the request primitive
    	 * @see Pedido.PagedResults the response payload
    	 */
    	String LIST_PEDIDO_RESPONSE = "listPedidoResponse";
    	/**
    	 * An error response primitive for listPedido.
    	 *
    	 * @see #LIST_PEDIDO the request primitive
    	 */
    	String LIST_PEDIDO_ERROR = "listPedidoError";
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
    	 * The 'create' request primitive for the Cliente entity.
    	 * @see Cliente the request payload
    	 */
    	String CREATE_CLIENTE = "createCliente";
    	/**
    	 * The success response primitive for createCliente.
    	 *
    	 * @see #CREATE_CLIENTE the request primitive
    	 */
    	String CREATE_CLIENTE_RESPONSE = "createClienteResponse";
    	/**
    	 * An error response primitive for createCliente.
    	 *
    	 * @see #CREATE_CLIENTE the request primitive
    	 */
    	String CREATE_CLIENTE_ERROR = "createClienteError";
    	/**
    	 * The 'createBulk' request primitive for the Cliente entity.
    	 * @see CreateBulkClienteInput the request payload
    	 */
    	String CREATE_BULK_CLIENTE = "createBulkCliente";
    	/**
    	 * The success response primitive for createBulkCliente.
    	 *
    	 * @see #CREATE_BULK_CLIENTE the request primitive
    	 * @see CreateBulkClienteOutput the response payload
    	 */
    	String CREATE_BULK_CLIENTE_RESPONSE = "createBulkClienteResponse";
    	/**
    	 * An error response primitive for createBulkCliente.
    	 *
    	 * @see #CREATE_BULK_CLIENTE the request primitive
    	 */
    	String CREATE_BULK_CLIENTE_ERROR = "createBulkClienteError";
    	/**
    	 * The 'createMerge' request primitive for the Cliente entity.
    	 * @see Cliente the request payload
    	 */
    	String CREATE_MERGE_CLIENTE = "createMergeCliente";
    	/**
    	 * The success response primitive for createMergeCliente.
    	 *
    	 * @see #CREATE_MERGE_CLIENTE the request primitive
    	 */
    	String CREATE_MERGE_CLIENTE_RESPONSE = "createMergeClienteResponse";
    	/**
    	 * An error response primitive for createMergeCliente.
    	 *
    	 * @see #CREATE_MERGE_CLIENTE the request primitive
    	 */
    	String CREATE_MERGE_CLIENTE_ERROR = "createMergeClienteError";
    	/**
    	 * The 'retrieve' request primitive for the Cliente entity.
    	 * @see Cliente.Id the request payload
    	 */
    	String RETRIEVE_CLIENTE = "retrieveCliente";
    	/**
    	 * The success response primitive for retrieveCliente.
    	 *
    	 * @see #RETRIEVE_CLIENTE the request primitive
    	 */
    	String RETRIEVE_CLIENTE_RESPONSE = "retrieveClienteResponse";
    	/**
    	 * An error response primitive for retrieveCliente.
    	 *
    	 * @see #RETRIEVE_CLIENTE the request primitive
    	 */
    	String RETRIEVE_CLIENTE_ERROR = "retrieveClienteError";
    	/**
    	 * The 'update' request primitive for the Cliente entity.
    	 * @see Cliente the request payload
    	 */
    	String UPDATE_CLIENTE = "updateCliente";
    	/**
    	 * The success response primitive for updateCliente.
    	 *
    	 * @see #UPDATE_CLIENTE the request primitive
    	 */
    	String UPDATE_CLIENTE_RESPONSE = "updateClienteResponse";
    	/**
    	 * An error response primitive for updateCliente.
    	 *
    	 * @see #UPDATE_CLIENTE the request primitive
    	 */
    	String UPDATE_CLIENTE_ERROR = "updateClienteError";
    	/**
    	 * The 'updateMerge' request primitive for the Cliente entity.
    	 * @see Cliente the request payload
    	 */
    	String UPDATE_MERGE_CLIENTE = "updateMergeCliente";
    	/**
    	 * The success response primitive for updateMergeCliente.
    	 *
    	 * @see #UPDATE_MERGE_CLIENTE the request primitive
    	 */
    	String UPDATE_MERGE_CLIENTE_RESPONSE = "updateMergeClienteResponse";
    	/**
    	 * An error response primitive for updateMergeCliente.
    	 *
    	 * @see #UPDATE_MERGE_CLIENTE the request primitive
    	 */
    	String UPDATE_MERGE_CLIENTE_ERROR = "updateMergeClienteError";
    	/**
    	 * The 'delete' request primitive for the Cliente entity.
    	 * @see Cliente.Id the request payload
    	 */
    	String DELETE_CLIENTE = "deleteCliente";
    	/**
    	 * The success response primitive for deleteCliente.
    	 *
    	 * @see #DELETE_CLIENTE the request primitive
    	 */
    	String DELETE_CLIENTE_RESPONSE = "deleteClienteResponse";
    	/**
    	 * An error response primitive for deleteCliente.
    	 *
    	 * @see #DELETE_CLIENTE the request primitive
    	 */
    	String DELETE_CLIENTE_ERROR = "deleteClienteError";
    	/**
    	 * The 'create' request primitive for the Item entity.
    	 * @see Item the request payload
    	 */
    	String CREATE_ITEM = "createItem";
    	/**
    	 * The success response primitive for createItem.
    	 *
    	 * @see #CREATE_ITEM the request primitive
    	 */
    	String CREATE_ITEM_RESPONSE = "createItemResponse";
    	/**
    	 * An error response primitive for createItem.
    	 *
    	 * @see #CREATE_ITEM the request primitive
    	 */
    	String CREATE_ITEM_ERROR = "createItemError";
    	/**
    	 * The 'createBulk' request primitive for the Item entity.
    	 * @see CreateBulkItemInput the request payload
    	 */
    	String CREATE_BULK_ITEM = "createBulkItem";
    	/**
    	 * The success response primitive for createBulkItem.
    	 *
    	 * @see #CREATE_BULK_ITEM the request primitive
    	 * @see CreateBulkItemOutput the response payload
    	 */
    	String CREATE_BULK_ITEM_RESPONSE = "createBulkItemResponse";
    	/**
    	 * An error response primitive for createBulkItem.
    	 *
    	 * @see #CREATE_BULK_ITEM the request primitive
    	 */
    	String CREATE_BULK_ITEM_ERROR = "createBulkItemError";
    	/**
    	 * The 'createMerge' request primitive for the Item entity.
    	 * @see Item the request payload
    	 */
    	String CREATE_MERGE_ITEM = "createMergeItem";
    	/**
    	 * The success response primitive for createMergeItem.
    	 *
    	 * @see #CREATE_MERGE_ITEM the request primitive
    	 */
    	String CREATE_MERGE_ITEM_RESPONSE = "createMergeItemResponse";
    	/**
    	 * An error response primitive for createMergeItem.
    	 *
    	 * @see #CREATE_MERGE_ITEM the request primitive
    	 */
    	String CREATE_MERGE_ITEM_ERROR = "createMergeItemError";
    	/**
    	 * The 'retrieve' request primitive for the Item entity.
    	 * @see Item.Id the request payload
    	 */
    	String RETRIEVE_ITEM = "retrieveItem";
    	/**
    	 * The success response primitive for retrieveItem.
    	 *
    	 * @see #RETRIEVE_ITEM the request primitive
    	 */
    	String RETRIEVE_ITEM_RESPONSE = "retrieveItemResponse";
    	/**
    	 * An error response primitive for retrieveItem.
    	 *
    	 * @see #RETRIEVE_ITEM the request primitive
    	 */
    	String RETRIEVE_ITEM_ERROR = "retrieveItemError";
    	/**
    	 * The 'update' request primitive for the Item entity.
    	 * @see Item the request payload
    	 */
    	String UPDATE_ITEM = "updateItem";
    	/**
    	 * The success response primitive for updateItem.
    	 *
    	 * @see #UPDATE_ITEM the request primitive
    	 */
    	String UPDATE_ITEM_RESPONSE = "updateItemResponse";
    	/**
    	 * An error response primitive for updateItem.
    	 *
    	 * @see #UPDATE_ITEM the request primitive
    	 */
    	String UPDATE_ITEM_ERROR = "updateItemError";
    	/**
    	 * The 'updateMerge' request primitive for the Item entity.
    	 * @see Item the request payload
    	 */
    	String UPDATE_MERGE_ITEM = "updateMergeItem";
    	/**
    	 * The success response primitive for updateMergeItem.
    	 *
    	 * @see #UPDATE_MERGE_ITEM the request primitive
    	 */
    	String UPDATE_MERGE_ITEM_RESPONSE = "updateMergeItemResponse";
    	/**
    	 * An error response primitive for updateMergeItem.
    	 *
    	 * @see #UPDATE_MERGE_ITEM the request primitive
    	 */
    	String UPDATE_MERGE_ITEM_ERROR = "updateMergeItemError";
    	/**
    	 * The 'delete' request primitive for the Item entity.
    	 * @see Item.Id the request payload
    	 */
    	String DELETE_ITEM = "deleteItem";
    	/**
    	 * The success response primitive for deleteItem.
    	 *
    	 * @see #DELETE_ITEM the request primitive
    	 */
    	String DELETE_ITEM_RESPONSE = "deleteItemResponse";
    	/**
    	 * An error response primitive for deleteItem.
    	 *
    	 * @see #DELETE_ITEM the request primitive
    	 */
    	String DELETE_ITEM_ERROR = "deleteItemError";
    	/**
    	 * The 'create' request primitive for the Pedido entity.
    	 * @see Pedido the request payload
    	 */
    	String CREATE_PEDIDO = "createPedido";
    	/**
    	 * The success response primitive for createPedido.
    	 *
    	 * @see #CREATE_PEDIDO the request primitive
    	 */
    	String CREATE_PEDIDO_RESPONSE = "createPedidoResponse";
    	/**
    	 * An error response primitive for createPedido.
    	 *
    	 * @see #CREATE_PEDIDO the request primitive
    	 */
    	String CREATE_PEDIDO_ERROR = "createPedidoError";
    	/**
    	 * The 'createBulk' request primitive for the Pedido entity.
    	 * @see CreateBulkPedidoInput the request payload
    	 */
    	String CREATE_BULK_PEDIDO = "createBulkPedido";
    	/**
    	 * The success response primitive for createBulkPedido.
    	 *
    	 * @see #CREATE_BULK_PEDIDO the request primitive
    	 * @see CreateBulkPedidoOutput the response payload
    	 */
    	String CREATE_BULK_PEDIDO_RESPONSE = "createBulkPedidoResponse";
    	/**
    	 * An error response primitive for createBulkPedido.
    	 *
    	 * @see #CREATE_BULK_PEDIDO the request primitive
    	 */
    	String CREATE_BULK_PEDIDO_ERROR = "createBulkPedidoError";
    	/**
    	 * The 'createMerge' request primitive for the Pedido entity.
    	 * @see Pedido the request payload
    	 */
    	String CREATE_MERGE_PEDIDO = "createMergePedido";
    	/**
    	 * The success response primitive for createMergePedido.
    	 *
    	 * @see #CREATE_MERGE_PEDIDO the request primitive
    	 */
    	String CREATE_MERGE_PEDIDO_RESPONSE = "createMergePedidoResponse";
    	/**
    	 * An error response primitive for createMergePedido.
    	 *
    	 * @see #CREATE_MERGE_PEDIDO the request primitive
    	 */
    	String CREATE_MERGE_PEDIDO_ERROR = "createMergePedidoError";
    	/**
    	 * The 'retrieve' request primitive for the Pedido entity.
    	 * @see Pedido.Id the request payload
    	 */
    	String RETRIEVE_PEDIDO = "retrievePedido";
    	/**
    	 * The success response primitive for retrievePedido.
    	 *
    	 * @see #RETRIEVE_PEDIDO the request primitive
    	 */
    	String RETRIEVE_PEDIDO_RESPONSE = "retrievePedidoResponse";
    	/**
    	 * An error response primitive for retrievePedido.
    	 *
    	 * @see #RETRIEVE_PEDIDO the request primitive
    	 */
    	String RETRIEVE_PEDIDO_ERROR = "retrievePedidoError";
    	/**
    	 * The 'update' request primitive for the Pedido entity.
    	 * @see Pedido the request payload
    	 */
    	String UPDATE_PEDIDO = "updatePedido";
    	/**
    	 * The success response primitive for updatePedido.
    	 *
    	 * @see #UPDATE_PEDIDO the request primitive
    	 */
    	String UPDATE_PEDIDO_RESPONSE = "updatePedidoResponse";
    	/**
    	 * An error response primitive for updatePedido.
    	 *
    	 * @see #UPDATE_PEDIDO the request primitive
    	 */
    	String UPDATE_PEDIDO_ERROR = "updatePedidoError";
    	/**
    	 * The 'updateMerge' request primitive for the Pedido entity.
    	 * @see Pedido the request payload
    	 */
    	String UPDATE_MERGE_PEDIDO = "updateMergePedido";
    	/**
    	 * The success response primitive for updateMergePedido.
    	 *
    	 * @see #UPDATE_MERGE_PEDIDO the request primitive
    	 */
    	String UPDATE_MERGE_PEDIDO_RESPONSE = "updateMergePedidoResponse";
    	/**
    	 * An error response primitive for updateMergePedido.
    	 *
    	 * @see #UPDATE_MERGE_PEDIDO the request primitive
    	 */
    	String UPDATE_MERGE_PEDIDO_ERROR = "updateMergePedidoError";
    	/**
    	 * The 'delete' request primitive for the Pedido entity.
    	 * @see Pedido.Id the request payload
    	 */
    	String DELETE_PEDIDO = "deletePedido";
    	/**
    	 * The success response primitive for deletePedido.
    	 *
    	 * @see #DELETE_PEDIDO the request primitive
    	 */
    	String DELETE_PEDIDO_RESPONSE = "deletePedidoResponse";
    	/**
    	 * An error response primitive for deletePedido.
    	 *
    	 * @see #DELETE_PEDIDO the request primitive
    	 */
    	String DELETE_PEDIDO_ERROR = "deletePedidoError";
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
    	String IMPORT_CLIENTE_EVENT = "importClienteEvent";
    	String EXPORT_CLIENTE_EVENT = "exportClienteEvent";
    	String IMPORT_ITEM_EVENT = "importItemEvent";
    	String EXPORT_ITEM_EVENT = "exportItemEvent";
    	String IMPORT_PEDIDO_EVENT = "importPedidoEvent";
    	String EXPORT_PEDIDO_EVENT = "exportPedidoEvent";
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
