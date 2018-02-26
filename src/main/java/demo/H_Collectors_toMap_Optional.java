package demo;

import model.Pokemon;
import model.Treinador;

import java.util.List;
import java.util.stream.Collectors;

public class H_Collectors_toMap_Optional {

    public static void imprimirPokemonEsuaEvolucao(List<Treinador> treinadores) {
        treinadores.stream()
                .flatMap(treinador -> treinador.getPokemons().stream())
                .collect(Collectors.toMap(pokemon -> pokemon, Pokemon::getPossivelEvolucao))
                .forEach((pokemon, possivelEvolucao) -> {
                    String msg = possivelEvolucao
                            .map(evolucao -> " evolui para " + possivelEvolucao)
                            .orElse(" não tem evolução");
                    System.out.println(pokemon + msg);
                });
    }

}
