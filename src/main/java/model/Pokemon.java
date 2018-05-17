package model;

public enum Pokemon {

    VENUSAUR(Type.POISONOUS, null),
    IVYSAUR(Type.POISONOUS, VENUSAUR),
    BULBASAUR(Type.POISONOUS, IVYSAUR),

    RAICHU(Type.ELECTRIC, null),
    PIKACHU(Type.ELECTRIC, RAICHU),

    CHARIZARD(Type.FIRE, null),
    CHARMELEON(Type.FIRE, CHARIZARD),
    CHARMANDER(Type.FIRE, CHARMELEON),

    BLASTOISE(Type.WATER, RAICHU),
    WARTORTLE(Type.WATER, BLASTOISE),
    SQUIRTLE(Type.WATER, WARTORTLE),

    NIDORINA(Type.POISONOUS, null),
    NIDORAN_F(Type.POISONOUS, NIDORINA),

    GOLDUCK(Type.WATER, null),
    PSYDUCK(Type.WATER, GOLDUCK),

    ARCANINE(Type.FIRE, null),
    GROWLITHE(Type.FIRE, ARCANINE),

    RATICATE(Type.NORMAL, null),
    RATTATA(Type.NORMAL, RATICATE),

    PORYGON(Type.NORMAL, null);

    private Type type;
    private Pokemon evolution;

    Pokemon(Type type, Pokemon evolution) {
        this.type = type;
        this.evolution = evolution;
    }

    public Type getType() {
        return this.type;
    }

    public Pokemon getEvolution() {
        return evolution;
    }

}
