package demo;

import model.Pokemon;
import model.Trainer;
import util.LeagueValidator;

public class B_FunctionalInterface_DefaultMethod {

    public static void main(String[] args) {
        Trainer john = new Trainer(
                "John",
                new Pokemon[]{Pokemon.ARCANINE}
        );

        LeagueValidator leagueIndigoValidator = new LeagueValidator() {
            public boolean isClassified(Trainer trainer) {
                return trainer.getPokemons().size() > 3;
            }
        };
        LeagueValidator leagueOrangeValidator = new LeagueValidator() {
            public boolean isClassified(Trainer trainer) {
                return trainer.getName().startsWith("J");
            }
        };

        validateIfTrainerCanParticipate(
                "Indigo League", john, leagueIndigoValidator);
        validateIfTrainerCanParticipate(
                "Orange League", john, leagueOrangeValidator);
    }

    private static void validateIfTrainerCanParticipate(
            String leagueName,
            Trainer trainer,
            LeagueValidator leagueValidator) {

        String result =
                leagueValidator.isClassified(trainer)
                        ? "CLASSIFIED :)"
                        : "DECLASSIFIED :(";

        System.out.println(leagueName);
        System.out.println(
                trainer.getName() + " is " + result
        );
    }

}
