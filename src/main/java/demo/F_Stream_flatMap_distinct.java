package demo;

import model.Pokemon;
import model.Treinador;
import util.GeradorDeTreinadores;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class F_Stream_flatMap_distinct {

    public static void main(String[] args) {
        List<Treinador> treinadores = GeradorDeTreinadores.obterPersonagensPrincipaisDaPrimeiraTemporada();

        List<Pokemon> pokemons = obterPokemons(treinadores);
        pokemons.forEach(System.out::println);
    }

    static List<Pokemon> obterPokemons(List<Treinador> treinadores) {
        return java6(treinadores);
        //return java8(treinadores);
    }

    private static List<Pokemon> java6(List<Treinador> treinadores) {
        List<Pokemon> resultado = new ArrayList<>();
        for (Treinador treinador : treinadores) {
            for (Pokemon pokemon : treinador.getPokemons()) {
                if (!resultado.contains(pokemon)) {
                    resultado.add(pokemon);
                }
            }
        }
        return resultado;
    }

    private static List<Pokemon> java8(List<Treinador> treinadores) {
        return treinadores.stream()
                .flatMap(t -> t.getPokemons().stream())
                .distinct()
                .collect(Collectors.toList());
    }

}
