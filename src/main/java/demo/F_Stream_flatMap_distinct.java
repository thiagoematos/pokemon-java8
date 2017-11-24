package demo;

import model.Pokemon;
import model.Treinador;
import util.GeradorDeTreinadores;

import java.util.ArrayList;
import java.util.List;

public class F_Stream_flatMap_distinct {

    public static void main(String[] args) {
        List<Treinador> treinadores = GeradorDeTreinadores.obterPersonagensPrincipaisDaPrimeiraTemporada();

        List<Pokemon> pokemons = obterPokemons(treinadores);
        for (Pokemon pokemon : pokemons) {
            System.out.println(pokemon);
        }
    }

    static List<Pokemon> obterPokemons(List<Treinador> treinadores) {
        return java6(treinadores);
    }

    private static List<Pokemon> java6(List<Treinador> treinadores) {
        List<Pokemon> resultado = new ArrayList<Pokemon>();
        for (Treinador treinador : treinadores) {
            for (Pokemon pokemon : treinador.getPokemons()) {
                if (!resultado.contains(pokemon)) {
                    resultado.add(pokemon);
                }
            }
        }
        return resultado;
    }

}
