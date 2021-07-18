package mapper;

import PokemonFormat.PokemonFormat;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper
public interface PokemonMapper {
    PokemonMapper INSTANCE = Mappers.getMapper(PokemonMapper.class);

    @Mapping(source = "name", target = "name")
    PokemonFormat pokemonToFormat(Pokemon pokemon);

}
