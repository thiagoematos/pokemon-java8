package demo;

import model.Treinador;
import util.GeradorDeTreinadores;

import java.util.List;

public class A_Lambda {

    public static void main(String[] args) {
        List<Treinador> treinadores = GeradorDeTreinadores
                .obterPersonagensPrincipaisDaPrimeiraTemporada();
        imprimirNomeDosTreinadores(treinadores);
    }

    private static void imprimirNomeDosTreinadores(List<Treinador> treinadores) {
        java6(treinadores);
    }

    private static void java6(List<Treinador> treinadores) {
        for (Treinador treinador : treinadores) {
            System.out.println(treinador.getNome());
        }
    }

}
