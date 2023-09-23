/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SinhVien;

/**
 *
 * @author admin
 */
public class SinhVIen {
    private String ten;
    private Double mask;

    public SinhVIen() {
    }
    

    public SinhVIen(String ten, Double mask) {
        this.ten = ten;
        this.mask = mask;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public Double getMask() {
        return mask;
    }

    public void setMask(Double mask) {
        this.mask = mask;
    }

    @Override
    public String toString() {
        return "SinhVIen{" + "ten=" + ten + ", mask=" + mask + '}';
    }

    
    
    
}
