
package prolab2;


import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;


import javax.swing.JLabel;
import javax.swing.JOptionPane;
import prolab2.classes.BilgisayarOyuncusu;
import prolab2.classes.InsanOyuncusu;
import prolab2.classes.Pokemon;

public class oyuncuVSpc extends javax.swing.JFrame {

    List<Pokemon> myPokemons = new ArrayList<>();  
    BilgisayarOyuncusu pc = new BilgisayarOyuncusu();
    InsanOyuncusu human = new InsanOyuncusu(); 
    List<JLabel> pokes = new ArrayList<>();
    PokemonHelper helper = new PokemonHelper();
    public oyuncuVSpc() {
        initComponents();
        helper.addPokemon(myPokemons); 
        addPokes(this.pokes);
        randomPoke();
       helper.kartlariCevir(myPokemons,pc.getKartListesi(),pokes);
        for (int i = 0; i < pokes.size(); i++) {
            final int temp = i;
                pokes.get(i).addMouseListener(new MouseAdapter() {   
                @Override
                public void mouseClicked(MouseEvent e)
                {  
                    for (int j = 0; j < human.getKartListesi().size(); j++) {
                        if (human.getKartListesi().get(j).getPokemonID()==Integer.valueOf(pokes.get(temp).getName())) {
                            if (human.getKartListesi().size()==3 ||myPokemons.isEmpty() ) {
                                 comeOnFight(pokes.get(temp));
                            }else System.out.println("yanlış hamle");
                        }
                    }
                }               
            });
        }  
    }
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
        jButton1 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        humanSkor = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Oyuncu vs Bilgisayar");
        setPreferredSize(new java.awt.Dimension(573, 649));
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
        poke2.setBounds(179, 77, 89, 125);

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 0, 0));
        jLabel7.setText("Computer =>");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(390, 20, 109, 40);

        pcSkor.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        pcSkor.setForeground(new java.awt.Color(255, 0, 0));
        pcSkor.setText("000");
        getContentPane().add(pcSkor);
        pcSkor.setBounds(500, 20, 40, 40);

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
        poke3.setBounds(318, 77, 89, 125);

        poke1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        poke1.setText("1");
        getContentPane().add(poke1);
        poke1.setBounds(40, 77, 89, 125);

        poke7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        poke7.setText("7");
        getContentPane().add(poke7);
        poke7.setBounds(450, 230, 89, 125);

        poke8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        poke8.setText("8");
        getContentPane().add(poke8);
        poke8.setBounds(450, 360, 89, 125);

        poke10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        poke10.setText("10");
        getContentPane().add(poke10);
        poke10.setBounds(420, 280, 89, 125);

        poke9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        poke9.setText("9");
        getContentPane().add(poke9);
        poke9.setBounds(420, 180, 89, 125);

        jButton1.setText("KartVer");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(180, 10, 150, 50);

        jPanel1.setBackground(new java.awt.Color(255, 102, 102));
        jPanel1.setLayout(null);
        getContentPane().add(jPanel1);
        jPanel1.setBounds(50, 209, 360, 280);

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 0, 0));
        jLabel9.setText("Player 1 =>");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(410, 540, 100, 40);

        humanSkor.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        humanSkor.setForeground(new java.awt.Color(255, 0, 0));
        humanSkor.setText("000");
        getContentPane().add(humanSkor);
        humanSkor.setBounds(510, 540, 40, 40);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        Prolab2 form = new Prolab2();
        form.setVisible(true);
    }//GEN-LAST:event_formWindowClosed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if (myPokemons.size()>0) {
            if (human.getKartListesi().size()<3) {
                  kartSec();
            }else{
                System.out.println("yeterli kartın var");
            }
        }else{
            System.out.println("Kart Kalmadı");
        }
    }//GEN-LAST:event_jButton1ActionPerformed

 
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
            java.util.logging.Logger.getLogger(oyuncuVSpc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(oyuncuVSpc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(oyuncuVSpc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(oyuncuVSpc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new oyuncuVSpc().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel humanSkor;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
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
    
    public void kartSec() {        
        human.kartSec(human.getKartListesi(), myPokemons);       
        pc.kartSec(pc.getKartListesi(), myPokemons);
        helper.pokeKonumYenile(pokes, pc.getKartListesi(),human.getKartListesi());
        for (int i = 0; i < pokes.size(); i++) {
            if (human.getKartListesi().get(2).getPokemonID()==Integer.valueOf(pokes.get(i).getName())) {
                helper.kartCevir(pokes.get(i));
            }
        }
        
    }
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
    private void randomPoke(){
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
        humanRandomPoke(temp);
        for(int i = 6;i<myPokemons.size();i++){
            helper.pokeYerlestir(pokes.get(i), myPokemons.get(temp.get(i)));
            tempPokemons.add(myPokemons.get(temp.get(i)));
        }
        myPokemons=tempPokemons;        
    }
    private void pcRandomPoke( List<Integer> temp ) {
        List<Pokemon> pokemons= new ArrayList<>();        
        pokemons.add(myPokemons.get(temp.get(0)));
        pokemons.add(myPokemons.get(temp.get(1)));
        pokemons.add(myPokemons.get(temp.get(2)));
        for(int i = 0;i<pokemons.size();i++){
            helper.pokeYerlestir(pokes.get(i), pokemons.get(i));
        }
        this.pc.setKartListesi(pokemons);
    }
    private void comeOnFight(JLabel poke){
        int pcPokeId ,x,  humanPokeId ,humanPokemonGuc=0,pcPokemonGuc;
        JLabel poke1 = null;
        List<Pokemon> tempHumKart= human.getKartListesi();
        List<Pokemon> tempPcKart= pc.getKartListesi();
        Random random = new Random();
        x= random.nextInt(pc.getKartListesi().size());
        humanPokeId = Integer.parseInt(poke.getName()); 
        pcPokeId = pc.getKartListesi().get(x).getPokemonID();
      
        for (JLabel card : pokes) {
            if (Integer.valueOf(card.getName())==pcPokeId) {
                poke1=card;
            }
        }
        poke.setBounds(179, 350, 89, 125);  
        poke1.setBounds(179, 215, 89, 125);
        helper.kartCevir(poke1);
        for (Pokemon pokemon : human.getKartListesi()) {
            if (pokemon.getPokemonID()==humanPokeId) 
                humanPokemonGuc= helper.pokemonKarsilastir(pokemon);
        }
        pcPokemonGuc=helper.pokemonKarsilastir(pc.getKartListesi().get(x));
        
        if (humanPokemonGuc>pcPokemonGuc) {
            human.setSkor(human.getSkor()+5);
        }else if(humanPokemonGuc<pcPokemonGuc){
            pc.setSkor(pc.getSkor()+5);
        }
        humanSkor.setText(""+human.getSkor());
        pcSkor.setText(""+pc.getSkor());
        helper.destroyCard(poke,poke1);
        
        
        for (int i = 0; i < human.getKartListesi().size(); i++) {
            if (human.getKartListesi().get(i).getPokemonID()==humanPokeId) 
                tempHumKart.remove(human.getKartListesi().get(i));                        
        }
        for (int i = 0; i < pc.getKartListesi().size(); i++) {
            if (pc.getKartListesi().get(i).getPokemonID()==pcPokeId) 
                tempPcKart.remove(pc.getKartListesi().get(i));                        
        }
        human.setKartListesi(tempHumKart);
        pc.setKartListesi(tempPcKart);
        
        
        if (human.getKartListesi().isEmpty()) {
            if(human.getSkor()>pc.getSkor()){
                JOptionPane.showMessageDialog(this, "İnsanlık kazandı");
            }else if(human.getSkor()==pc.getSkor()) JOptionPane.showMessageDialog(this, "Dostluk kazandı");
            else JOptionPane.showMessageDialog(this, "Yapay zeka  kazandı");
            Prolab2 form = new Prolab2();
            form.setVisible(true);
            this.setVisible(false);
        }
        
        
        helper.pokeKonumYenile(pokes, pc.getKartListesi(),human.getKartListesi());
    }
    private void humanRandomPoke( List<Integer> temp ) {
        List<Pokemon> pokemons= new ArrayList<>();
        pokemons.add(myPokemons.get(temp.get(3)));
        pokemons.add(myPokemons.get(temp.get(4)));
        pokemons.add(myPokemons.get(temp.get(5)));
        for(int i = 0;i<pokemons.size();i++){
            helper.pokeYerlestir(pokes.get(i+3), pokemons.get(i));
        }
        this.human.setKartListesi(pokemons);
    }

     
}
