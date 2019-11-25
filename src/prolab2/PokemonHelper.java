
package prolab2;

import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Random;
import java.util.Timer;
import java.util.TimerTask;
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
        Bulbasaur bulbasaur = new Bulbasaur(50,1,"Bulbasaur","çim");
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
        myPokemons.add(zubat);  
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
    public void pokeYerlestir(JLabel poke, Pokemon pokemons){
        if(pokemons instanceof Bulbasaur){
            Bulbasaur  myPokemon = (Bulbasaur) pokemons;
            poke.setIcon(myPokemon.getImage());
            poke.setName("1");
        }
        else if (pokemons instanceof Butterfree){
            Butterfree  myPokemon = (Butterfree) pokemons;
            poke.setIcon(myPokemon.getImage());
            poke.setName("2");
        }
        else if (pokemons instanceof Charmander){
            Charmander  myPokemon = (Charmander) pokemons;
            poke.setIcon(myPokemon.getImage());
             poke.setName("3");
        }
        else if (pokemons instanceof Jigglypuff){
            Jigglypuff  myPokemon = (Jigglypuff) pokemons;
            poke.setIcon(myPokemon.getImage());
             poke.setName("4");
        }
        else if (pokemons instanceof Meowth){
            Meowth  myPokemon = (Meowth) pokemons;
            poke.setIcon(myPokemon.getImage());
            poke.setName("5");
        }
        else if (pokemons instanceof Pikachu){
            Pikachu  myPokemon = (Pikachu) pokemons;
            poke.setIcon(myPokemon.getImage());
             poke.setName("6");
        }
        else if (pokemons instanceof Psyduck){
            Psyduck  myPokemon = (Psyduck) pokemons;
            poke.setIcon(myPokemon.getImage());
             poke.setName("7");
        }
        else if (pokemons instanceof Snorlax){
            Snorlax  myPokemon = (Snorlax) pokemons;
            poke.setIcon(myPokemon.getImage());
             poke.setName("8");
        }
        else if (pokemons instanceof Squirtle){
            Squirtle  myPokemon = (Squirtle) pokemons;
            poke.setIcon(myPokemon.getImage());
             poke.setName("9");
        }
        else if (pokemons instanceof Zubat){
            Zubat  myPokemon = (Zubat) pokemons;
            poke.setIcon(myPokemon.getImage());
             poke.setName("10");
        }
    }
    public void pokeKonumYenile(List<JLabel> pokes,List<Pokemon> pcPokemons, List<Pokemon> humanPokemons){
       for (int i = 0; i < humanPokemons.size(); i++) {
            for (JLabel poke : pokes) {
               if (humanPokemons.get(i).getPokemonID()==Integer.valueOf(poke.getName())) {
                   poke.setBounds(40+(i*139), 495, 89, 125);
               }
           }
       }
       for (int i = 0; i < pcPokemons.size(); i++) {
            for (JLabel poke : pokes) {
               if (pcPokemons.get(i).getPokemonID()==Integer.valueOf(poke.getName())) {
                   poke.setBounds(40+(i*139), 80, 89, 125);
               }
           }
       }
       
    }
    public int pokemonKarsilastir(Pokemon pokemons){
        int guc=0;
        if(pokemons instanceof Bulbasaur){
            Bulbasaur  myPokemon = (Bulbasaur) pokemons;
            guc=myPokemon.getHasarPuanı();
        }
        else if (pokemons instanceof Butterfree){
            Butterfree  myPokemon = (Butterfree) pokemons;
            guc=myPokemon.getHasarPuanı();
        }
        else if (pokemons instanceof Charmander){
            Charmander  myPokemon = (Charmander) pokemons;
            guc=myPokemon.getHasarPuanı();
        }
        else if (pokemons instanceof Jigglypuff){
            Jigglypuff  myPokemon = (Jigglypuff) pokemons;
             guc=myPokemon.getHasarPuanı();
        }
        else if (pokemons instanceof Meowth){
            Meowth  myPokemon = (Meowth) pokemons;
            guc=myPokemon.getHasarPuanı();
        }
        else if (pokemons instanceof Pikachu){
            Pikachu  myPokemon = (Pikachu) pokemons;
             guc=myPokemon.getHasarPuanı();
        }
        else if (pokemons instanceof Psyduck){
            Psyduck  myPokemon = (Psyduck) pokemons;
            guc=myPokemon.getHasarPuanı();
        }
        else if (pokemons instanceof Snorlax){
            Snorlax  myPokemon = (Snorlax) pokemons;
            guc=myPokemon.getHasarPuanı();
        }
        else if (pokemons instanceof Squirtle){
            Squirtle  myPokemon = (Squirtle) pokemons;
            guc=myPokemon.getHasarPuanı();
        }
        else if (pokemons instanceof Zubat){
            Zubat  myPokemon = (Zubat) pokemons;
            guc=myPokemon.getHasarPuanı();
        }
        
        return guc;
    }
    public void destroyCard(JLabel poke, JLabel poke1) {
           Timer timer = new Timer();  
           TimerTask timerTask = new TimerTask() {
              int deger = 0;
              @Override
              public void run() {
                  while(deger==1){                   
                      poke.setVisible(false); 
                      poke1.setVisible(false);                   
                      deger=2;
                  }
                  if(deger==0) deger=1;           
              }             
           };
           timer.scheduleAtFixedRate(timerTask, 0,1500);
    }
    public void kartlariCevir(List<Pokemon> myPokemons,List<Pokemon> pcPokemon, List<JLabel> pokes) {
        ImageIcon icon =convertIcon(0);
         for (int i = 0; i < pcPokemon.size(); i++) {
              for (int j = 0; j < pokes.size(); j++) {
                  if (Integer.parseInt(pokes.get(j).getName())==pcPokemon.get(i).getPokemonID()) {
                      pokes.get(j).setIcon(icon);
                  }
              }
          }
        for (int i = 0; i < myPokemons.size(); i++) {
            for (int j = 5; j < pokes.size(); j++) {
                if (Integer.parseInt(pokes.get(j).getName())==myPokemons.get(i).getPokemonID()) {
                    pokes.get(j).setIcon(icon);
                    pokes.get(j).setBounds(417+(i*10), 250+(i*25), 89, 125);
                }
            }
        }
    }
    public void kartCevir(JLabel poke){
            poke.setIcon(convertIcon(Integer.valueOf(poke.getName())));
    }
}
