/**
 * This is a generated file. DO NOT EDIT ANY CODE HERE, YOUR CHANGES WILL BE LOST.
 */
package br.com.senior.furb.basico;

import br.com.senior.messaging.model.*;

/**
 * The 'updateMerge' request primitive for the Sala entity.
 */
@CommandDescription(name="updateMergeSala", kind=CommandKind.UpdateMerge, requestPrimitive="updateMergeSala", responsePrimitive="updateMergeSalaResponse")
public interface UpdateMergeSala extends MessageHandler {
    
    public Sala updateMergeSala(Sala toUpdateMerge);
    
}
