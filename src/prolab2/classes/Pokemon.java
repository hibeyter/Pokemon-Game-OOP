
package prolab2.classes;


public  abstract class Pokemon {
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
    

  public abstract int hasarPuaniGoster();
 
}
