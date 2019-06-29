/**
 * This is a generated file. DO NOT EDIT ANY CODE HERE, YOUR CHANGES WILL BE LOST.
 */
package br.com.senior.furb.basico;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.LinkedHashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.GeneratedValue;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.FetchType;
import javax.persistence.OneToMany;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import java.util.Optional;
import java.util.LinkedHashSet;
import javax.persistence.ManyToMany;
import javax.persistence.CascadeType;

@Entity
@Table(name="sala")
public class SalaEntity {
	
	public static final String SECURITY_RESOURCE = "res://senior.com.br/furb/basico/entities/sala";

	@Id
	@GeneratedValue(generator = "uuid2")
	@GenericGenerator(name = "uuid2", strategy = "uuid2")
	@Column(name = "id", updatable = false)
	private java.util.UUID id;
	
	@Column(name = "nome")
	private String nome;
	
	@Column(name = "descricao")
	private String descricao;
	
	@OneToMany(fetch = FetchType.LAZY)
	@JoinTable(name = "sala_setores",
	          joinColumns = @JoinColumn(name = "sala_id", referencedColumnName = "id"),
	          inverseJoinColumns = @JoinColumn(name = "setores_id", referencedColumnName = "id"))
	private java.util.List<SetorEntity> setores;
	
	@ManyToMany(fetch = FetchType.LAZY, cascade = {CascadeType.PERSIST})
	@JoinTable(name = "sala_evento",
	          joinColumns = @JoinColumn(name = "sala_id", referencedColumnName = "id"),
	          inverseJoinColumns = @JoinColumn(name = "evento_id", referencedColumnName = "id"))
	private java.util.Set<EventoEntity> evento = new LinkedHashSet<>();
	
	public java.util.UUID getId() {
		return id;
	}
	
	public String getNome() {
		return nome;
	}
	
	public String getDescricao() {
		return descricao;
	}
	
	public java.util.List<SetorEntity> getSetores() {
		return setores;
	}
	
	public java.util.Set<EventoEntity> getEvento() {
		return evento;
	}
	
	public void setId(java.util.UUID id) {
		this.id = id;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	public void setSetores(java.util.List<SetorEntity> setores) {
		this.setores = setores;
	}
	
	public void setEvento(List<EventoEntity> evento) {
		if (evento != null) {
			evento.forEach(this::addToEvento);
		} else {
			final Set<EventoEntity> current = new LinkedHashSet<EventoEntity>();
			current.addAll(this.evento);
			current.forEach(this::removeFromEvento);
		}
	}
	
	public void addToEvento(EventoEntity eventoEntity) {
		if (eventoEntity.getId() == null || !evento.contains(eventoEntity)) {
			evento.add(eventoEntity);
			eventoEntity.getSalas().add(this);
		}
	}
	
	public EventoEntity getFromEvento(java.util.UUID eventoEntityId) {
		Optional<EventoEntity> entity = evento.stream().filter(e -> e.getId().equals(eventoEntityId)).findFirst();
		if (entity.isPresent()) {
			return entity.get();
		}
		return null;
	}
	
	public void removeFromEvento(EventoEntity eventoEntity) {
		evento.remove(eventoEntity);
		eventoEntity.getSalas().remove(this);
	}
	
	@Override
	public int hashCode() {
	    int ret = 1;
	    if (id != null) {
	        ret = 31 * ret + id.hashCode();
	    }
	    return ret;
	}
	
	@Override
	public boolean equals(Object obj) {
	    if (this == obj) {
	        return true;
	    }
	    if (!(obj instanceof SalaEntity)) {
	        return false;
	    }
	    SalaEntity other = (SalaEntity) obj;
	    if ((id == null) != (other.id == null)) {
	        return false;
	    }
	    if ((id != null) && !id.equals(other.id)) {
	        return false;
	    }
	    return true;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		toString(sb, new ArrayList<>());
		return sb.toString();
	}
	
	void toString(StringBuilder sb, List<Object> appended) {
		sb.append(getClass().getSimpleName()).append(" [");
		if (appended.contains(this)) {
			sb.append("<Previously appended object>").append(']');
			return;
		}
		appended.add(this);
		sb.append("id=").append(id == null ? "null" : id).append(", ");
		sb.append("nome=").append(nome == null ? "null" : nome).append(", ");
		sb.append("descricao=").append(descricao == null ? "null" : descricao).append(", ");
		sb.append("setores=<");
		if (setores == null) {
			sb.append("null");
		} else {
			sb.append('[');
			Iterator<SetorEntity> iterator = setores.iterator();
			while (iterator.hasNext()) {
				iterator.next().toString(sb, appended);
				if (iterator.hasNext()) {
					sb.append(", ");
				}
			}
			sb.append(']');
		}
		sb.append('>').append(", ");
		sb.append("evento=<");
		if (evento == null) {
			sb.append("null");
		} else {
			sb.append('[');
			Iterator<EventoEntity> iterator = evento.iterator();
			while (iterator.hasNext()) {
				iterator.next().toString(sb, appended);
				if (iterator.hasNext()) {
					sb.append(", ");
				}
			}
			sb.append(']');
		}
		sb.append('>');
		sb.append(']');
	}
	
}
