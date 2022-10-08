/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package qlks.model;

/**
 *
 * @author pc
 */
public class DichVu {
    private String MaDichVu;
    private String TenDichVu;
    private Double DonGia;
    private String GhiChu;
    
    public String getMaDichVu() {
        return MaDichVu;
    }
    public Double getDonGia() {
        return DonGia;
    }
    public void setDonGia(Double donGia) {
        this.DonGia = donGia;
    }
    public void setMaDichVu(String maDichVu) {
        MaDichVu = maDichVu;
    }
    public String getTenDichVu() {
        return TenDichVu;
    }
    public void setTenDichVu(String tenDichVu) {
        TenDichVu = tenDichVu;
    }
    public String getGhiChu() {
        return GhiChu;
    }
    public void setGhiChu(String ghiChu) {
        GhiChu = ghiChu;
    }

    
    
}
