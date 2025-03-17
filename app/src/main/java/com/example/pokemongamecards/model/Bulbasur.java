package com.example.pokemongamecards.model;

public class Bulbasur extends Pokemon implements IPlanta {
    public Bulbasur(int numPokedex, String nombrePokemon, double pesoPokemon, String sexo, String temporadaQueAparece) {
        super(numPokedex, nombrePokemon, pesoPokemon, sexo, temporadaQueAparece, "Planta");
    }

    @Override
    public void atacarParalizar() {
        System.out.println(nombrePokemon+ " Ha usado Paralizar");
    }

    @Override
    public void atacarDrenaje() {
        System.out.println(nombrePokemon+ " Ha usado Drenaje");
    }

    @Override
    public void atacarHojaAfilada() {
        System.out.println(nombrePokemon+ " Ha usado Hoja Afilada");
    }

    @Override
    public void atacarLatigoCepa() {
        System.out.println(nombrePokemon+ " Ha usado Latigo Cepa");
    }
}
