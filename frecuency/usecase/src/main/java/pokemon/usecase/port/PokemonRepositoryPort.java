package pokemon.usecase.port;


import java.util.List;

public interface PokemonRepositoryPort {
    List<Pokemon> findAll();

}
