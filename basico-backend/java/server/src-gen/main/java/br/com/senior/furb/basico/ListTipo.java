/**
 * This is a generated file. DO NOT EDIT ANY CODE HERE, YOUR CHANGES WILL BE LOST.
 */
package br.com.senior.furb.basico;

import br.com.senior.messaging.model.*;

/**
 * The 'list' request primitive for the Tipo entity.
 */
@CommandDescription(name="listTipo", kind=CommandKind.List, requestPrimitive="listTipo", responsePrimitive="listTipoResponse")
public interface ListTipo extends MessageHandler {
    
    public Tipo.PagedResults listTipo(Tipo.PageRequest pageRequest);
    
}
