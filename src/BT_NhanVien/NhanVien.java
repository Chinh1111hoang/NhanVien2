/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BT_NhanVien;

/**
 *
 * @author admin
 */
public class NhanVien {
    private String maNhanVien;
    private String tenNhanVien;
    private Integer luongCoban;
    private String phongBan;
    private String chucVu;
    private Integer namSinh;
    private Boolean gioiTinh;

    public NhanVien() {
    }

    public NhanVien(String maNhanVien, String tenNhanVien, Integer luongCoban, String phongBan, String chucVu, Integer namSinh, Boolean gioiTinh) {
        this.maNhanVien = maNhanVien;
        this.tenNhanVien = tenNhanVien;
        this.luongCoban = luongCoban;
        this.phongBan = phongBan;
        this.chucVu = chucVu;
        this.namSinh = namSinh;
        this.gioiTinh = gioiTinh;
    }

    public String getMaNhanVien() {
        return maNhanVien;
    }

    public void setMaNhanVien(String maNhanVien) {
        this.maNhanVien = maNhanVien;
    }

    public String getTenNhanVien() {
        return tenNhanVien;
    }

    public void setTenNhanVien(String tenNhanVien) {
        this.tenNhanVien = tenNhanVien;
    }

    public Integer getLuongCoban() {
        return luongCoban;
    }

    public void setLuongCoban(Integer luongCoban) {
        this.luongCoban = luongCoban;
    }

    public String getPhongBan() {
        return phongBan;
    }

    public void setPhongBan(String phongBan) {
        this.phongBan = phongBan;
    }

    public String getChucVu() {
        return chucVu;
    }

    public void setChucVu(String chucVu) {
        this.chucVu = chucVu;
    }

    public Integer getNamSinh() {
        return namSinh;
    }

    public void setNamSinh(Integer namSinh) {
        this.namSinh = namSinh;
    }

    public Boolean getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(Boolean gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    @Override
    public String toString() {
        return "NhanVien{" + "maNhanVien=" + maNhanVien 
                + ", tenNhanVien=" + tenNhanVien 
                + ", luongCoban=" + luongCoban 
                + ", phongBan=" + phongBan 
                + ", chucVu=" + chucVu 
                + ", namSinh=" + namSinh 
                + ", gioiTinh=" + gioiTinh + '}';
    }
    
    public void inThongTin(){
        System.out.println("NhanVien{" + "maNhanVien=" + maNhanVien 
                + ", tenNhanVien=" + tenNhanVien 
                + ", luongCoban=" + luongCoban 
                + ", phongBan=" + phongBan 
                + ", chucVu=" + chucVu 
                + ", namSinh=" + namSinh 
                + ", gioiTinh=" + gioiTinh + '}');
    }
    
}
