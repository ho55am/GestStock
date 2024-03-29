/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ma.view;

import java.util.ArrayList;
import ma.controller.Client_controller;
import ma.controller.Commande_controller;
import ma.controller.Produit_controller;
import ma.model.Client_model;
import ma.model.Commande_model;

/**
 *
 * @author BEKRI
 */
public class Commandes extends javax.swing.JDialog {

    /**
     * Creates new form Commandes
     */
    public Commandes(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        
        Combo_client.setModel(new javax.swing.DefaultComboBoxModel(new Client_controller().getallclients().toArray()));
        Combo_product.setModel(new javax.swing.DefaultComboBoxModel(new Produit_controller().getallproducts().toArray()));
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtRech = new javax.swing.JTextField();
        txtIdcomm = new javax.swing.JTextField();
        txtQte = new javax.swing.JTextField();
        txtTTC = new javax.swing.JTextField();
        Combo_client = new javax.swing.JComboBox();
        Combo_product = new javax.swing.JComboBox();
        jTrecherche = new javax.swing.JButton();
        jnouveau = new javax.swing.JButton();
        jenregistrer = new javax.swing.JButton();
        jsupprimer = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(600, 400));
        setResizable(false);
        getContentPane().setLayout(null);

        jLabel1.setText("COMMANDES");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(349, 0, 155, 43);

        jLabel2.setText("Rechercher Id Commande");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(33, 75, 124, 14);

        jLabel3.setText("Id.Commande");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(33, 115, 67, 14);

        jLabel4.setText("Client");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(33, 153, 27, 14);

        jLabel5.setText("Produit");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(33, 191, 34, 14);

        jLabel6.setText("Quantité");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(33, 229, 42, 14);

        jLabel7.setText("TTC");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(33, 267, 19, 14);
        getContentPane().add(txtRech);
        txtRech.setBounds(185, 72, 174, 20);
        getContentPane().add(txtIdcomm);
        txtIdcomm.setBounds(185, 112, 174, 20);
        getContentPane().add(txtQte);
        txtQte.setBounds(185, 226, 174, 20);
        getContentPane().add(txtTTC);
        txtTTC.setBounds(185, 264, 174, 20);

        Combo_client.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        getContentPane().add(Combo_client);
        Combo_client.setBounds(185, 150, 174, 20);

        Combo_product.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        getContentPane().add(Combo_product);
        Combo_product.setBounds(185, 188, 174, 20);

        jTrecherche.setText("Rechercher");
        jTrecherche.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTrechercheActionPerformed(evt);
            }
        });
        getContentPane().add(jTrecherche);
        jTrecherche.setBounds(406, 71, 87, 23);

        jnouveau.setText("Nouveau");
        jnouveau.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jnouveauActionPerformed(evt);
            }
        });
        getContentPane().add(jnouveau);
        jnouveau.setBounds(10, 310, 130, 23);

        jenregistrer.setText("Enregistrer");
        jenregistrer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jenregistrerActionPerformed(evt);
            }
        });
        getContentPane().add(jenregistrer);
        jenregistrer.setBounds(150, 310, 140, 23);

        jsupprimer.setText("Supprimer");
        getContentPane().add(jsupprimer);
        jsupprimer.setBounds(300, 310, 150, 23);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTrechercheActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTrechercheActionPerformed
      Commande_controller controller = new Commande_controller();
      ArrayList<Commande_model> clientList=controller.getCommandeBy_nom(txtRech.getText());
        for (Commande_model client_model : clientList) {
            txtIdcomm.setText(client_model.getId_commande()+"");
            txtQte.setText(client_model.getQuantite()+"");
            txtTTC.setText(client_model.getTVA()+"");
        break;    
        }
    }//GEN-LAST:event_jTrechercheActionPerformed

    private void jnouveauActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jnouveauActionPerformed
            
        txtIdcomm.setText(null);
        txtQte.setText(null);
        txtTTC.setText(null);
    }//GEN-LAST:event_jnouveauActionPerformed

    private void jenregistrerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jenregistrerActionPerformed
        Commande_controller controller = new Commande_controller(); 
        Commande_model commandes = new Commande_model();
        
    }//GEN-LAST:event_jenregistrerActionPerformed

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
            java.util.logging.Logger.getLogger(Commandes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Commandes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Commandes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Commandes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Commandes dialog = new Commandes(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox Combo_client;
    private javax.swing.JComboBox Combo_product;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JButton jTrecherche;
    private javax.swing.JButton jenregistrer;
    private javax.swing.JButton jnouveau;
    private javax.swing.JButton jsupprimer;
    private javax.swing.JTextField txtIdcomm;
    private javax.swing.JTextField txtQte;
    private javax.swing.JTextField txtRech;
    private javax.swing.JTextField txtTTC;
    // End of variables declaration//GEN-END:variables
}
