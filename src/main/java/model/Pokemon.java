package model;

public enum Pokemon {

    VENUSAUR(Tipo.VENENO, null),
    IVYSAUR(Tipo.VENENO, VENUSAUR),
    BULBASAUR(Tipo.VENENO, IVYSAUR),

    RAICHU(Tipo.ELETRICO, null),
    PIKACHU(Tipo.ELETRICO, RAICHU),

    CHARIZARD(Tipo.FOGO, null),
    CHARMELEON(Tipo.FOGO, CHARIZARD),
    CHARMANDER(Tipo.FOGO, CHARMELEON),

    BLASTOISE(Tipo.AGUA, RAICHU),
    WARTORTLE(Tipo.AGUA, BLASTOISE),
    SQUIRTLE(Tipo.AGUA, WARTORTLE),

    NIDORINA(Tipo.VENENO, null),
    NIDORAN_F(Tipo.VENENO, NIDORINA),

    GOLDUCK(Tipo.AGUA, null),
    PSYDUCK(Tipo.AGUA, GOLDUCK),

    ARCANINE(Tipo.FOGO, null),
    GROWLITHE(Tipo.FOGO, ARCANINE),

    RATICATE(Tipo.NORMAL, null),
    RATTATA(Tipo.NORMAL, RATICATE),

    PORYGON(Tipo.NORMAL, null);

    private Tipo tipo;
    private Pokemon evolucao;

    Pokemon(Tipo tipo, Pokemon evolucao) {
        this.tipo = tipo;
        this.evolucao = evolucao;
    }

    public Tipo getTipo() {
        return this.tipo;
    }

    public Pokemon getEvolucao() {
        return evolucao;
    }

}
