
package prolab2.pokemonlar;

import javax.swing.ImageIcon;
import prolab2.PokemonHelper;
import prolab2.classes.Pokemon;


public class Squirtle extends Pokemon {
        private int hasarPuanı;
        private ImageIcon image;
        private boolean  kartKullanildiMi;
    public Squirtle() {
    }

    public Squirtle(int hasarPuanı, int pokemonI, String pokemonAd, String pokemonTip) {
        super(pokemonI, pokemonAd, pokemonTip);
        this.hasarPuanı = hasarPuanı;
        this.image=PokemonHelper.convertIcon(pokemonI);
        this.kartKullanildiMi=false;
    }

    public boolean isKartKullanildiMi() {
        return kartKullanildiMi;
    }

    public void setKartKullanildiMi(boolean kartKullanildiMi) {
        this.kartKullanildiMi = kartKullanildiMi;
    }

    public int getHasarPuanı() {
        return hasarPuanı;
    }

    public void setHasarPuanı(int hasarPuanı) {
        this.hasarPuanı = hasarPuanı;
    }
    
      public ImageIcon getImage() {
        return image;
    }
    
    @Override
    public int hasarPuaniGoster() {
        return hasarPuanı; 
    }
}