/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package qlks.ui;

import java.awt.Dialog;
import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.List;
import java.util.Objects;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;
import qlks.dao.BookRoomDAO;
import qlks.model.HoaDon;
import qlks.dao.HoaDonDAO;
import qlks.dao.ChiTietHoaDonDAO;
import qlks.helper.DateHelper;
import qlks.helper.DialogHelper;
import qlks.helper.JdbcHelper;
import qlks.model.ChiTietHoaDon;


/**
 *
 * @author tuat5
 */
public class HoaDonForm extends javax.swing.JFrame {

    /**
     * Creates new form HoaDonForm
     */
    public HoaDonForm() {
        int index = -1;
        initComponents();
        this.setLocationRelativeTo(null);
        this.setTitle("Hóa Đơn");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        tab = new javax.swing.JTabbedPane();
        tabs = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblHoaDon = new javax.swing.JTable();
        jLabel12 = new javax.swing.JLabel();
        tab1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        btnSua = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        btnDichVu = new javax.swing.JButton();
        txtMaCTHD = new javax.swing.JTextField();
        txtMaHD = new javax.swing.JTextField();
        txtMaDatPhong = new javax.swing.JTextField();
        txtSoNgayO = new javax.swing.JTextField();
        txtTienPhong = new javax.swing.JTextField();
        txtTienDichVu = new javax.swing.JTextField();
        txtPhuThu = new javax.swing.JTextField();
        txtTongTien = new javax.swing.JTextField();
        btnThanhToan = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(255, 242, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jPanel1.setBackground(new java.awt.Color(255, 216, 255));

        jLabel7.setBackground(new java.awt.Color(255, 255, 255));
        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 153, 102));
        jLabel7.setText("Hóa Đơn");
        jLabel7.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 153, 102)));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(216, 216, 216)
                .addComponent(jLabel7)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(16, Short.MAX_VALUE)
                .addComponent(jLabel7)
                .addGap(14, 14, 14))
        );

        tab.setBackground(new java.awt.Color(255, 242, 255));
        tab.setForeground(new java.awt.Color(0, 153, 102));

        tabs.setBackground(new java.awt.Color(255, 242, 255));

        tblHoaDon.setAutoCreateRowSorter(true);
        tblHoaDon.setBackground(new java.awt.Color(255, 249, 255));
        tblHoaDon.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "MÃ HDCT", "Mã HD", "Mã NV", "Mã KH", "ID Phòng", "Ngày Lập", "Trạng Thái"
            }
        ));
        tblHoaDon.setGridColor(new java.awt.Color(255, 249, 255));
        tblHoaDon.setSelectionBackground(new java.awt.Color(255, 249, 255));
        tblHoaDon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                tblHoaDonMouseReleased(evt);
            }
        });
        jScrollPane1.setViewportView(tblHoaDon);

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 153, 102));
        jLabel12.setText("Danh sách hóa đơn");

        javax.swing.GroupLayout tabsLayout = new javax.swing.GroupLayout(tabs);
        tabs.setLayout(tabsLayout);
        tabsLayout.setHorizontalGroup(
            tabsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, tabsLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 585, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, tabsLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel12)
                .addGap(180, 180, 180))
        );
        tabsLayout.setVerticalGroup(
            tabsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tabsLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(356, Short.MAX_VALUE))
        );

        tab.addTab("Danh sách hóa đơn", tabs);

        tab1.setBackground(new java.awt.Color(255, 242, 255));
        tab1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 153, 102));
        jLabel1.setText("CHI TIẾT HÓA ĐƠN");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 153, 102));
        jLabel2.setText("Mã CTHD:");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 153, 102));
        jLabel3.setText("Mã HD:");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 153, 102));
        jLabel4.setText("Mã Đặt Phòng:");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 153, 102));
        jLabel5.setText("Số ngày ở:");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 153, 102));
        jLabel6.setText("Tiền phòng:");

        btnSua.setBackground(new java.awt.Color(204, 204, 204));
        btnSua.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnSua.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/polypro/icon/iconform/tải_xuống__1_-removebg-preview.png"))); // NOI18N
        btnSua.setText("Sửa");
        btnSua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSuaActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 153, 102));
        jLabel8.setText("Tiền Dịch Vụ:");
        jLabel8.setToolTipText("");

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 153, 102));
        jLabel9.setText("Phụ Thu:");

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 153, 102));
        jLabel10.setText("Thành Tiền");

        btnDichVu.setBackground(new java.awt.Color(204, 204, 204));
        btnDichVu.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnDichVu.setText("Danh Sách Dịch Vụ");
        btnDichVu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDichVuActionPerformed(evt);
            }
        });

        txtMaCTHD.setBackground(new java.awt.Color(255, 242, 255));
        txtMaCTHD.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        txtMaCTHD.setToolTipText("Nhập CTHD");
        txtMaCTHD.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 1, 1, 0, new java.awt.Color(0, 153, 102)));

        txtMaHD.setBackground(new java.awt.Color(255, 242, 255));
        txtMaHD.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        txtMaHD.setToolTipText("Nhập Mã HD");
        txtMaHD.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 1, 1, 0, new java.awt.Color(0, 153, 102)));

        txtMaDatPhong.setBackground(new java.awt.Color(255, 242, 255));
        txtMaDatPhong.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        txtMaDatPhong.setToolTipText("Nhập Mã Đặt Phòng");
        txtMaDatPhong.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 1, 1, 0, new java.awt.Color(0, 153, 102)));

        txtSoNgayO.setBackground(new java.awt.Color(255, 242, 255));
        txtSoNgayO.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        txtSoNgayO.setToolTipText("Nhập Số ngày ở");
        txtSoNgayO.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 1, 1, 0, new java.awt.Color(0, 153, 102)));
        txtSoNgayO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSoNgayOActionPerformed(evt);
            }
        });

        txtTienPhong.setBackground(new java.awt.Color(255, 242, 255));
        txtTienPhong.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        txtTienPhong.setToolTipText("Nhập Tiền phòng");
        txtTienPhong.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 1, 1, 0, new java.awt.Color(0, 153, 102)));

        txtTienDichVu.setBackground(new java.awt.Color(255, 242, 255));
        txtTienDichVu.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        txtTienDichVu.setToolTipText("Nhập Tiền Dịch Vụ");
        txtTienDichVu.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 1, 1, 0, new java.awt.Color(0, 153, 102)));

        txtPhuThu.setBackground(new java.awt.Color(255, 242, 255));
        txtPhuThu.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        txtPhuThu.setToolTipText("Nhập Phụ Thu");
        txtPhuThu.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 1, 1, 0, new java.awt.Color(0, 153, 102)));

        txtTongTien.setBackground(new java.awt.Color(255, 242, 255));
        txtTongTien.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        txtTongTien.setToolTipText("Nhập Thành Tiền");
        txtTongTien.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 1, 1, 0, new java.awt.Color(0, 153, 102)));

        btnThanhToan.setBackground(new java.awt.Color(204, 204, 204));
        btnThanhToan.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnThanhToan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/polypro/icon/iconform/tải_xuống-removebg-preview.png"))); // NOI18N
        btnThanhToan.setText("Thanh Toán");
        btnThanhToan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThanhToanActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout tab1Layout = new javax.swing.GroupLayout(tab1);
        tab1.setLayout(tab1Layout);
        tab1Layout.setHorizontalGroup(
            tab1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tab1Layout.createSequentialGroup()
                .addGroup(tab1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(tab1Layout.createSequentialGroup()
                        .addGap(434, 434, 434)
                        .addComponent(btnDichVu))
                    .addGroup(tab1Layout.createSequentialGroup()
                        .addGap(126, 126, 126)
                        .addComponent(btnThanhToan)
                        .addGap(18, 18, 18)
                        .addComponent(btnSua, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(tab1Layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addGroup(tab1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(tab1Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(26, 26, 26)
                                .addComponent(txtMaCTHD, javax.swing.GroupLayout.PREFERRED_SIZE, 288, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(tab1Layout.createSequentialGroup()
                                .addGroup(tab1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel9)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel10)
                                    .addComponent(jLabel3))
                                .addGroup(tab1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(tab1Layout.createSequentialGroup()
                                        .addGap(26, 26, 26)
                                        .addGroup(tab1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(txtTienPhong, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 288, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtTienDichVu, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 288, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtSoNgayO, javax.swing.GroupLayout.PREFERRED_SIZE, 288, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtMaDatPhong, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 288, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtMaHD, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 288, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtPhuThu, javax.swing.GroupLayout.PREFERRED_SIZE, 288, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtTongTien, javax.swing.GroupLayout.PREFERRED_SIZE, 288, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(tab1Layout.createSequentialGroup()
                                        .addGap(66, 66, 66)
                                        .addComponent(jLabel1)))))))
                .addContainerGap(16, Short.MAX_VALUE))
        );
        tab1Layout.setVerticalGroup(
            tab1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tab1Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                .addGroup(tab1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtMaCTHD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(tab1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnDichVu, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtMaHD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(tab1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(txtMaDatPhong, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                .addGroup(tab1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtSoNgayO, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(tab1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtTienPhong, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(tab1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtTienDichVu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addGap(18, 18, 18)
                .addGroup(tab1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(txtPhuThu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(tab1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(txtTongTien, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(87, 87, 87)
                .addGroup(tab1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnThanhToan, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSua, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34))
        );

        tab.addTab("Chi tiết hóa đơn", tab1);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(tab)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tab, javax.swing.GroupLayout.PREFERRED_SIZE, 612, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    public static String MaHD, MaPhong;
    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
        this.load();
    }//GEN-LAST:event_formWindowOpened

    private void tblHoaDonMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblHoaDonMouseReleased
        // TODO add your handling code here:
        if(evt.getClickCount() == 2){
            this.row = tblHoaDon.rowAtPoint(evt.getPoint());
            if(this.row >=0)
            {
                DienDuLieuVaoField();
                tab.setSelectedIndex(1);
            }
            
        }
    }//GEN-LAST:event_tblHoaDonMouseReleased
    public String MaHDCT;
    private void btnSuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSuaActionPerformed
        // TODO add your handling code here:
      //  update();
    }//GEN-LAST:event_btnSuaActionPerformed

    private void txtSoNgayOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSoNgayOActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSoNgayOActionPerformed

    private void btnDichVuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDichVuActionPerformed
        // TODO add your handling code here:
        new ChiTietDVForm().setVisible(true);
    }//GEN-LAST:event_btnDichVuActionPerformed

    private void btnThanhToanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThanhToanActionPerformed
        // TODO add your handling code here:
        clearForm();
        thanhToan();
        
    }//GEN-LAST:event_btnThanhToanActionPerformed
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
            java.util.logging.Logger.getLogger(HoaDonForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HoaDonForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HoaDonForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HoaDonForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HoaDonForm().setVisible(true);
            }
        });
    }
    int index = 0;
    HoaDonDAO dao = new HoaDonDAO();
//
//    void update(){
//        ChiTietHoaDon hdct = getForm();
//            try {
//                ctdao.update(hdct);
//                this.loadHDCT();
//                DialogHelper.alert(this, "Thêm mới thành công!");
//            } catch (Exception e) {
//                DialogHelper.alert(this, "Thêm mới thất bại!");
//            }
//    }
    
    
    void load() {
        DefaultTableModel model = (DefaultTableModel) tblHoaDon.getModel();
        tblHoaDon.setEnabled(false);
        model.setRowCount(0);
//        try {
        List<HoaDon> list = dao.select();
        for (HoaDon hdct : list) {
            Object[] row = {
                hdct.getMaHDCT(),
                hdct.getMaHD(),
                hdct.getMaNV(),
                hdct.getMaKH(),
                hdct.getIDPhong(),
                hdct.getNgayLapHD(),
                hdct.getTrangThai()
            };
            model.addRow(row);
        }
//        } 
//        catch (Exception e) {
//            DialogHelper.alert(this, "Lỗi truy vấn dữ liệu!");
//            System.out.println("loi: " + e.toString() );
//        }
    }
    
    void loadHDCT(){
        List<ChiTietHoaDon> list = ctdao.selectALL();
        for (ChiTietHoaDon hdct : list) {
            Object[] row = {
                hdct.getMaCTHD(),
                hdct.getMaHD(),
                hdct.getMaPhong(),
                hdct.getNgayO(),
                hdct.getNgayThanhToan(),
                hdct.getPhuThu(),
                hdct.getThanhTien(),
                hdct.getTienDichvu(),
                hdct.getTienPhong()
            };
            list.add(hdct);
        }  
    }
    
    BookRoomDAO daoDP = new BookRoomDAO();
    int row = -1;
    void DienDuLieuVaoField() {
        try {
            String maHDCT = (String) tblHoaDon.getValueAt(this.row, 0);
            ChiTietHoaDon hdct = ctdao.selectById(maHDCT);
            if(hdct != null){
                setForm(hdct);
                tab.setSelectedIndex(0);
                updateStatus();
            }
        } catch (Exception e) {
            DialogHelper.alert(this, "Lỗi truy vấn dữ liệu!");
        }
    }
    ChiTietHoaDonDAO ctdao = new ChiTietHoaDonDAO();
    void setForm(ChiTietHoaDon hdct){
        txtMaCTHD.setText(hdct.getMaCTHD());
        txtMaHD.setText(hdct.getMaHD());
        txtMaDatPhong.setText(hdct.getMaPhong());
        txtSoNgayO.setText(Integer.toString(hdct.getNgayO()));
        txtTienPhong.setText(Double.toString(hdct.getTienPhong()));
        txtTienDichVu.setText(Double.toString(hdct.getTienDichvu()));
        txtPhuThu.setText(Double.toString(hdct.getPhuThu()));
        txtTongTien.setText(Double.toString(hdct.getThanhTien()));
      //  date_ThanhToan.setDate(hdct.getNgayThanhToan());
    }
    
    
    ChiTietHoaDon getForm(){
        ChiTietHoaDon hdct = new ChiTietHoaDon();
        hdct.setMaHD(txtMaHD.getText());
        hdct.setMaPhong(txtMaDatPhong.getText());
        hdct.setNgayO(Integer.parseInt(txtSoNgayO.getText()));
        hdct.setPhuThu(Double.parseDouble(txtPhuThu.getText()));
        hdct.setThanhTien(Double.parseDouble(txtTongTien.getText()));
        hdct.setTienDichvu(Double.parseDouble(txtTienDichVu.getText()));
        hdct.setTienPhong(Double.parseDouble(txtTienPhong.getText()));
        return hdct;
    }
    String trangThai;
    void updateStatus(){
        boolean edit = this.row >= 0;
        txtMaCTHD.setEditable(!edit);
    }
    
        HoaDon getHD(){
        HoaDon hd = new HoaDon();
        hd.setMaHD(txtMaHD.getText());
        return hd;
    }
    
        void clearForm(){
        txtMaCTHD.setText("");
        txtMaDatPhong.setText("");
        txtMaHD.setText("");
        txtPhuThu.setText("");
        txtSoNgayO.setText("");
        txtTienDichVu.setText("");
        txtTienPhong.setText("");
        txtTongTien.setText("");
    }
         void thanhToan(){
        HoaDon hd = getHD();
            try {
                dao.updateTrangThai(hd);
                this.load();
                DialogHelper.alert(this, "Thanh toán thành công!");
            } catch (Exception e) {
                DialogHelper.alert(this, "Thanh toán thành công!");
            }
    }
 
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDichVu;
    private javax.swing.JButton btnSua;
    private javax.swing.JButton btnThanhToan;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane tab;
    private javax.swing.JPanel tab1;
    private javax.swing.JPanel tabs;
    private javax.swing.JTable tblHoaDon;
    private javax.swing.JTextField txtMaCTHD;
    private javax.swing.JTextField txtMaDatPhong;
    private javax.swing.JTextField txtMaHD;
    private javax.swing.JTextField txtPhuThu;
    private javax.swing.JTextField txtSoNgayO;
    private javax.swing.JTextField txtTienDichVu;
    private javax.swing.JTextField txtTienPhong;
    private javax.swing.JTextField txtTongTien;
    // End of variables declaration//GEN-END:variables
}
