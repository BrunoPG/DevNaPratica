/**
 * This is a generated file. DO NOT EDIT ANY CODE HERE, YOUR CHANGES WILL BE LOST.
 */
package br.com.senior.furb.basico;

import br.com.senior.messaging.model.*;

/**
 * The 'createMerge' request primitive for the Sala entity.
 */
@CommandDescription(name="createMergeSala", kind=CommandKind.CreateMerge, requestPrimitive="createMergeSala", responsePrimitive="createMergeSalaResponse")
public interface CreateMergeSala extends MessageHandler {
    
    public Sala createMergeSala(Sala toCreateMerge);
    
}
