package demo;

import model.Pokemon;
import model.Tipo;
import model.Treinador;
import util.GeradorDeTreinadores;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import static demo.F_Stream_flatMap_distinct.obterPokemons;

public class G_Collectors_groupingBy {

    public static void main(String[] args) {
        List<Treinador> treinadores = GeradorDeTreinadores.obterPersonagensPrincipaisDaPrimeiraTemporada();
        List<Pokemon> pokemons = obterPokemons(treinadores);

        Map<Tipo, List<Pokemon>> pokemonsPorTipo = categorizarPokemonsPorTipo(pokemons);
        pokemonsPorTipo.forEach(
                (tipo, pokemonList) -> System.out.println(tipo + " " + pokemonList)
        );
    }

    private static Map<Tipo, List<Pokemon>> categorizarPokemonsPorTipo(List<Pokemon> pokemons) {
        return java6(pokemons);
        // return java8(pokemons);
    }

    private static Map<Tipo, List<Pokemon>> java6(List<Pokemon> pokemons) {
        Map<Tipo, List<Pokemon>> resultado = new HashMap<>();
        for (Pokemon pokemon : pokemons) {
            if (!resultado.containsKey(pokemon.getTipo())) {
                resultado.put(pokemon.getTipo(), new ArrayList<>());
            }
            resultado.get(pokemon.getTipo()).add(pokemon);
        }
        return resultado;
    }

    private static Map<Tipo, List<Pokemon>> java8(List<Pokemon> pokemons) {
        return pokemons
                .stream()
                .collect(Collectors.groupingBy(Pokemon::getTipo));
    }

}
