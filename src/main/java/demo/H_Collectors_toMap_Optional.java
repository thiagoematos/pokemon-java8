package demo;

import model.Pokemon;
import model.Treinador;
import util.GeradorDeTreinadores;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static demo.F_Stream_flatMap_distinct.obterPokemons;

public class H_Collectors_toMap_Optional {

    public static void main(String[] args) {
        List<Treinador> treinadores = GeradorDeTreinadores.obterPersonagensPrincipaisDaPrimeiraTemporada();
        List<Pokemon> pokemons = obterPokemons(treinadores);

        Map<Pokemon, Pokemon> pokemonEsuaEvolucaoJava6 = mapearEvolucao(pokemons);
        imprimirJava6(pokemonEsuaEvolucaoJava6);
    }

    private static Map<Pokemon, Pokemon> mapearEvolucao(List<Pokemon> pokemons) {
        Map<Pokemon, Pokemon> resultado = new HashMap<Pokemon, Pokemon>();
        for (Pokemon pokemon : pokemons) {
            resultado.put(pokemon, pokemon.getEvolucao());
        }
        return resultado;
    }

    private static void imprimirJava6(Map<Pokemon, Pokemon> pokemonEsuaEvolucao) {
        for (Map.Entry<Pokemon, Pokemon> tupla : pokemonEsuaEvolucao.entrySet()) {
            Pokemon pokemon = tupla.getKey();
            Pokemon evolucao = tupla.getValue();
            if (evolucao == null) {
                System.out.println(pokemon + " não tem evolução");
            } else {
                System.out.println(pokemon + " evolui para " + evolucao);
            }
        }
    }

}
