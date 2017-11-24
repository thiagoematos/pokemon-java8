package demo;

import model.Trainer;
import util.TrainerFactory;

import java.util.List;

public class A_Lambda {

    public static void main(String[] args) {
        List<Trainer> trainers = TrainerFactory.getCharactersOfFirstSeason();
        imprimirNomeDosTreinadores(trainers);
    }

    private static void imprimirNomeDosTreinadores(List<Trainer> trainers) {
        java6(trainers);
        java8(trainers);
    }

    private static void java6(List<Trainer> trainers) {
        for (Trainer trainer : trainers) {
            System.out.println(trainer.getName());
        }
    }

    private static void java8(List<Trainer> trainers) {
        trainers.forEach(trainer -> System.out.println(trainer.getName()));
    }

}
