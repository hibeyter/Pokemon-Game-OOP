
package prolab2.pokemonlar;

import javax.swing.ImageIcon;
import prolab2.PokemonHelper;
import prolab2.classes.Pokemon;

public class Bulbasaur extends Pokemon{
    private  int hasarPuani;
    private boolean kartKullanildiMi;
    private  ImageIcon image ;
    public Bulbasaur() {
    }

    public Bulbasaur(int hasarPuani, int pokemonI, String pokemonAd, String pokemonTip) {
        super(pokemonI, pokemonAd, pokemonTip);
        this.hasarPuani = hasarPuani;
        this.image=PokemonHelper.convertIcon(pokemonI); 
        this.kartKullanildiMi=false;
    }

    public boolean isKartKullanildiMi() {
        return kartKullanildiMi;
    }

    public void setKartKullanildiMi(boolean kartKullanildiMi) {
        this.kartKullanildiMi = kartKullanildiMi;
    }
    
    

    public int getHasarPuani() {
        return hasarPuani;
    }

    public void setHasarPuani(int hasarPuani) {
        this.hasarPuani = hasarPuani;
    }

    public ImageIcon getImage() {
        return image;
    }

    @Override
    public int hasarPuaniGoster() {
        return hasarPuani; 
    }
    
    
}
