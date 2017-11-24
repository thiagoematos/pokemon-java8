package demo;

import model.Trainer;
import util.TrainerFactory;

import java.util.List;

public class F_Stream_count {

    public static void main(String[] args) {
        List<Trainer> trainers = TrainerFactory.getCharactersOfFirstSeason();

        long quantityOfPokemons = obterQuantidadeDePokemons(trainers);
        System.out.print(quantityOfPokemons);
    }

    private static long obterQuantidadeDePokemons(List<Trainer> trainers) {
        return java6(trainers);
        //return java8(trainers);
    }

    private static int java6(List<Trainer> trainers) {
        int quantity = 0;
        for (Trainer trainer : trainers) {
            quantity += trainer.getPokemons().size();
        }
        return quantity;
    }

    private static long java8(List<Trainer> trainers) {
        return trainers
                .stream()
                .mapToLong(t -> t.getPokemons().size())
                .count();
    }

}
