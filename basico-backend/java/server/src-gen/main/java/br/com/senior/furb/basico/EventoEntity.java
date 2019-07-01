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
import javax.persistence.ManyToOne;
import javax.persistence.JoinColumn;
import java.util.Optional;
import java.util.HashSet;
import javax.persistence.ManyToMany;
import javax.persistence.CascadeType;

@Entity
@Table(name="evento")
public class EventoEntity {
	
	public static final String SECURITY_RESOURCE = "res://senior.com.br/furb/basico/entities/evento";

	@Id
	@GeneratedValue(generator = "uuid2")
	@GenericGenerator(name = "uuid2", strategy = "uuid2")
	@Column(name = "id", updatable = false)
	private java.util.UUID id;
	
	@Column(name = "nome")
	private String nome;
	
	@Column(name = "descricao")
	private String descricao;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "tipo")
	private TipoEntity tipo;
	
	@ManyToMany(fetch = FetchType.LAZY, cascade = {CascadeType.PERSIST}, mappedBy = "evento")
	private java.util.Set<SalaEntity> salas = new HashSet<>();
	
	public java.util.UUID getId() {
		return id;
	}
	
	public String getNome() {
		return nome;
	}
	
	public String getDescricao() {
		return descricao;
	}
	
	public TipoEntity getTipo() {
		return tipo;
	}
	
	public java.util.Set<SalaEntity> getSalas() {
		return salas;
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
	
	public void setTipo(TipoEntity tipo) {
		this.tipo = tipo;
	}
	
	public void setSalas(List<SalaEntity> salas) {
		if (salas != null) {
			salas.forEach(this::addToSalas);
		} else {
			final Set<SalaEntity> current = new LinkedHashSet<SalaEntity>();
			current.addAll(this.salas);
			current.forEach(this::removeFromSalas);
		}
	}
	
	public void addToSalas(SalaEntity salaEntity) {
		salaEntity.addToEvento(this);
	}
	
	public SalaEntity getFromSalas(java.util.UUID salaEntityId) {
		Optional<SalaEntity> entity = salas.stream().filter(e -> e.getId().equals(salaEntityId)).findFirst();
		if (entity.isPresent()) {
			return entity.get();
		}
		return null;
	}
	
	public void removeFromSalas(SalaEntity salaEntity) {
		salaEntity.removeFromEvento(this);
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
	    if (!(obj instanceof EventoEntity)) {
	        return false;
	    }
	    EventoEntity other = (EventoEntity) obj;
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
		sb.append("tipo=<");
		if (tipo == null) {
			sb.append("null");
		} else {
			tipo.toString(sb, appended);
		}
		sb.append('>').append(", ");
		sb.append("salas=<");
		if (salas == null) {
			sb.append("null");
		} else {
			sb.append('[');
			Iterator<SalaEntity> iterator = salas.iterator();
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
