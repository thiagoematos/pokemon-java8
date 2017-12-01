package demo;

import model.Pokemon;
import model.Tipo;
import model.Treinador;

import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class G_Collectors_groupingBy {

    public static void imprimirPokemonsCategorizadosPorTipo(Collection<Treinador> treinadores) {
        Map<Tipo, Collection<Pokemon>> pokemonsPorTipo = categorizarPokemonsPorTipo(F_Stream_flatMap_distinct.obterPokemons(treinadores));
        imprimir(pokemonsPorTipo);
    }

    private static Map<Tipo, Collection<Pokemon>> categorizarPokemonsPorTipo(Collection<Pokemon> pokemons) {
        Map<Tipo, Collection<Pokemon>> resultado = new HashMap<Tipo, Collection<Pokemon>>();
        for (Pokemon pokemon : pokemons) {
            if (!resultado.containsKey(pokemon.getTipo())) {
                resultado.put(pokemon.getTipo(), new HashSet<>());
            }
            resultado.get(pokemon.getTipo()).add(pokemon);
        }
        return resultado;
    }

    private static void imprimir(Map<Tipo, Collection<Pokemon>> pokemonsPorTipo) {
        for (Map.Entry<Tipo, Collection<Pokemon>> tupla : pokemonsPorTipo.entrySet()) {
            Tipo tipo = tupla.getKey();
            Collection<Pokemon> pokemonList = tupla.getValue();
            System.out.println(tipo + " " + pokemonList);
        }
    }

}
