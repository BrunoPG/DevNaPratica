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

@Component("furb.basico.SalaDTOConverter")
@Lazy
public class SalaDTOConverter extends EntityDTOConverter {

	@Autowired
	private SetorDTOConverter setorConverter;
	@Autowired
	private EventoDTOConverter eventoConverter;

	@Override
	public void setupMapperToEntity(ModelMapper mapper, ConversionContext conversionContext) {
		Converter <List<Setor>, List<SetorEntity>> setoresConverter = new ContextualizedConverter<List<Setor>, List<SetorEntity>>() {
			@Override
			public List<SetorEntity> convert(List<Setor> source) {
				if (source == null) {
					return Collections.emptyList();
				}
				return source.stream().map(d -> toEntity(d, SetorEntity.class, conversionContext)).collect(Collectors.toList());
			}
		};
		Converter<List<Evento>, List<EventoEntity>> eventoConverter = new ContextualizedConverter<List<Evento>, List<EventoEntity>>() {
		    @Override
		    public List<EventoEntity> convert(List<Evento> source) {
		    	if (source == null) {
		    		return Collections.emptyList();
		    	}
		        Set<EventoEntity> converted = new LinkedHashSet<>(source.size());
		        for (Evento dto : source) {
		            if (conversionContext.getConverted().containsKey(dto)) {
		                converted.add((EventoEntity) conversionContext.getConverted().get(dto));
		            } else {
						converted.add(toDTO(dto, EventoEntity.class, conversionContext.getRelationshipFields("evento"), conversionContext));
		            }
		        }
		        return new ArrayList<>(converted);
		    }
		};

		PropertyMap<Sala, SalaEntity> salaMap = new PropertyMap<Sala, SalaEntity>() {
			@Override
			protected void configure() {
				using(setoresConverter).map(source.setores).setSetores(null);
				using(eventoConverter).map(source.evento).setEvento(null);
			}
		};
		mapper.addMappings(salaMap);
		if (mapper.getTypeMap(Setor.class, SetorEntity.class) == null) {
			this.setorConverter.setupMapperToEntity(mapper, conversionContext);
		}
		if (mapper.getTypeMap(Evento.class, EventoEntity.class) == null) {
			this.eventoConverter.setupMapperToEntity(mapper, conversionContext);
		}
		mapper.getTypeMap(Sala.class, SalaEntity.class).setPropertyCondition(new ConvertedObjectCondition(conversionContext));
	}

	@Override
	public void setupMapperToDTO(ModelMapper mapper, ConversionContext conversionContext) {
		
		Converter <List<SetorEntity>, List<Setor>> setoresConverter = new ContextualizedConverter<List<SetorEntity>, List<Setor>>() {
			@Override
			public List<Setor> convert(List<SetorEntity> source) {
				if (conversionContext.isIncludeTranslations()) {
					return source.stream().map(e -> toDTOWithTranslations(e, Setor.class, conversionContext.getRelationshipFields("setores"), conversionContext)).collect(Collectors.toList());
				}
				return source.stream().map(e -> toDTO(e, Setor.class, conversionContext.getRelationshipFields("setores"), conversionContext)).collect(Collectors.toList());
			}
		};
		
		
		Converter<Set<EventoEntity>, List<Evento>> eventoConverter = new ContextualizedConverter<Set<EventoEntity>, List<Evento>>() {
		    @Override
		    public List<Evento> convert(Set<EventoEntity> source) {
		        List<Evento> converted = new ArrayList<>(source.size());
		        for (EventoEntity entity : source) {
		            if (conversionContext.getConverted().containsKey(entity)) {
		                converted.add((Evento) conversionContext.getConverted().get(entity));
		            } else {
		                if (conversionContext.isIncludeTranslations()) {
		                	converted.add(toDTOWithTranslations(entity, Evento.class, conversionContext.getRelationshipFields("evento"), conversionContext));
		                } else {
		                	converted.add(toDTO(entity, Evento.class, conversionContext.getRelationshipFields("evento"), conversionContext));
		                }
		            }
		        }
		        return converted;
		    }
		};
		
		//eager relationships
		PropertyMap<SalaEntity, Sala> salaMap = new PropertyMap<SalaEntity, Sala>() {
			@Override
			public void configure() {
				using(setoresConverter).map(source.getSetores(), destination.setores);
				using(eventoConverter).map(source.getEvento(), destination.evento);
			}
		};
		//lazy relationships
		
		mapper.addMappings(salaMap);
		
		if (mapper.getTypeMap(SetorEntity.class, Setor.class) == null) {
		    this.setorConverter.setupMapperToDTO(mapper, conversionContext);
		}
		if (mapper.getTypeMap(EventoEntity.class, Evento.class) == null) {
		    this.eventoConverter.setupMapperToDTO(mapper, conversionContext);
		}
		mapper.getTypeMap(SalaEntity.class, Sala.class).setPropertyCondition(new ConvertedObjectCondition(conversionContext));
	}
}
