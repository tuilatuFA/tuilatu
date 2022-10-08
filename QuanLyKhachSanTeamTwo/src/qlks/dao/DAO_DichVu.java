package qlks.dao;

import java.sql.ResultSet;
import javax.swing.JOptionPane;
import qlks.helper.JdbcHelper;
import qlks.model.DichVu;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


public class DAO_DichVu {

    public void insert(DichVu model){
        String sql="INSERT INTO DichVu (MaDichVu, TenDichVu, DonGia, GhiChu) VALUES (?, ?, ?, ?)";
        JdbcHelper.executeUpdate(sql, 
        model.getMaDichVu(), 
        model.getTenDichVu(), 
        model.getDonGia(), 
        model.getGhiChu());
    }

    public void update(DichVu model){
        String sql="UPDATE DichVu SET TenDichVu=?, DonGia=? WHERE MaDichVu=?";
        JdbcHelper.executeUpdate(sql, 
       // 
        model.getTenDichVu(), 
        model.getDonGia(), 
//                
        model.getGhiChu(),
        model.getMaDichVu()
        
        );
    } 

    public void delete(String MaDichVu){
        String sql="DELETE FROM DichVu WHERE MaDichVu=?";
        JdbcHelper.executeUpdate(sql, MaDichVu);
    }  

    public List<DichVu> select(){
        String sql="SELECT * FROM DichVu";
        return select(sql);
    }   

    public DichVu findById(String MaDichVu){
        String sql="SELECT * FROM DichVu WHERE MaDichVu=?";
        List<DichVu> list = select(sql, MaDichVu);
        return list.size() > 0 ? list.get(0) : null;
    } 

    private List<DichVu> select(String sql, Object...args){
        List<DichVu> list=new ArrayList<>();
        try {
            ResultSet rs = null;
            try {
                rs = JdbcHelper.executeQuery(sql, args);
                while(rs.next()){
                    DichVu model=readFromResultSet(rs);
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
    
    private DichVu readFromResultSet(ResultSet rs) throws SQLException{
        DichVu model=new DichVu();
        model.setMaDichVu(rs.getString("MaDichVu"));
        model.setTenDichVu(rs.getString("TenDichVu"));
        model.setDonGia(rs.getDouble("DonGia"));
        model.setGhiChu(rs.getString("GhiChu"));
        return model;
    }
    
    
    




}
