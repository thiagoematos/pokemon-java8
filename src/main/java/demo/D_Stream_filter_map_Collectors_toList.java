package demo;

import model.Trainer;

import java.util.ArrayList;
import java.util.Collection;

public class D_Stream_filter_map_Collectors_toList {

    public static void printNameOfClassifieds(Collection<Trainer> treinadores) {
        Collection<String> nameOfClassifieds = getNameOfClassifiedTrainers(treinadores);
        print(nameOfClassifieds);
    }

    private static Collection<String> getNameOfClassifiedTrainers(Collection<Trainer> trainers) {
        Collection<String> classifieds = new ArrayList<String>();
        for (Trainer trainer : trainers) {
            if (trainer.getPokemons().size() > 2) {
                classifieds.add(trainer.getName());
            }
        }
        return classifieds;
    }

    private static void print(Collection<String> classified) {
        for (String nameOfClassified : classified) {
            System.out.println(nameOfClassified);
        }
    }

}
