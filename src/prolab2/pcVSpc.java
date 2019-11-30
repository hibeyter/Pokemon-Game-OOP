/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prolab2;


import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Timer;
import java.util.TimerTask;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import prolab2.classes.BilgisayarOyuncusu;
import prolab2.classes.Pokemon;



/**
 *
 * @author beyter
 */
public class pcVSpc extends javax.swing.JFrame {
    

    List<Pokemon> myPokemons = new ArrayList<>();  
    BilgisayarOyuncusu pc = new BilgisayarOyuncusu();
    BilgisayarOyuncusu pc1 = new BilgisayarOyuncusu();
    List<JLabel> pokes = new ArrayList<>();
    PokemonHelper helper = new PokemonHelper();
    boolean oyunBittiMi=false;
    
    public pcVSpc() {
        initComponents();
        helper.addPokemon(myPokemons); 
        addPokes(this.pokes);
        randomPoke();
        helper.pokeKonumYenile(pokes, pc.getKartListesi(),pc1.getKartListesi());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        poke2 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        pcSkor = new javax.swing.JLabel();
        poke6 = new javax.swing.JLabel();
        poke4 = new javax.swing.JLabel();
        poke5 = new javax.swing.JLabel();
        poke3 = new javax.swing.JLabel();
        poke1 = new javax.swing.JLabel();
        poke7 = new javax.swing.JLabel();
        poke8 = new javax.swing.JLabel();
        poke10 = new javax.swing.JLabel();
        poke9 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        pcOneSkor = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Bilgisayar vs Bilgisayar");
        setPreferredSize(new java.awt.Dimension(568, 645));
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
        });
        getContentPane().setLayout(null);

        poke2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        poke2.setText("2");
        getContentPane().add(poke2);
        poke2.setBounds(180, 70, 89, 125);

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 0, 0));
        jLabel7.setText("Computer2 =>");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(390, 10, 119, 40);

        pcSkor.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        pcSkor.setForeground(new java.awt.Color(255, 0, 0));
        pcSkor.setText("000");
        getContentPane().add(pcSkor);
        pcSkor.setBounds(520, 10, 40, 40);

        poke6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        poke6.setText("6");
        getContentPane().add(poke6);
        poke6.setBounds(310, 500, 89, 125);

        poke4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        poke4.setText("4");
        getContentPane().add(poke4);
        poke4.setBounds(30, 500, 89, 125);

        poke5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        poke5.setText("5");
        getContentPane().add(poke5);
        poke5.setBounds(170, 500, 89, 125);

        poke3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        poke3.setText("3");
        getContentPane().add(poke3);
        poke3.setBounds(320, 70, 89, 125);

        poke1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        poke1.setText("1");
        getContentPane().add(poke1);
        poke1.setBounds(40, 70, 89, 125);

        poke7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        poke7.setText("7");
        getContentPane().add(poke7);
        poke7.setBounds(450, 199, 89, 125);

        poke8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        poke8.setText("8");
        getContentPane().add(poke8);
        poke8.setBounds(450, 329, 89, 125);

        poke10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        poke10.setText("10");
        getContentPane().add(poke10);
        poke10.setBounds(420, 249, 89, 125);

        poke9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        poke9.setText("9");
        getContentPane().add(poke9);
        poke9.setBounds(420, 149, 89, 125);

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 0, 0));
        jLabel9.setText("Computer1=>");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(410, 540, 113, 40);

        pcOneSkor.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        pcOneSkor.setForeground(new java.awt.Color(255, 0, 0));
        pcOneSkor.setText("000");
        getContentPane().add(pcOneSkor);
        pcOneSkor.setBounds(530, 540, 40, 40);

        jButton1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton1.setText("Başla");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(30, 15, 190, 30);

        jPanel1.setBackground(new java.awt.Color(255, 102, 102));
        jPanel1.setLayout(null);
        getContentPane().add(jPanel1);
        jPanel1.setBounds(40, 220, 360, 240);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        Prolab2 form = new Prolab2();
        form.setVisible(true);
        
    }//GEN-LAST:event_formWindowClosed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Timer timer = new Timer();  
        TimerTask task = new TimerTask() {           
           @Override
           public void run() {
               if (!oyunBittiMi) {
                   playGame();
               }else{
                   System.out.println("oyun bitti");
                   timer.cancel();                   
               }
           }                     
        };
        timer.scheduleAtFixedRate(task, 0,3000);
    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(pcVSpc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(pcVSpc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(pcVSpc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(pcVSpc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new pcVSpc().setVisible(true);
            }
        });
    }

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel pcOneSkor;
    private javax.swing.JLabel pcSkor;
    private javax.swing.JLabel poke1;
    private javax.swing.JLabel poke10;
    private javax.swing.JLabel poke2;
    private javax.swing.JLabel poke3;
    private javax.swing.JLabel poke4;
    private javax.swing.JLabel poke5;
    private javax.swing.JLabel poke6;
    private javax.swing.JLabel poke7;
    private javax.swing.JLabel poke8;
    private javax.swing.JLabel poke9;
    // End of variables declaration//GEN-END:variables

    private void addPokes(List<JLabel> pokes) {
          pokes.add(poke1);
          pokes.add(poke2);
          pokes.add(poke3);
          pokes.add(poke4);
          pokes.add(poke5);
          pokes.add(poke6);
          pokes.add(poke7);
          pokes.add(poke8);
          pokes.add(poke9);
          pokes.add(poke10);  
    }

    private void randomPoke() {
        Random random = new Random();
        List<Integer> list  = new ArrayList<>();
        List<Integer> temp  = new ArrayList<>();
        List<Pokemon> tempPokemons = new ArrayList<>();
        for (int i = 0; i < 10; i++) list.add(i);           
        for(int i = 0; i<10;i++){
            int x = random.nextInt(list.size());
            temp.add(list.get(x));
            list.remove(x);
        }       
        pcRandomPoke(temp);
        for(int i = 6;i<myPokemons.size();i++){
            helper.pokeYerlestir(pokes.get(i), myPokemons.get(temp.get(i)));
            tempPokemons.add(myPokemons.get(temp.get(i)));
        }
        myPokemons=tempPokemons;   
        
    }
    private void playGame() {
        int pcPokeId ,pcX,pcOneX, pcOnePokeId ,pcOnePokemonGuc=0,pcPokemonGuc;
        JLabel poke=null, poke1 = null;
        List<Pokemon> tempPcOneKart= pc1.getKartListesi();
        List<Pokemon> tempPcKart= pc.getKartListesi();
        Random random = new Random();
        pcX= random.nextInt(pc.getKartListesi().size());
        pcOneX= random.nextInt(pc1.getKartListesi().size());
        pcPokeId = pc.getKartListesi().get(pcX).getPokemonID();
        pcOnePokeId=pc1.getKartListesi().get(pcOneX).getPokemonID();
        
        for (JLabel card : pokes) {          
            if (Integer.valueOf(card.getName())==pcPokeId) {
                poke=card;
            }else if(Integer.valueOf(card.getName())==pcOnePokeId){
                poke1=card;
            }
        }
        
        poke1.setBounds(179, 350, 89, 125);  
        poke.setBounds(179, 215, 89, 125);
        
        pcPokemonGuc=helper.pokemonKarsilastir(pc.getKartListesi().get(pcX));
        pcOnePokemonGuc=helper.pokemonKarsilastir(pc1.getKartListesi().get(pcOneX));
        if (pcOnePokemonGuc>pcPokemonGuc)   pc1.setSkor(pc1.getSkor()+5);
        else if(pcOnePokemonGuc<pcPokemonGuc) pc.setSkor(pc.getSkor()+5);
 
        helper.destroyCard(poke,poke1);
        
        pcOneSkor.setText(""+pc1.getSkor());
        pcSkor.setText(""+pc.getSkor());
        for (int i = 0; i < pc1.getKartListesi().size(); i++) {
            if (pc1.getKartListesi().get(i).getPokemonID()==pcOnePokeId) 
                tempPcOneKart.remove(pc1.getKartListesi().get(i));                        
        }
        for (int i = 0; i < pc.getKartListesi().size(); i++) {
            if (pc.getKartListesi().get(i).getPokemonID()==pcPokeId) 
                tempPcKart.remove(pc.getKartListesi().get(i));                        
        }
        pc1.setKartListesi(tempPcOneKart);
        pc.setKartListesi(tempPcKart);
        helper.pokeKonumYenile(pokes, pc.getKartListesi(),pc1.getKartListesi());
       
        
        if (!myPokemons.isEmpty() && pc.getKartListesi().size()<3) {
            try {
                Thread.sleep(1500);
            } catch (InterruptedException ex) {
                Logger.getLogger(pcVSpc.class.getName()).log(Level.SEVERE, null, ex);
            }
            pc.kartSec(pc.getKartListesi(), myPokemons);
            pc1.kartSec(pc1.getKartListesi(), myPokemons);
        }
        
        
        helper.pokeKonumYenile(pokes, pc.getKartListesi(),pc1.getKartListesi());

        if(pc.getKartListesi().isEmpty())
        {
            if(pc1.getSkor()>pc.getSkor()){
                JOptionPane.showMessageDialog(this, "bilgisayar 1 kazandı");
            }else if(pc1.getSkor()==pc.getSkor()) JOptionPane.showMessageDialog(this, "Dostluk kazandı");
            else JOptionPane.showMessageDialog(this, "bilgisayar 2  kazandı");
            oyunBittiMi=true;
            Prolab2 form = new Prolab2();
            form.setVisible(true);
            this.setVisible(false);
        }
       
       
       
    }
    private void pcRandomPoke(List<Integer> temp) {
        List<Pokemon> pokemons= new ArrayList<>();        
        pokemons.add(myPokemons.get(temp.get(0)));
        pokemons.add(myPokemons.get(temp.get(1)));
        pokemons.add(myPokemons.get(temp.get(2)));
        for(int i = 0;i<pokemons.size();i++){
            helper.pokeYerlestir(pokes.get(i), pokemons.get(i));
        }
        this.pc.setKartListesi(pokemons);
       
        
        List<Pokemon> pokemons1= new ArrayList<>();        
        pokemons1.add(myPokemons.get(temp.get(3)));
        pokemons1.add(myPokemons.get(temp.get(4)));
        pokemons1.add(myPokemons.get(temp.get(5)));
        for(int i=3;i<6;i++){
            helper.pokeYerlestir(pokes.get(i), pokemons1.get(i-3));
        }
        this.pc1.setKartListesi(pokemons1);
        
        
    }

  
}