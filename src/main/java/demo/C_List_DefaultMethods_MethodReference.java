package demo;

import model.Treinador;

import java.util.Comparator;
import java.util.List;

public class C_List_DefaultMethods_MethodReference {

    public static void ordenarTreinadoresPorNomePorQuantidadeDePokemons(List<Treinador> treinadores) {
        Comparator<Treinador> porNome = Comparator.comparing(Treinador::getNome);
        Comparator<Treinador> porQtde = Comparator.comparing(treinador -> treinador.getPokemons().size());
        treinadores.sort(porNome.thenComparing(porQtde));
    }

}
