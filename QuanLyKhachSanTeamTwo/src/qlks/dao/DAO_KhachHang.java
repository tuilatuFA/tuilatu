/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package qlks.dao;

import java.sql.ResultSet;
import javax.swing.JOptionPane;
import qlks.helper.JdbcHelper;
import qlks.model.KhachHang;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ADMIN
 */
public class DAO_KhachHang {
    public void insert(KhachHang model){
        String sql="INSERT INTO KhachHang (MaKhachHang, TenKhachHang, Gender, SoDienThoai, SoCMND, GhiChu) VALUES (?, ?, ?, ?, ?, ?)";
        JdbcHelper.executeUpdate(sql, 
        model.getMaKhachHang(), 
        model.getTenKhachHang(), 
        model.isGender(), 
        model.getSoDienThoai(),
        model.getSoCMND(),
        model.getGhiChu(),
        model.getHinh());
    }

    public void update(KhachHang model){
        String sql="UPDATE KhachHang SET MaKhachHang=?, TenKhachHang=?, Gender=?, SoDienThoai=?, soCMND=?, GhiChu=? WHERE MaKhachHang=?";
        JdbcHelper.executeUpdate(sql, 
        model.getMaKhachHang(), 
        model.getTenKhachHang(), 
        model.isGender(), 
        model.getSoDienThoai(),
        model.getSoCMND(),
        model.getGhiChu(),
        model.getHinh());
    } 

    public void delete(String MaKhachHang){
        String sql="DELETE FROM KhachHang WHERE MaKhachHang=?";
        JdbcHelper.executeUpdate(sql, MaKhachHang);
    }  

    public List<KhachHang> select(){
        String sql="SELECT * FROM KhachHang";
        return select(sql);
    }   

    public KhachHang findById(String MaKhachHang){
        String sql="SELECT * FROM KhachHang WHERE MaKhachHang=?";
        List<KhachHang> list = select(sql, MaKhachHang);
        return list.size() > 0 ? list.get(0) : null;
    } 

    private List<KhachHang> select(String sql, Object...args){
        List<KhachHang> list=new ArrayList<>();
        try {
            ResultSet rs = null;
            try {
                rs = JdbcHelper.executeQuery(sql, args);
                while(rs.next()){
                    KhachHang model=readFromResultSet(rs);
                    list.add(model);
                }
            } 
            finally{
                rs.getStatement().getConnection().close();
            }
        } 
        catch (SQLException ex) {
            throw new RuntimeException(ex);
        }
        return list;
    }
    
    private KhachHang readFromResultSet(ResultSet rs) throws SQLException{
        KhachHang model=new KhachHang();
        model.setMaKhachHang(rs.getString("MaKhachHang"));
        model.setTenKhachHang(rs.getString("TenKhachHang"));
        model.setGender(rs.getBoolean("Gender"));
        model.setSoDienThoai(rs.getString("SoDienThoai"));
        model.setSoCMND(rs.getString("SoCMND"));
        model.setGhiChu(rs.getString("GhiChu")); 
        return model;
    }
    
    
    
}
