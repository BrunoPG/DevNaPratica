/**
 * This is a generated file. DO NOT EDIT ANY CODE HERE, YOUR CHANGES WILL BE LOST.
 */
package br.com.senior.furb.basico;

import java.util.function.Supplier;

import br.com.senior.messaging.Message;
import br.com.senior.messaging.IMessenger;
import br.com.senior.messaging.utils.DtoJsonConverter;
import br.com.senior.sdl.user.UserIdentifier;

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

import br.com.senior.furb.basico.BasicoValidator;
import br.com.senior.furb.basico.BasicoException;
import br.com.senior.furb.basico.BasicoConstants;

/**
* 
*/
public class BasicoStubImpl  implements BasicoStub {

	protected final Supplier<IMessenger> messengerSupplier;
	protected final UserIdentifier userId;
	protected final Supplier<Message> messageSupplier;

	/**
	 * Use {@link #BasicoStubImpl(MessengerSupplier, UserIdentifier, MessageSupplier)} instead.
	 */
	@Deprecated
	public BasicoStubImpl(IMessenger messenger, UserIdentifier userId) {
		this(new InstanceMessengerSupplier(messenger), userId, null);
	}

	/**
	 * @param messengerSupplier Supplies current service messenger.
	 * @param userId Provides tenant and user name to send or publish messages.
	 * @param messageSupplier Supplies current message being processed by service. Used to send messages by foolowup.
	 */
	public BasicoStubImpl(Supplier<IMessenger> messengerSupplier, UserIdentifier userId, Supplier<Message> messageSupplier) {
		this.messengerSupplier = messengerSupplier;
		this.userId = userId;
		this.messageSupplier = messageSupplier;
	}

	/**
	 * Chamada síncrona para o método getQtdTipo
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * 
	 * @throws BasicoMessageException quando um erro com payload for retornado pela mensageria
	 */
	@Override
	public GetQtdTipoOutput getQtdTipo(GetQtdTipoInput input, long timeout) {
		br.com.senior.furb.basico.impl.GetQtdTipoImpl impl = new br.com.senior.furb.basico.impl.GetQtdTipoImpl(messengerSupplier, userId, messageSupplier);
		return impl.getQtdTipo(input, timeout);
	}
	
	/**
	 * Chamada assíncrona para o método getQtdTipo
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * 
	 */
	@Override
	public void getQtdTipo(GetQtdTipoInput input) {
		br.com.senior.furb.basico.impl.GetQtdTipoImpl impl = new br.com.senior.furb.basico.impl.GetQtdTipoImpl(messengerSupplier, userId, messageSupplier);
		impl.getQtdTipo(input);
	}
	
	/**
	 * Chamada assíncrona para o método getQtdTipo
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * 
	 */
	@Override
	public CompletableFuture<GetQtdTipoOutput> getQtdTipoRequest(GetQtdTipoInput input) {
		br.com.senior.furb.basico.impl.GetQtdTipoImpl impl = new br.com.senior.furb.basico.impl.GetQtdTipoImpl(messengerSupplier, userId, messageSupplier);
		return impl.getQtdTipoRequest(input);
	}
	/**
	 * Chamada síncrona para o método getDateEvento
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * 
	 * @throws BasicoMessageException quando um erro com payload for retornado pela mensageria
	 */
	@Override
	public GetDateEventoOutput getDateEvento(GetDateEventoInput input, long timeout) {
		br.com.senior.furb.basico.impl.GetDateEventoImpl impl = new br.com.senior.furb.basico.impl.GetDateEventoImpl(messengerSupplier, userId, messageSupplier);
		return impl.getDateEvento(input, timeout);
	}
	
	/**
	 * Chamada assíncrona para o método getDateEvento
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * 
	 */
	@Override
	public void getDateEvento(GetDateEventoInput input) {
		br.com.senior.furb.basico.impl.GetDateEventoImpl impl = new br.com.senior.furb.basico.impl.GetDateEventoImpl(messengerSupplier, userId, messageSupplier);
		impl.getDateEvento(input);
	}
	
	/**
	 * Chamada assíncrona para o método getDateEvento
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * 
	 */
	@Override
	public CompletableFuture<GetDateEventoOutput> getDateEventoRequest(GetDateEventoInput input) {
		br.com.senior.furb.basico.impl.GetDateEventoImpl impl = new br.com.senior.furb.basico.impl.GetDateEventoImpl(messengerSupplier, userId, messageSupplier);
		return impl.getDateEventoRequest(input);
	}
	/**
	 * Chamada síncrona para o método getSalas
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * 
	 * @throws BasicoMessageException quando um erro com payload for retornado pela mensageria
	 */
	@Override
	public GetSalasOutput getSalas(GetSalasInput input, long timeout) {
		br.com.senior.furb.basico.impl.GetSalasImpl impl = new br.com.senior.furb.basico.impl.GetSalasImpl(messengerSupplier, userId, messageSupplier);
		return impl.getSalas(input, timeout);
	}
	
	/**
	 * Chamada assíncrona para o método getSalas
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * 
	 */
	@Override
	public void getSalas(GetSalasInput input) {
		br.com.senior.furb.basico.impl.GetSalasImpl impl = new br.com.senior.furb.basico.impl.GetSalasImpl(messengerSupplier, userId, messageSupplier);
		impl.getSalas(input);
	}
	
	/**
	 * Chamada assíncrona para o método getSalas
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * 
	 */
	@Override
	public CompletableFuture<GetSalasOutput> getSalasRequest(GetSalasInput input) {
		br.com.senior.furb.basico.impl.GetSalasImpl impl = new br.com.senior.furb.basico.impl.GetSalasImpl(messengerSupplier, userId, messageSupplier);
		return impl.getSalasRequest(input);
	}
	/**
	 * Chamada síncrona para o método getSetores
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * 
	 * @throws BasicoMessageException quando um erro com payload for retornado pela mensageria
	 */
	@Override
	public GetSetoresOutput getSetores(GetSetoresInput input, long timeout) {
		br.com.senior.furb.basico.impl.GetSetoresImpl impl = new br.com.senior.furb.basico.impl.GetSetoresImpl(messengerSupplier, userId, messageSupplier);
		return impl.getSetores(input, timeout);
	}
	
	/**
	 * Chamada assíncrona para o método getSetores
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * 
	 */
	@Override
	public void getSetores(GetSetoresInput input) {
		br.com.senior.furb.basico.impl.GetSetoresImpl impl = new br.com.senior.furb.basico.impl.GetSetoresImpl(messengerSupplier, userId, messageSupplier);
		impl.getSetores(input);
	}
	
	/**
	 * Chamada assíncrona para o método getSetores
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * 
	 */
	@Override
	public CompletableFuture<GetSetoresOutput> getSetoresRequest(GetSetoresInput input) {
		br.com.senior.furb.basico.impl.GetSetoresImpl impl = new br.com.senior.furb.basico.impl.GetSetoresImpl(messengerSupplier, userId, messageSupplier);
		return impl.getSetoresRequest(input);
	}
	/**
	 * Chamada síncrona para o método getMetadata
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * Default 'getMetadata' query. Every service must handle this command and return metadata in the format requested.
	 * @throws BasicoMessageException quando um erro com payload for retornado pela mensageria
	 */
	@Override
	public GetMetadataOutput getMetadata(GetMetadataInput input, long timeout) {
		br.com.senior.furb.basico.impl.GetMetadataImpl impl = new br.com.senior.furb.basico.impl.GetMetadataImpl(messengerSupplier, userId, messageSupplier);
		return impl.getMetadata(input, timeout);
	}
	
	/**
	 * Chamada assíncrona para o método getMetadata
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * Default 'getMetadata' query. Every service must handle this command and return metadata in the format requested.
	 */
	@Override
	public void getMetadata(GetMetadataInput input) {
		br.com.senior.furb.basico.impl.GetMetadataImpl impl = new br.com.senior.furb.basico.impl.GetMetadataImpl(messengerSupplier, userId, messageSupplier);
		impl.getMetadata(input);
	}
	
	/**
	 * Chamada assíncrona para o método getMetadata
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * Default 'getMetadata' query. Every service must handle this command and return metadata in the format requested.
	 */
	@Override
	public CompletableFuture<GetMetadataOutput> getMetadataRequest(GetMetadataInput input) {
		br.com.senior.furb.basico.impl.GetMetadataImpl impl = new br.com.senior.furb.basico.impl.GetMetadataImpl(messengerSupplier, userId, messageSupplier);
		return impl.getMetadataRequest(input);
	}
	/**
	 * Chamada síncrona para o método importTipo
	 * This is a public operation
	 * 
	 * @throws BasicoMessageException quando um erro com payload for retornado pela mensageria
	 */
	@Override
	public ImportTipoOutput importTipo(ImportTipoInput input, long timeout) {
		br.com.senior.furb.basico.impl.ImportTipoImpl impl = new br.com.senior.furb.basico.impl.ImportTipoImpl(messengerSupplier, userId, messageSupplier);
		return impl.importTipo(input, timeout);
	}
	
	/**
	 * Chamada assíncrona para o método importTipo
	 * This is a public operation
	 * 
	 */
	@Override
	public void importTipo(ImportTipoInput input) {
		br.com.senior.furb.basico.impl.ImportTipoImpl impl = new br.com.senior.furb.basico.impl.ImportTipoImpl(messengerSupplier, userId, messageSupplier);
		impl.importTipo(input);
	}
	
	/**
	 * Chamada assíncrona para o método importTipo
	 * This is a public operation
	 * 
	 */
	@Override
	public CompletableFuture<ImportTipoOutput> importTipoRequest(ImportTipoInput input) {
		br.com.senior.furb.basico.impl.ImportTipoImpl impl = new br.com.senior.furb.basico.impl.ImportTipoImpl(messengerSupplier, userId, messageSupplier);
		return impl.importTipoRequest(input);
	}
	/**
	 * Chamada síncrona para o método exportTipo
	 * This is a public operation
	 * 
	 * @throws BasicoMessageException quando um erro com payload for retornado pela mensageria
	 */
	@Override
	public ExportTipoOutput exportTipo(ExportTipoInput input, long timeout) {
		br.com.senior.furb.basico.impl.ExportTipoImpl impl = new br.com.senior.furb.basico.impl.ExportTipoImpl(messengerSupplier, userId, messageSupplier);
		return impl.exportTipo(input, timeout);
	}
	
	/**
	 * Chamada assíncrona para o método exportTipo
	 * This is a public operation
	 * 
	 */
	@Override
	public void exportTipo(ExportTipoInput input) {
		br.com.senior.furb.basico.impl.ExportTipoImpl impl = new br.com.senior.furb.basico.impl.ExportTipoImpl(messengerSupplier, userId, messageSupplier);
		impl.exportTipo(input);
	}
	
	/**
	 * Chamada assíncrona para o método exportTipo
	 * This is a public operation
	 * 
	 */
	@Override
	public CompletableFuture<ExportTipoOutput> exportTipoRequest(ExportTipoInput input) {
		br.com.senior.furb.basico.impl.ExportTipoImpl impl = new br.com.senior.furb.basico.impl.ExportTipoImpl(messengerSupplier, userId, messageSupplier);
		return impl.exportTipoRequest(input);
	}
	/**
	 * Chamada síncrona para o método importEvento
	 * This is a public operation
	 * 
	 * @throws BasicoMessageException quando um erro com payload for retornado pela mensageria
	 */
	@Override
	public ImportEventoOutput importEvento(ImportEventoInput input, long timeout) {
		br.com.senior.furb.basico.impl.ImportEventoImpl impl = new br.com.senior.furb.basico.impl.ImportEventoImpl(messengerSupplier, userId, messageSupplier);
		return impl.importEvento(input, timeout);
	}
	
	/**
	 * Chamada assíncrona para o método importEvento
	 * This is a public operation
	 * 
	 */
	@Override
	public void importEvento(ImportEventoInput input) {
		br.com.senior.furb.basico.impl.ImportEventoImpl impl = new br.com.senior.furb.basico.impl.ImportEventoImpl(messengerSupplier, userId, messageSupplier);
		impl.importEvento(input);
	}
	
	/**
	 * Chamada assíncrona para o método importEvento
	 * This is a public operation
	 * 
	 */
	@Override
	public CompletableFuture<ImportEventoOutput> importEventoRequest(ImportEventoInput input) {
		br.com.senior.furb.basico.impl.ImportEventoImpl impl = new br.com.senior.furb.basico.impl.ImportEventoImpl(messengerSupplier, userId, messageSupplier);
		return impl.importEventoRequest(input);
	}
	/**
	 * Chamada síncrona para o método exportEvento
	 * This is a public operation
	 * 
	 * @throws BasicoMessageException quando um erro com payload for retornado pela mensageria
	 */
	@Override
	public ExportEventoOutput exportEvento(ExportEventoInput input, long timeout) {
		br.com.senior.furb.basico.impl.ExportEventoImpl impl = new br.com.senior.furb.basico.impl.ExportEventoImpl(messengerSupplier, userId, messageSupplier);
		return impl.exportEvento(input, timeout);
	}
	
	/**
	 * Chamada assíncrona para o método exportEvento
	 * This is a public operation
	 * 
	 */
	@Override
	public void exportEvento(ExportEventoInput input) {
		br.com.senior.furb.basico.impl.ExportEventoImpl impl = new br.com.senior.furb.basico.impl.ExportEventoImpl(messengerSupplier, userId, messageSupplier);
		impl.exportEvento(input);
	}
	
	/**
	 * Chamada assíncrona para o método exportEvento
	 * This is a public operation
	 * 
	 */
	@Override
	public CompletableFuture<ExportEventoOutput> exportEventoRequest(ExportEventoInput input) {
		br.com.senior.furb.basico.impl.ExportEventoImpl impl = new br.com.senior.furb.basico.impl.ExportEventoImpl(messengerSupplier, userId, messageSupplier);
		return impl.exportEventoRequest(input);
	}
	/**
	 * Chamada síncrona para o método importSala
	 * This is a public operation
	 * 
	 * @throws BasicoMessageException quando um erro com payload for retornado pela mensageria
	 */
	@Override
	public ImportSalaOutput importSala(ImportSalaInput input, long timeout) {
		br.com.senior.furb.basico.impl.ImportSalaImpl impl = new br.com.senior.furb.basico.impl.ImportSalaImpl(messengerSupplier, userId, messageSupplier);
		return impl.importSala(input, timeout);
	}
	
	/**
	 * Chamada assíncrona para o método importSala
	 * This is a public operation
	 * 
	 */
	@Override
	public void importSala(ImportSalaInput input) {
		br.com.senior.furb.basico.impl.ImportSalaImpl impl = new br.com.senior.furb.basico.impl.ImportSalaImpl(messengerSupplier, userId, messageSupplier);
		impl.importSala(input);
	}
	
	/**
	 * Chamada assíncrona para o método importSala
	 * This is a public operation
	 * 
	 */
	@Override
	public CompletableFuture<ImportSalaOutput> importSalaRequest(ImportSalaInput input) {
		br.com.senior.furb.basico.impl.ImportSalaImpl impl = new br.com.senior.furb.basico.impl.ImportSalaImpl(messengerSupplier, userId, messageSupplier);
		return impl.importSalaRequest(input);
	}
	/**
	 * Chamada síncrona para o método exportSala
	 * This is a public operation
	 * 
	 * @throws BasicoMessageException quando um erro com payload for retornado pela mensageria
	 */
	@Override
	public ExportSalaOutput exportSala(ExportSalaInput input, long timeout) {
		br.com.senior.furb.basico.impl.ExportSalaImpl impl = new br.com.senior.furb.basico.impl.ExportSalaImpl(messengerSupplier, userId, messageSupplier);
		return impl.exportSala(input, timeout);
	}
	
	/**
	 * Chamada assíncrona para o método exportSala
	 * This is a public operation
	 * 
	 */
	@Override
	public void exportSala(ExportSalaInput input) {
		br.com.senior.furb.basico.impl.ExportSalaImpl impl = new br.com.senior.furb.basico.impl.ExportSalaImpl(messengerSupplier, userId, messageSupplier);
		impl.exportSala(input);
	}
	
	/**
	 * Chamada assíncrona para o método exportSala
	 * This is a public operation
	 * 
	 */
	@Override
	public CompletableFuture<ExportSalaOutput> exportSalaRequest(ExportSalaInput input) {
		br.com.senior.furb.basico.impl.ExportSalaImpl impl = new br.com.senior.furb.basico.impl.ExportSalaImpl(messengerSupplier, userId, messageSupplier);
		return impl.exportSalaRequest(input);
	}
	/**
	 * Chamada síncrona para o método importSetor
	 * This is a public operation
	 * 
	 * @throws BasicoMessageException quando um erro com payload for retornado pela mensageria
	 */
	@Override
	public ImportSetorOutput importSetor(ImportSetorInput input, long timeout) {
		br.com.senior.furb.basico.impl.ImportSetorImpl impl = new br.com.senior.furb.basico.impl.ImportSetorImpl(messengerSupplier, userId, messageSupplier);
		return impl.importSetor(input, timeout);
	}
	
	/**
	 * Chamada assíncrona para o método importSetor
	 * This is a public operation
	 * 
	 */
	@Override
	public void importSetor(ImportSetorInput input) {
		br.com.senior.furb.basico.impl.ImportSetorImpl impl = new br.com.senior.furb.basico.impl.ImportSetorImpl(messengerSupplier, userId, messageSupplier);
		impl.importSetor(input);
	}
	
	/**
	 * Chamada assíncrona para o método importSetor
	 * This is a public operation
	 * 
	 */
	@Override
	public CompletableFuture<ImportSetorOutput> importSetorRequest(ImportSetorInput input) {
		br.com.senior.furb.basico.impl.ImportSetorImpl impl = new br.com.senior.furb.basico.impl.ImportSetorImpl(messengerSupplier, userId, messageSupplier);
		return impl.importSetorRequest(input);
	}
	/**
	 * Chamada síncrona para o método exportSetor
	 * This is a public operation
	 * 
	 * @throws BasicoMessageException quando um erro com payload for retornado pela mensageria
	 */
	@Override
	public ExportSetorOutput exportSetor(ExportSetorInput input, long timeout) {
		br.com.senior.furb.basico.impl.ExportSetorImpl impl = new br.com.senior.furb.basico.impl.ExportSetorImpl(messengerSupplier, userId, messageSupplier);
		return impl.exportSetor(input, timeout);
	}
	
	/**
	 * Chamada assíncrona para o método exportSetor
	 * This is a public operation
	 * 
	 */
	@Override
	public void exportSetor(ExportSetorInput input) {
		br.com.senior.furb.basico.impl.ExportSetorImpl impl = new br.com.senior.furb.basico.impl.ExportSetorImpl(messengerSupplier, userId, messageSupplier);
		impl.exportSetor(input);
	}
	
	/**
	 * Chamada assíncrona para o método exportSetor
	 * This is a public operation
	 * 
	 */
	@Override
	public CompletableFuture<ExportSetorOutput> exportSetorRequest(ExportSetorInput input) {
		br.com.senior.furb.basico.impl.ExportSetorImpl impl = new br.com.senior.furb.basico.impl.ExportSetorImpl(messengerSupplier, userId, messageSupplier);
		return impl.exportSetorRequest(input);
	}
	/**
	 * Chamada síncrona para o método listTipo
	 * This is a public operation
	 * The 'list' request primitive for the Tipo entity.
	 * @throws BasicoMessageException quando um erro com payload for retornado pela mensageria
	 */
	@Override
	public Tipo.PagedResults listTipo(Tipo.PageRequest input, long timeout) {
		br.com.senior.furb.basico.impl.ListTipoImpl impl = new br.com.senior.furb.basico.impl.ListTipoImpl(messengerSupplier, userId, messageSupplier);
		return impl.listTipo(input, timeout);
	}
	
	/**
	 * Chamada assíncrona para o método listTipo
	 * This is a public operation
	 * The 'list' request primitive for the Tipo entity.
	 */
	@Override
	public void listTipo(Tipo.PageRequest input) {
		br.com.senior.furb.basico.impl.ListTipoImpl impl = new br.com.senior.furb.basico.impl.ListTipoImpl(messengerSupplier, userId, messageSupplier);
		impl.listTipo(input);
	}
	
	/**
	 * Chamada assíncrona para o método listTipo
	 * This is a public operation
	 * The 'list' request primitive for the Tipo entity.
	 */
	@Override
	public CompletableFuture<Tipo.PagedResults> listTipoRequest(Tipo.PageRequest input) {
		br.com.senior.furb.basico.impl.ListTipoImpl impl = new br.com.senior.furb.basico.impl.ListTipoImpl(messengerSupplier, userId, messageSupplier);
		return impl.listTipoRequest(input);
	}
	/**
	 * Chamada síncrona para o método listEvento
	 * This is a public operation
	 * The 'list' request primitive for the Evento entity.
	 * @throws BasicoMessageException quando um erro com payload for retornado pela mensageria
	 */
	@Override
	public Evento.PagedResults listEvento(Evento.PageRequest input, long timeout) {
		br.com.senior.furb.basico.impl.ListEventoImpl impl = new br.com.senior.furb.basico.impl.ListEventoImpl(messengerSupplier, userId, messageSupplier);
		return impl.listEvento(input, timeout);
	}
	
	/**
	 * Chamada assíncrona para o método listEvento
	 * This is a public operation
	 * The 'list' request primitive for the Evento entity.
	 */
	@Override
	public void listEvento(Evento.PageRequest input) {
		br.com.senior.furb.basico.impl.ListEventoImpl impl = new br.com.senior.furb.basico.impl.ListEventoImpl(messengerSupplier, userId, messageSupplier);
		impl.listEvento(input);
	}
	
	/**
	 * Chamada assíncrona para o método listEvento
	 * This is a public operation
	 * The 'list' request primitive for the Evento entity.
	 */
	@Override
	public CompletableFuture<Evento.PagedResults> listEventoRequest(Evento.PageRequest input) {
		br.com.senior.furb.basico.impl.ListEventoImpl impl = new br.com.senior.furb.basico.impl.ListEventoImpl(messengerSupplier, userId, messageSupplier);
		return impl.listEventoRequest(input);
	}
	/**
	 * Chamada síncrona para o método listSala
	 * This is a public operation
	 * The 'list' request primitive for the Sala entity.
	 * @throws BasicoMessageException quando um erro com payload for retornado pela mensageria
	 */
	@Override
	public Sala.PagedResults listSala(Sala.PageRequest input, long timeout) {
		br.com.senior.furb.basico.impl.ListSalaImpl impl = new br.com.senior.furb.basico.impl.ListSalaImpl(messengerSupplier, userId, messageSupplier);
		return impl.listSala(input, timeout);
	}
	
	/**
	 * Chamada assíncrona para o método listSala
	 * This is a public operation
	 * The 'list' request primitive for the Sala entity.
	 */
	@Override
	public void listSala(Sala.PageRequest input) {
		br.com.senior.furb.basico.impl.ListSalaImpl impl = new br.com.senior.furb.basico.impl.ListSalaImpl(messengerSupplier, userId, messageSupplier);
		impl.listSala(input);
	}
	
	/**
	 * Chamada assíncrona para o método listSala
	 * This is a public operation
	 * The 'list' request primitive for the Sala entity.
	 */
	@Override
	public CompletableFuture<Sala.PagedResults> listSalaRequest(Sala.PageRequest input) {
		br.com.senior.furb.basico.impl.ListSalaImpl impl = new br.com.senior.furb.basico.impl.ListSalaImpl(messengerSupplier, userId, messageSupplier);
		return impl.listSalaRequest(input);
	}
	/**
	 * Chamada síncrona para o método listSetor
	 * This is a public operation
	 * The 'list' request primitive for the Setor entity.
	 * @throws BasicoMessageException quando um erro com payload for retornado pela mensageria
	 */
	@Override
	public Setor.PagedResults listSetor(Setor.PageRequest input, long timeout) {
		br.com.senior.furb.basico.impl.ListSetorImpl impl = new br.com.senior.furb.basico.impl.ListSetorImpl(messengerSupplier, userId, messageSupplier);
		return impl.listSetor(input, timeout);
	}
	
	/**
	 * Chamada assíncrona para o método listSetor
	 * This is a public operation
	 * The 'list' request primitive for the Setor entity.
	 */
	@Override
	public void listSetor(Setor.PageRequest input) {
		br.com.senior.furb.basico.impl.ListSetorImpl impl = new br.com.senior.furb.basico.impl.ListSetorImpl(messengerSupplier, userId, messageSupplier);
		impl.listSetor(input);
	}
	
	/**
	 * Chamada assíncrona para o método listSetor
	 * This is a public operation
	 * The 'list' request primitive for the Setor entity.
	 */
	@Override
	public CompletableFuture<Setor.PagedResults> listSetorRequest(Setor.PageRequest input) {
		br.com.senior.furb.basico.impl.ListSetorImpl impl = new br.com.senior.furb.basico.impl.ListSetorImpl(messengerSupplier, userId, messageSupplier);
		return impl.listSetorRequest(input);
	}
	/**
	 * Chamada síncrona para o método getDependencies
	 * This is a public operation
	 * Returns a list with all dependencies from this service, along with their respective versions
	 * @throws BasicoMessageException quando um erro com payload for retornado pela mensageria
	 */
	@Override
	public GetDependenciesOutput getDependencies(long timeout) {
		br.com.senior.furb.basico.impl.GetDependenciesImpl impl = new br.com.senior.furb.basico.impl.GetDependenciesImpl(messengerSupplier, userId, messageSupplier);
		return impl.getDependencies(timeout);
	}
	
	/**
	 * Chamada assíncrona para o método getDependencies
	 * This is a public operation
	 * Returns a list with all dependencies from this service, along with their respective versions
	 */
	@Override
	public void getDependencies() {
		br.com.senior.furb.basico.impl.GetDependenciesImpl impl = new br.com.senior.furb.basico.impl.GetDependenciesImpl(messengerSupplier, userId, messageSupplier);
		impl.getDependencies();
	}
	
	/**
	 * Chamada assíncrona para o método getDependencies
	 * This is a public operation
	 * Returns a list with all dependencies from this service, along with their respective versions
	 */
	@Override
	public CompletableFuture<GetDependenciesOutput> getDependenciesRequest() {
		br.com.senior.furb.basico.impl.GetDependenciesImpl impl = new br.com.senior.furb.basico.impl.GetDependenciesImpl(messengerSupplier, userId, messageSupplier);
		return impl.getDependenciesRequest();
	}
	/**
	 * Chamada síncrona para o método createTipo
	 * This is a public operation
	 * The 'create' request primitive for the Tipo entity.
	 * @throws BasicoMessageException quando um erro com payload for retornado pela mensageria
	 */
	@Override
	public Tipo createTipo(Tipo input, long timeout) {
		br.com.senior.furb.basico.impl.CreateTipoImpl impl = new br.com.senior.furb.basico.impl.CreateTipoImpl(messengerSupplier, userId, messageSupplier);
		return impl.createTipo(input, timeout);
	}
	
	/**
	 * Chamada assíncrona para o método createTipo
	 * This is a public operation
	 * The 'create' request primitive for the Tipo entity.
	 */
	@Override
	public void createTipo(Tipo input) {
		br.com.senior.furb.basico.impl.CreateTipoImpl impl = new br.com.senior.furb.basico.impl.CreateTipoImpl(messengerSupplier, userId, messageSupplier);
		impl.createTipo(input);
	}
	
	/**
	 * Chamada assíncrona para o método createTipo
	 * This is a public operation
	 * The 'create' request primitive for the Tipo entity.
	 */
	@Override
	public CompletableFuture<Tipo> createTipoRequest(Tipo input) {
		br.com.senior.furb.basico.impl.CreateTipoImpl impl = new br.com.senior.furb.basico.impl.CreateTipoImpl(messengerSupplier, userId, messageSupplier);
		return impl.createTipoRequest(input);
	}
	/**
	 * Chamada síncrona para o método createBulkTipo
	 * This is a public operation
	 * The 'createBulk' request primitive for the Tipo entity.
	 * @throws BasicoMessageException quando um erro com payload for retornado pela mensageria
	 */
	@Override
	public CreateBulkTipoOutput createBulkTipo(CreateBulkTipoInput input, long timeout) {
		br.com.senior.furb.basico.impl.CreateBulkTipoImpl impl = new br.com.senior.furb.basico.impl.CreateBulkTipoImpl(messengerSupplier, userId, messageSupplier);
		return impl.createBulkTipo(input, timeout);
	}
	
	/**
	 * Chamada assíncrona para o método createBulkTipo
	 * This is a public operation
	 * The 'createBulk' request primitive for the Tipo entity.
	 */
	@Override
	public void createBulkTipo(CreateBulkTipoInput input) {
		br.com.senior.furb.basico.impl.CreateBulkTipoImpl impl = new br.com.senior.furb.basico.impl.CreateBulkTipoImpl(messengerSupplier, userId, messageSupplier);
		impl.createBulkTipo(input);
	}
	
	/**
	 * Chamada assíncrona para o método createBulkTipo
	 * This is a public operation
	 * The 'createBulk' request primitive for the Tipo entity.
	 */
	@Override
	public CompletableFuture<CreateBulkTipoOutput> createBulkTipoRequest(CreateBulkTipoInput input) {
		br.com.senior.furb.basico.impl.CreateBulkTipoImpl impl = new br.com.senior.furb.basico.impl.CreateBulkTipoImpl(messengerSupplier, userId, messageSupplier);
		return impl.createBulkTipoRequest(input);
	}
	/**
	 * Chamada síncrona para o método createMergeTipo
	 * This is a public operation
	 * The 'createMerge' request primitive for the Tipo entity.
	 * @throws BasicoMessageException quando um erro com payload for retornado pela mensageria
	 */
	@Override
	public Tipo createMergeTipo(Tipo input, long timeout) {
		br.com.senior.furb.basico.impl.CreateMergeTipoImpl impl = new br.com.senior.furb.basico.impl.CreateMergeTipoImpl(messengerSupplier, userId, messageSupplier);
		return impl.createMergeTipo(input, timeout);
	}
	
	/**
	 * Chamada assíncrona para o método createMergeTipo
	 * This is a public operation
	 * The 'createMerge' request primitive for the Tipo entity.
	 */
	@Override
	public void createMergeTipo(Tipo input) {
		br.com.senior.furb.basico.impl.CreateMergeTipoImpl impl = new br.com.senior.furb.basico.impl.CreateMergeTipoImpl(messengerSupplier, userId, messageSupplier);
		impl.createMergeTipo(input);
	}
	
	/**
	 * Chamada assíncrona para o método createMergeTipo
	 * This is a public operation
	 * The 'createMerge' request primitive for the Tipo entity.
	 */
	@Override
	public CompletableFuture<Tipo> createMergeTipoRequest(Tipo input) {
		br.com.senior.furb.basico.impl.CreateMergeTipoImpl impl = new br.com.senior.furb.basico.impl.CreateMergeTipoImpl(messengerSupplier, userId, messageSupplier);
		return impl.createMergeTipoRequest(input);
	}
	/**
	 * Chamada síncrona para o método retrieveTipo
	 * This is a public operation
	 * The 'retrieve' request primitive for the Tipo entity.
	 * @throws BasicoMessageException quando um erro com payload for retornado pela mensageria
	 */
	@Override
	public Tipo retrieveTipo(Tipo.Id input, long timeout) {
		br.com.senior.furb.basico.impl.RetrieveTipoImpl impl = new br.com.senior.furb.basico.impl.RetrieveTipoImpl(messengerSupplier, userId, messageSupplier);
		return impl.retrieveTipo(input, timeout);
	}
	
	/**
	 * Chamada assíncrona para o método retrieveTipo
	 * This is a public operation
	 * The 'retrieve' request primitive for the Tipo entity.
	 */
	@Override
	public void retrieveTipo(Tipo.Id input) {
		br.com.senior.furb.basico.impl.RetrieveTipoImpl impl = new br.com.senior.furb.basico.impl.RetrieveTipoImpl(messengerSupplier, userId, messageSupplier);
		impl.retrieveTipo(input);
	}
	
	/**
	 * Chamada assíncrona para o método retrieveTipo
	 * This is a public operation
	 * The 'retrieve' request primitive for the Tipo entity.
	 */
	@Override
	public CompletableFuture<Tipo> retrieveTipoRequest(Tipo.Id input) {
		br.com.senior.furb.basico.impl.RetrieveTipoImpl impl = new br.com.senior.furb.basico.impl.RetrieveTipoImpl(messengerSupplier, userId, messageSupplier);
		return impl.retrieveTipoRequest(input);
	}
	/**
	 * Chamada síncrona para o método updateTipo
	 * This is a public operation
	 * The 'update' request primitive for the Tipo entity.
	 * @throws BasicoMessageException quando um erro com payload for retornado pela mensageria
	 */
	@Override
	public Tipo updateTipo(Tipo input, long timeout) {
		br.com.senior.furb.basico.impl.UpdateTipoImpl impl = new br.com.senior.furb.basico.impl.UpdateTipoImpl(messengerSupplier, userId, messageSupplier);
		return impl.updateTipo(input, timeout);
	}
	
	/**
	 * Chamada assíncrona para o método updateTipo
	 * This is a public operation
	 * The 'update' request primitive for the Tipo entity.
	 */
	@Override
	public void updateTipo(Tipo input) {
		br.com.senior.furb.basico.impl.UpdateTipoImpl impl = new br.com.senior.furb.basico.impl.UpdateTipoImpl(messengerSupplier, userId, messageSupplier);
		impl.updateTipo(input);
	}
	
	/**
	 * Chamada assíncrona para o método updateTipo
	 * This is a public operation
	 * The 'update' request primitive for the Tipo entity.
	 */
	@Override
	public CompletableFuture<Tipo> updateTipoRequest(Tipo input) {
		br.com.senior.furb.basico.impl.UpdateTipoImpl impl = new br.com.senior.furb.basico.impl.UpdateTipoImpl(messengerSupplier, userId, messageSupplier);
		return impl.updateTipoRequest(input);
	}
	/**
	 * Chamada síncrona para o método updateMergeTipo
	 * This is a public operation
	 * The 'updateMerge' request primitive for the Tipo entity.
	 * @throws BasicoMessageException quando um erro com payload for retornado pela mensageria
	 */
	@Override
	public Tipo updateMergeTipo(Tipo input, long timeout) {
		br.com.senior.furb.basico.impl.UpdateMergeTipoImpl impl = new br.com.senior.furb.basico.impl.UpdateMergeTipoImpl(messengerSupplier, userId, messageSupplier);
		return impl.updateMergeTipo(input, timeout);
	}
	
	/**
	 * Chamada assíncrona para o método updateMergeTipo
	 * This is a public operation
	 * The 'updateMerge' request primitive for the Tipo entity.
	 */
	@Override
	public void updateMergeTipo(Tipo input) {
		br.com.senior.furb.basico.impl.UpdateMergeTipoImpl impl = new br.com.senior.furb.basico.impl.UpdateMergeTipoImpl(messengerSupplier, userId, messageSupplier);
		impl.updateMergeTipo(input);
	}
	
	/**
	 * Chamada assíncrona para o método updateMergeTipo
	 * This is a public operation
	 * The 'updateMerge' request primitive for the Tipo entity.
	 */
	@Override
	public CompletableFuture<Tipo> updateMergeTipoRequest(Tipo input) {
		br.com.senior.furb.basico.impl.UpdateMergeTipoImpl impl = new br.com.senior.furb.basico.impl.UpdateMergeTipoImpl(messengerSupplier, userId, messageSupplier);
		return impl.updateMergeTipoRequest(input);
	}
	/**
	 * Chamada síncrona para o método deleteTipo
	 * This is a public operation
	 * The 'delete' request primitive for the Tipo entity.
	 * @throws BasicoMessageException quando um erro com payload for retornado pela mensageria
	 */
	@Override
	public void deleteTipo(Tipo.Id input, long timeout) {
		br.com.senior.furb.basico.impl.DeleteTipoImpl impl = new br.com.senior.furb.basico.impl.DeleteTipoImpl(messengerSupplier, userId, messageSupplier);
		impl.deleteTipo(input, timeout);
	}
	
	/**
	 * Chamada assíncrona para o método deleteTipo
	 * This is a public operation
	 * The 'delete' request primitive for the Tipo entity.
	 */
	@Override
	public void deleteTipo(Tipo.Id input) {
		br.com.senior.furb.basico.impl.DeleteTipoImpl impl = new br.com.senior.furb.basico.impl.DeleteTipoImpl(messengerSupplier, userId, messageSupplier);
		impl.deleteTipo(input);
	}
	
	/**
	 * Chamada síncrona para o método createEvento
	 * This is a public operation
	 * The 'create' request primitive for the Evento entity.
	 * @throws BasicoMessageException quando um erro com payload for retornado pela mensageria
	 */
	@Override
	public Evento createEvento(Evento input, long timeout) {
		br.com.senior.furb.basico.impl.CreateEventoImpl impl = new br.com.senior.furb.basico.impl.CreateEventoImpl(messengerSupplier, userId, messageSupplier);
		return impl.createEvento(input, timeout);
	}
	
	/**
	 * Chamada assíncrona para o método createEvento
	 * This is a public operation
	 * The 'create' request primitive for the Evento entity.
	 */
	@Override
	public void createEvento(Evento input) {
		br.com.senior.furb.basico.impl.CreateEventoImpl impl = new br.com.senior.furb.basico.impl.CreateEventoImpl(messengerSupplier, userId, messageSupplier);
		impl.createEvento(input);
	}
	
	/**
	 * Chamada assíncrona para o método createEvento
	 * This is a public operation
	 * The 'create' request primitive for the Evento entity.
	 */
	@Override
	public CompletableFuture<Evento> createEventoRequest(Evento input) {
		br.com.senior.furb.basico.impl.CreateEventoImpl impl = new br.com.senior.furb.basico.impl.CreateEventoImpl(messengerSupplier, userId, messageSupplier);
		return impl.createEventoRequest(input);
	}
	/**
	 * Chamada síncrona para o método createBulkEvento
	 * This is a public operation
	 * The 'createBulk' request primitive for the Evento entity.
	 * @throws BasicoMessageException quando um erro com payload for retornado pela mensageria
	 */
	@Override
	public CreateBulkEventoOutput createBulkEvento(CreateBulkEventoInput input, long timeout) {
		br.com.senior.furb.basico.impl.CreateBulkEventoImpl impl = new br.com.senior.furb.basico.impl.CreateBulkEventoImpl(messengerSupplier, userId, messageSupplier);
		return impl.createBulkEvento(input, timeout);
	}
	
	/**
	 * Chamada assíncrona para o método createBulkEvento
	 * This is a public operation
	 * The 'createBulk' request primitive for the Evento entity.
	 */
	@Override
	public void createBulkEvento(CreateBulkEventoInput input) {
		br.com.senior.furb.basico.impl.CreateBulkEventoImpl impl = new br.com.senior.furb.basico.impl.CreateBulkEventoImpl(messengerSupplier, userId, messageSupplier);
		impl.createBulkEvento(input);
	}
	
	/**
	 * Chamada assíncrona para o método createBulkEvento
	 * This is a public operation
	 * The 'createBulk' request primitive for the Evento entity.
	 */
	@Override
	public CompletableFuture<CreateBulkEventoOutput> createBulkEventoRequest(CreateBulkEventoInput input) {
		br.com.senior.furb.basico.impl.CreateBulkEventoImpl impl = new br.com.senior.furb.basico.impl.CreateBulkEventoImpl(messengerSupplier, userId, messageSupplier);
		return impl.createBulkEventoRequest(input);
	}
	/**
	 * Chamada síncrona para o método createMergeEvento
	 * This is a public operation
	 * The 'createMerge' request primitive for the Evento entity.
	 * @throws BasicoMessageException quando um erro com payload for retornado pela mensageria
	 */
	@Override
	public Evento createMergeEvento(Evento input, long timeout) {
		br.com.senior.furb.basico.impl.CreateMergeEventoImpl impl = new br.com.senior.furb.basico.impl.CreateMergeEventoImpl(messengerSupplier, userId, messageSupplier);
		return impl.createMergeEvento(input, timeout);
	}
	
	/**
	 * Chamada assíncrona para o método createMergeEvento
	 * This is a public operation
	 * The 'createMerge' request primitive for the Evento entity.
	 */
	@Override
	public void createMergeEvento(Evento input) {
		br.com.senior.furb.basico.impl.CreateMergeEventoImpl impl = new br.com.senior.furb.basico.impl.CreateMergeEventoImpl(messengerSupplier, userId, messageSupplier);
		impl.createMergeEvento(input);
	}
	
	/**
	 * Chamada assíncrona para o método createMergeEvento
	 * This is a public operation
	 * The 'createMerge' request primitive for the Evento entity.
	 */
	@Override
	public CompletableFuture<Evento> createMergeEventoRequest(Evento input) {
		br.com.senior.furb.basico.impl.CreateMergeEventoImpl impl = new br.com.senior.furb.basico.impl.CreateMergeEventoImpl(messengerSupplier, userId, messageSupplier);
		return impl.createMergeEventoRequest(input);
	}
	/**
	 * Chamada síncrona para o método retrieveEvento
	 * This is a public operation
	 * The 'retrieve' request primitive for the Evento entity.
	 * @throws BasicoMessageException quando um erro com payload for retornado pela mensageria
	 */
	@Override
	public Evento retrieveEvento(Evento.Id input, long timeout) {
		br.com.senior.furb.basico.impl.RetrieveEventoImpl impl = new br.com.senior.furb.basico.impl.RetrieveEventoImpl(messengerSupplier, userId, messageSupplier);
		return impl.retrieveEvento(input, timeout);
	}
	
	/**
	 * Chamada assíncrona para o método retrieveEvento
	 * This is a public operation
	 * The 'retrieve' request primitive for the Evento entity.
	 */
	@Override
	public void retrieveEvento(Evento.Id input) {
		br.com.senior.furb.basico.impl.RetrieveEventoImpl impl = new br.com.senior.furb.basico.impl.RetrieveEventoImpl(messengerSupplier, userId, messageSupplier);
		impl.retrieveEvento(input);
	}
	
	/**
	 * Chamada assíncrona para o método retrieveEvento
	 * This is a public operation
	 * The 'retrieve' request primitive for the Evento entity.
	 */
	@Override
	public CompletableFuture<Evento> retrieveEventoRequest(Evento.Id input) {
		br.com.senior.furb.basico.impl.RetrieveEventoImpl impl = new br.com.senior.furb.basico.impl.RetrieveEventoImpl(messengerSupplier, userId, messageSupplier);
		return impl.retrieveEventoRequest(input);
	}
	/**
	 * Chamada síncrona para o método updateEvento
	 * This is a public operation
	 * The 'update' request primitive for the Evento entity.
	 * @throws BasicoMessageException quando um erro com payload for retornado pela mensageria
	 */
	@Override
	public Evento updateEvento(Evento input, long timeout) {
		br.com.senior.furb.basico.impl.UpdateEventoImpl impl = new br.com.senior.furb.basico.impl.UpdateEventoImpl(messengerSupplier, userId, messageSupplier);
		return impl.updateEvento(input, timeout);
	}
	
	/**
	 * Chamada assíncrona para o método updateEvento
	 * This is a public operation
	 * The 'update' request primitive for the Evento entity.
	 */
	@Override
	public void updateEvento(Evento input) {
		br.com.senior.furb.basico.impl.UpdateEventoImpl impl = new br.com.senior.furb.basico.impl.UpdateEventoImpl(messengerSupplier, userId, messageSupplier);
		impl.updateEvento(input);
	}
	
	/**
	 * Chamada assíncrona para o método updateEvento
	 * This is a public operation
	 * The 'update' request primitive for the Evento entity.
	 */
	@Override
	public CompletableFuture<Evento> updateEventoRequest(Evento input) {
		br.com.senior.furb.basico.impl.UpdateEventoImpl impl = new br.com.senior.furb.basico.impl.UpdateEventoImpl(messengerSupplier, userId, messageSupplier);
		return impl.updateEventoRequest(input);
	}
	/**
	 * Chamada síncrona para o método updateMergeEvento
	 * This is a public operation
	 * The 'updateMerge' request primitive for the Evento entity.
	 * @throws BasicoMessageException quando um erro com payload for retornado pela mensageria
	 */
	@Override
	public Evento updateMergeEvento(Evento input, long timeout) {
		br.com.senior.furb.basico.impl.UpdateMergeEventoImpl impl = new br.com.senior.furb.basico.impl.UpdateMergeEventoImpl(messengerSupplier, userId, messageSupplier);
		return impl.updateMergeEvento(input, timeout);
	}
	
	/**
	 * Chamada assíncrona para o método updateMergeEvento
	 * This is a public operation
	 * The 'updateMerge' request primitive for the Evento entity.
	 */
	@Override
	public void updateMergeEvento(Evento input) {
		br.com.senior.furb.basico.impl.UpdateMergeEventoImpl impl = new br.com.senior.furb.basico.impl.UpdateMergeEventoImpl(messengerSupplier, userId, messageSupplier);
		impl.updateMergeEvento(input);
	}
	
	/**
	 * Chamada assíncrona para o método updateMergeEvento
	 * This is a public operation
	 * The 'updateMerge' request primitive for the Evento entity.
	 */
	@Override
	public CompletableFuture<Evento> updateMergeEventoRequest(Evento input) {
		br.com.senior.furb.basico.impl.UpdateMergeEventoImpl impl = new br.com.senior.furb.basico.impl.UpdateMergeEventoImpl(messengerSupplier, userId, messageSupplier);
		return impl.updateMergeEventoRequest(input);
	}
	/**
	 * Chamada síncrona para o método deleteEvento
	 * This is a public operation
	 * The 'delete' request primitive for the Evento entity.
	 * @throws BasicoMessageException quando um erro com payload for retornado pela mensageria
	 */
	@Override
	public void deleteEvento(Evento.Id input, long timeout) {
		br.com.senior.furb.basico.impl.DeleteEventoImpl impl = new br.com.senior.furb.basico.impl.DeleteEventoImpl(messengerSupplier, userId, messageSupplier);
		impl.deleteEvento(input, timeout);
	}
	
	/**
	 * Chamada assíncrona para o método deleteEvento
	 * This is a public operation
	 * The 'delete' request primitive for the Evento entity.
	 */
	@Override
	public void deleteEvento(Evento.Id input) {
		br.com.senior.furb.basico.impl.DeleteEventoImpl impl = new br.com.senior.furb.basico.impl.DeleteEventoImpl(messengerSupplier, userId, messageSupplier);
		impl.deleteEvento(input);
	}
	
	/**
	 * Chamada síncrona para o método createSala
	 * This is a public operation
	 * The 'create' request primitive for the Sala entity.
	 * @throws BasicoMessageException quando um erro com payload for retornado pela mensageria
	 */
	@Override
	public Sala createSala(Sala input, long timeout) {
		br.com.senior.furb.basico.impl.CreateSalaImpl impl = new br.com.senior.furb.basico.impl.CreateSalaImpl(messengerSupplier, userId, messageSupplier);
		return impl.createSala(input, timeout);
	}
	
	/**
	 * Chamada assíncrona para o método createSala
	 * This is a public operation
	 * The 'create' request primitive for the Sala entity.
	 */
	@Override
	public void createSala(Sala input) {
		br.com.senior.furb.basico.impl.CreateSalaImpl impl = new br.com.senior.furb.basico.impl.CreateSalaImpl(messengerSupplier, userId, messageSupplier);
		impl.createSala(input);
	}
	
	/**
	 * Chamada assíncrona para o método createSala
	 * This is a public operation
	 * The 'create' request primitive for the Sala entity.
	 */
	@Override
	public CompletableFuture<Sala> createSalaRequest(Sala input) {
		br.com.senior.furb.basico.impl.CreateSalaImpl impl = new br.com.senior.furb.basico.impl.CreateSalaImpl(messengerSupplier, userId, messageSupplier);
		return impl.createSalaRequest(input);
	}
	/**
	 * Chamada síncrona para o método createBulkSala
	 * This is a public operation
	 * The 'createBulk' request primitive for the Sala entity.
	 * @throws BasicoMessageException quando um erro com payload for retornado pela mensageria
	 */
	@Override
	public CreateBulkSalaOutput createBulkSala(CreateBulkSalaInput input, long timeout) {
		br.com.senior.furb.basico.impl.CreateBulkSalaImpl impl = new br.com.senior.furb.basico.impl.CreateBulkSalaImpl(messengerSupplier, userId, messageSupplier);
		return impl.createBulkSala(input, timeout);
	}
	
	/**
	 * Chamada assíncrona para o método createBulkSala
	 * This is a public operation
	 * The 'createBulk' request primitive for the Sala entity.
	 */
	@Override
	public void createBulkSala(CreateBulkSalaInput input) {
		br.com.senior.furb.basico.impl.CreateBulkSalaImpl impl = new br.com.senior.furb.basico.impl.CreateBulkSalaImpl(messengerSupplier, userId, messageSupplier);
		impl.createBulkSala(input);
	}
	
	/**
	 * Chamada assíncrona para o método createBulkSala
	 * This is a public operation
	 * The 'createBulk' request primitive for the Sala entity.
	 */
	@Override
	public CompletableFuture<CreateBulkSalaOutput> createBulkSalaRequest(CreateBulkSalaInput input) {
		br.com.senior.furb.basico.impl.CreateBulkSalaImpl impl = new br.com.senior.furb.basico.impl.CreateBulkSalaImpl(messengerSupplier, userId, messageSupplier);
		return impl.createBulkSalaRequest(input);
	}
	/**
	 * Chamada síncrona para o método createMergeSala
	 * This is a public operation
	 * The 'createMerge' request primitive for the Sala entity.
	 * @throws BasicoMessageException quando um erro com payload for retornado pela mensageria
	 */
	@Override
	public Sala createMergeSala(Sala input, long timeout) {
		br.com.senior.furb.basico.impl.CreateMergeSalaImpl impl = new br.com.senior.furb.basico.impl.CreateMergeSalaImpl(messengerSupplier, userId, messageSupplier);
		return impl.createMergeSala(input, timeout);
	}
	
	/**
	 * Chamada assíncrona para o método createMergeSala
	 * This is a public operation
	 * The 'createMerge' request primitive for the Sala entity.
	 */
	@Override
	public void createMergeSala(Sala input) {
		br.com.senior.furb.basico.impl.CreateMergeSalaImpl impl = new br.com.senior.furb.basico.impl.CreateMergeSalaImpl(messengerSupplier, userId, messageSupplier);
		impl.createMergeSala(input);
	}
	
	/**
	 * Chamada assíncrona para o método createMergeSala
	 * This is a public operation
	 * The 'createMerge' request primitive for the Sala entity.
	 */
	@Override
	public CompletableFuture<Sala> createMergeSalaRequest(Sala input) {
		br.com.senior.furb.basico.impl.CreateMergeSalaImpl impl = new br.com.senior.furb.basico.impl.CreateMergeSalaImpl(messengerSupplier, userId, messageSupplier);
		return impl.createMergeSalaRequest(input);
	}
	/**
	 * Chamada síncrona para o método retrieveSala
	 * This is a public operation
	 * The 'retrieve' request primitive for the Sala entity.
	 * @throws BasicoMessageException quando um erro com payload for retornado pela mensageria
	 */
	@Override
	public Sala retrieveSala(Sala.Id input, long timeout) {
		br.com.senior.furb.basico.impl.RetrieveSalaImpl impl = new br.com.senior.furb.basico.impl.RetrieveSalaImpl(messengerSupplier, userId, messageSupplier);
		return impl.retrieveSala(input, timeout);
	}
	
	/**
	 * Chamada assíncrona para o método retrieveSala
	 * This is a public operation
	 * The 'retrieve' request primitive for the Sala entity.
	 */
	@Override
	public void retrieveSala(Sala.Id input) {
		br.com.senior.furb.basico.impl.RetrieveSalaImpl impl = new br.com.senior.furb.basico.impl.RetrieveSalaImpl(messengerSupplier, userId, messageSupplier);
		impl.retrieveSala(input);
	}
	
	/**
	 * Chamada assíncrona para o método retrieveSala
	 * This is a public operation
	 * The 'retrieve' request primitive for the Sala entity.
	 */
	@Override
	public CompletableFuture<Sala> retrieveSalaRequest(Sala.Id input) {
		br.com.senior.furb.basico.impl.RetrieveSalaImpl impl = new br.com.senior.furb.basico.impl.RetrieveSalaImpl(messengerSupplier, userId, messageSupplier);
		return impl.retrieveSalaRequest(input);
	}
	/**
	 * Chamada síncrona para o método updateSala
	 * This is a public operation
	 * The 'update' request primitive for the Sala entity.
	 * @throws BasicoMessageException quando um erro com payload for retornado pela mensageria
	 */
	@Override
	public Sala updateSala(Sala input, long timeout) {
		br.com.senior.furb.basico.impl.UpdateSalaImpl impl = new br.com.senior.furb.basico.impl.UpdateSalaImpl(messengerSupplier, userId, messageSupplier);
		return impl.updateSala(input, timeout);
	}
	
	/**
	 * Chamada assíncrona para o método updateSala
	 * This is a public operation
	 * The 'update' request primitive for the Sala entity.
	 */
	@Override
	public void updateSala(Sala input) {
		br.com.senior.furb.basico.impl.UpdateSalaImpl impl = new br.com.senior.furb.basico.impl.UpdateSalaImpl(messengerSupplier, userId, messageSupplier);
		impl.updateSala(input);
	}
	
	/**
	 * Chamada assíncrona para o método updateSala
	 * This is a public operation
	 * The 'update' request primitive for the Sala entity.
	 */
	@Override
	public CompletableFuture<Sala> updateSalaRequest(Sala input) {
		br.com.senior.furb.basico.impl.UpdateSalaImpl impl = new br.com.senior.furb.basico.impl.UpdateSalaImpl(messengerSupplier, userId, messageSupplier);
		return impl.updateSalaRequest(input);
	}
	/**
	 * Chamada síncrona para o método updateMergeSala
	 * This is a public operation
	 * The 'updateMerge' request primitive for the Sala entity.
	 * @throws BasicoMessageException quando um erro com payload for retornado pela mensageria
	 */
	@Override
	public Sala updateMergeSala(Sala input, long timeout) {
		br.com.senior.furb.basico.impl.UpdateMergeSalaImpl impl = new br.com.senior.furb.basico.impl.UpdateMergeSalaImpl(messengerSupplier, userId, messageSupplier);
		return impl.updateMergeSala(input, timeout);
	}
	
	/**
	 * Chamada assíncrona para o método updateMergeSala
	 * This is a public operation
	 * The 'updateMerge' request primitive for the Sala entity.
	 */
	@Override
	public void updateMergeSala(Sala input) {
		br.com.senior.furb.basico.impl.UpdateMergeSalaImpl impl = new br.com.senior.furb.basico.impl.UpdateMergeSalaImpl(messengerSupplier, userId, messageSupplier);
		impl.updateMergeSala(input);
	}
	
	/**
	 * Chamada assíncrona para o método updateMergeSala
	 * This is a public operation
	 * The 'updateMerge' request primitive for the Sala entity.
	 */
	@Override
	public CompletableFuture<Sala> updateMergeSalaRequest(Sala input) {
		br.com.senior.furb.basico.impl.UpdateMergeSalaImpl impl = new br.com.senior.furb.basico.impl.UpdateMergeSalaImpl(messengerSupplier, userId, messageSupplier);
		return impl.updateMergeSalaRequest(input);
	}
	/**
	 * Chamada síncrona para o método deleteSala
	 * This is a public operation
	 * The 'delete' request primitive for the Sala entity.
	 * @throws BasicoMessageException quando um erro com payload for retornado pela mensageria
	 */
	@Override
	public void deleteSala(Sala.Id input, long timeout) {
		br.com.senior.furb.basico.impl.DeleteSalaImpl impl = new br.com.senior.furb.basico.impl.DeleteSalaImpl(messengerSupplier, userId, messageSupplier);
		impl.deleteSala(input, timeout);
	}
	
	/**
	 * Chamada assíncrona para o método deleteSala
	 * This is a public operation
	 * The 'delete' request primitive for the Sala entity.
	 */
	@Override
	public void deleteSala(Sala.Id input) {
		br.com.senior.furb.basico.impl.DeleteSalaImpl impl = new br.com.senior.furb.basico.impl.DeleteSalaImpl(messengerSupplier, userId, messageSupplier);
		impl.deleteSala(input);
	}
	
	/**
	 * Chamada síncrona para o método createSetor
	 * This is a public operation
	 * The 'create' request primitive for the Setor entity.
	 * @throws BasicoMessageException quando um erro com payload for retornado pela mensageria
	 */
	@Override
	public Setor createSetor(Setor input, long timeout) {
		br.com.senior.furb.basico.impl.CreateSetorImpl impl = new br.com.senior.furb.basico.impl.CreateSetorImpl(messengerSupplier, userId, messageSupplier);
		return impl.createSetor(input, timeout);
	}
	
	/**
	 * Chamada assíncrona para o método createSetor
	 * This is a public operation
	 * The 'create' request primitive for the Setor entity.
	 */
	@Override
	public void createSetor(Setor input) {
		br.com.senior.furb.basico.impl.CreateSetorImpl impl = new br.com.senior.furb.basico.impl.CreateSetorImpl(messengerSupplier, userId, messageSupplier);
		impl.createSetor(input);
	}
	
	/**
	 * Chamada assíncrona para o método createSetor
	 * This is a public operation
	 * The 'create' request primitive for the Setor entity.
	 */
	@Override
	public CompletableFuture<Setor> createSetorRequest(Setor input) {
		br.com.senior.furb.basico.impl.CreateSetorImpl impl = new br.com.senior.furb.basico.impl.CreateSetorImpl(messengerSupplier, userId, messageSupplier);
		return impl.createSetorRequest(input);
	}
	/**
	 * Chamada síncrona para o método createBulkSetor
	 * This is a public operation
	 * The 'createBulk' request primitive for the Setor entity.
	 * @throws BasicoMessageException quando um erro com payload for retornado pela mensageria
	 */
	@Override
	public CreateBulkSetorOutput createBulkSetor(CreateBulkSetorInput input, long timeout) {
		br.com.senior.furb.basico.impl.CreateBulkSetorImpl impl = new br.com.senior.furb.basico.impl.CreateBulkSetorImpl(messengerSupplier, userId, messageSupplier);
		return impl.createBulkSetor(input, timeout);
	}
	
	/**
	 * Chamada assíncrona para o método createBulkSetor
	 * This is a public operation
	 * The 'createBulk' request primitive for the Setor entity.
	 */
	@Override
	public void createBulkSetor(CreateBulkSetorInput input) {
		br.com.senior.furb.basico.impl.CreateBulkSetorImpl impl = new br.com.senior.furb.basico.impl.CreateBulkSetorImpl(messengerSupplier, userId, messageSupplier);
		impl.createBulkSetor(input);
	}
	
	/**
	 * Chamada assíncrona para o método createBulkSetor
	 * This is a public operation
	 * The 'createBulk' request primitive for the Setor entity.
	 */
	@Override
	public CompletableFuture<CreateBulkSetorOutput> createBulkSetorRequest(CreateBulkSetorInput input) {
		br.com.senior.furb.basico.impl.CreateBulkSetorImpl impl = new br.com.senior.furb.basico.impl.CreateBulkSetorImpl(messengerSupplier, userId, messageSupplier);
		return impl.createBulkSetorRequest(input);
	}
	/**
	 * Chamada síncrona para o método createMergeSetor
	 * This is a public operation
	 * The 'createMerge' request primitive for the Setor entity.
	 * @throws BasicoMessageException quando um erro com payload for retornado pela mensageria
	 */
	@Override
	public Setor createMergeSetor(Setor input, long timeout) {
		br.com.senior.furb.basico.impl.CreateMergeSetorImpl impl = new br.com.senior.furb.basico.impl.CreateMergeSetorImpl(messengerSupplier, userId, messageSupplier);
		return impl.createMergeSetor(input, timeout);
	}
	
	/**
	 * Chamada assíncrona para o método createMergeSetor
	 * This is a public operation
	 * The 'createMerge' request primitive for the Setor entity.
	 */
	@Override
	public void createMergeSetor(Setor input) {
		br.com.senior.furb.basico.impl.CreateMergeSetorImpl impl = new br.com.senior.furb.basico.impl.CreateMergeSetorImpl(messengerSupplier, userId, messageSupplier);
		impl.createMergeSetor(input);
	}
	
	/**
	 * Chamada assíncrona para o método createMergeSetor
	 * This is a public operation
	 * The 'createMerge' request primitive for the Setor entity.
	 */
	@Override
	public CompletableFuture<Setor> createMergeSetorRequest(Setor input) {
		br.com.senior.furb.basico.impl.CreateMergeSetorImpl impl = new br.com.senior.furb.basico.impl.CreateMergeSetorImpl(messengerSupplier, userId, messageSupplier);
		return impl.createMergeSetorRequest(input);
	}
	/**
	 * Chamada síncrona para o método retrieveSetor
	 * This is a public operation
	 * The 'retrieve' request primitive for the Setor entity.
	 * @throws BasicoMessageException quando um erro com payload for retornado pela mensageria
	 */
	@Override
	public Setor retrieveSetor(Setor.Id input, long timeout) {
		br.com.senior.furb.basico.impl.RetrieveSetorImpl impl = new br.com.senior.furb.basico.impl.RetrieveSetorImpl(messengerSupplier, userId, messageSupplier);
		return impl.retrieveSetor(input, timeout);
	}
	
	/**
	 * Chamada assíncrona para o método retrieveSetor
	 * This is a public operation
	 * The 'retrieve' request primitive for the Setor entity.
	 */
	@Override
	public void retrieveSetor(Setor.Id input) {
		br.com.senior.furb.basico.impl.RetrieveSetorImpl impl = new br.com.senior.furb.basico.impl.RetrieveSetorImpl(messengerSupplier, userId, messageSupplier);
		impl.retrieveSetor(input);
	}
	
	/**
	 * Chamada assíncrona para o método retrieveSetor
	 * This is a public operation
	 * The 'retrieve' request primitive for the Setor entity.
	 */
	@Override
	public CompletableFuture<Setor> retrieveSetorRequest(Setor.Id input) {
		br.com.senior.furb.basico.impl.RetrieveSetorImpl impl = new br.com.senior.furb.basico.impl.RetrieveSetorImpl(messengerSupplier, userId, messageSupplier);
		return impl.retrieveSetorRequest(input);
	}
	/**
	 * Chamada síncrona para o método updateSetor
	 * This is a public operation
	 * The 'update' request primitive for the Setor entity.
	 * @throws BasicoMessageException quando um erro com payload for retornado pela mensageria
	 */
	@Override
	public Setor updateSetor(Setor input, long timeout) {
		br.com.senior.furb.basico.impl.UpdateSetorImpl impl = new br.com.senior.furb.basico.impl.UpdateSetorImpl(messengerSupplier, userId, messageSupplier);
		return impl.updateSetor(input, timeout);
	}
	
	/**
	 * Chamada assíncrona para o método updateSetor
	 * This is a public operation
	 * The 'update' request primitive for the Setor entity.
	 */
	@Override
	public void updateSetor(Setor input) {
		br.com.senior.furb.basico.impl.UpdateSetorImpl impl = new br.com.senior.furb.basico.impl.UpdateSetorImpl(messengerSupplier, userId, messageSupplier);
		impl.updateSetor(input);
	}
	
	/**
	 * Chamada assíncrona para o método updateSetor
	 * This is a public operation
	 * The 'update' request primitive for the Setor entity.
	 */
	@Override
	public CompletableFuture<Setor> updateSetorRequest(Setor input) {
		br.com.senior.furb.basico.impl.UpdateSetorImpl impl = new br.com.senior.furb.basico.impl.UpdateSetorImpl(messengerSupplier, userId, messageSupplier);
		return impl.updateSetorRequest(input);
	}
	/**
	 * Chamada síncrona para o método updateMergeSetor
	 * This is a public operation
	 * The 'updateMerge' request primitive for the Setor entity.
	 * @throws BasicoMessageException quando um erro com payload for retornado pela mensageria
	 */
	@Override
	public Setor updateMergeSetor(Setor input, long timeout) {
		br.com.senior.furb.basico.impl.UpdateMergeSetorImpl impl = new br.com.senior.furb.basico.impl.UpdateMergeSetorImpl(messengerSupplier, userId, messageSupplier);
		return impl.updateMergeSetor(input, timeout);
	}
	
	/**
	 * Chamada assíncrona para o método updateMergeSetor
	 * This is a public operation
	 * The 'updateMerge' request primitive for the Setor entity.
	 */
	@Override
	public void updateMergeSetor(Setor input) {
		br.com.senior.furb.basico.impl.UpdateMergeSetorImpl impl = new br.com.senior.furb.basico.impl.UpdateMergeSetorImpl(messengerSupplier, userId, messageSupplier);
		impl.updateMergeSetor(input);
	}
	
	/**
	 * Chamada assíncrona para o método updateMergeSetor
	 * This is a public operation
	 * The 'updateMerge' request primitive for the Setor entity.
	 */
	@Override
	public CompletableFuture<Setor> updateMergeSetorRequest(Setor input) {
		br.com.senior.furb.basico.impl.UpdateMergeSetorImpl impl = new br.com.senior.furb.basico.impl.UpdateMergeSetorImpl(messengerSupplier, userId, messageSupplier);
		return impl.updateMergeSetorRequest(input);
	}
	/**
	 * Chamada síncrona para o método deleteSetor
	 * This is a public operation
	 * The 'delete' request primitive for the Setor entity.
	 * @throws BasicoMessageException quando um erro com payload for retornado pela mensageria
	 */
	@Override
	public void deleteSetor(Setor.Id input, long timeout) {
		br.com.senior.furb.basico.impl.DeleteSetorImpl impl = new br.com.senior.furb.basico.impl.DeleteSetorImpl(messengerSupplier, userId, messageSupplier);
		impl.deleteSetor(input, timeout);
	}
	
	/**
	 * Chamada assíncrona para o método deleteSetor
	 * This is a public operation
	 * The 'delete' request primitive for the Setor entity.
	 */
	@Override
	public void deleteSetor(Setor.Id input) {
		br.com.senior.furb.basico.impl.DeleteSetorImpl impl = new br.com.senior.furb.basico.impl.DeleteSetorImpl(messengerSupplier, userId, messageSupplier);
		impl.deleteSetor(input);
	}
	


	/**
	* Chamada assíncrona para o método publishServiceStarted
	* Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	*/
	public void publishServiceStarted( ServiceStartedPayload input ) {
	
		Message message = new Message(userId.getTenant(), BasicoConstants.DOMAIN, BasicoConstants.SERVICE, BasicoConstants.Events.SERVICE_STARTED, DtoJsonConverter.toJSON(input));
		try {
			addMessageHeaders(message);
			messengerSupplier.get().publish(message);
		} catch (Exception e) {
			throw new BasicoException("Erro ao enviar a mensagem", e);
		}
	}
	
	/**
	* Chamada assíncrona para o método publishNotifyUserEvent
	* Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	*/
	public void publishNotifyUserEvent( NotifyUserEventPayload input ) {
	
		Message message = new Message(userId.getTenant(), BasicoConstants.DOMAIN, BasicoConstants.SERVICE, BasicoConstants.Events.NOTIFY_USER_EVENT, DtoJsonConverter.toJSON(input));
		try {
			addMessageHeaders(message);
			messengerSupplier.get().publish(message);
		} catch (Exception e) {
			throw new BasicoException("Erro ao enviar a mensagem", e);
		}
	}
	
	/**
	* Chamada assíncrona para o método publishImportTipoEvent
	* This is a public operation
	*/
	public void publishImportTipoEvent( ImportTipoEventPayload input ) {
	
		Message message = new Message(userId.getTenant(), BasicoConstants.DOMAIN, BasicoConstants.SERVICE, BasicoConstants.Events.IMPORT_TIPO_EVENT, DtoJsonConverter.toJSON(input));
		try {
			addMessageHeaders(message);
			messengerSupplier.get().publish(message);
		} catch (Exception e) {
			throw new BasicoException("Erro ao enviar a mensagem", e);
		}
	}
	
	/**
	* Chamada assíncrona para o método publishExportTipoEvent
	* This is a public operation
	*/
	public void publishExportTipoEvent( ExportTipoEventPayload input ) {
	
		Message message = new Message(userId.getTenant(), BasicoConstants.DOMAIN, BasicoConstants.SERVICE, BasicoConstants.Events.EXPORT_TIPO_EVENT, DtoJsonConverter.toJSON(input));
		try {
			addMessageHeaders(message);
			messengerSupplier.get().publish(message);
		} catch (Exception e) {
			throw new BasicoException("Erro ao enviar a mensagem", e);
		}
	}
	
	/**
	* Chamada assíncrona para o método publishImportEventoEvent
	* This is a public operation
	*/
	public void publishImportEventoEvent( ImportEventoEventPayload input ) {
	
		Message message = new Message(userId.getTenant(), BasicoConstants.DOMAIN, BasicoConstants.SERVICE, BasicoConstants.Events.IMPORT_EVENTO_EVENT, DtoJsonConverter.toJSON(input));
		try {
			addMessageHeaders(message);
			messengerSupplier.get().publish(message);
		} catch (Exception e) {
			throw new BasicoException("Erro ao enviar a mensagem", e);
		}
	}
	
	/**
	* Chamada assíncrona para o método publishExportEventoEvent
	* This is a public operation
	*/
	public void publishExportEventoEvent( ExportEventoEventPayload input ) {
	
		Message message = new Message(userId.getTenant(), BasicoConstants.DOMAIN, BasicoConstants.SERVICE, BasicoConstants.Events.EXPORT_EVENTO_EVENT, DtoJsonConverter.toJSON(input));
		try {
			addMessageHeaders(message);
			messengerSupplier.get().publish(message);
		} catch (Exception e) {
			throw new BasicoException("Erro ao enviar a mensagem", e);
		}
	}
	
	/**
	* Chamada assíncrona para o método publishImportSalaEvent
	* This is a public operation
	*/
	public void publishImportSalaEvent( ImportSalaEventPayload input ) {
	
		Message message = new Message(userId.getTenant(), BasicoConstants.DOMAIN, BasicoConstants.SERVICE, BasicoConstants.Events.IMPORT_SALA_EVENT, DtoJsonConverter.toJSON(input));
		try {
			addMessageHeaders(message);
			messengerSupplier.get().publish(message);
		} catch (Exception e) {
			throw new BasicoException("Erro ao enviar a mensagem", e);
		}
	}
	
	/**
	* Chamada assíncrona para o método publishExportSalaEvent
	* This is a public operation
	*/
	public void publishExportSalaEvent( ExportSalaEventPayload input ) {
	
		Message message = new Message(userId.getTenant(), BasicoConstants.DOMAIN, BasicoConstants.SERVICE, BasicoConstants.Events.EXPORT_SALA_EVENT, DtoJsonConverter.toJSON(input));
		try {
			addMessageHeaders(message);
			messengerSupplier.get().publish(message);
		} catch (Exception e) {
			throw new BasicoException("Erro ao enviar a mensagem", e);
		}
	}
	
	/**
	* Chamada assíncrona para o método publishImportSetorEvent
	* This is a public operation
	*/
	public void publishImportSetorEvent( ImportSetorEventPayload input ) {
	
		Message message = new Message(userId.getTenant(), BasicoConstants.DOMAIN, BasicoConstants.SERVICE, BasicoConstants.Events.IMPORT_SETOR_EVENT, DtoJsonConverter.toJSON(input));
		try {
			addMessageHeaders(message);
			messengerSupplier.get().publish(message);
		} catch (Exception e) {
			throw new BasicoException("Erro ao enviar a mensagem", e);
		}
	}
	
	/**
	* Chamada assíncrona para o método publishExportSetorEvent
	* This is a public operation
	*/
	public void publishExportSetorEvent( ExportSetorEventPayload input ) {
	
		Message message = new Message(userId.getTenant(), BasicoConstants.DOMAIN, BasicoConstants.SERVICE, BasicoConstants.Events.EXPORT_SETOR_EVENT, DtoJsonConverter.toJSON(input));
		try {
			addMessageHeaders(message);
			messengerSupplier.get().publish(message);
		} catch (Exception e) {
			throw new BasicoException("Erro ao enviar a mensagem", e);
		}
	}
	

	private void addMessageHeaders(Message message) {
		message.setUsername(userId.getUsername());
		if (userId.isTrusted()) {
			message.addHeader("trusted", true);
		}
	}
}
