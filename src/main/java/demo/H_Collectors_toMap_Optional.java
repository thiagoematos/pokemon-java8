package demo;

import model.Pokemon;
import model.Treinador;

import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static demo.F_Stream_flatMap_distinct.obterPokemons;

public class H_Collectors_toMap_Optional {

    public static void imprimirPokemonEsuaEvolucao(List<Treinador> treinadores) {
        Collection<Pokemon> pokemons = obterPokemons(treinadores);
        Map<Pokemon, Pokemon> mapaDasEvolucoes = mapearEvolucao(pokemons);
        imprimir(mapaDasEvolucoes);
    }

    private static Map<Pokemon, Pokemon> mapearEvolucao(Collection<Pokemon> pokemons) {
        Map<Pokemon, Pokemon> resultado = new HashMap<Pokemon, Pokemon>();
        for (Pokemon pokemon : pokemons) {
            resultado.put(pokemon, pokemon.getEvolucao());
        }
        return resultado;
    }

    private static void imprimir(Map<Pokemon, Pokemon> mapaDasEvolucoes) {
        for (Map.Entry<Pokemon, Pokemon> item : mapaDasEvolucoes.entrySet()) {
            Pokemon pokemon = item.getKey();
            Pokemon evolucao = item.getValue();
            if (evolucao == null) {
                System.out.println(pokemon + " não tem evolução");
            } else {
                System.out.println(pokemon + " evolui para " + evolucao);
            }
        }
    }

}
