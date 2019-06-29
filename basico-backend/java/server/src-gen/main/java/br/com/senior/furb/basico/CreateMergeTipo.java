/**
 * This is a generated file. DO NOT EDIT ANY CODE HERE, YOUR CHANGES WILL BE LOST.
 */
package br.com.senior.furb.basico;

import br.com.senior.messaging.model.*;

/**
 * The 'createMerge' request primitive for the Tipo entity.
 */
@CommandDescription(name="createMergeTipo", kind=CommandKind.CreateMerge, requestPrimitive="createMergeTipo", responsePrimitive="createMergeTipoResponse")
public interface CreateMergeTipo extends MessageHandler {
    
    public Tipo createMergeTipo(Tipo toCreateMerge);
    
}
