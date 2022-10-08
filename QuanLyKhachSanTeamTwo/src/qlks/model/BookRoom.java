/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package qlks.model;

import java.sql.Date;

/**
 *
 * @author tuat5
 */
public class BookRoom {
    String idBookRoom,maKH,maPHG,idNV;
    Date dayBookRoom, dayWillCheckOut;
    int soNguoi;
    Double tienDatCoc;

    public String getIdBookRoom() {
        return idBookRoom;
    }

    public void setIdBookRoom(String idBookRoom) {
        this.idBookRoom = idBookRoom;
    }

    public String getMaKH() {
        return maKH;
    }

    public void setMaKH(String maKH) {
        this.maKH = maKH;
    }

    public String getMaPHG() {
        return maPHG;
    }

    public void setMaPHG(String maPHG) {
        this.maPHG = maPHG;
    }

    public String getIdNV() {
        return idNV;
    }

    public void setIdNV(String idNV) {
        this.idNV = idNV;
    }

    public Date getDayBookRoom() {
        return dayBookRoom;
    }

    public void setDayBookRoom(Date dayBookRoom) {
        this.dayBookRoom = dayBookRoom;
    }

    public Date getDayWillCheckOut() {
        return dayWillCheckOut;
    }

    public void setDayWillCheckOut(Date dayWillCheckOut) {
        this.dayWillCheckOut = dayWillCheckOut;
    }

    public int getSoNguoi() {
        return soNguoi;
    }

    public void setSoNguoi(int soNguoi) {
        this.soNguoi = soNguoi;
    }

    public Double getTienDatCoc() {
        return tienDatCoc;
    }

    public void setTienDatCoc(Double tienDatCoc) {
        this.tienDatCoc = tienDatCoc;
    }

    
    
}
