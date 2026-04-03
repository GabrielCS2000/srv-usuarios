package br.com.statement.controller.mapper;

import br.com.statement.config.MappingConfig;
import br.com.statement.controller.dto.consumes.request.UsuariosPostDTO;
import br.com.statement.entity.Usuarios;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(config = MappingConfig.class)
public interface UsuariosMapper {
    @Mapping(target = "id", ignore = true)
    @Mapping(target = "dateCreated", ignore = true)
    Usuarios toDomain(UsuariosPostDTO dto);
}
