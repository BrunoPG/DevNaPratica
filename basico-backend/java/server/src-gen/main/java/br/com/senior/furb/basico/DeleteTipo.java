/**
 * This is a generated file. DO NOT EDIT ANY CODE HERE, YOUR CHANGES WILL BE LOST.
 */
package br.com.senior.furb.basico;

import br.com.senior.messaging.model.*;

/**
 * The 'delete' request primitive for the Tipo entity.
 */
@CommandDescription(name="deleteTipo", kind=CommandKind.Delete, requestPrimitive="deleteTipo", responsePrimitive="deleteTipoResponse")
public interface DeleteTipo extends MessageHandler {
    
    public void deleteTipo(Tipo.Id id);
    
}
