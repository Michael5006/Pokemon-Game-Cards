package com.example.pokemongamecards.model;

public class Charmander extends Pokemon implements IFuego {
    public Charmander(int numPokedex, String nombrePokemon, double pesoPokemon, String sexo, String temporadaQueAparece){
        super(numPokedex, nombrePokemon, pesoPokemon, sexo, temporadaQueAparece, "Fuego");
    }
    @Override
    public void atacarPunioFuego(){
        System.out.println(nombrePokemon+ " Ha usado Puño de fuego");
    }
    @Override
    public void atacarAscuas(){
        System.out.println(nombrePokemon+ " Ha usado Ascuas");
    }
    @Override
    public void atacarLanzallamas(){
        System.out.println(nombrePokemon+ " Ha usado Lanzallamas");
    }
}
