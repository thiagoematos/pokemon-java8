package demo;

import model.Trainer;
import util.TrainerFactory;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class E_Stream_filter_map_Collectors_toList {

    public static void main(String[] args) {
        List<Trainer> trainers = TrainerFactory.getCharactersOfFirstSeason();

        List<String> classificados = obterNomeDosTreinadoresClassificados(trainers);
        imprimirNomeDosClassificados(classificados);
    }

    private static List<String> obterNomeDosTreinadoresClassificados(List<Trainer> trainers) {
        //return java6(trainers);
        return java8(trainers);
    }

    private static List<String> java6(List<Trainer> trainers) {
        List<String> classifiedTrainers = new ArrayList<>();
        for (Trainer trainer : trainers) {
            if (trainer.getPokemons().size() > 3) {
                classifiedTrainers.add(trainer.getName());
            }
        }
        return classifiedTrainers;
    }

    private static List<String> java8(List<Trainer> trainers) {
        return trainers.stream()
                .filter(trainer -> trainer.getPokemons().size() > 3)
                .map(Trainer::getName)
                .collect(Collectors.toList());
    }

    private static void imprimirNomeDosClassificados(List<String> classificados) {
        // Java 6
        for (String nomeDoClassificado : classificados) {
            System.out.println(nomeDoClassificado);
        }
        // ou Java 8 (Default Method/Method Reference)
        classificados.forEach(System.out::println);
    }

}
