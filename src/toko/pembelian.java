package toko;


import java.sql.Connection;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author TOSHIBA
 */
public class pembelian extends javax.swing.JFrame {

    /**
     * Creates new form pembelian
     */
    public pembelian() {
        initComponents();
        gkedit();
    }
    private void gkedit(){
    txt_namabrg.setEditable(false);
    txt_hargabeli.setEditable(false);
    txt_subtotal.setEditable(false);
    txt_quantity.setEditable(false);
    txt_kodebrg.setEditable(false);
    txt_totalPembelian.setEditable(false);
    }
     private void hitung(){
    int harga = Integer.parseInt(txt_hargabeli.getText());
    int qty = Integer.parseInt(txt_quantity.getText());
   
    int subTtl  = harga * qty;
    txt_subtotal.setText(String.valueOf(subTtl));
    
    }
    
    private void kosong(){
    txt_kodebrg.setText(null);
    txt_namabrg.setText(null);
    txt_hargabeli.setText(null);
    txt_quantity.setText(null);
    txt_subtotal.setText(null);
    }
private void total(){
     try {
            String sql = "SELECT SUM(sub_total) FROM detail_beli WHERE kode_pembelian='"+txt_notapmbl.getText()+"'";
            java.sql.Connection conn=(Connection)Konfigurasi.configDB();
            java.sql.PreparedStatement pst=conn.prepareStatement(sql);
            java.sql.ResultSet rs = pst.executeQuery(sql);
            
            if(rs.next()){
                txt_totalPembelian.setText(rs.getString(1));
                
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

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        txt_subtotal = new javax.swing.JTextField();
        txt_quantity = new javax.swing.JTextField();
        txt_hargabeli = new javax.swing.JTextField();
        txt_namabrg = new javax.swing.JTextField();
        txt_kodebrg = new javax.swing.JTextField();
        btn_cari = new javax.swing.JButton();
        btn_keluar = new javax.swing.JButton();
        btn_konfirmasi = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        btn_edit = new javax.swing.JButton();
        btn_laporan = new javax.swing.JButton();
        btn_dasboard = new javax.swing.JButton();
        btn_batalbrg = new javax.swing.JButton();
        btn_tambahkan = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        txt_totalPembelian = new javax.swing.JTextField();
        btn_batal = new javax.swing.JButton();
        btn_simpan = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jLabel8 = new javax.swing.JLabel();
        txt_notapmbl = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(700, 500));
        jPanel1.setLayout(null);

        txt_subtotal.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(txt_subtotal);
        txt_subtotal.setBounds(300, 310, 130, 20);

        txt_quantity.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txt_quantity.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_quantityKeyReleased(evt);
            }
        });
        jPanel1.add(txt_quantity);
        txt_quantity.setBounds(300, 280, 130, 20);

        txt_hargabeli.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(txt_hargabeli);
        txt_hargabeli.setBounds(320, 250, 110, 20);

        txt_namabrg.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(txt_namabrg);
        txt_namabrg.setBounds(300, 220, 130, 20);

        txt_kodebrg.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(txt_kodebrg);
        txt_kodebrg.setBounds(300, 190, 100, 20);

        btn_cari.setBackground(new java.awt.Color(255, 255, 255));
        btn_cari.setText("Cari");
        btn_cari.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btn_cari.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cariActionPerformed(evt);
            }
        });
        jPanel1.add(btn_cari);
        btn_cari.setBounds(400, 190, 30, 20);

        btn_keluar.setBackground(new java.awt.Color(255, 255, 255));
        btn_keluar.setBorder(null);
        btn_keluar.setContentAreaFilled(false);
        btn_keluar.setEnabled(false);
        btn_keluar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_keluarActionPerformed(evt);
            }
        });
        jPanel1.add(btn_keluar);
        btn_keluar.setBounds(0, 250, 140, 30);

        btn_konfirmasi.setBackground(new java.awt.Color(0, 204, 255));
        btn_konfirmasi.setText("Konfirmasi");
        btn_konfirmasi.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btn_konfirmasi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_konfirmasiActionPerformed(evt);
            }
        });
        jPanel1.add(btn_konfirmasi);
        btn_konfirmasi.setBounds(300, 130, 70, 30);

        jLabel11.setBackground(new java.awt.Color(255, 255, 255));
        jLabel11.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel11.setText("Sub Total");
        jPanel1.add(jLabel11);
        jLabel11.setBounds(150, 300, 150, 30);

        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/cg.png"))); // NOI18N
        jPanel1.add(jLabel12);
        jLabel12.setBounds(530, 320, 40, 30);

        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Picture1234.png"))); // NOI18N
        jPanel1.add(jLabel10);
        jLabel10.setBounds(530, 240, 40, 30);

        btn_edit.setBackground(new java.awt.Color(255, 255, 255));
        btn_edit.setText("<< Edit >>");
        btn_edit.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btn_edit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_editActionPerformed(evt);
            }
        });
        jPanel1.add(btn_edit);
        btn_edit.setBounds(570, 240, 120, 30);

        btn_laporan.setBackground(javax.swing.UIManager.getDefaults().getColor("CheckBox.focus"));
        btn_laporan.setBorder(null);
        btn_laporan.setContentAreaFilled(false);
        btn_laporan.setEnabled(false);
        btn_laporan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_laporanActionPerformed(evt);
            }
        });
        jPanel1.add(btn_laporan);
        btn_laporan.setBounds(0, 220, 150, 30);

        btn_dasboard.setBackground(new java.awt.Color(255, 255, 255));
        btn_dasboard.setBorder(null);
        btn_dasboard.setContentAreaFilled(false);
        btn_dasboard.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_dasboardActionPerformed(evt);
            }
        });
        jPanel1.add(btn_dasboard);
        btn_dasboard.setBounds(0, 180, 150, 30);

        btn_batalbrg.setBackground(new java.awt.Color(255, 255, 255));
        btn_batalbrg.setText("<< Batal Barang");
        btn_batalbrg.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btn_batalbrg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_batalbrgActionPerformed(evt);
            }
        });
        jPanel1.add(btn_batalbrg);
        btn_batalbrg.setBounds(570, 320, 120, 30);

        btn_tambahkan.setBackground(new java.awt.Color(255, 255, 255));
        btn_tambahkan.setText("Tambahkan >>");
        btn_tambahkan.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btn_tambahkan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_tambahkanActionPerformed(evt);
            }
        });
        jPanel1.add(btn_tambahkan);
        btn_tambahkan.setBounds(570, 280, 120, 30);

        usernamePmbl.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(usernamePmbl);
        usernamePmbl.setBounds(80, 90, 70, 30);

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Kode Barang", "Nama Barang", "Quantity", "harga barang", "Sub Total"
            }
        ));
        jTable2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable2MouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jTable2);

        jPanel1.add(jScrollPane2);
        jScrollPane2.setBounds(153, 413, 540, 90);

        txt_totalPembelian.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        txt_totalPembelian.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txt_totalPembelian.setBorder(null);
        txt_totalPembelian.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_totalPembelianActionPerformed(evt);
            }
        });
        jPanel1.add(txt_totalPembelian);
        txt_totalPembelian.setBounds(510, 110, 180, 40);

        btn_batal.setBackground(new java.awt.Color(204, 0, 0));
        btn_batal.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        btn_batal.setText("Batal");
        btn_batal.setBorder(null);
        btn_batal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_batalActionPerformed(evt);
            }
        });
        jPanel1.add(btn_batal);
        btn_batal.setBounds(390, 360, 80, 30);

        btn_simpan.setBackground(new java.awt.Color(0, 204, 255));
        btn_simpan.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        btn_simpan.setText("Simpan");
        btn_simpan.setBorder(null);
        btn_simpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_simpanActionPerformed(evt);
            }
        });
        jPanel1.add(btn_simpan);
        btn_simpan.setBounds(260, 360, 80, 30);

        jLabel9.setText("Rp.");
        jPanel1.add(jLabel9);
        jLabel9.setBounds(300, 240, 50, 30);

        jDateChooser1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.add(jDateChooser1);
        jDateChooser1.setBounds(300, 100, 130, 30);

        jLabel8.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel8.setText("Quantity");
        jPanel1.add(jLabel8);
        jLabel8.setBounds(150, 269, 170, 30);

        txt_notapmbl.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(txt_notapmbl);
        txt_notapmbl.setBounds(300, 70, 130, 20);

        jLabel6.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel6.setText("Nama Barang");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(150, 209, 150, 30);

        jLabel7.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel7.setText("Harga Beli");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(150, 240, 150, 30);

        jLabel5.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel5.setText("Kode/Inisial Barang");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(150, 180, 150, 30);

        jLabel4.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel4.setText("Tanggal Pembelian");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(150, 100, 150, 19);

        jLabel3.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel3.setText("Nota Pembelian");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(150, 70, 140, 20);

        jLabel2.setFont(new java.awt.Font("Verdana", 0, 24)); // NOI18N
        jLabel2.setText("TOTAL PEMBELIAN");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(470, 80, 230, 30);

        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/kk.png"))); // NOI18N
        jPanel1.add(jLabel13);
        jLabel13.setBounds(530, 280, 40, 30);

        jLabel14.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel14.setText("Rp.");
        jPanel1.add(jLabel14);
        jLabel14.setBounds(460, 110, 35, 29);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/1234567.png"))); // NOI18N
        jPanel1.add(jLabel1);
        jLabel1.setBounds(0, 0, 700, 500);

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 700, 500));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btn_tambahkanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_tambahkanActionPerformed
        // TODO add your handling code here:
        DefaultTableModel model = (DefaultTableModel) jTable2.getModel();
        if(txt_kodebrg.getText().trim().equals("") || txt_quantity.getText().trim().equals("") || txt_namabrg.getText().trim().equals("")){
            JOptionPane.showMessageDialog(null, "Data Yang Dimasukkan Belum Lengkap");
        }else{
        model.addRow(new Object[]{txt_kodebrg.getText(),txt_namabrg.getText(),txt_quantity.getText(),
        txt_hargabeli.getText(),txt_subtotal.getText()});
        }
        try {
            String sql = "INSERT INTO detail_beli VALUES ('"+txt_notapmbl.getText()+"','"+txt_kodebrg.getText()+"',"+txt_quantity.getText()+","+txt_subtotal.getText()+")";
            java.sql.Connection conn=(Connection)Konfigurasi.configDB();
            java.sql.PreparedStatement pst=conn.prepareStatement(sql);
            pst.execute();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
        kosong();
        total();
    }//GEN-LAST:event_btn_tambahkanActionPerformed

    private void btn_batalbrgActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_batalbrgActionPerformed
        // TODO add your handling code here:
        DefaultTableModel model = (DefaultTableModel) jTable2.getModel();
        if (jTable2.getSelectedRow() == -1){
            if (jTable2.getRowCount() == 0){
            JOptionPane.showMessageDialog(null, "Tidak Ada Data Dalam Tabel");
            }else{
            JOptionPane.showMessageDialog(null, "Pilih Data Yang Akan Dihapus");
            }
        }else{
        model.removeRow(jTable2.getSelectedRow());
        }
        try {
            String sql = "Delete from detail_beli WHERE kode_barang= '"+txt_kodebrg.getText()+"'AND kode_pembelian='"+txt_notapmbl.getText()+"'";
            java.sql.Connection conn=(Connection)Konfigurasi.configDB();
            java.sql.PreparedStatement pst=conn.prepareStatement(sql);
            pst.execute();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
        kosong();
        total();
        
    }//GEN-LAST:event_btn_batalbrgActionPerformed

    private void btn_konfirmasiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_konfirmasiActionPerformed
        // TODO add your handling code here:
        

	try {
            String sql = "INSERT INTO pembelian (kode_pembelian) VALUES ('"+txt_notapmbl.getText()+"')";
            java.sql.Connection conn=(Connection)Konfigurasi.configDB();
            java.sql.PreparedStatement pst=conn.prepareStatement(sql);
            pst.execute();
            JOptionPane.showMessageDialog(null, "konfirmasi berhasil");
            
             txt_notapmbl.setEditable(false);
             jDateChooser1.disable();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
        txt_kodebrg.setEditable(true);
        
    }//GEN-LAST:event_btn_konfirmasiActionPerformed

    private void btn_cariActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cariActionPerformed
        // TODO add your handling code here:
        try {
            String sql = "SELECT nama_barang, harga_beli, kode_barang FROM barang WHERE kode_barang='"+txt_kodebrg.getText() +"' OR nama_barang LIKE '%"+txt_kodebrg.getText() +"%'";
            java.sql.Connection conn=(Connection)Konfigurasi.configDB();
            java.sql.PreparedStatement pst=conn.prepareStatement(sql);
            java.sql.ResultSet rs = pst.executeQuery(sql);
            
            if(rs.next()){
                txt_namabrg.setText(rs.getString(1));
                txt_hargabeli.setText(rs.getString(2));
                txt_kodebrg.setText(rs.getString(3));
            }
                
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Kode Barang Salah!!");
        }
         txt_quantity.setEditable(true);
    }//GEN-LAST:event_btn_cariActionPerformed

    private void txt_quantityKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_quantityKeyReleased
        // TODO add your handling code here:
        hitung();
    }//GEN-LAST:event_txt_quantityKeyReleased

    private void jTable2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable2MouseClicked
        // TODO add your handling code here:
       DefaultTableModel model = (DefaultTableModel) jTable2.getModel();{
        txt_kodebrg.setText(model.getValueAt(jTable2.getSelectedRow(),0).toString());
        txt_namabrg.setText(model.getValueAt(jTable2.getSelectedRow(),1).toString());
        txt_quantity.setText(model.getValueAt(jTable2.getSelectedRow(),2).toString());
        txt_hargabeli.setText(model.getValueAt(jTable2.getSelectedRow(),3).toString());
        txt_subtotal.setText(model.getValueAt(jTable2.getSelectedRow(),4).toString());
    }
    }//GEN-LAST:event_jTable2MouseClicked

    private void btn_editActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_editActionPerformed
        // TODO add your handling code here:
        DefaultTableModel model = (DefaultTableModel) jTable2.getModel();{
        if (jTable2.getSelectedRow() == -1){
            if (jTable2.getRowCount() == 0){
            JOptionPane.showMessageDialog(null, "Tidak Ada Data Dalam Tabel");
            }else{
            JOptionPane.showMessageDialog(null, "Pilih Data Yang Akan Diubah");
            }
        }else{
        model.setValueAt(txt_kodebrg.getText(), jTable2.getSelectedRow(),0);
        model.setValueAt(txt_namabrg.getText(), jTable2.getSelectedRow(),1);
        model.setValueAt(txt_quantity.getText(),jTable2.getSelectedRow(),2);
        model.setValueAt(txt_hargabeli.getText(), jTable2.getSelectedRow(),3);
        model.setValueAt(txt_subtotal.getText(), jTable2.getSelectedRow(),4);
        }
        try {
            String sql = "UPDATE detail_beli SET jumlah= "+txt_quantity.getText()+", sub_total ="+txt_subtotal.getText()
                    +" WHERE kode_pembelian = '"+txt_notapmbl.getText()
                    +"' AND kode_barang = '"+txt_kodebrg.getText()+"'";
            java.sql.Connection conn=(Connection)Konfigurasi.configDB();
            java.sql.PreparedStatement pst=conn.prepareStatement(sql);
            pst.execute();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
        kosong();
        total();
    }
    }//GEN-LAST:event_btn_editActionPerformed

    private void btn_simpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_simpanActionPerformed
        // TODO add your handling code here:
        String tampilan = "yyyy-MM-dd";
        SimpleDateFormat fm = new SimpleDateFormat(tampilan);
        String tgl = String.valueOf(fm.format(jDateChooser1.getDate()));
        try {
            String sql = "UPDATE pembelian set grand_total =" +txt_totalPembelian.getText()+",tgl_pembelian = '" +tgl+"' WHERE kode_pembelian ='"
                    + txt_notapmbl.getText()+"'";
           
            java.sql.Connection conn=(Connection)Konfigurasi.configDB();
            java.sql.PreparedStatement pst=conn.prepareStatement(sql);
            pst.execute();
            JOptionPane.showMessageDialog(null, "data berhasil disimpan");
            this.setVisible(false);
            new Dashboard().setVisible(true);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
            
        }
    }//GEN-LAST:event_btn_simpanActionPerformed

    private void btn_batalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_batalActionPerformed
        // TODO add your handling code here:
        try {
            String sql = "DELETE from pembelian WHERE kode_pembelian ='"+ txt_notapmbl.getText()+"'";
            java.sql.Connection conn=(Connection)Konfigurasi.configDB();
            java.sql.PreparedStatement pst=conn.prepareStatement(sql);
            pst.execute();
            this.setVisible(false);
            new Dashboard().setVisible(true);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
        
        
    }//GEN-LAST:event_btn_batalActionPerformed

    private void txt_totalPembelianActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_totalPembelianActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_totalPembelianActionPerformed

    private void btn_dasboardActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_dasboardActionPerformed
        // TODO add your handling code here:
        try {
            String sql = "DELETE from pembelian WHERE kode_pembelian ='"+ txt_notapmbl.getText()+"'";
            java.sql.Connection conn=(Connection)Konfigurasi.configDB();
            java.sql.PreparedStatement pst=conn.prepareStatement(sql);
            pst.execute();
            
        } catch (Exception e) {
            
        }
        this.setVisible(false);
        new Dashboard().setVisible(true);
    }//GEN-LAST:event_btn_dasboardActionPerformed

    private void btn_laporanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_laporanActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_btn_laporanActionPerformed

    private void btn_keluarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_keluarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_keluarActionPerformed

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
            java.util.logging.Logger.getLogger(pembelian.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(pembelian.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(pembelian.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(pembelian.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new pembelian().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_batal;
    private javax.swing.JButton btn_batalbrg;
    private javax.swing.JButton btn_cari;
    private javax.swing.JButton btn_dasboard;
    private javax.swing.JButton btn_edit;
    private javax.swing.JButton btn_keluar;
    private javax.swing.JButton btn_konfirmasi;
    private javax.swing.JButton btn_laporan;
    private javax.swing.JButton btn_simpan;
    private javax.swing.JButton btn_tambahkan;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTextField txt_hargabeli;
    private javax.swing.JTextField txt_kodebrg;
    private javax.swing.JTextField txt_namabrg;
    private javax.swing.JTextField txt_notapmbl;
    private javax.swing.JTextField txt_quantity;
    private javax.swing.JTextField txt_subtotal;
    private javax.swing.JTextField txt_totalPembelian;
    public static final javax.swing.JLabel usernamePmbl = new javax.swing.JLabel();
    // End of variables declaration//GEN-END:variables
}
