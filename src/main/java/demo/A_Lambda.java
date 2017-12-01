package demo;

import model.Treinador;

import java.util.Collection;

public class A_Lambda {

    public static void imprimirNomeDosTreinadores(Collection<Treinador> treinadores) {
        for (Treinador treinador : treinadores) {
            System.out.println(treinador.getNome());
        }
    }

}
