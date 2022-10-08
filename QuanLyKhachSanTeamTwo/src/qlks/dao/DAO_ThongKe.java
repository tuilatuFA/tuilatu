/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package qlks.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import qlks.helper.JdbcHelper;

/**
 *
 * @author pc
 */
public class DAO_ThongKe {
    public List<Object[]> getDoanhThu(Date time1, Date time2){
        List<Object[]> list=new ArrayList<>();
        try {
            ResultSet rs = null;
            try {
                String sql="{exec sp_ThongKeDoanhThu (?), (?)}";
                rs = JdbcHelper.executeQuery(sql, time1, time2);
                while(rs.next()){
                    Object[] model={
                        rs.getString("MaKhachHang"),
                        rs.getInt("TongHoaDon"),
                        rs.getDouble("TongTienHoaDon"),
                        
                    };
                    list.add(model);
                }
            } 
            catch (Exception e ){
                 rs.getStatement().getConnection().close();
                e.toString();
            }
        } 
        catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return list;
    }    
    
    
    
}
