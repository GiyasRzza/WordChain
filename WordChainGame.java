
package WordChain;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

public class WordChainGame extends javax.swing.JFrame implements Game{
     private String word ;
     private boolean gameIs;
     private int point;
     private String name;
    public WordChainGame() {
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
            initComponents();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(WordChainGame.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            Logger.getLogger(WordChainGame.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            Logger.getLogger(WordChainGame.class.getName()).log(Level.SEVERE, null, ex);
        } catch (UnsupportedLookAndFeelException ex) {
            Logger.getLogger(WordChainGame.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
     public String getInputOne() {
        return inputOne;
    }

    public void setInputOne(String inputOne) {
        this.inputOne = inputOne;
    }

    private String inputOne;

    public String getWord() {
        return word;
    }

    public void setWord(String word) {
        this.word = word;
    }

    public boolean isGameIs() {
        return gameIs;
    }

    public void setGameIs(boolean gameIs) {
        this.gameIs = gameIs;
    }

    
    
     public int getPoint() {
        return point;
    }

    public void setPoint(int point) {
        this.point = point;
    }
       public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public String myPane(String messages){
        return JOptionPane.showInputDialog(this, messages);
    }
    

   
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(51, 51, 51));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 204));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Oyuna Xosh Gelmisiniz");

        jTextArea1.setEditable(false);
        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Segoe Print", 0, 14)); // NOI18N
        jTextArea1.setForeground(new java.awt.Color(255, 51, 51));
        jTextArea1.setRows(5);
        jTextArea1.setText("Salam Bu oyunun 1 ci versiyasidir,Ikinci versiya ise api \nile olacaq google translete apisine baglanaraq girilen \nsozlerin ingilisce qarsiliqin tapacaqsiniz\n\n");
        jScrollPane1.setViewportView(jTextArea1);

        jButton1.setFont(new java.awt.Font("Serif", 3, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(0, 255, 0));
        jButton1.setText("Ready");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 461, Short.MAX_VALUE)
                    .addComponent(jScrollPane1))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(86, 86, 86)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 293, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(48, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        setName(JOptionPane.showInputDialog(this, "Adinizi ve soy adinizi daxil edin!"));
        play();
    }//GEN-LAST:event_jButton1ActionPerformed

    
    public static void main(String args[]) {
     
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new WordChainGame().setVisible(true);
            }
        });
    }

    @Override
    public void initialize() {
         setInputOne(myPane("Sozu daxil edin"));
         setWord(myPane("Sozu daxil edin"));
        setGameIs(true);
        setPoint(3);
    }

    @Override
    public void play() {
     
        initialize();
        while (isGameOver()) {
            if (getWord().charAt(0) == getInputOne().charAt(getInputOne().length() - 1)) {
                setInputOne(getWord());
                setWord(myPane("Sozu daxil edin"));
            } else {
                if (getPoint()<=1){
                    setGameIs(false);
                   JOptionPane.showMessageDialog(this, "Game Over!!");
                    System.exit(0);
                }
                else {
                    setPoint(getPoint()-1);
                    JOptionPane.showMessageDialog(this, "Yanlis cavab,Oynama haqqiniz: "+getPoint());
                    setWord(myPane("Sozu daxil edin"));
                }
            }
        }
      
        
    }

    @Override
    public boolean isGameOver() {
        if (gameIs) {
            return true;
        }
        else {
            return false;
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    // End of variables declaration//GEN-END:variables
}
