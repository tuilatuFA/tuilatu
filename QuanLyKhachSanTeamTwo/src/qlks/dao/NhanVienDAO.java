// Tu Ech
package qlks.dao;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import qlks.helper.JdbcHelper;
import qlks.model.NhanVien;
public class NhanVienDAO {
    public void insert(NhanVien model){
        String sql="INSERT INTO NhanVien (MaNhanVien, TenNhanVien, Gender, NgaySinh, SoDienThoai, Luong, DiaChi, NgayBatDauLam, GhiChu, ChucVu, hinh ) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
        JdbcHelper.executeUpdate(sql, 
                model.getMaNhanVien(), 
                model.getTenNhanVien(), 
                model.isGioiTinh(), 
                model.getNgaySinh(),
                model.getSoDienThoai(),
                model.getLuong(),
                model.getDiaChi(),
                model.getNgayBatDauLam(),
                model.getChuThich(),
                model.getChucVu(),
                model.getHinh()
        );     
    }   
    public void update(NhanVien model){
        String sql="UPDATE NhanVien SET TenNhanVien=?, Gender=?, NgaySinh=?, SoDienThoai=?, Luong=?, DiaChi=?, NgayBatDauLam=?, GhiChu=?, ChucVu=?, hinh=? WHERE MaNhanVien=?";
        JdbcHelper.executeUpdate(sql, 
                model.getMaNhanVien(), 
                model.getTenNhanVien(), 
                model.isGioiTinh(), 
                model.getNgaySinh(),
                model.getSoDienThoai(),
                model.getLuong(),
                model.getDiaChi(),
                model.getNgayBatDauLam(),
                model.getChuThich(),
                model.getChucVu(),
                model.getHinh()
        );
    } 
    public void delete(String MaNV){
        String sql="DELETE FROM NhanVien WHERE MaNhanVien=?";
        JdbcHelper.executeUpdate(sql, MaNV);
    }  
    public List<NhanVien> select(){
        String sql="SELECT * FROM NhanVien";
        return select(sql);
    }   
    public NhanVien findById(String manv){
        String sql="SELECT * FROM NhanVien WHERE MaNhanVien=?";
        List<NhanVien> list = select(sql, manv);
        return list.size() > 0 ? list.get(0) : null;
    }   
    private List<NhanVien> select(String sql, Object...args){
        List<NhanVien> list=new ArrayList<>();
        try {
            ResultSet rs = null;
            try {
                rs = JdbcHelper.executeQuery(sql, args);
                while(rs.next()){
                    NhanVien model=readFromResultSet(rs);
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
    private NhanVien readFromResultSet(ResultSet rs) throws SQLException{
        NhanVien model=new NhanVien();
        model.setMaNhanVien(rs.getString("MaNhanVien"));
        model.setTenNhanVien(rs.getString("TenNhanVien"));
        model.setGioiTinh(rs.getBoolean("Gender"));
        model.setNgaySinh(rs.getDate("NgaySinh"));
        model.setSoDienThoai(rs.getString("SoDienThoai"));
        model.setLuong(rs.getDouble("Luong"));
        model.setDiaChi(rs.getString("DiaChi"));
        model.setNgayBatDauLam(rs.getDate("NgayBatDauLam"));
        model.setChuThich(rs.getString("GhiChu"));
        model.setChucVu(rs.getString("ChucVu"));
        model.setHinh(rs.getString("hinh"));
     
        return model;
    }
}

        