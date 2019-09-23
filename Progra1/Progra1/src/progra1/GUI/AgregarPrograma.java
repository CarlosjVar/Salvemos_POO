/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package progra1.GUI;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import progra1.logica.Locutor;
import progra1.logica.RadioEmisora;

/**
 *
 * @author Mau
 */
public class AgregarPrograma extends javax.swing.JFrame {

    /**
     * Creates new form AgregarPrograma
     */
    public AgregarPrograma() {
        initComponents();
        RadioEmisora r = Principal.getEmisora();
        ArrayList<Locutor> l = r.getLocutores();
        for(Locutor loc : l){
            cbLocutorPr.addItem(loc.getNombre());
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel19 = new javax.swing.JLabel();
        tbGeneroPr = new javax.swing.JTextField();
        tbNombrePr = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        Duración = new javax.swing.JLabel();
        tbHorarioPr = new javax.swing.JTextField();
        tbDuracionPr = new javax.swing.JTextField();
        btAgregarPr = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        cbLocutorPr = new javax.swing.JComboBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel19.setText("Agregar programa");
        getContentPane().add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(144, 35, -1, -1));
        getContentPane().add(tbGeneroPr, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 190, 110, -1));
        getContentPane().add(tbNombrePr, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 80, 110, -1));

        jLabel16.setText("Nombre");
        getContentPane().add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 80, -1, -1));

        jLabel20.setText("Género:");
        getContentPane().add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 190, -1, -1));

        jLabel15.setText("Horario");
        getContentPane().add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 120, -1, -1));

        jLabel21.setText("Locutor");
        getContentPane().add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 230, -1, -1));

        Duración.setText("Duración");
        getContentPane().add(Duración, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 160, -1, -1));
        getContentPane().add(tbHorarioPr, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 120, 110, -1));
        getContentPane().add(tbDuracionPr, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 160, 110, -1));

        btAgregarPr.setText("Agregar");
        btAgregarPr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAgregarPrActionPerformed(evt);
            }
        });
        getContentPane().add(btAgregarPr, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 280, -1, -1));
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(165, 321, -1, -1));
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 340, -1, -1));

        cbLocutorPr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbLocutorPrActionPerformed(evt);
            }
        });
        getContentPane().add(cbLocutorPr, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 230, 110, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cbLocutorPrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbLocutorPrActionPerformed

            
        
    }//GEN-LAST:event_cbLocutorPrActionPerformed

    private void btAgregarPrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAgregarPrActionPerformed
        String nombre = tbNombrePr.getText();
        String horario =tbHorarioPr.getText();
        String duracion = tbDuracionPr.getText();
        String genero = tbGeneroPr.getText();
        int locutor = cbLocutorPr.getSelectedIndex();
        
                if (nombre.equals("") || horario.equals("") || duracion.equals("") || genero.equals("")  ){
            JOptionPane.showMessageDialog(null, "Debe rellenar todos los espacios");
        }
        
        else{
            try {
                int horar = Integer.parseInt(horario);
                
                   try {
                        int duracion2 = Integer.parseInt(duracion);
                        RadioEmisora r = Principal.getEmisora();
                        ArrayList<Locutor> locut = r.getLocutores();
                        Locutor locutor2=locut.get(locutor);
                        r.agregarPrograma(nombre, horar, duracion2, genero, locutor2);
                        Principal.setEmisora(r);
                        this.dispose();
                        JOptionPane.showMessageDialog(null, "Programa agregado correctamente");
                    }

                     catch(Exception e){
                         JOptionPane.showMessageDialog(null, "Debe ingresar un numero en duracion");

                    }

            }

            catch(Exception e){
                JOptionPane.showMessageDialog(null, "Debe ingresar un numero en horario");

             }
        }
    }//GEN-LAST:event_btAgregarPrActionPerformed

    /**
     * @param args the command line arguments
     */
    public void iniciar(){
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
            java.util.logging.Logger.getLogger(AgregarPrograma.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AgregarPrograma.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AgregarPrograma.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AgregarPrograma.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>


        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AgregarPrograma().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Duración;
    private javax.swing.JButton btAgregarPr;
    private javax.swing.JComboBox cbLocutorPr;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JTextField tbDuracionPr;
    private javax.swing.JTextField tbGeneroPr;
    private javax.swing.JTextField tbHorarioPr;
    private javax.swing.JTextField tbNombrePr;
    // End of variables declaration//GEN-END:variables
}
