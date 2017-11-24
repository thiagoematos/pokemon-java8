package util;

import model.Pokemon;
import model.Treinador;

import java.util.Arrays;
import java.util.List;

public class GeradorDeTreinadores {

    public static List<Treinador> obterPersonagensPrincipaisDaPrimeiraTemporada() {
        Treinador ash = new Treinador(
                "Ash",
                new Pokemon[]{
                        Pokemon.PIKACHU,
                        Pokemon.BULBASAUR,
                        Pokemon.CHARMANDER,
                        Pokemon.SQUIRTLE
                }
        );

        Treinador misty = new Treinador(
                "Misty",
                new Pokemon[]{
                        Pokemon.NIDORAN_F,
                        Pokemon.PSYDUCK,
                        Pokemon.GROWLITHE
                }
        );

        Treinador brock = new Treinador(
                "Brock",
                new Pokemon[]{
                        Pokemon.RATTATA,
                        Pokemon.PORYGON
                }
        );

        return Arrays.asList(ash, misty, brock);
    }

}
