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
import qlks.model.UserLogin;

/**
 *
 * @author LENOVO
 */
public class UserLoginDAO extends qlksDAO<UserLogin, String>{
    String SELECT_BY_ID_SQL = "SELECT * FROM UserLogin WHERE IDNhanVien=?";
    String SELECT_PAS_SQL = "SELECT * FROM UserLogin WHERE PasswordKey =?";
    
    @Override
    public UserLogin selectById(String id) {
        List<UserLogin> list = selectBySql(SELECT_BY_ID_SQL, id);
        if(list.isEmpty()){
            return null;
        }
        return list.get(0);
    }
    
    @Override
    public UserLogin selectByMK(String mk){
        List<UserLogin> list = selectBySql(SELECT_PAS_SQL, mk);
        if (list.isEmpty()){
            return null;
        }
        return list.get(0);
    }
    
    @Override
    protected List<UserLogin> selectBySql(String sql, Object... args) {
        List<UserLogin> list = new ArrayList<>();
        try {
            ResultSet rs = JdbcHelper.executeQuery(sql, args);
            while (rs.next()){
                UserLogin entity = new UserLogin();
                entity.setMaNhanVien(rs.getString("IDNhanVien"));
                entity.setMatKhau(rs.getString("PasswordKey"));
                list.add(entity);
            }
            rs.getStatement().getConnection().close();;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return list;
    }
   
    
    
}