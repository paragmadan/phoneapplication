/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication7;

import com.sun.javafx.scene.control.skin.FXVK;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import jdk.nashorn.internal.parser.TokenType;

/**
 *
 * @author P@r@G
 */
public class addcont extends javax.swing.JFrame {

    /**
     * Creates new form addcont
     */
    public addcont() {
        initComponents();
     email.setVisible(false);
     address.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        ol = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        phno = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        nm = new javax.swing.JTextField();
        more = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        adrs = new javax.swing.JLabel();
        email = new javax.swing.JTextField();
        address = new javax.swing.JTextField();
        war = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(490, 420));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setIcon(new javax.swing.ImageIcon("C:\\Users\\P@r@G\\Desktop\\imageproj\\download1.png")); // NOI18N
        jButton1.setText("BACK");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 80, -1));

        ol.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentHidden(java.awt.event.ComponentEvent evt) {
                olComponentHidden(evt);
            }
        });
        getContentPane().add(ol, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 280, 110, 20));

        jButton2.setBackground(new java.awt.Color(102, 255, 51));
        jButton2.setText("SUBMIT");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 360, -1, 20));
        getContentPane().add(phno, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 240, 180, -1));

        jLabel2.setText("ENTER NAME");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 200, 80, 20));
        getContentPane().add(nm, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 200, 180, -1));

        more.setBackground(new java.awt.Color(255, 255, 0));
        more.setFont(new java.awt.Font("Tempus Sans ITC", 0, 11)); // NOI18N
        more.setForeground(new java.awt.Color(255, 51, 51));
        more.setIcon(new javax.swing.ImageIcon("C:\\Users\\P@r@G\\Desktop\\imageproj\\more.png")); // NOI18N
        more.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                moreActionPerformed(evt);
            }
        });
        getContentPane().add(more, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 270, 90, 30));

        jLabel3.setText("Enter PHONE NO.");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 240, 110, 20));
        getContentPane().add(adrs, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 320, 100, 20));

        email.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emailActionPerformed(evt);
            }
        });
        getContentPane().add(email, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 280, 180, -1));
        getContentPane().add(address, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 320, 180, -1));

        war.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        war.setForeground(new java.awt.Color(255, 51, 51));
        getContentPane().add(war, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 260, 330, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\P@r@G\\Desktop\\imageproj\\images (1).jpg")); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 0, 360, 190));

        jPanel2.setBackground(new java.awt.Color(255, 204, 204));
        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(-30, -10, 650, 490));
        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        phBOOK g=new phBOOK();
       g.setVisible(true);
        setVisible(false);
        ///`System.exit(0);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void moreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_moreActionPerformed
        // TODO add your handling code here:
f=1;
        more.setVisible(false);
        ol.setText("EMAIL");
      adrs.setText("ADDRESS");
      email.setVisible(true);
      address.setVisible(true);
    }//GEN-LAST:event_moreActionPerformed

    private void olComponentHidden(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_olComponentHidden
        // TODO add your handling code here:

    }//GEN-LAST:event_olComponentHidden

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        String dd=""+nm.getText();
        String dd1=""+phno.getText();
        String e=""+email.getText();
        String a=""+address.getText();
       if(dd.equals("")&&phno.getText().equals(""))
      {
           war.setText("!!!!!!!!  Enter atleast  one detail !!!!!!!");
       }
       else
       {
       continfo inf=new continfo(dd,dd1,e,a);
   userDAO uu=new userDAO();
            try {
                if(uu.ins(inf)>0)
                {
                    war.setForeground(new java.awt.Color(0,255,0));
                    war.setText("CONGO,YOUR DETAILS WERE INSERTED");
                }
                else
                    JOptionPane.showMessageDialog(this,"SORRY<YOUR RECORD COULNT BE INSERTED");
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(addcont.class.getName()).log(Level.SEVERE, null, ex);
            } catch (SQLException ex) {
                Logger.getLogger(addcont.class.getName()).log(Level.SEVERE, null, ex);
            }
       }
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void emailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_emailActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
//        ol.setVisible(false);

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(addcont.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(addcont.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(addcont.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(addcont.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new addcont().setVisible(true);
              //  ui.setVisible(false);
            }
        });
    
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField address;
    private javax.swing.JLabel adrs;
    private javax.swing.JTextField email;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JButton more;
    private javax.swing.JTextField nm;
    private javax.swing.JLabel ol;
    private javax.swing.JTextField phno;
    private javax.swing.JLabel war;
    // End of variables declaration//GEN-END:variables
private static int f=0;
}