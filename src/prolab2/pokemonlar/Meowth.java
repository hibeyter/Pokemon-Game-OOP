
package prolab2.pokemonlar;

import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import prolab2.PokemonHelper;
import prolab2.classes.Pokemon;


public class Meowth extends Pokemon {
    private int hasarPuanı;
    private ImageIcon image;
    public Meowth() {
    }

    public Meowth(int hasarPuanı, int pokemonI, String pokemonAd, String pokemonTip) {
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
