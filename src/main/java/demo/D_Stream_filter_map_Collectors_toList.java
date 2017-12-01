package demo;

import model.Treinador;

import java.util.ArrayList;
import java.util.Collection;

public class D_Stream_filter_map_Collectors_toList {

    public static void imprimirNomeDosClassificados(Collection<Treinador> treinadores) {
        Collection<String> nomeDosClassificados = obterNomeDosTreinadoresClassificados(treinadores);
        imprimir(nomeDosClassificados);
    }

    private static Collection<String> obterNomeDosTreinadoresClassificados(Collection<Treinador> treinadores) {
        Collection<String> classificados = new ArrayList<String>();
        for (Treinador treinador : treinadores) {
            if (treinador.getPokemons().size() > 2) {
                classificados.add(treinador.getNome());
            }
        }
        return classificados;
    }

    private static void imprimir(Collection<String> classificados) {
        for (String nomeDoClassificado : classificados) {
            System.out.println(nomeDoClassificado);
        }
    }

}
