package demo;

import model.Treinador;

import java.util.Collection;

public class E_Stream_sum {

    public static int obterQuantidadeDePokemons(Collection<Treinador> treinadores) {
        return treinadores.stream()
                .mapToInt(treinador -> treinador.getPokemons().size())
                .sum();
    }

}
