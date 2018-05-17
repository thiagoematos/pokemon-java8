package demo;

import model.Pokemon;
import model.Trainer;

import java.util.Collection;

public class A_Lambda {

    public static void printNames(Collection<Trainer> trainers,
                                  Collection<Pokemon> pokemons) {
        for (Trainer trainer : trainers) {
            System.out.println(trainer.getName());
        }
        for (Pokemon pokemon : pokemons) {
            System.out.println(pokemon);
        }
    }

}
