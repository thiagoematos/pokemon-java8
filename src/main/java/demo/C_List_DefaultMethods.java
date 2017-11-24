package demo;

import model.Trainer;
import util.TrainerFactory;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class C_List_DefaultMethods {

    public static void main(String[] args) {
        List<Trainer> trainers = TrainerFactory.getCharactersOfFirstSeason();
        ordenarTreinadoresPelaQuantidadeDePokemons(trainers);
    }

    private static void ordenarTreinadoresPelaQuantidadeDePokemons(List<Trainer> trainers) {
        java6(trainers);
        java8(trainers);
    }

    private static void java6(List<Trainer> trainers) {
        Collections.sort(trainers, new Comparator<Trainer>() {
            @Override
            public int compare(Trainer trainer1, Trainer trainer2) {
                return trainer1.getPokemons().size() - trainer2.getPokemons().size();
            }
        });
    }

    private static void java8(List<Trainer> trainers) {
        trainers.sort((trainer1, trainer2) -> trainer1.getPokemons().size() - trainer2.getPokemons().size());
        // ou melhor...
        trainers.sort(Comparator.comparing(trainer -> trainer.getPokemons().size()));
    }

}
