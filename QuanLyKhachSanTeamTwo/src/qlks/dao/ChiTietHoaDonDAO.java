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
import qlks.model.ChiTietHoaDon;
import qlks.model.HoaDon;

/**
 *
 * @author tuat5
 */
public class ChiTietHoaDonDAO extends HoaDonOver<ChiTietHoaDon, String>{
    String SELECT_ALL_SQL = "SELECT * FROM ChiTietHoaDon";
    String SELECT_ID_SQL = "SELECT * FROM ChiTietHD WHERE MaHDCT =?";
    String UPDATE_SQL = "UPDATE ChiTietHD SET MaHD=?, MaDatPhong=?, SumDayStay=?, TienPhong=?, TienDichVu=?, PhuThu=?, ThanhTien=?, DayPay=? WHERE MaHDCT=?";
    
    @Override
    public ChiTietHoaDon selectById(String maHDCT) {
        List<ChiTietHoaDon> list = selectBySql(SELECT_ID_SQL, maHDCT);
        if(list.isEmpty()){
            return null;
        }
        return list.get(0);
    }
    
    public void update(ChiTietHoaDon entity) {
        JdbcHelper.executeUpdate(UPDATE_SQL, entity.getMaHD(), entity.getMaPhong(), entity.getNgayO(), entity.getTienPhong(), entity.getTienDichvu(), entity.getPhuThu(), entity.getThanhTien(), entity.getMaCTHD());
    }
    
    public ChiTietHoaDon selectTrangThai(String trangThai){
        String sql="SELECT * FROM HoaDon WHERE TrangThai = ?";
        List<ChiTietHoaDon> list = selectBySql(sql, trangThai);
        return list.size() > 0 ? list.get(0) : null;
    }
    
    @Override
    public List<ChiTietHoaDon> selectALL() {
        return selectBySql(SELECT_ALL_SQL);
    }

    @Override
    protected List<ChiTietHoaDon> selectBySql(String sql, Object... args) {
        List<ChiTietHoaDon> list = new ArrayList<>();
        try {
            ResultSet rs = JdbcHelper.executeQuery(sql, args);
            while (rs.next()){
                ChiTietHoaDon entity = new ChiTietHoaDon();
                entity.setMaCTHD(rs.getString("MaHDCT"));
                entity.setMaHD(rs.getString("MaHD"));
                entity.setMaPhong(rs.getString("MaDatPhong"));
                entity.setNgayO(rs.getInt("SumDayStay"));
                entity.setTienPhong(rs.getDouble("TienPhong"));
                entity.setTienDichvu(rs.getDouble("TienDichVu"));
                entity.setPhuThu(rs.getDouble("PhuThu"));
                entity.setThanhTien(rs.getDouble("ThanhTien"));
                entity.setNgayThanhToan(rs.getDate("DayPay"));
                list.add(entity);
            }
            rs.getStatement().getConnection().close();;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        return list;
    }
    private ChiTietHoaDon readFromResultSet(ResultSet rs) throws SQLException{
        ChiTietHoaDon model=new ChiTietHoaDon();
        model.setMaCTHD(rs.getString("MaHDCT"));
        model.setMaHD(rs.getString("MaHD"));
        model.setMaPhong(rs.getString("MaDatPhong"));
        model.setNgayO(rs.getInt("SumDayStay"));
        model.setTienPhong(rs.getDouble("TienPhong"));
        model.setTienDichvu(rs.getDouble("TienDichVu"));
        model.setPhuThu(rs.getDouble("PhuThu"));
        model.setThanhTien(rs.getDouble("ThanhTien"));
        model.setNgayThanhToan(rs.getDate("DayPay"));
        return model;
    }
}
