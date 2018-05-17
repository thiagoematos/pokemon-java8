package demo;

import model.Trainer;

import java.util.Collection;

public class E_Stream_sum {

    public static int getQuantityOfPokemons(Collection<Trainer> trainers) {
        int total = 0;
        for (Trainer trainer : trainers) {
            total += trainer.getPokemons().size();
        }
        return total;
    }

}
