
package prolab2.pokemonlar;

import javax.swing.ImageIcon;
import prolab2.PokemonHelper;
import prolab2.classes.Pokemon;


public class Psyduck extends Pokemon {
    private int hasarPuanı;
    private ImageIcon image;
    public Psyduck() {
    }

    public Psyduck(int hasarPuanı, int pokemonI, String pokemonAd, String pokemonTip) {
        super(pokemonI, pokemonAd, pokemonTip);
        this.hasarPuanı = hasarPuanı;
        this.image=PokemonHelper.convertIcon(pokemonI);
    }

    public int getHasarPuanı() {
        return hasarPuanı;
    }

    public void setHasarPuanı(int hasarPuanı) {
        this.hasarPuanı = hasarPuanı;
    }
    @Override
    public int hasarPuaniGoster() {
        return hasarPuanı; 
    }
}