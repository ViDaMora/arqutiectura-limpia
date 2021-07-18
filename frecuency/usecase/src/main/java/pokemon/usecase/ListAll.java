package pokemon.usecase;

import pokemon.usecase.port.PokemonRepositoryPort;
import pokemon.usecase.base.UseCase;

import java.util.Optional;

public class ListAll extends UseCase<ListAll.Request, ListAll.Response>{
    private PokemonRepositoryPort documentRepository;

    @Override
    protected void executeUseCase(Request requestValues) {
        Optional.of(documentRepository.findAll())
                .map(documents -> {
                    emit().onSuccess(new ListAllPDFUseCase.Response(documents));
                    return documents;
                }).orElseGet(() -> {
            emit().onError(new RuntimeException("No se pudo realizar la tarea"));
            return null;
        });
    }

}
