/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prolab2.classes;

/**
 *
 * @author beyter
 */
public class Pokemon {
 private int  pokemonID;
 private String pokemonAd;
 private String  pokemonTip;  

    public Pokemon() {
    }

    public Pokemon(int pokemonID, String pokemonAd, String pokemonTip) {
        this.pokemonID = pokemonID;
        this.pokemonAd = pokemonAd;
        this.pokemonTip = pokemonTip;
    }

    public int getPokemonID() {
        return pokemonID;
    }

    public void setPokemonID(int pokemonID) {
        this.pokemonID = pokemonID;
    }

    public String getPokemonAd() {
        return pokemonAd;
    }

    public void setPokemonAd(String pokemonAd) {
        this.pokemonAd = pokemonAd;
    }

    public String getPokemonTip() {
        return pokemonTip;
    }

    public void setPokemonTip(String pokemonTip) {
        this.pokemonTip = pokemonTip;
    }
    

  public int hasarPuaniGoster(){
      return 0;
  }
}
