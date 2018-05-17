package util;

import model.Pokemon;
import model.Trainer;

import java.util.Arrays;
import java.util.List;

public class TrainersFactory {

    public static List<Trainer> get() {
        Trainer ash = new Trainer(
                "Ash",
                new Pokemon[]{
                        Pokemon.PIKACHU,
                        Pokemon.BULBASAUR,
                        Pokemon.CHARMANDER,
                        Pokemon.SQUIRTLE
                }
        );

        Trainer misty = new Trainer(
                "Misty",
                new Pokemon[]{
                        Pokemon.NIDORAN_F,
                        Pokemon.PSYDUCK,
                        Pokemon.GROWLITHE
                }
        );

        Trainer brock = new Trainer(
                "Brock",
                new Pokemon[]{
                        Pokemon.RATTATA,
                        Pokemon.PORYGON
                }
        );

        return Arrays.asList(ash, misty, brock);
    }

}
