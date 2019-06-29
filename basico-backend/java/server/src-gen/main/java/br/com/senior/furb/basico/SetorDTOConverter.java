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

@Component("furb.basico.SetorDTOConverter")
@Lazy
public class SetorDTOConverter extends EntityDTOConverter {

	@Autowired
	private SalaDTOConverter salaConverter;

	@Override
	public void setupMapperToEntity(ModelMapper mapper, ConversionContext conversionContext) {
		Converter<Sala, SalaEntity> salaConverter = new ContextualizedConverter<Sala, SalaEntity>() {
			@Override
			public SalaEntity convert(Sala source) {
				return toEntity(source, SalaEntity.class, conversionContext);
			}
		};

		PropertyMap<Setor, SetorEntity> setorMap = new PropertyMap<Setor, SetorEntity>() {
			@Override
			protected void configure() {
				using(salaConverter).map(source.sala).setSala(null);
			}
		};
		mapper.addMappings(setorMap);
		if (mapper.getTypeMap(Sala.class, SalaEntity.class) == null) {
			this.salaConverter.setupMapperToEntity(mapper, conversionContext);
		}
		mapper.getTypeMap(Setor.class, SetorEntity.class).setPropertyCondition(new ConvertedObjectCondition(conversionContext));
	}

	@Override
	public void setupMapperToDTO(ModelMapper mapper, ConversionContext conversionContext) {
		
		Converter<SalaEntity, Sala> salaConverter = new ContextualizedConverter<SalaEntity, Sala>() {
			@Override
			public Sala convert(SalaEntity source) {
				if (conversionContext.isIncludeTranslations()) {
					return toDTOWithTranslations(source, Sala.class, conversionContext.getRelationshipFields("sala"), conversionContext);
				}
				return toDTO(source, Sala.class, conversionContext.getRelationshipFields("sala"), conversionContext);
			}
		};
		
		//eager relationships
		PropertyMap<SetorEntity, Setor> setorMap = new PropertyMap<SetorEntity, Setor>() {
			@Override
			public void configure() {
				using(salaConverter).map(source.getSala(), destination.sala);
			}
		};
		//lazy relationships
		
		mapper.addMappings(setorMap);
		
		if (mapper.getTypeMap(SalaEntity.class, Sala.class) == null) {
		    this.salaConverter.setupMapperToDTO(mapper, conversionContext);
		}
		mapper.getTypeMap(SetorEntity.class, Setor.class).setPropertyCondition(new ConvertedObjectCondition(conversionContext));
	}
}
