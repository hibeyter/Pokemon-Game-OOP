
package prolab2;

import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Random;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import prolab2.classes.Pokemon;
import prolab2.pokemonlar.Bulbasaur;
import prolab2.pokemonlar.Butterfree;
import prolab2.pokemonlar.Charmander;
import prolab2.pokemonlar.Jigglypuff;
import prolab2.pokemonlar.Meowth;
import prolab2.pokemonlar.Pikachu;
import prolab2.pokemonlar.Psyduck;
import prolab2.pokemonlar.Snorlax;
import prolab2.pokemonlar.Squirtle;
import prolab2.pokemonlar.Zubat;


public class PokemonHelper {

    public PokemonHelper() {
        
    }
    
    
    public void  addPokemon(List<Pokemon> myPokemons){
        Bulbasaur bulbasaur = new Bulbasaur(40,1,"Bulbasaur","çim");
        myPokemons.add(bulbasaur);
        Butterfree butterfree = new Butterfree(10,2,"Butterfree","hava");
        myPokemons.add(butterfree);
        Charmander charmander = new Charmander(60,3,"Charmander","ateş");
        myPokemons.add(charmander);
        Jigglypuff jigglypuff = new Jigglypuff(70,4,"Jigglypuff","ses");
        myPokemons.add(jigglypuff);
        Meowth meowth = new Meowth(40,5,"Meowth","normal");
        myPokemons.add(meowth);
        Pikachu pikachu = new Pikachu(40,6,"Pikachu","elektrik");
        myPokemons.add(pikachu);
        Psyduck psyduck = new Psyduck(20,7,"Psyduck","su");
        myPokemons.add(psyduck);
        Snorlax snorlax = new Snorlax(30,8,"Snorlax","normal");
        myPokemons.add(snorlax);
        Squirtle squirtle = new Squirtle(30,9,"Squirtle","su");
        myPokemons.add(squirtle);
        Zubat zubat = new Zubat(50,10,"Zubat","hava");
        myPokemons.add(squirtle);  
    }
    
    public static ImageIcon convertIcon(int id){
          ImageIcon image;
          BufferedImage img ;
        try {
            img = ImageIO.read(new File("pokemonlar/"+id+".png"));
            Image convert = img.getScaledInstance(89, 125,Image.SCALE_SMOOTH);
            ImageIcon imageIcon = new ImageIcon(convert);
            return imageIcon;
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }        
        return null;
    }
    
    
    public void getImages(List<ImageIcon> imgs){
          BufferedImage img = null;
          String fileName;
        try {            
            for (int i = 0; i < 11; i++) {
                fileName=String.valueOf(i);
                img = ImageIO.read(new File("pokemonlar/"+fileName+".png"));
                Image convert = img.getScaledInstance(89, 125,Image.SCALE_SMOOTH);
                ImageIcon imageIcon = new ImageIcon(convert);
                imgs.add(imageIcon);
            }           
        } catch (IOException e) {
            System.err.println("resim bulunamadı");
        }
    }
    public void randomPoke(List<ImageIcon> imgs, List<JLabel> pokes){
        Random random = new Random();
        for (int i = 0; i < pokes.size(); i++) {
            int x = random.nextInt(imgs.size());
            if(x==0)x=1;         
            pokes.get(i).setIcon(imgs.get(x));
            imgs.remove(x);
        }        
    }
}
