/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package qlks.model;

import java.sql.Date;


/**
 *
 * @author pc
 */
public class HoaDon {
    private String maHDCT;
    private String MaHD;
    private String MaNV;
    private String MaKH;
    private String IDPhong;
    private Date NgayLapHD;
    private String TrangThai;

    public String getMaHDCT() {
        return maHDCT;
    }

    public void setMaHDCT(String maHDCT) {
        this.maHDCT = maHDCT;
    }

    public String getMaHD() {
        return MaHD;
    }
    public void setMaHD(String maHD) {
        MaHD = maHD;
    }
    public String getMaNV() {
        return MaNV;
    }
    public void setMaNV(String maNV) {
        MaNV = maNV;
    }
    public String getMaKH() {
        return MaKH;
    }
    public void setMaKH(String maKH) {
        MaKH = maKH;
    }
    public String getIDPhong() {
        return IDPhong;
    }
    public void setIDPhong(String iDPhong) {
        IDPhong = iDPhong;
    }
    public Date getNgayLapHD() {
        return NgayLapHD;
    }
    public void setNgayLapHD(Date ngayLapHD) {
        NgayLapHD = ngayLapHD;
    }
    public String getTrangThai() {
        return TrangThai;
    }
    public void setTrangThai(String trangThai) {
        TrangThai = trangThai;
    }



    
}
