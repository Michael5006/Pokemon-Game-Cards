// Aquí se definirán los atributos y métodos de todos los Pokémon
package com.example.pokemongamecards.model;

public abstract class Pokemon {
    protected int numPokedex;
    protected String nombrePokemon;
    protected double pesoPokemon;
    protected String sexo;
    protected String temporadaQueAparece;
    protected String tipo;

    // 🔹 Corrección: Ahora el constructor acepta los 6 parámetros
    public Pokemon(int numPokedex, String nombrePokemon, double pesoPokemon, String sexo, String temporadaQueAparece, String tipo) {
        this.numPokedex = numPokedex;
        this.nombrePokemon = nombrePokemon;
        this.pesoPokemon = pesoPokemon;
        this.sexo = sexo;
        this.temporadaQueAparece = temporadaQueAparece;
        this.tipo = tipo;
    }

    // Ataques Generales
    public void atacarPlacaje(){
        System.out.println(nombrePokemon + " ha usado Placaje");
    }

    public void atacarArañazo(){
        System.out.println(nombrePokemon + " ha usado Arañazo");
    }

    public void atacarMordisco(){
        System.out.println(nombrePokemon + " ha usado Mordisco");
    }
}
