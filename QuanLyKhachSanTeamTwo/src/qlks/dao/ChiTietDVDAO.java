/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package qlks.dao;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import qlks.helper.JdbcHelper;
import qlks.model.ChiTietDV;
import qlks.model.ChiTietHoaDon;

/**
 *
 * @author tuat5
 */
public class ChiTietDVDAO {
    String SELECT_ALL_SQL = "SELECT * FROM ChiTietDV";
    String SELECT_ID_SQL = "SELECT * FROM ChiTietDV WHERE MaPhong =?";
    
    public ChiTietDV selectById(String maPhong) {
        List<ChiTietDV> list = selectBySql(SELECT_ID_SQL, maPhong);
        if(list.isEmpty()){
            return null;
        }
        return list.get(0);
    }
    
    public List<ChiTietDV> selectALL() {
        return selectBySql(SELECT_ALL_SQL);
    }
    
    protected List<ChiTietDV> selectBySql(String sql, Object... args) {
        List<ChiTietDV> list = new ArrayList<>();
        try {
            ResultSet rs = JdbcHelper.executeQuery(sql, args);
            while (rs.next()){
                ChiTietDV entity = new ChiTietDV();
                entity.setMaPhong(rs.getString("MaPhong"));
                entity.setTenDichVu(rs.getString("TenDichVu"));
                entity.setSoLuong(rs.getInt("SoLuong"));
                entity.setThannhTien(rs.getDouble("ThanhTien"));
                list.add(entity);
            }
            rs.getStatement().getConnection().close();;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        return list;
    }
}
