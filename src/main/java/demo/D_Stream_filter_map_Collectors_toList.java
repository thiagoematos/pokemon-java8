package demo;

import model.Treinador;
import util.GeradorDeTreinadores;

import java.util.ArrayList;
import java.util.List;

public class D_Stream_filter_map_Collectors_toList {

    public static void main(String[] args) {
        List<Treinador> treinadores = GeradorDeTreinadores.obterPersonagensPrincipaisDaPrimeiraTemporada();

        List<String> classificados = obterNomeDosTreinadoresClassificados(treinadores);
        imprimirNomeDosClassificados(classificados);
    }

    private static List<String> obterNomeDosTreinadoresClassificados(List<Treinador> treinadores) {
        return java6(treinadores);
    }

    private static List<String> java6(List<Treinador> treinadores) {
        List<String> classificados = new ArrayList<String>();
        for (Treinador treinador : treinadores) {
            if (treinador.getPokemons().size() > 3) {
                classificados.add(treinador.getNome());
            }
        }
        return classificados;
    }

    private static void imprimirNomeDosClassificados(List<String> classificados) {
        // Java 6
        for (String nomeDoClassificado : classificados) {
            System.out.println(nomeDoClassificado);
        }
    }

}
