package demo;

import model.Pokemon;
import model.Trainer;
import util.TrainerFactory;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class G_Stream_flatMap_distinct {

    public static void main(String[] args) {
        List<Trainer> trainers = TrainerFactory.getCharactersOfFirstSeason();

        List<Pokemon> pokemons = obterPokemons(trainers);
        pokemons.forEach(System.out::println);
    }

    static List<Pokemon> obterPokemons(List<Trainer> trainers) {
        return java6(trainers);
        //return java8(trainers);
    }

    private static List<Pokemon> java6(List<Trainer> trainers) {
        List<Pokemon> result = new ArrayList<>();
        for (Trainer trainer : trainers) {
            for (Pokemon pokemon : trainer.getPokemons()) {
                if (!result.contains(pokemon)) {
                    result.add(pokemon);
                }
            }
        }
        return result;
    }

    private static List<Pokemon> java8(List<Trainer> trainers) {
        return trainers.stream()
                .flatMap(t -> t.getPokemons().stream())
                .distinct()
                .collect(Collectors.toList());
    }

}
