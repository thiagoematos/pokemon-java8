package demo;

import model.Pokemon;
import model.Treinador;

import java.util.Collection;

public class A_Lambda {

    public static void imprimirNomes(Collection<Treinador> treinadores,
                                     Collection<Pokemon> pokemons) {
        for (Treinador treinador : treinadores) {
            System.out.println(treinador.getNome());
        }
        for (Pokemon pokemon : pokemons) {
            System.out.println(pokemon);
        }
    }

}
