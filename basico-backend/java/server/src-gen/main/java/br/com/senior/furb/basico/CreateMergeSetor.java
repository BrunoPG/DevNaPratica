/**
 * This is a generated file. DO NOT EDIT ANY CODE HERE, YOUR CHANGES WILL BE LOST.
 */
package br.com.senior.furb.basico;

import br.com.senior.messaging.model.*;

/**
 * The 'createMerge' request primitive for the Setor entity.
 */
@CommandDescription(name="createMergeSetor", kind=CommandKind.CreateMerge, requestPrimitive="createMergeSetor", responsePrimitive="createMergeSetorResponse")
public interface CreateMergeSetor extends MessageHandler {
    
    public Setor createMergeSetor(Setor toCreateMerge);
    
}
