package demo;

import model.Treinador;

import java.util.Collection;

public class F_Stream_flatMap_distinct {

    public static void imprimirPokemons(Collection<Treinador> treinadores) {
        treinadores.stream()
                .flatMap(treinador -> treinador.getPokemons().stream())
                .forEach(System.out::println);
    }

}
