package model;

import java.util.Arrays;
import java.util.Collection;

public class Treinador {

    private String nome;
    private Collection<Pokemon> pokemons;

    public Treinador(String nome, Pokemon[] pokemons) {
        this.nome = nome;
        this.pokemons = Arrays.asList(pokemons);
    }

    public String getNome() {
        return nome;
    }

    public Collection<Pokemon> getPokemons() {
        return pokemons;
    }

}
