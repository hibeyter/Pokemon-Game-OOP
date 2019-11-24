
package prolab2.classes;

import java.util.List;
import java.util.Random;


public class BilgisayarOyuncusu extends Oyuncu {
    private List<Pokemon> kartListesi;

    public BilgisayarOyuncusu() {
        
    }

    public BilgisayarOyuncusu(List<Pokemon> kartListesi, int oyuncuID, String oyuncuAdi, int skor) {
        super(oyuncuID, oyuncuAdi, skor);
        this.kartListesi = kartListesi;
    }

    public List<Pokemon> getKartListesi() {
        return kartListesi;
    }

    public void setKartListesi(List<Pokemon> kartListesi) {
        this.kartListesi = kartListesi;
    }

    @Override
    public void kartSec(List<Pokemon> myPokemons,List<Pokemon> pokemons) {
         Random random = new Random();
         int x = random.nextInt(pokemons.size());
         myPokemons.add(pokemons.get(x));
         pokemons.remove(x);
    }

 


    
    
    
}
