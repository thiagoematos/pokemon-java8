package demo;

import model.Pokemon;
import model.Trainer;
import util.LeagueValidator;

public class B_FunctionalInterface_DefaultMethod {

    public static void main(String[] args) {
        Trainer joaozinho = new Trainer(
                "Joãozinho",
                new Pokemon[]{Pokemon.ARCANINE}
        );

        LeagueValidator indigoLeagueValidator = trainer -> trainer.getPokemons().size() > 3;
        LeagueValidator orangeLeagueValidator = trainer -> trainer.getName().startsWith("J");

        validarSeTreinadorPodeParticiparDaLiga(joaozinho, indigoLeagueValidator);
        validarSeTreinadorPodeParticiparDaLiga(joaozinho, orangeLeagueValidator);
    }

    private static void validarSeTreinadorPodeParticiparDaLiga(
            Trainer trainer,
            LeagueValidator leagueValidator) {
        leagueValidator.validate(trainer);
        leagueValidator.printResultFor(trainer);
    }

}
