package demo;

import model.Trainer;
import util.TrainerFactory;

import java.util.Comparator;
import java.util.List;

public class D_MethodReference {

    public static void main(String[] args) {
        List<Trainer> trainers = TrainerFactory.getCharactersOfFirstSeason();
        ordenarTreinadoresPeloNome(trainers);
    }

    private static void ordenarTreinadoresPeloNome(List<Trainer> trainers) {
        trainers.sort(Comparator.comparing(trainer -> trainer.getName()));
        // ou melhor...
        trainers.sort(Comparator.comparing(Trainer::getName));
    }

}
