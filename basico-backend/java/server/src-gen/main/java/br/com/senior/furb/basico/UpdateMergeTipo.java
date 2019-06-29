/**
 * This is a generated file. DO NOT EDIT ANY CODE HERE, YOUR CHANGES WILL BE LOST.
 */
package br.com.senior.furb.basico;

import br.com.senior.messaging.model.*;

/**
 * The 'updateMerge' request primitive for the Tipo entity.
 */
@CommandDescription(name="updateMergeTipo", kind=CommandKind.UpdateMerge, requestPrimitive="updateMergeTipo", responsePrimitive="updateMergeTipoResponse")
public interface UpdateMergeTipo extends MessageHandler {
    
    public Tipo updateMergeTipo(Tipo toUpdateMerge);
    
}
