/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Forms;
import javax.swing.JOptionPane;

/**
 *
 * @author ASUS
 */
public class MenuUtama extends javax.swing.JFrame {

    /**
     * Creates new form MenuUtama
     */
    public MenuUtama() {
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

        bara_mahasiswa = new javax.swing.JButton();
        bara_tabungan = new javax.swing.JButton();
        bara_logout = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        bara_mahasiswa.setText("Mahasiswa");
        bara_mahasiswa.setName("bara_mahasiswa"); // NOI18N
        bara_mahasiswa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bara_mahasiswaActionPerformed(evt);
            }
        });

        bara_tabungan.setText("Tabungan");
        bara_tabungan.setName("bara_tabungan"); // NOI18N
        bara_tabungan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bara_tabunganActionPerformed(evt);
            }
        });

        bara_logout.setText("Logout");
        bara_logout.setName("bara_logout"); // NOI18N
        bara_logout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bara_logoutActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(115, 115, 115)
                .addComponent(bara_mahasiswa)
                .addGap(18, 18, 18)
                .addComponent(bara_tabungan)
                .addContainerGap(96, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(bara_logout)
                .addGap(28, 28, 28))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(110, 110, 110)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bara_mahasiswa)
                    .addComponent(bara_tabungan))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 79, Short.MAX_VALUE)
                .addComponent(bara_logout)
                .addGap(65, 65, 65))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bara_mahasiswaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bara_mahasiswaActionPerformed
        // TODO add your handling code here:
        new Mahasiswa().setVisible(true);
        dispose();
    }//GEN-LAST:event_bara_mahasiswaActionPerformed

    private void bara_tabunganActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bara_tabunganActionPerformed
        // TODO add your handling code here:
        new Tabungan().setVisible(true);
        dispose();
    }//GEN-LAST:event_bara_tabunganActionPerformed

    private void bara_logoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bara_logoutActionPerformed
        // TODO add your handling code here:
        new Login().setVisible(true);
        dispose();
        javax.swing.JOptionPane.showMessageDialog(null, "Anda Berhasil logout");
    }//GEN-LAST:event_bara_logoutActionPerformed

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
            java.util.logging.Logger.getLogger(MenuUtama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuUtama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuUtama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuUtama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuUtama().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bara_logout;
    private javax.swing.JButton bara_mahasiswa;
    private javax.swing.JButton bara_tabungan;
    // End of variables declaration//GEN-END:variables
}
