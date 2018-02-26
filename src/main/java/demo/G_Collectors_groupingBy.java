package demo;

import model.Pokemon;
import model.Treinador;

import java.util.Collection;
import java.util.stream.Collectors;

public class G_Collectors_groupingBy {

    public static void imprimirPokemonsCategorizadosPorTipo(Collection<Treinador> treinadores) {
        treinadores.stream()
                .flatMap(treinador -> treinador.getPokemons().stream())
                .collect(Collectors.groupingBy(Pokemon::getTipo))
                .forEach((tipo, pokemons) -> System.out.println(tipo + " " + pokemons));
    }

}
