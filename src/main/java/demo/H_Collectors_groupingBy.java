package demo;

import model.Pokemon;
import model.Trainer;
import model.Type;
import util.TrainerFactory;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import static demo.G_Stream_flatMap_distinct.obterPokemons;

public class H_Collectors_groupingBy {

    public static void main(String[] args) {
        List<Trainer> trainers = TrainerFactory.getCharactersOfFirstSeason();
        List<Pokemon> pokemons = obterPokemons(trainers);

        Map<Type, List<Pokemon>> pokemonsByType = categorizarPokemonsPorTipo(pokemons);
        pokemonsByType.forEach((type, pokemonList) -> System.out.println(type + " " + pokemonList));
    }

    private static Map<Type, List<Pokemon>> categorizarPokemonsPorTipo(List<Pokemon> pokemons) {
        return java6(pokemons);
        // return java8(pokemons);
    }

    private static Map<Type, List<Pokemon>> java6(List<Pokemon> pokemons) {
        Map<Type, List<Pokemon>> result = new HashMap<>();
        for (Pokemon pokemon : pokemons) {
            if (!result.containsKey(pokemon.getType())) {
                result.put(pokemon.getType(), new ArrayList<>());
            }
            result.get(pokemon.getType()).add(pokemon);
        }
        return result;
    }

    private static Map<Type, List<Pokemon>> java8(List<Pokemon> pokemons) {
        return pokemons
                .stream()
                .collect(Collectors.groupingBy(Pokemon::getType));
    }

}
