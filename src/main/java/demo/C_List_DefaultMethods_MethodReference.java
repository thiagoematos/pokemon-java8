package demo;

import model.Treinador;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class C_List_DefaultMethods_MethodReference {

    public static void ordenarTreinadoresPorNomePorQuantidadeDePokemons(List<Treinador> treinadores) {
        Collections.sort(treinadores, new Comparator<Treinador>() {
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

}
