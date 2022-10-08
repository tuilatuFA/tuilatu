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
import qlks.model.BookRoom;
import qlks.model.KhachHang;
import qlks.model.NhanVien;

/**
 *
 * @author tuat5
 */
public class BookRoomDAO {
    String INSERT_SQL="INSERT INTO BookRoom (ID,MaKH,MaPHG,DayBookRoom,DayWillCheckOut,SoNguoi,IdNV,TienDatCoc) values (?,?,?,?,?,?,?,?)";
    
    public void insert(BookRoom entity){
        JdbcHelper.executeUpdate(INSERT_SQL, entity.getIdBookRoom(), entity.getMaKH(), entity.getMaPHG(), entity.getDayBookRoom(), entity.getDayWillCheckOut(), entity.getSoNguoi(), entity.getIdNV(), entity.getTienDatCoc());
    }
            
    public List<BookRoom> select(){
        String sql="SELECT * FROM BookRoom";
        return select(sql);
    }
    public BookRoom selectByID(String maHDCT){
        String sql="SELECT * FROM BookRoom WHERE ID = ?";
        List<BookRoom> list = select(sql, maHDCT);
        return list.size() > 0 ? list.get(0) : null;
    }
    
    private List<BookRoom> select(String sql, Object...args){
        List<BookRoom> list=new ArrayList<>();
        try {
            ResultSet rs = null;
            try {
                rs = JdbcHelper.executeQuery(sql, args);
                while(rs.next()){
                    BookRoom model=readFromResultSet(rs);
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
    
    private BookRoom readFromResultSet(ResultSet rs) throws SQLException{
        BookRoom model=new BookRoom();
        model.setIdBookRoom(rs.getString("ID"));
        model.setMaKH(rs.getString("MaKH"));
        model.setMaPHG(rs.getString("MaPHG"));
        model.setDayBookRoom(rs.getDate("DayBookRoom"));
        model.setDayWillCheckOut(rs.getDate("DayWillCheckOut"));
        model.setSoNguoi(rs.getInt("SoNguoi"));
        model.setIdNV(rs.getString("IdNV"));
        model.setTienDatCoc(rs.getDouble("TienDatCoc"));
        return model;
    }
}
