package com.company;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import javax.swing.JOptionPane;

/**
 *
 * @author student
 */
public class cSoustavy extends javax.swing.JFrame { //extends - rozšiřuje(dědičnost)
    private int s = 10; // s jako soustava
    /**
     * Creates new form cSoustavy
     */
    public cSoustavy() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        cislo = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        binCislo = new javax.swing.JLabel();
        vysledek = new javax.swing.JButton();
        octCislo = new javax.swing.JLabel();
        decCislo = new javax.swing.JLabel();
        soustava = new javax.swing.JComboBox();
        hexCislo = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        konec = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel3.setBackground(java.awt.Color.black);
        jLabel3.setForeground(new java.awt.Color(23, 11, 11));
        jLabel3.setText("              Vyjádření čísla v číselné soustavách");
        jLabel3.setVerticalTextPosition(javax.swing.SwingConstants.TOP);

        jLabel10.setText("0");

        jLabel2.setText("Zadej číslo");

        jLabel11.setText("0");

        cislo.setText("0");
        cislo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cisloActionPerformed(evt);
            }
        });

        jLabel4.setText("Vyber číselnou soustavu");

        binCislo.setText("BIN");

        vysledek.setText("Výsledek");
        vysledek.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                vysledekActionPerformed(evt);
            }
        });

        octCislo.setText("OCT");

        decCislo.setText("DEC");

        soustava.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "binární", "oktálová", "dekadická", "hexadecimální" }));
        soustava.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                soustavaActionPerformed(evt);
            }
        });

        hexCislo.setText("HEX");

        jLabel9.setText("0");

        jLabel12.setText("0");

        konec.setText("Konec");
        konec.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                konecActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(16, 16, 16)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addComponent(cislo)
                                                                .addGap(18, 18, 18)
                                                                .addComponent(soustava, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addComponent(jLabel2)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
                                                                .addComponent(jLabel4)))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(vysledek))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(12, 12, 12)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(binCislo)
                                                        .addComponent(octCislo)
                                                        .addComponent(decCislo)
                                                        .addComponent(hexCislo))
                                                .addGap(77, 77, 77)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(0, 0, Short.MAX_VALUE))
                                        .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(16, 16, 16))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(konec, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(163, 163, 163))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel4)
                                        .addComponent(jLabel2))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(soustava, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(vysledek)
                                        .addComponent(cislo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(12, 12, 12)
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(binCislo)
                                        .addComponent(jLabel9))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(octCislo)
                                        .addComponent(jLabel10))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(decCislo)
                                        .addComponent(jLabel11))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(hexCislo)
                                        .addComponent(jLabel12))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                                .addComponent(konec)
                                .addContainerGap())
        );

        cislo.getAccessibleContext().setAccessibleName("");
        cislo.getAccessibleContext().setAccessibleDescription("");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void soustavaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_soustavaActionPerformed
       /* switch(soustava.getSelectedIndex()){
            case 0: s = 2;
                break;
            case 1: s = 8;
                break;
            case 2: s = 10;
                break;
            case 3: s = 16;
                break;
        }*/
        int[] poleSoustav = {2,8,10,16};
        s = poleSoustav[soustava.getSelectedIndex()];
    }//GEN-LAST:event_soustavaActionPerformed

    private void cisloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cisloActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cisloActionPerformed

    private void konecActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_konecActionPerformed
        System.exit(0);
        //this.dispose();
    }//GEN-LAST:event_konecActionPerformed

    private void vysledekActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_vysledekActionPerformed
        //vyjímky
        try {

            String dec = Integer.toString(Integer.parseInt(cislo.getText(),s));
            jLabel11.setText(dec);
            String bin = Integer.toBinaryString(Integer.parseInt(cislo.getText(),s));
            jLabel9.setText(bin);
            String oct = Integer.toOctalString(Integer.parseInt(cislo.getText(),s));
            jLabel10.setText(oct);
            String hex = Integer.toHexString(Integer.parseInt(cislo.getText(),s));
            jLabel12.setText(hex);
            //výpis chybové hlášky
        }catch (Exception e){
            JOptionPane.showMessageDialog(null,"Neplatne zadani", "Chyba",JOptionPane.ERROR_MESSAGE);
            return;
        }




        //jLabel11.setText(cislo.getText());

        //jLabel9.settext(String.format("%b"cislo.getText()));

    }//GEN-LAST:event_vysledekActionPerformed

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
            java.util.logging.Logger.getLogger(cSoustavy.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(cSoustavy.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(cSoustavy.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(cSoustavy.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new cSoustavy().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel binCislo;
    private javax.swing.JTextField cislo;
    private javax.swing.JLabel decCislo;
    private javax.swing.JLabel hexCislo;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JButton konec;
    private javax.swing.JLabel octCislo;
    private javax.swing.JComboBox soustava;
    private javax.swing.JButton vysledek;
    // End of variables declaration//GEN-END:variables
}
