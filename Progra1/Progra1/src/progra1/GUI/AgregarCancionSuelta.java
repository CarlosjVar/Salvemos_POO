/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package progra1.GUI;

import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import progra1.logica.RadioEmisora;

/**
 *
 * @author Mau
 */
public class AgregarCancionSuelta extends javax.swing.JFrame {
    String abrir;

    /**
     * Creates new form AgregarCancionSuelta
     */
    public AgregarCancionSuelta() {
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

        jLabel20 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        tbCantanteC = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        tbGeneroC = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        tbNombreC = new javax.swing.JTextField();
        btAgregarC = new javax.swing.JButton();
        tbAlbumC = new javax.swing.JTextField();
        tbDuracionC = new javax.swing.JTextField();
        btExcel = new javax.swing.JButton();
        jLabel16 = new javax.swing.JLabel();
        btPathC = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        btFin = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel20.setText("Álbum");
        getContentPane().add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(67, 233, -1, -1));

        jLabel15.setText("Cantante");
        getContentPane().add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(67, 157, -1, -1));

        jLabel21.setText("Path");
        getContentPane().add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(67, 280, -1, -1));

        jLabel22.setText("Género");
        getContentPane().add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(67, 195, -1, -1));
        getContentPane().add(tbCantanteC, new org.netbeans.lib.awtextra.AbsoluteConstraints(203, 154, 110, -1));

        jLabel18.setText("Duración");
        getContentPane().add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 120, -1, -1));

        tbGeneroC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tbGeneroCActionPerformed(evt);
            }
        });
        getContentPane().add(tbGeneroC, new org.netbeans.lib.awtextra.AbsoluteConstraints(203, 192, 110, -1));

        jLabel19.setText("Agregar canción suelta");
        getContentPane().add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(144, 35, -1, -1));

        tbNombreC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tbNombreCActionPerformed(evt);
            }
        });
        getContentPane().add(tbNombreC, new org.netbeans.lib.awtextra.AbsoluteConstraints(203, 78, 110, -1));

        btAgregarC.setText("Agregar");
        btAgregarC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAgregarCActionPerformed(evt);
            }
        });
        getContentPane().add(btAgregarC, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 320, -1, -1));
        getContentPane().add(tbAlbumC, new org.netbeans.lib.awtextra.AbsoluteConstraints(203, 230, 110, -1));
        getContentPane().add(tbDuracionC, new org.netbeans.lib.awtextra.AbsoluteConstraints(203, 116, 110, -1));

        btExcel.setText("Importar desde Excel");
        btExcel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btExcelActionPerformed(evt);
            }
        });
        getContentPane().add(btExcel, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 320, -1, -1));

        jLabel16.setText("Nombre");
        getContentPane().add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 80, -1, -1));

        btPathC.setText("Abrir");
        btPathC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btPathCActionPerformed(evt);
            }
        });
        getContentPane().add(btPathC, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 270, 110, -1));
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(358, 371, -1, -1));

        btFin.setText("Finalizar");
        btFin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btFinActionPerformed(evt);
            }
        });
        getContentPane().add(btFin, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 370, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tbGeneroCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tbGeneroCActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tbGeneroCActionPerformed

    private void tbNombreCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tbNombreCActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tbNombreCActionPerformed

    private void btExcelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btExcelActionPerformed
        
            JFileChooser f = new JFileChooser();
            f.showOpenDialog(f);
            String p= f.getSelectedFile().getAbsolutePath();
   

            
            try{
                
                RadioEmisora r = Principal.getEmisora();
                r.Cargarlista_de_todo(p);
                Principal.setEmisora(r);
                JOptionPane.showMessageDialog(null, "Importación correcta"); 
            }
            
            catch(Exception e){
                JOptionPane.showMessageDialog(null, "No se puedo cargar archivo"); 
                
            }
    }//GEN-LAST:event_btExcelActionPerformed

    private void btPathCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btPathCActionPerformed
            JFileChooser f = new JFileChooser();
            f.showOpenDialog(f);
            abrir= f.getSelectedFile().getAbsolutePath();
    }//GEN-LAST:event_btPathCActionPerformed

    private void btAgregarCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAgregarCActionPerformed
        String nombre = tbNombreC.getText();
        String duracion = tbDuracionC.getText();
        String cantante = tbCantanteC.getText();
        String genero = tbGeneroC.getText();
        String album = tbAlbumC.getText();
        String path = this.abrir;
        
        if(nombre.equals("") || duracion.equals("") || cantante.equals("") || genero.equals("") || album.equals("") || path.equals("")){
            JOptionPane.showMessageDialog(null, "No pueden haber campos vacios");
        }
        else{
            try{
                float dura = Float.parseFloat(duracion);
                RadioEmisora r = Principal.getEmisora();
                r.agregarSencillo(album, path, nombre, dura, cantante, genero);
                Principal.setEmisora(r);
                JOptionPane.showMessageDialog(null, "Canción agregada correctamente");
            }
            catch(Exception e){
                JOptionPane.showMessageDialog(null, "La duracion debe ser un numero decimal");
            }
        }        // TODO add your handling code here:
    }//GEN-LAST:event_btAgregarCActionPerformed

    private void btFinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btFinActionPerformed
       this.dispose();
    }//GEN-LAST:event_btFinActionPerformed

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
            java.util.logging.Logger.getLogger(AgregarCancionSuelta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AgregarCancionSuelta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AgregarCancionSuelta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AgregarCancionSuelta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AgregarCancionSuelta().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btAgregarC;
    private javax.swing.JButton btExcel;
    private javax.swing.JButton btFin;
    private javax.swing.JButton btPathC;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JTextField tbAlbumC;
    private javax.swing.JTextField tbCantanteC;
    private javax.swing.JTextField tbDuracionC;
    private javax.swing.JTextField tbGeneroC;
    private javax.swing.JTextField tbNombreC;
    // End of variables declaration//GEN-END:variables
}
