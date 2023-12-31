/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package toko;

import java.sql.Connection;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.HashMap;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.view.JasperViewer;

/**
 *
 * @author user
 */
public class Pmbl_bln extends javax.swing.JFrame {

    /**
     * Creates new form Pmbl_bln
     */
    public Pmbl_bln() {
        initComponents();
        tampil();
        txtTotal.setEditable(false);
    }
    
    private void tampil(){
     DefaultTableModel model = new DefaultTableModel();
    model.addColumn("No");
    model.addColumn("Nota Penjualan");
    model.addColumn("Nama Barang");
    model.addColumn("Quantity");
    model.addColumn("Harga");
    model.addColumn("Sub Total");
    jTable1.setModel(model);
     }
    
    private void total(){
     
        try {
            String sql = "SELECT SUM(sub_total) FROM pembelian join detail_beli "
                    + " on pembelian.kode_pembelian=detail_beli.kode_pembelian "
                    + " where month(tgl_pembelian)=' "+txtBulan.getSelectedItem()
                    +"' and year(tgl_pembelian)='"+txtYear.getYear()+"'";
       java.sql.Connection conn=(Connection)Konfigurasi.configDB();
            java.sql.PreparedStatement pst=conn.prepareStatement(sql);
            java.sql.ResultSet rs = pst.executeQuery(sql);
            
            if(rs.next()){
                txtTotal.setText(rs.getString(1));
                
            }
                
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e);
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

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton4 = new javax.swing.JButton();
        btnCetak = new javax.swing.JButton();
        txtTotal = new javax.swing.JTextField();
        txtBulan = new javax.swing.JComboBox<>();
        btnCari = new javax.swing.JButton();
        txtYear = new com.toedter.calendar.JYearChooser();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 204, 255));
        jPanel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel1.setText("Laporan Bulanan Pembelian");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(130, 10, 450, 50);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "", "", "", ""
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(22, 140, 650, 240);

        jButton4.setText("Kembali");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton4);
        jButton4.setBounds(580, 460, 90, 30);

        btnCetak.setText("Cetak");
        btnCetak.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCetakActionPerformed(evt);
            }
        });
        jPanel1.add(btnCetak);
        btnCetak.setBounds(510, 460, 61, 30);
        jPanel1.add(txtTotal);
        txtTotal.setBounds(510, 400, 160, 30);

        txtBulan.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12" }));
        jPanel1.add(txtBulan);
        txtBulan.setBounds(250, 80, 60, 30);

        btnCari.setText("Cari");
        btnCari.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCariActionPerformed(evt);
            }
        });
        jPanel1.add(btnCari);
        btnCari.setBounds(430, 80, 51, 30);
        jPanel1.add(txtYear);
        txtYear.setBounds(360, 80, 70, 30);

        jLabel4.setText("Bulan");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(210, 80, 70, 30);

        jLabel3.setText("Total Pengeluaran : Rp.");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(370, 400, 130, 30);

        jLabel5.setText("Tahun");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(320, 80, 70, 30);

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 700, 500));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        new lapPmbl().setVisible(true);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void btnCetakActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCetakActionPerformed
        // TODO add your handling code here:
        try {

            java.sql.Connection conn =(Connection)Konfigurasi.configDB();

            //Statement stm = conn.createStatement();

            try {

                String report = ("C:\\Dev\\Tutorial java\\Kasir\\src\\toko\\Pmbl_bln.jrxml");

                HashMap hash = new HashMap();
                //String, Object> hush = new HashMap()<String, object>();
                hash.put("Par_bln", txtBulan.getSelectedItem());
                hash.put("Par_thn", txtYear.getYear());
                JasperReport JRpt = JasperCompileManager.compileReport(report);
                JasperPrint JPrint = JasperFillManager.fillReport(JRpt, hash, conn);
                JasperViewer.viewReport(JPrint, false);

            }catch (Exception rptextcpt) {
                JOptionPane.showMessageDialog(this, rptextcpt.getMessage());
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage());
        }
    }//GEN-LAST:event_btnCetakActionPerformed

    private void btnCariActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCariActionPerformed
        // TODO add your handling code here:
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("No");
        model.addColumn("Nota Penjualan");
        model.addColumn("Nama Barang");
        model.addColumn("Quantity");
        model.addColumn("Harga");
        model.addColumn("Sub Total");

        try {
            int no = 1;
            String sql = "select pembelian.kode_pembelian, barang.nama_barang, detail_beli.jumlah, barang.harga_beli, "
            + " detail_beli.sub_total "
            + " from pembelian join detail_beli on pembelian.kode_pembelian = detail_beli.kode_pembelian "
            + " join barang on barang.kode_barang=detail_beli.kode_barang "
            + " where month(tgl_pembelian)=' "+txtBulan.getSelectedItem()
            +"' and year(tgl_pembelian)='"+txtYear.getYear()+"'"
            +" order by pembelian.kode_pembelian";
            java.sql.Connection conn=(Connection)Konfigurasi.configDB();
            java.sql.Statement stm = conn.createStatement();
            java.sql.ResultSet res = stm.executeQuery(sql);
            while (res.next()){
                model.addRow(new Object[]{no++, res.getString(1),
                    res.getString(2), res.getString(3),res.getString(4),
                    res.getString(5)});
        }
        jTable1.setModel(model);
        } catch (Exception e){
            JOptionPane.showMessageDialog(this, e);
        }
        total();
    }//GEN-LAST:event_btnCariActionPerformed

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
            java.util.logging.Logger.getLogger(Pmbl_bln.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Pmbl_bln.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Pmbl_bln.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Pmbl_bln.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Pmbl_bln().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCari;
    private javax.swing.JButton btnCetak;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JComboBox<String> txtBulan;
    private javax.swing.JTextField txtTotal;
    private com.toedter.calendar.JYearChooser txtYear;
    // End of variables declaration//GEN-END:variables
}
