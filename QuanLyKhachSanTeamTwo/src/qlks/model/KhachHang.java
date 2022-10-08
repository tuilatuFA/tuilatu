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
public class KhachHang {
    private String MaKhachHang;
    private String TenKhachHang;
    private boolean Gender;
    private String SoDienThoai;
    private String SoCMND;
    private String GhiChu;
    private String hinh;
    
    public String getMaKhachHang() {
        return MaKhachHang;
    }
    public void setMaKhachHang(String maKhachHang) {
        MaKhachHang = maKhachHang;
    }
    public String getTenKhachHang() {
        return TenKhachHang;
    }
    public void setTenKhachHang(String tenKhachHang) {
        TenKhachHang = tenKhachHang;
    }
    public boolean isGender() {
        return Gender;
    }
    public void setGender(boolean gender) {
        Gender = gender;
    }
    public String getSoDienThoai() {
        return SoDienThoai;
    }
    public void setSoDienThoai(String soDienThoai) {
        SoDienThoai = soDienThoai;
    }
    public String getSoCMND() {
        return SoCMND;
    }

    public String getHinh() {
        return hinh;
    }

    public void setHinh(String hinh) {
        this.hinh = hinh;
    }
    public void setSoCMND(String soCMND) {
        SoCMND = soCMND;
    }
    public String getGhiChu() {
        return GhiChu;
    }
    public void setGhiChu(String ghiChu) {
        GhiChu = ghiChu;
    }

    public void getHinh(String string) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }



    
}
