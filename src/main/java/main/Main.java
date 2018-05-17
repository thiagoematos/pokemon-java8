package main;

import demo.*;
import model.Pokemon;
import model.Trainer;
import util.TrainersFactory;

import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Trainer> trainers = TrainersFactory
                .get();

        System.out.println("Name of Trainers: ");
        A_Lambda.printNames(
                trainers,
                Arrays.asList(Pokemon.values())
        );

        System.out.println("Sort trainers by quantity of pokemons...");
        C_List_DefaultMethods_MethodReference.sortTrainerByNameAndQuantityOfPokemons(trainers);

        System.out.println("Classified trainers (more than 2 pokemons): ");
        D_Stream_filter_map_Collectors_toList.printNameOfClassifieds(trainers);

        System.out.println(
                "Total quantity of pokemons: " +
                        E_Stream_sum.getQuantityOfPokemons(trainers)
        );

        System.out.println("Pokemons:");
        F_Stream_flatMap_distinct.printPokemons(trainers);

        System.out.println("Pokemons grouped by type:");
        G_Collectors_groupingBy.printPokemonsGroupedByType(trainers);

        System.out.println("Pokemon e its evolution:");
        H_Collectors_toMap_Optional.printPokemonAndItsEvolution(trainers);
    }

}
