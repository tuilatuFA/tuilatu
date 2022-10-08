/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package qlks.dao;

import java.util.List;
import qlks.model.ChiTietHoaDon;
import qlks.model.HoaDon;

/**
 *
 * @author tuat5
 */
public abstract class HoaDonOver<EntityType,KeyType> {
    abstract public EntityType selectById(String entityString);
    abstract public List<EntityType> selectALL();
    abstract protected List<ChiTietHoaDon> selectBySql(String sql, Object... args);
    abstract public EntityType selectTrangThai(String EntityString);
}
