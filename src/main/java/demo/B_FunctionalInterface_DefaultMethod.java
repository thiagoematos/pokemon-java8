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

        LigaValidador ligaIndigoValidador = treinador -> treinador.getPokemons().size() > 3;
        LigaValidador ligaLaranjaValidador = treinador -> treinador.getNome().startsWith("J");

        ligaIndigoValidador
                .validarSeTreinadorPodeParticiparDaLiga("Liga Indigo", joaozinho);
        ligaLaranjaValidador
                .validarSeTreinadorPodeParticiparDaLiga("Liga Laranja", joaozinho);
    }

}
