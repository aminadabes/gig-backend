package com.tscomunidadegraca.gig.mapper;

import com.tscomunidadegraca.gig.dto.MembroDTO;
import com.tscomunidadegraca.gig.entity.Membro;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper
public interface MembroMapper {

    MembroMapper INSTANCE = Mappers.getMapper(MembroMapper.class);

    @Mapping(target = "data_nascimento", source = "data_nascimento", dateFormat = "dd/MM/yyyy")
    Membro toModel(MembroDTO membroDTO);

    MembroDTO toMembroDTO(Membro membro);
}
