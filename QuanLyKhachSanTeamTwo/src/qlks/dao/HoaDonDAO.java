/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package qlks.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import qlks.helper.JdbcHelper;
import qlks.model.HoaDon;

/**
 *
 * @author tuat5
 */
public class HoaDonDAO {
    String trangThai = "Da Thanh Toan";
    String UPDATE_SQL="UPDATE HoaDon set TrangThai = '" + trangThai + "'" + "WHERE MaHD = ?";
    
    public List<HoaDon> select(){
        String sql="SELECT * FROM HoaDon";
        return select(sql);
    }
    
    public HoaDon selectById(String macd){
        String sql="SELECT * FROM HoaDon WHERE MaHD = ?";
        List<HoaDon> list = select(sql, macd);
        return list.size() > 0 ? list.get(0) : null;
    }
    
     public HoaDon selectTrangThai(String trangThai){
        String sql="SELECT * FROM HoaDon WHERE TrangThai = ?";
        List<HoaDon> list = select(sql, trangThai);
        return list.size() > 0 ? list.get(0) : null;
    }
    
    public void updateTrangThai(HoaDon entity){
        JdbcHelper.executeUpdate(UPDATE_SQL, entity.getTrangThai());
    }
     
    private List<HoaDon> select(String sql, Object...args){
        List<HoaDon> list=new ArrayList<>();
        try {
            ResultSet rs = null;
            try {
                rs = JdbcHelper.executeQuery(sql, args);
                while(rs.next()){
                    HoaDon model=readFromResultSet(rs);
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
    
    private HoaDon readFromResultSet(ResultSet rs) throws SQLException{
        HoaDon model=new HoaDon();
        model.setMaHDCT(rs.getString("MaHDCT"));
        model.setMaHD(rs.getString("MaHD"));
        model.setMaNV(rs.getString("MaNV"));
        model.setMaKH(rs.getString("MaKH"));
        model.setIDPhong(rs.getString("IDPhong"));
        model.setNgayLapHD(rs.getDate("NgayLap"));
        model.setTrangThai(rs.getString("TrangThai"));
        return model;
    }
}
