/**
 * This is a generated file. DO NOT EDIT ANY CODE HERE, YOUR CHANGES WILL BE LOST.
 */
package br.com.senior.furb.basico;

import br.com.senior.messaging.model.*;

@CommandDescription(name = "createBulkTipo", kind = CommandKind.Create, requestPrimitive = "createBulkTipo", responsePrimitive="")
public interface CreateBulkTipo extends MessageHandler {
    public CreateBulkTipoOutput createBulkTipo(CreateBulkTipoInput toCreate);
}
