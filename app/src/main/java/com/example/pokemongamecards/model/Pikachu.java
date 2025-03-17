package com.example.pokemongamecards.model;

public class Pikachu extends Pokemon implements IElectrico {
    public Pikachu(int numPokedex, String nombrePokemon, double pesoPokemon, String sexo, String temporadaQueAparece) {
        super(numPokedex, nombrePokemon, pesoPokemon, sexo, temporadaQueAparece, "Electrico");
    }

    @Override
    public void atacarImpactrueno() {
        System.out.println(nombrePokemon+ " Ha usado Impatrueno");
    }

    @Override
    public void atacarPunioTrueno() {
        System.out.println(nombrePokemon+ " Ha usado Puño de trueno");
    }

    @Override
    public void atacarRayo() {
        System.out.println(nombrePokemon+ " Ha usado Rayo");
    }

    @Override
    public void atacarRayoCarga() {
        System.out.println(nombrePokemon+ " Ha usado Rayo de carga");
    }
}
