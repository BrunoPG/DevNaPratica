/**
 * This is a generated file. DO NOT EDIT ANY CODE HERE, YOUR CHANGES WILL BE LOST.
 */
package br.com.senior.furb.basico;

import br.com.senior.messaging.model.*;

/**
 * The 'updateMerge' request primitive for the Setor entity.
 */
@CommandDescription(name="updateMergeSetor", kind=CommandKind.UpdateMerge, requestPrimitive="updateMergeSetor", responsePrimitive="updateMergeSetorResponse")
public interface UpdateMergeSetor extends MessageHandler {
    
    public Setor updateMergeSetor(Setor toUpdateMerge);
    
}
