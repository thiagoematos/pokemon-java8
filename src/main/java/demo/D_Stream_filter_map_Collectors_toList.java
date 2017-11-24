package demo;

import model.Treinador;
import util.GeradorDeTreinadores;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class D_Stream_filter_map_Collectors_toList {

    public static void main(String[] args) {
        List<Treinador> treinadores = GeradorDeTreinadores.obterPersonagensPrincipaisDaPrimeiraTemporada();

        List<String> classificados = obterNomeDosTreinadoresClassificados(treinadores);
        imprimirNomeDosClassificados(classificados);
    }

    private static List<String> obterNomeDosTreinadoresClassificados(List<Treinador> treinadores) {
        //return java6(treinadores);
        return java8(treinadores);
    }

    private static List<String> java6(List<Treinador> treinadores) {
        List<String> classificados = new ArrayList<>();
        for (Treinador treinador : treinadores) {
            if (treinador.getPokemons().size() > 3) {
                classificados.add(treinador.getNome());
            }
        }
        return classificados;
    }

    private static List<String> java8(List<Treinador> treinadores) {
        return treinadores.stream()
                .filter(treinador -> treinador.getPokemons().size() > 3)
                .map(Treinador::getNome)
                .collect(Collectors.toList());
    }

    private static void imprimirNomeDosClassificados(List<String> classificados) {
        // Java 6
        for (String nomeDoClassificado : classificados) {
            System.out.println(nomeDoClassificado);
        }
        // ou Java 8 (Default Method/Method Reference)
        classificados.forEach(System.out::println);
    }

}
