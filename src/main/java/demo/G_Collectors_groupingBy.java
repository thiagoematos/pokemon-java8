package demo;

import model.Pokemon;
import model.Type;
import model.Trainer;

import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class G_Collectors_groupingBy {

    public static void printPokemonsGroupedByType(Collection<Trainer> trainers) {
        Map<Type, Collection<Pokemon>> groups = groupedByType(F_Stream_flatMap_distinct.getPokemons(trainers));
        print(groups);
    }

    private static Map<Type, Collection<Pokemon>> groupedByType(Collection<Pokemon> pokemons) {
        Map<Type, Collection<Pokemon>> result = new HashMap<Type, Collection<Pokemon>>();
        for (Pokemon pokemon : pokemons) {
            if (!result.containsKey(pokemon.getType())) {
                result.put(pokemon.getType(), new HashSet<>());
            }
            result.get(pokemon.getType()).add(pokemon);
        }
        return result;
    }

    private static void print(Map<Type, Collection<Pokemon>> groups) {
        for (Map.Entry<Type, Collection<Pokemon>> group : groups.entrySet()) {
            Type type = group.getKey();
            Collection<Pokemon> pokemons = group.getValue();
            System.out.println(type + " " + pokemons);
        }
    }

}
