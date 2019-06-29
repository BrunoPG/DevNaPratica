/**
 * This is a generated file. DO NOT EDIT ANY CODE HERE, YOUR CHANGES WILL BE LOST.
 */
package br.com.senior.furb.basico;

import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.stream.Collectors;

import org.modelmapper.Converter;
import org.modelmapper.ModelMapper;
import org.modelmapper.PropertyMap;

import br.com.senior.custom.ConversionContext;
import br.com.senior.custom.ConvertedObjectCondition;

import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;

import br.com.senior.custom.EntityDTOConverter;

@Component("furb.basico.EventoDTOConverter")
@Lazy
public class EventoDTOConverter extends EntityDTOConverter {

	@Autowired
	private TipoDTOConverter tipoConverter;
	@Autowired
	private SalaDTOConverter salaConverter;

	@Override
	public void setupMapperToEntity(ModelMapper mapper, ConversionContext conversionContext) {
		Converter<Tipo, TipoEntity> tipoConverter = new ContextualizedConverter<Tipo, TipoEntity>() {
			@Override
			public TipoEntity convert(Tipo source) {
				return toEntity(source, TipoEntity.class, conversionContext);
			}
		};
		Converter<List<Sala>, List<SalaEntity>> salasConverter = new ContextualizedConverter<List<Sala>, List<SalaEntity>>() {
		    @Override
		    public List<SalaEntity> convert(List<Sala> source) {
		    	if (source == null) {
		    		return Collections.emptyList();
		    	}
		        Set<SalaEntity> converted = new LinkedHashSet<>(source.size());
		        for (Sala dto : source) {
		            if (conversionContext.getConverted().containsKey(dto)) {
		                converted.add((SalaEntity) conversionContext.getConverted().get(dto));
		            } else {
						converted.add(toDTO(dto, SalaEntity.class, conversionContext.getRelationshipFields("salas"), conversionContext));
		            }
		        }
		        return new ArrayList<>(converted);
		    }
		};

		PropertyMap<Evento, EventoEntity> eventoMap = new PropertyMap<Evento, EventoEntity>() {
			@Override
			protected void configure() {
				using(tipoConverter).map(source.tipo).setTipo(null);
				using(salasConverter).map(source.salas).setSalas(null);
			}
		};
		mapper.addMappings(eventoMap);
		if (mapper.getTypeMap(Tipo.class, TipoEntity.class) == null) {
			this.tipoConverter.setupMapperToEntity(mapper, conversionContext);
		}
		if (mapper.getTypeMap(Sala.class, SalaEntity.class) == null) {
			this.salaConverter.setupMapperToEntity(mapper, conversionContext);
		}
		mapper.getTypeMap(Evento.class, EventoEntity.class).setPropertyCondition(new ConvertedObjectCondition(conversionContext));
	}

	@Override
	public void setupMapperToDTO(ModelMapper mapper, ConversionContext conversionContext) {
		
		Converter<TipoEntity, Tipo> tipoConverter = new ContextualizedConverter<TipoEntity, Tipo>() {
			@Override
			public Tipo convert(TipoEntity source) {
				if (conversionContext.isIncludeTranslations()) {
					return toDTOWithTranslations(source, Tipo.class, conversionContext.getRelationshipFields("tipo"), conversionContext);
				}
				return toDTO(source, Tipo.class, conversionContext.getRelationshipFields("tipo"), conversionContext);
			}
		};
		
		
		Converter<Set<SalaEntity>, List<Sala>> salasConverter = new ContextualizedConverter<Set<SalaEntity>, List<Sala>>() {
		    @Override
		    public List<Sala> convert(Set<SalaEntity> source) {
		        List<Sala> converted = new ArrayList<>(source.size());
		        for (SalaEntity entity : source) {
		            if (conversionContext.getConverted().containsKey(entity)) {
		                converted.add((Sala) conversionContext.getConverted().get(entity));
		            } else {
		                if (conversionContext.isIncludeTranslations()) {
		                	converted.add(toDTOWithTranslations(entity, Sala.class, conversionContext.getRelationshipFields("salas"), conversionContext));
		                } else {
		                	converted.add(toDTO(entity, Sala.class, conversionContext.getRelationshipFields("salas"), conversionContext));
		                }
		            }
		        }
		        return converted;
		    }
		};
		
		//eager relationships
		PropertyMap<EventoEntity, Evento> eventoMap = new PropertyMap<EventoEntity, Evento>() {
			@Override
			public void configure() {
				using(tipoConverter).map(source.getTipo(), destination.tipo);
				using(salasConverter).map(source.getSalas(), destination.salas);
			}
		};
		//lazy relationships
		
		mapper.addMappings(eventoMap);
		
		if (mapper.getTypeMap(TipoEntity.class, Tipo.class) == null) {
		    this.tipoConverter.setupMapperToDTO(mapper, conversionContext);
		}
		if (mapper.getTypeMap(SalaEntity.class, Sala.class) == null) {
		    this.salaConverter.setupMapperToDTO(mapper, conversionContext);
		}
		mapper.getTypeMap(EventoEntity.class, Evento.class).setPropertyCondition(new ConvertedObjectCondition(conversionContext));
	}
}
