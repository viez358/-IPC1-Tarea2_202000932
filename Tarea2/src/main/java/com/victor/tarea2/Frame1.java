/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.victor.tarea2;

/**
 *
 * @author VO
 */
public class Frame1 extends javax.swing.JFrame {

    /**
     * Creates new form Frame1
     */
    
    Frame2 f2 = new Frame2();
    
    public Frame1() {
        initComponents();
        initComponents2();              /**Código para Centrar Ventana*/
    }
    
    public void initComponents2(){      /**Código para Centrar Ventana*/
        setLocationRelativeTo(null);    /**Código para Centrar Ventana*/
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        Buttom_Registrarse = new javax.swing.JButton();
        TXT_Password = new javax.swing.JTextField();
        TXT_User_Name = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        Buttom_Iniciar_Sesion = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(683, 384));
        jPanel1.setLayout(null);

        Buttom_Registrarse.setText("Sign In");
        Buttom_Registrarse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Buttom_RegistrarseActionPerformed(evt);
            }
        });
        jPanel1.add(Buttom_Registrarse);
        Buttom_Registrarse.setBounds(310, 240, 69, 25);
        jPanel1.add(TXT_Password);
        TXT_Password.setBounds(260, 170, 160, 30);
        jPanel1.add(TXT_User_Name);
        TXT_User_Name.setBounds(260, 130, 160, 30);

        jLabel1.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jLabel1.setText("Login");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(10, 10, 70, 30);

        Buttom_Iniciar_Sesion.setText("Log In");
        Buttom_Iniciar_Sesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Buttom_Iniciar_SesionActionPerformed(evt);
            }
        });
        jPanel1.add(Buttom_Iniciar_Sesion);
        Buttom_Iniciar_Sesion.setBounds(310, 210, 70, 25);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Buttom_RegistrarseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Buttom_RegistrarseActionPerformed
        f2.setVisible(true);
        this.setVisible(false);    
    }//GEN-LAST:event_Buttom_RegistrarseActionPerformed

    private void Buttom_Iniciar_SesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Buttom_Iniciar_SesionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Buttom_Iniciar_SesionActionPerformed
    
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
            java.util.logging.Logger.getLogger(Frame1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Frame1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Frame1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Frame1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Frame1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Buttom_Iniciar_Sesion;
    private javax.swing.JButton Buttom_Registrarse;
    private javax.swing.JTextField TXT_Password;
    private javax.swing.JTextField TXT_User_Name;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
