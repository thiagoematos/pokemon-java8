package demo;

import model.Trainer;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class C_List_DefaultMethods_MethodReference {

    public static void sortTrainerByNameAndQuantityOfPokemons(List<Trainer> trainers) {
        Collections.sort(trainers, new Comparator<Trainer>() {
            public int compare(Trainer trainer1, Trainer trainer2) {
                int comparingByName = trainer1.getName().compareTo(trainer2.getName());
                if (comparingByName == 0) {
                    int comparingByQuantity = trainer1.getPokemons().size() - trainer2.getPokemons().size();
                    return comparingByQuantity;
                }
                return comparingByName;
            }
        });
    }

}
