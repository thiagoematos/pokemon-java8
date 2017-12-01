import demo.*;
import model.Treinador;
import util.GeradorDeTreinadores;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Treinador> treinadores = GeradorDeTreinadores
                .obterPersonagensPrincipaisDaPrimeiraTemporada();

        System.out.println("Nome dos Treinadores: ");
        A_Lambda.imprimirNomeDosTreinadores(treinadores);

        System.out.println("Ordenando treinadores pela quantidade de pokemons...");
        C_List_DefaultMethods_MethodReference.ordenarTreinadoresPorNomePorQuantidadeDePokemons(treinadores);

        System.out.println("Treinadores classificados (mais de 2 pokemons): ");
        D_Stream_filter_map_Collectors_toList.imprimirNomeDosClassificados(treinadores);

        System.out.println(
                "Quantidade total de pokemons: " +
                        E_Stream_sum.obterQuantidadeDePokemons(treinadores)
        );

        System.out.println("Pokemons:");
        F_Stream_flatMap_distinct.imprimirPokemons(treinadores);

        System.out.println("Pokemons categorizados por tipo:");
        G_Collectors_groupingBy.imprimirPokemonsCategorizadosPorTipo(treinadores);

        System.out.println("Pokemon e sua evolução:");
        H_Collectors_toMap_Optional.imprimirPokemonEsuaEvolucao(treinadores);
    }

}
