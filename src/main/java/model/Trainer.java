package model;

import java.util.Arrays;
import java.util.Collection;

public class Trainer {

    private String name;
    private Collection<Pokemon> pokemons;

    public Trainer(String name, Pokemon[] pokemons) {
        this.name = name;
        this.pokemons = Arrays.asList(pokemons);
    }

    public String getName() {
        return name;
    }

    public Collection<Pokemon> getPokemons() {
        return pokemons;
    }

}
