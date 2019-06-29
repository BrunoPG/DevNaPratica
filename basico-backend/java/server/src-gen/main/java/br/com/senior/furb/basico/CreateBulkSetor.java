/**
 * This is a generated file. DO NOT EDIT ANY CODE HERE, YOUR CHANGES WILL BE LOST.
 */
package br.com.senior.furb.basico;

import br.com.senior.messaging.model.*;

@CommandDescription(name = "createBulkSetor", kind = CommandKind.Create, requestPrimitive = "createBulkSetor", responsePrimitive="")
public interface CreateBulkSetor extends MessageHandler {
    public CreateBulkSetorOutput createBulkSetor(CreateBulkSetorInput toCreate);
}
