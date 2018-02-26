package demo;

import model.Treinador;

import java.util.Collection;

public class D_Stream_filter_map_Collectors_toList {

    public static void imprimirNomeDosClassificados(Collection<Treinador> treinadores) {
        treinadores.stream()
                .filter(treinador -> treinador.getPokemons().size() > 2)
                .map(Treinador::getNome)
                .forEach(System.out::println);
    }

}
