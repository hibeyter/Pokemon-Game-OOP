/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prolab2.pokemonlar;

import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import prolab2.PokemonHelper;
import prolab2.classes.Pokemon;

/**
 *
 * @author beyter
 */
public class Charmander extends Pokemon {
    private int hasarPuanı;
    private ImageIcon image;
    public Charmander() {
    }

    public Charmander(int hasarPuanı, int pokemonI, String pokemonAd, String pokemonTip) {
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
