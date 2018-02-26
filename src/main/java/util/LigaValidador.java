package util;

import model.Treinador;

@FunctionalInterface
public interface LigaValidador {

    boolean estaClassificado(Treinador treinador);

    default void validarSeTreinadorPodeParticiparDaLiga(
            String nomeDaLiga,
            Treinador treinador) {

        String resultado =
                estaClassificado(treinador)
                        ? "CLASSIFICADO :)"
                        : "DESCLASSIFICADO :(";

        System.out.println(nomeDaLiga);
        System.out.println(
                treinador.getNome() + " está " + resultado
        );
    }

}
