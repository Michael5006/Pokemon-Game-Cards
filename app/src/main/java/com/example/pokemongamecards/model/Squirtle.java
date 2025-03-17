package com.example.pokemongamecards.model;

public class Squirtle extends Pokemon implements IAgua {
    public Squirtle(int numPokedex, String nombrePokemon, double pesoPokemon, String sexo, String temporadaQueAparece){
        super(numPokedex, nombrePokemon, pesoPokemon, sexo, temporadaQueAparece, "Agua");
    }

    @Override
    public void atacarHidrobomba() {
        System.out.println(nombrePokemon+ " Ha usado Hidrobomba");
    }

    @Override
    public void atacarPistolaAgua() {
        System.out.println(nombrePokemon+ " Ha usado Pistola de agua");
    }

    @Override
    public void atacarBurbuja() {
        System.out.println(nombrePokemon+ " Ha usado Burbuja");
    }

    @Override
    public void atacarHidropulso() {
        System.out.println(nombrePokemon+ " Ha usado Hidropulso");
    }
}
