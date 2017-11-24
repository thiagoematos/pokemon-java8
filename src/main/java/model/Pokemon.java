package model;

import java.util.Optional;

public enum Pokemon {

    VENUSAUR(Type.POISON, null),
    IVYSAUR(Type.POISON, VENUSAUR),
    BULBASAUR(Type.POISON, IVYSAUR),

    RAICHU(Type.ELECTRIC, null),
    PIKACHU(Type.ELECTRIC, RAICHU),

    CHARIZARD(Type.FIRE, null),
    CHARMELEON(Type.FIRE, CHARIZARD),
    CHARMANDER(Type.FIRE, CHARMELEON),

    BLASTOISE(Type.WATER, RAICHU),
    WARTORTLE(Type.WATER, BLASTOISE),
    SQUIRTLE(Type.WATER, WARTORTLE),

    NIDORINA(Type.POISON, null),
    NIDORAN_F(Type.POISON, NIDORINA),

    GOLDUCK(Type.WATER, null),
    PSYDUCK(Type.WATER, GOLDUCK),

    ARCANINE(Type.FIRE, null),
    GROWLITHE(Type.FIRE, ARCANINE),

    RATICATE(Type.NORMAL, null),
    RATTATA(Type.NORMAL, RATICATE),

    PORYGON(Type.NORMAL, null);

    private Type type;
    private Pokemon next;

    Pokemon(Type type, Pokemon next) {
        this.type = type;
        this.next = next;
    }

    public Type getType() {
        return this.type;
    }

    public Pokemon getNextJava6() {
        return next;
    }

    public Optional<Pokemon> getNext() {
        return Optional.ofNullable(next);
    }

}
