package demo;

import model.Pokemon;
import model.Treinador;

import java.util.Collection;

public class A_Lambda {

    public static void imprimirNomes(Collection<Treinador> treinadores,
                                     Collection<Pokemon> pokemons) {
        treinadores.forEach(treinador -> System.out.println(treinador.getNome()));
        pokemons.forEach(pokemon -> System.out.println(pokemon));
    }

}
