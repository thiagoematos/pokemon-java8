package demo;

import model.Treinador;

import java.util.Collection;

public class E_Stream_sum {

    public static int obterQuantidadeDePokemons(Collection<Treinador> treinadores) {
        int total = 0;
        for (Treinador treinador : treinadores) {
            total += treinador.getPokemons().size();
        }
        return total;
    }

}
