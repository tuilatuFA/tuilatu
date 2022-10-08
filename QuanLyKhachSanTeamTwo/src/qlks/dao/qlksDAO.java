/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package qlks.dao;

import java.util.List;

/**
 *
 * @author pc
 */
public abstract class qlksDAO<EntityType,KeyType> {
    abstract public EntityType selectById(KeyType id);
    abstract protected List <EntityType> selectBySql(String sql, Object...args);
    abstract public EntityType selectByMK(KeyType mk);
}
