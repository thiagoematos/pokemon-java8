package util;

import model.Trainer;

@FunctionalInterface
public interface LeagueValidator {

    boolean validate(Trainer trainer);

    default void printResultFor(Trainer trainer) {
        if (this.validate(trainer)) {
            System.out.println("Classified :)");
        } else {
            System.out.println("Disqualified :(");
        }
    }

}
