package demo;

import model.Pokemon;
import model.Treinador;
import util.LigaValidador;

public class B_FunctionalInterface_DefaultMethod {

    public static void main(String[] args) {
        Treinador joaozinho = new Treinador(
                "Joãozinho",
                new Pokemon[]{Pokemon.ARCANINE}
        );

        LigaValidador ligaIndigoValidador =
                treinador -> treinador.getPokemons().size() > 3;
        LigaValidador ligaLaranaValidador =
                treinador -> treinador.getNome().startsWith("J");

        validarSeTreinadorPodeParticiparDaLiga(
                "Liga Indigo", joaozinho, ligaIndigoValidador);
        validarSeTreinadorPodeParticiparDaLiga(
                "Liga Laranja", joaozinho, ligaLaranaValidador);
    }

    private static void validarSeTreinadorPodeParticiparDaLiga(
            String nomeDaLiga,
            Treinador treinador,
            LigaValidador ligaValidador) {
        System.out.println(nomeDaLiga);
        ligaValidador.imprimirResultadoPara(treinador);
    }

}
