/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bang_NV2;

/**
 *
 * @author admin
 */
public class NhanVien2 {
    private String maNV;
    private String hoTen;
    private String gioiTinh;
    private String lop;

    public NhanVien2() {
    }

    public NhanVien2(String maNV, String hoTen, String gioiTinh, String lop) {
        this.maNV = maNV;
        this.hoTen = hoTen;
        this.gioiTinh = gioiTinh;
        this.lop = lop;
    }

    public String getMaNV() {
        return maNV;
    }

    public void setMaNV(String maNV) {
        this.maNV = maNV;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(String gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public String getLop() {
        return lop;
    }

    public void setLop(String lop) {
        this.lop = lop;
    }

    @Override
    public String toString() {
        return "NhanVien2{" + "maNV=" + maNV + ", hoTen=" + hoTen + ", gioiTinh=" + gioiTinh + ", lop=" + lop + '}';
    }
    
    
}
