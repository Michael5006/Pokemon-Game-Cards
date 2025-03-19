package com.example.pokemongamecards.model;

public class Pikachu extends Pokemon implements IElectrico {
    public Pikachu(int numPokedex, String nombrePokemon, double pesoPokemon, String sexo, String temporadaQueAparece) {
        super(numPokedex, nombrePokemon, pesoPokemon, sexo, temporadaQueAparece, "Electrico");
    }

    @Override
    public String atacarImpactrueno() {
        return nombrePokemon + " ha usado Impactrueno!";
    }

    @Override
    public String atacarPunioTrueno() {
        return nombrePokemon + " ha usado Puño Trueno!";
    }

    @Override
    public String atacarRayo() {
        return nombrePokemon + " ha usado Rayo!";
    }

    @Override
    public String atacarRayoCarga() {
        return nombrePokemon + " ha usado Rayo de Carga!";
    }
}
