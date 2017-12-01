package demo;

import model.Pokemon;
import model.Treinador;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

public class F_Stream_flatMap_distinct {

    public static void imprimirPokemons(Collection<Treinador> treinadores) {
        Set<Pokemon> pokemons = obterPokemons(treinadores);
        for (Pokemon pokemon : pokemons) {
            System.out.println(pokemon);
        }
    }

    static Set<Pokemon> obterPokemons(Collection<Treinador> treinadores) {
        Set<Pokemon> resultado = new HashSet<Pokemon>();
        for (Treinador treinador : treinadores) {
            resultado.addAll(
                    treinador.getPokemons()
            );
        }
        return resultado;
    }

}
