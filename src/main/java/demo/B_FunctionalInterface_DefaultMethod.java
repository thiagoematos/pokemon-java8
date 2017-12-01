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

        LigaValidador ligaIndigoValidador = new LigaValidador() {
            public boolean estaClassificado(Treinador treinador) {
                return treinador.getPokemons().size() > 3;
            }
        };
        LigaValidador ligaLaranjaValidador = new LigaValidador() {
            public boolean estaClassificado(Treinador treinador) {
                return treinador.getNome().startsWith("J");
            }
        };

        validarSeTreinadorPodeParticiparDaLiga(
                "Liga Indigo", joaozinho, ligaIndigoValidador);
        validarSeTreinadorPodeParticiparDaLiga(
                "Liga Laranja", joaozinho, ligaLaranjaValidador);
    }

    private static void validarSeTreinadorPodeParticiparDaLiga(
            String nomeDaLiga,
            Treinador treinador,
            LigaValidador ligaValidador) {

        String resultado =
                ligaValidador.estaClassificado(treinador)
                        ? "CLASSIFICADO :)"
                        : "DESCLASSIFICADO :(";

        System.out.println(nomeDaLiga);
        System.out.println(
                treinador.getNome() + " está " + resultado
        );
    }

}
