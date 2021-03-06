/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.victor.tarea2;

/**
 *
 * @author VO
 */
public class Frame2 extends javax.swing.JFrame {

    private static Usuario[] listaUsuario=new Usuario[2];
    
    /**
     * Creates new form Frame2
     */
    public Frame2() {
        initComponents();
        initComponents2();              /**Código para Centrar Ventana*/
    }
    
    private void initComponents2(){      /**Código para Centrar Ventana*/
        setLocationRelativeTo(null);    /**Código para Centrar Ventana*/
    }
    
    private Usuario[] redimensionarArreglo(Usuario[] arreglo){
        Usuario[] temporal=new Usuario[arreglo.length + 1];        
        for (int i = 0; i < arreglo.length; i++) {            
            temporal[i]=arreglo[i];
        }
        return temporal;
    }
    
    
    // Método que verifica si hay espacio para redimensionar el arreglo.
    
    private Boolean hayEspacio(Usuario[] arreglo){
        Boolean espacio=false;
        for (int i = 0; i < arreglo.length; i++) {
            if (arreglo[i]==null) {                
                espacio=true;
                break;
            }
        }
        return espacio;
    }

    
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jToggleButton1 = new javax.swing.JToggleButton();
        jPanel1 = new javax.swing.JPanel();
        Buttom_Refrescar = new javax.swing.JButton();
        TXT_Password = new javax.swing.JTextField();
        TXT_User_Name = new javax.swing.JTextField();
        Mostrar_Contra = new javax.swing.JLabel();
        Buttom_Add_User = new javax.swing.JButton();
        Buttom_Regresar_Iniciar_Sesion = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        Mostrar_Usuario = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        jToggleButton1.setText("jToggleButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(683, 384));
        jPanel1.setLayout(null);

        Buttom_Refrescar.setText("Refresh");
        Buttom_Refrescar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Buttom_RefrescarActionPerformed(evt);
            }
        });
        jPanel1.add(Buttom_Refrescar);
        Buttom_Refrescar.setBounds(20, 90, 80, 25);
        jPanel1.add(TXT_Password);
        TXT_Password.setBounds(190, 20, 160, 30);
        jPanel1.add(TXT_User_Name);
        TXT_User_Name.setBounds(20, 20, 160, 30);

        Mostrar_Contra.setBackground(new java.awt.Color(255, 255, 153));
        Mostrar_Contra.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jPanel1.add(Mostrar_Contra);
        Mostrar_Contra.setBounds(360, 150, 290, 30);

        Buttom_Add_User.setText("Add User");
        Buttom_Add_User.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Buttom_Add_UserActionPerformed(evt);
            }
        });
        jPanel1.add(Buttom_Add_User);
        Buttom_Add_User.setBounds(20, 60, 80, 25);

        Buttom_Regresar_Iniciar_Sesion.setText("Back");
        Buttom_Regresar_Iniciar_Sesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Buttom_Regresar_Iniciar_SesionActionPerformed(evt);
            }
        });
        jPanel1.add(Buttom_Regresar_Iniciar_Sesion);
        Buttom_Regresar_Iniciar_Sesion.setBounds(20, 120, 80, 25);

        jLabel2.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jLabel2.setText("Register");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(580, 10, 90, 30);

        Mostrar_Usuario.setBackground(new java.awt.Color(255, 255, 153));
        Mostrar_Usuario.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jPanel1.add(Mostrar_Usuario);
        Mostrar_Usuario.setBounds(320, 110, 290, 30);

        jLabel4.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jLabel4.setText("Usuario:");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(220, 110, 90, 30);

        jLabel3.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jLabel3.setText("Contraseña:");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(220, 150, 140, 30);

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

    private void Buttom_RefrescarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Buttom_RefrescarActionPerformed
        
        for (int i = 0; i < listaUsuario.length; i++) {
            
            if (listaUsuario[i]!=null){
                System.out.println("*********");
                System.out.println(listaUsuario[i].getNombreUsuario());
                System.out.println(listaUsuario[i].getPassword());
                System.out.println("*********");
            }
            
        }
        
    }//GEN-LAST:event_Buttom_RefrescarActionPerformed
        
    private void Buttom_Add_UserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Buttom_Add_UserActionPerformed
        
        //Verificación si hay que redimensionar arreglo
        if (!hayEspacio(listaUsuario)) {
            System.out.println("Tamaño Actual: " + listaUsuario.length);
            listaUsuario = redimensionarArreglo(listaUsuario);
            System.out.println("Tamaño Nuevo: " + listaUsuario.length);
        }
        
        //Busca Posición Vacía para Agregar al Usuario
        for (int i = 0; i < listaUsuario.length; i++) {
            if (listaUsuario[i]==null){
                listaUsuario[i] = new Usuario(TXT_User_Name.getText(), TXT_Password.getText());
                break;
            }
        }
    }//GEN-LAST:event_Buttom_Add_UserActionPerformed

    private void Buttom_Regresar_Iniciar_SesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Buttom_Regresar_Iniciar_SesionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Buttom_Regresar_Iniciar_SesionActionPerformed

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
            java.util.logging.Logger.getLogger(Frame2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Frame2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Frame2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Frame2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Frame2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Buttom_Add_User;
    private javax.swing.JButton Buttom_Refrescar;
    private javax.swing.JButton Buttom_Regresar_Iniciar_Sesion;
    private javax.swing.JLabel Mostrar_Contra;
    private javax.swing.JLabel Mostrar_Usuario;
    private javax.swing.JTextField TXT_Password;
    private javax.swing.JTextField TXT_User_Name;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JToggleButton jToggleButton1;
    // End of variables declaration//GEN-END:variables
}
