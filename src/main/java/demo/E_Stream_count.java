package demo;

import model.Treinador;
import util.GeradorDeTreinadores;

import java.util.List;

public class E_Stream_count {

    public static void main(String[] args) {
        List<Treinador> treinadores = GeradorDeTreinadores.obterPersonagensPrincipaisDaPrimeiraTemporada();

        long quantidadeTotal = obterQuantidadeDePokemons(treinadores);
        System.out.print(quantidadeTotal);
    }

    private static long obterQuantidadeDePokemons(List<Treinador> treinadores) {
        return java6(treinadores);
    }

    private static int java6(List<Treinador> treinadores) {
        int total = 0;
        for (Treinador treinador : treinadores) {
            total += treinador.getPokemons().size();
        }
        return total;
    }

}
