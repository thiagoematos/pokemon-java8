package demo;

import model.Pokemon;
import model.Treinador;
import util.GeradorDeTreinadores;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

import static demo.F_Stream_flatMap_distinct.obterPokemons;

public class H_Collectors_toMap_Optional {

    public static void main(String[] args) {
        List<Treinador> treinadores = GeradorDeTreinadores.obterPersonagensPrincipaisDaPrimeiraTemporada();
        List<Pokemon> pokemons = obterPokemons(treinadores);

        Map<Pokemon, Pokemon> pokemonEsuaEvolucaoJava6 = mapearEvolucaoJava6(pokemons);
        imprimirJava6(pokemonEsuaEvolucaoJava6);

        Map<Pokemon, Optional<Pokemon>> pokemonEsuaEvolucao = mapearEvolucaoJava8(pokemons);
        imprimirJava8(pokemonEsuaEvolucao);
    }

    private static Map<Pokemon, Pokemon> mapearEvolucaoJava6(List<Pokemon> pokemons) {
        Map<Pokemon, Pokemon> resultado = new HashMap<>();
        for (Pokemon pokemon : pokemons) {
            resultado.put(pokemon, pokemon.getEvolucaoJava6());
        }
        return resultado;
    }

    private static void imprimirJava6(Map<Pokemon, Pokemon> pokemonEsuaEvolucao) {
        for (Map.Entry<Pokemon, Pokemon> tupla : pokemonEsuaEvolucao.entrySet()) {
            Pokemon pokemon = tupla.getKey();
            Pokemon evolucao = tupla.getValue();
            if (evolucao == null) {
                System.out.println(pokemon + " não tem evolução");
            } else {
                System.out.println(pokemon + " evolui para " + evolucao);
            }
        }
    }

    private static Map<Pokemon, Optional<Pokemon>> mapearEvolucaoJava8(List<Pokemon> pokemons) {
        return pokemons
                .stream()
                .collect(Collectors.toMap(p -> p, Pokemon::getEvolucao));
    }

    private static void imprimirJava8(Map<Pokemon, Optional<Pokemon>> pokemonEsuaEvolucao) {
        pokemonEsuaEvolucao
                .entrySet()
                .stream()
                .map(tupla -> {
                    Pokemon pokemon = tupla.getKey();
                    Optional<Pokemon> possivelEvolucao = tupla.getValue();

                    String mensagemSeEvoluiu = possivelEvolucao
                            .map(evolucao -> " evolui para " + evolucao)
                            .orElse(" não tem evolução!");

                    return pokemon + mensagemSeEvoluiu;
                })
                .forEach(System.out::println);
    }

}
