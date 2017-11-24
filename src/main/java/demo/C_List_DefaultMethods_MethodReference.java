package demo;

import model.Treinador;
import util.GeradorDeTreinadores;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class C_List_DefaultMethods_MethodReference {

    public static void main(String[] args) {
        List<Treinador> treinadores = GeradorDeTreinadores.obterPersonagensPrincipaisDaPrimeiraTemporada();
        ordenarTreinadoresPorNomePorQuantidadeDePokemons(treinadores);
    }

    private static void ordenarTreinadoresPorNomePorQuantidadeDePokemons(List<Treinador> treinadores) {
        java6(treinadores);
        //java8(treinadores);
        treinadores.forEach(treinador -> {
            System.out.println(treinador.getNome() + "-> " + treinador.getPokemons().size());
        });
    }

    private static void java6(List<Treinador> treinadores) {
        Collections.sort(treinadores, new Comparator<Treinador>() {
            @Override
            public int compare(Treinador treinador1, Treinador treinador2) {
                int compararPorNome = treinador1.getNome().compareTo(treinador2.getNome());
                if (compararPorNome == 0) {
                    int compararPorQuantidadeDePokemons = treinador1.getPokemons().size() - treinador2.getPokemons().size();
                    return compararPorQuantidadeDePokemons;
                }
                return compararPorNome;
            }
        });
    }

    private static void java8(List<Treinador> treinadores) {
        treinadores.sort((treinador1, treinador2) -> {
            int compararPorNome = treinador1.getNome().compareTo(treinador2.getNome());
            if (compararPorNome == 0) {
                int compararPorQuantidadeDePokemons = treinador1.getPokemons().size() - treinador2.getPokemons().size();
                return compararPorQuantidadeDePokemons;
            }
            return compararPorNome;
        });
        // ou melhor...
        Comparator<Treinador> compararPorNome = Comparator.comparing(Treinador::getNome);
        Comparator<Treinador> compararPorQuantidadeDePokemons = Comparator.comparing(treinador -> treinador.getPokemons().size());
        treinadores.sort(
                compararPorNome.thenComparing(compararPorQuantidadeDePokemons)
        );
    }

}
