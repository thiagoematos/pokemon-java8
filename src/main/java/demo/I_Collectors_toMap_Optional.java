package demo;

import model.Pokemon;
import model.Trainer;
import util.TrainerFactory;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

import static demo.G_Stream_flatMap_distinct.obterPokemons;

public class I_Collectors_toMap_Optional {


    public static void main(String[] args) {
        List<Trainer> trainers = TrainerFactory.getCharactersOfFirstSeason();
        List<Pokemon> pokemons = obterPokemons(trainers);

        Map<Pokemon, Pokemon> pokemonAndItsEvolutionJava6 = mapearEvolucaoJava6(pokemons);
        imprimirJava6(pokemonAndItsEvolutionJava6);

        Map<Pokemon, Optional<Pokemon>> pokemonAndItsEvolution = mapearEvolucaoJava8(pokemons);
        imprimirJava8(pokemonAndItsEvolution);
    }

    private static Map<Pokemon, Pokemon> mapearEvolucaoJava6(List<Pokemon> pokemons) {
        Map<Pokemon, Pokemon> result = new HashMap<>();
        for (Pokemon pokemon : pokemons) {
            result.put(pokemon, pokemon.getNextJava6());
        }
        return result;
    }

    private static void imprimirJava6(Map<Pokemon, Pokemon> pokemonAndItsEvolution) {
        for (Map.Entry<Pokemon, Pokemon> entry : pokemonAndItsEvolution.entrySet()) {
            Pokemon pokemon = entry.getKey();
            Pokemon evolution = entry.getValue();
            if (evolution == null) {
                System.out.println(pokemon + " não tem evolução");
            } else {
                System.out.println(pokemon + " evolui para " + evolution);
            }
        }
    }

    private static Map<Pokemon, Optional<Pokemon>> mapearEvolucaoJava8(List<Pokemon> pokemons) {
        return pokemons
                .stream()
                .collect(Collectors.toMap(p -> p, Pokemon::getNext));
    }

    private static void imprimirJava8(Map<Pokemon, Optional<Pokemon>> pokemonAndItsEvolution) {
        pokemonAndItsEvolution
                .entrySet()
                .stream()
                .map(entry -> {
                    Pokemon givenPokemon = entry.getKey();
                    Optional<Pokemon> possibleEvolution = entry.getValue();

                    String messageIfPokemonEvolves = possibleEvolution
                            .map(evolution -> " evolui para " + evolution)
                            .orElse(" não tem evolução!");
                    return givenPokemon + messageIfPokemonEvolves;
                })
                .forEach(System.out::println);
    }

}
