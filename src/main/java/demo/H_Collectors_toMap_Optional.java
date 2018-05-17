package demo;

import model.Pokemon;
import model.Trainer;

import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static demo.F_Stream_flatMap_distinct.getPokemons;

public class H_Collectors_toMap_Optional {

    public static void printPokemonAndItsEvolution(List<Trainer> trainers) {
        Collection<Pokemon> pokemons = getPokemons(trainers);
        Map<Pokemon, Pokemon> evolutionsMap = mapEvolutions(pokemons);
        print(evolutionsMap);
    }

    private static Map<Pokemon, Pokemon> mapEvolutions(Collection<Pokemon> pokemons) {
        Map<Pokemon, Pokemon> result = new HashMap<Pokemon, Pokemon>();
        for (Pokemon pokemon : pokemons) {
            result.put(pokemon, pokemon.getEvolution());
        }
        return result;
    }

    private static void print(Map<Pokemon, Pokemon> evolutionsMap) {
        for (Map.Entry<Pokemon, Pokemon> item : evolutionsMap.entrySet()) {
            Pokemon pokemon = item.getKey();
            Pokemon evolution = item.getValue();
            if (evolution == null) {
                System.out.println(pokemon + " has no evolution");
            } else {
                System.out.println(pokemon + " evolves to " + evolution);
            }
        }
    }

}
