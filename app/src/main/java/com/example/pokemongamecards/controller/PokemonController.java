package com.example.pokemongamecards.controller;
import com.example.pokemongamecards.model.*;

public class PokemonController {
    //Datos de cada Pokémon
    public Pikachu crearPikachu(){
        return new Pikachu(25, "Pikachu", 6.0, "Hembra", "Temporada 1");
    }
    public Bulbasur crearBulbasur(){
        return new Bulbasur(1, "Bulbasur", 6.9,"Hembra", "Temporada 1");
    }
    public Charmander crearCharmander(){
        return new Charmander(4, "Charmander", 8.5, "Macho", "Temporada 1");
    }
    public Squirtle crearSquirtle(){
        return new Squirtle(7, "Squirtle", 9.0, "Macho", "Temporada 1");
    }

    //Ataques Básicos
    public void ataquesBasicos(Pokemon pokemon, String ataque){
        switch (ataque.toLowerCase()){
            case "placaje":
                pokemon.atacarPlacaje();
                break;
            case "arañazo":
                pokemon.atacarArañazo();
                break;
            case "mordisco":
                pokemon.atacarMordisco();
                break;
            default:
                System.out.println("Este ataque no es reconocido por el Pokémon");

        }
    }
}
