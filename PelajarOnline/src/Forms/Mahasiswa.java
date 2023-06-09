/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Forms;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author ASUS
 */
public class Mahasiswa extends javax.swing.JFrame {
    private Connection con;
    private Statement stat;
    private ResultSet res;
    /**
     * Creates new form Mahasiswa
     */
    public Mahasiswa() {
        initComponents();
        setTitle("FORM MAHASISWA");
        koneksi ();
        kosongkan ();       
    }

    private void koneksi (){
     try {
         Class.forName("com.mysql.jdbc.Driver");
         con=DriverManager.getConnection("jdbc:mysql://127.0.0.1/aplikasikelas", "root", "");
         stat=con.createStatement();
         } catch (Exception e) {
           JOptionPane.showMessageDialog(null, e);}   
    }
    private void kosongkan(){
     bara_nim.setText("");
     bara_nama.setText("");
     bara_jk.setSelectedIndex(-1);
     bara_nohp.setText("");
     bara_alamat.setText("");
     bara_nim.requestFocus();
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
        bara_nim = new javax.swing.JTextField();
        bara_nama = new javax.swing.JTextField();
        bara_nohp = new javax.swing.JTextField();
        bara_alamat = new javax.swing.JTextField();
        bara_edit = new javax.swing.JButton();
        bara_hapus = new javax.swing.JButton();
        bara_simpan = new javax.swing.JButton();
        bara_search = new javax.swing.JButton();
        bara_lihat = new javax.swing.JButton();
        bara_jk = new javax.swing.JComboBox<>();
        bara_menu = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Nim");

        jLabel2.setText("Nama");

        jLabel3.setText("Jenis Kelamin");

        jLabel4.setText("No Handphone");

        jLabel5.setText("Alamat");

        bara_nim.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bara_nimActionPerformed(evt);
            }
        });
        bara_nim.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                bara_nimKeyTyped(evt);
            }
        });

        bara_nama.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bara_namaActionPerformed(evt);
            }
        });

        bara_nohp.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                bara_nohpKeyTyped(evt);
            }
        });

        bara_edit.setText("Edit");
        bara_edit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bara_editActionPerformed(evt);
            }
        });

        bara_hapus.setText("Hapus");
        bara_hapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bara_hapusActionPerformed(evt);
            }
        });

        bara_simpan.setText("Simpan");
        bara_simpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bara_simpanActionPerformed(evt);
            }
        });

        bara_search.setText("Search");
        bara_search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bara_searchActionPerformed(evt);
            }
        });

        bara_lihat.setText("Lihat");
        bara_lihat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bara_lihatActionPerformed(evt);
            }
        });

        bara_jk.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Laki-laki", "Perempuan", " " }));
        bara_jk.setSelectedIndex(-1);

        bara_menu.setText("Menu");
        bara_menu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bara_menuActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(bara_edit)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGap(38, 38, 38))
                            .addComponent(bara_menu))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(bara_hapus)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(bara_simpan)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(bara_search)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(bara_lihat))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(bara_alamat, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(47, 47, 47))))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel4)
                            .addGap(34, 34, 34)
                            .addComponent(bara_nohp))
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel2)
                                .addComponent(jLabel1)
                                .addComponent(jLabel3))
                            .addGap(45, 45, 45)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(bara_jk, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(bara_nim)
                                .addComponent(bara_nama, javax.swing.GroupLayout.DEFAULT_SIZE, 251, Short.MAX_VALUE)))))
                .addGap(30, 30, 30))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(bara_nim, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(bara_nama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(bara_jk, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(jLabel5))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(bara_nohp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bara_alamat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(46, 46, 46)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(bara_lihat)
                        .addComponent(bara_search)
                        .addComponent(bara_simpan))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(bara_edit)
                        .addComponent(bara_hapus)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bara_menu)
                .addContainerGap(36, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bara_namaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bara_namaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bara_namaActionPerformed

    private void bara_nimActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bara_nimActionPerformed
        // TODO add your handling code here:
         try{
            res=stat.executeQuery("select * from mahasiswa where "+ "Nim='" + bara_nim.getText()
                +"'" ); while (res.next())
                { bara_nama.setText(res.getString("Nama"));
                bara_jk.setSelectedItem(res.getString("JenisKelamin"));
                bara_nohp.setText(res.getString("NoHp"));
                bara_alamat.setText(res.getString("Alamat"));
                }    
        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, e);
        }   

    }//GEN-LAST:event_bara_nimActionPerformed

    private void bara_editActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bara_editActionPerformed
        // TODO add your handling code here:
                int ok=JOptionPane.showConfirmDialog(null,"Apakah yakin ingin mengedit data?","Confirmation",
                JOptionPane.YES_NO_OPTION);
    try{
    String sql = "update mahasiswa set Nim=?,Nama=?,JenisKelamin=?,NoHp=?,Alamat=? where Nim='"
                    + bara_nim.getText()+"'";
    PreparedStatement st=con.prepareStatement(sql);
    if(ok==0)
    {
    try{
    st.setString(1,bara_nim.getText());
    st.setString(2,bara_nama.getText());
    st.setString(3,(String)bara_jk.getSelectedItem());
    st.setString(4,bara_nohp.getText());
    st.setString(5,bara_alamat.getText());
    st.executeUpdate();
    kosongkan();
    JOptionPane.showMessageDialog(null,"Edit Data Sukses");
    new Mahasiswa().setVisible(true);
    dispose();
    }catch (Exception e)
    {
    JOptionPane.showMessageDialog(null, "Edit Data Gagal");
    }
    }
    }catch (Exception e){}
    }//GEN-LAST:event_bara_editActionPerformed

    private void bara_hapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bara_hapusActionPerformed
        // TODO add your handling code here:
         int ok=JOptionPane.showConfirmDialog(null, "Apakah yakin ingin menghapus?", "Confirmation", 
                JOptionPane.YES_NO_CANCEL_OPTION);
        if (ok==0)
        {
         try{
             String sql="delete from mahasiswa where Nim='"+bara_nim.getText()+"'";
             PreparedStatement st=con.prepareStatement (sql);
             st.executeUpdate();
             kosongkan();
             JOptionPane.showMessageDialog(null, "Delete Data Sukses");
             new Mahasiswa().setVisible(true);
             dispose();
         } catch (Exception e)
         {
             JOptionPane.showMessageDialog(null, "Delete Data Gagal");
         }
        }
    }//GEN-LAST:event_bara_hapusActionPerformed

    private void bara_simpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bara_simpanActionPerformed
        // TODO add your handling code here:
        try {
         stat.executeUpdate("insert into mahasiswa values ("
             + "'" + bara_nim.getText()+"',"
             + "'" + bara_nama.getText()+"',"
             + "'" + bara_jk.getSelectedItem()+ "',"
             + "'" + bara_nohp.getText()+"',"
             + "'" + bara_alamat.getText()+"')");
         kosongkan();
         JOptionPane.showMessageDialog(null, "Berhasil Menyimpan Data");
         new Mahasiswa().setVisible(true);
         dispose();
         } catch (Exception e) {
         JOptionPane.showMessageDialog(null, "Gagal Menyimpan Data! : "+e);
        }
    }//GEN-LAST:event_bara_simpanActionPerformed

    private void bara_searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bara_searchActionPerformed
        // TODO add your handling code here:
            try {
            res=stat.executeQuery("select * from mahasiswa where "+ "Nim='" +bara_nim.getText()
            +"'" ); while (res.next())
                { bara_nama.setText(res.getString("Nama"));
                bara_jk.setSelectedItem(res.getString("JenisKelamin"));
                bara_nohp.setText(res.getString("NoHp"));
                bara_alamat.setText(res.getString("Alamat"));
    }
                }catch (Exception e) {
                    JOptionPane.showMessageDialog(rootPane, e);
                    }
    }//GEN-LAST:event_bara_searchActionPerformed

    private void bara_lihatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bara_lihatActionPerformed
        // TODO add your handling code here:
        new TableMahasiswa().setVisible(true);
        dispose();
    }//GEN-LAST:event_bara_lihatActionPerformed

    private void bara_menuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bara_menuActionPerformed
        // TODO add your handling code here:
        new MenuUtama().setVisible(true);
        dispose();
    }//GEN-LAST:event_bara_menuActionPerformed

    private void bara_nohpKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_bara_nohpKeyTyped
        // TODO add your handling code here:
        char bara=evt.getKeyChar();
        if(!(Character.isDigit(bara)))
        {
            evt.consume();
        }
    }//GEN-LAST:event_bara_nohpKeyTyped

    private void bara_nimKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_bara_nimKeyTyped
        // TODO add your handling code here:
                char bara=evt.getKeyChar();
        if(!(Character.isDigit(bara)))
        {
            evt.consume();
        }
    }//GEN-LAST:event_bara_nimKeyTyped

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
            java.util.logging.Logger.getLogger(Mahasiswa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Mahasiswa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Mahasiswa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Mahasiswa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Mahasiswa().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JTextField bara_alamat;
    private javax.swing.JButton bara_edit;
    private javax.swing.JButton bara_hapus;
    public javax.swing.JComboBox<String> bara_jk;
    private javax.swing.JButton bara_lihat;
    private javax.swing.JButton bara_menu;
    public javax.swing.JTextField bara_nama;
    public javax.swing.JTextField bara_nim;
    public javax.swing.JTextField bara_nohp;
    private javax.swing.JButton bara_search;
    private javax.swing.JButton bara_simpan;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    // End of variables declaration//GEN-END:variables
}
