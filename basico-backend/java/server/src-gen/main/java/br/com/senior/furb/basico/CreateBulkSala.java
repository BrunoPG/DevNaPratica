/**
 * This is a generated file. DO NOT EDIT ANY CODE HERE, YOUR CHANGES WILL BE LOST.
 */
package br.com.senior.furb.basico;

import br.com.senior.messaging.model.*;

@CommandDescription(name = "createBulkSala", kind = CommandKind.Create, requestPrimitive = "createBulkSala", responsePrimitive="")
public interface CreateBulkSala extends MessageHandler {
    public CreateBulkSalaOutput createBulkSala(CreateBulkSalaInput toCreate);
}
