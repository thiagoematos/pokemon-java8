package demo;

import model.Pokemon;
import model.Trainer;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

public class F_Stream_flatMap_distinct {

    public static void printPokemons(Collection<Trainer> trainers) {
        Set<Pokemon> pokemons = getPokemons(trainers);
        for (Pokemon pokemon : pokemons) {
            System.out.println(pokemon);
        }
    }

    static Set<Pokemon> getPokemons(Collection<Trainer> trainers) {
        Set<Pokemon> result = new HashSet<Pokemon>();
        for (Trainer trainer : trainers) {
            result.addAll(
                    trainer.getPokemons()
            );
        }
        return result;
    }

}
