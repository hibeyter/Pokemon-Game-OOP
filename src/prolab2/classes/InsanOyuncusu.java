
package prolab2.classes;

import java.util.List;

public class InsanOyuncusu extends Oyuncu {
   private List<Pokemon> kartListesi;

    public InsanOyuncusu() {
        
    }

    public InsanOyuncusu(List<Pokemon> kartListesi, int oyuncuID, String oyuncuAdi, int skor) {
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
    public void kartSec(List<Pokemon> myPokemons) {
        
    }
    
    
    
}
