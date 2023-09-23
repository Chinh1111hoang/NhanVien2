/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BT_NhanVien;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author admin
 */
public class QLNV {
    Scanner sc = new Scanner(System.in);
    ArrayList<NhanVien> listNhanVien = new ArrayList<>();
    
    public void nhap(){
        System.out.println("Nhap ma: ");
        String ma = sc.nextLine();
        System.out.println("Nhap ten nhan vien");
        String tenNhanVien = sc.nextLine();
        System.out.println("Nhap luong co ban: ");
        Integer luongCoBan = Integer.parseInt(sc.nextLine());
        System.out.println("Nhap phong ban: ");
        String phongBan = sc.nextLine();
        System.out.println("Nhap chuc vu: ");
        String chucVu = sc.nextLine();
        System.out.println("Nhap nam sinh: ");
        Integer namSinh = Integer.parseInt(sc.nextLine());
        System.out.println("Nhap gioi tinh(0-nam/1-nu):");
        Boolean gioiTinh = Boolean.parseBoolean(sc.nextLine());
        
        NhanVien nhanVien = new NhanVien(ma, tenNhanVien, luongCoBan, phongBan, chucVu, namSinh, gioiTinh);
        listNhanVien.add(nhanVien);
    }
    
    public ArrayList<NhanVien> xuat(){
        return listNhanVien;
    }
    
    public ArrayList<NhanVien> timNhanVien(String nhapPhongBan){
        ArrayList<NhanVien> ketQuaTimKiem = new ArrayList<>();
        for (NhanVien nhanVien : listNhanVien) {
            if (nhanVien.getPhongBan().equals(nhapPhongBan)) {
                ketQuaTimKiem.add(nhanVien);
            }
        }
        return ketQuaTimKiem;
    }
    
    public ArrayList<NhanVien> tinhTuoiNhanVien(){
        ArrayList<NhanVien> tuoiNhanVien = new ArrayList<>();
        Integer ketQuaTuoi = 0;
        for (NhanVien nhanVien : listNhanVien) {
            ketQuaTuoi = 2023 - nhanVien.getNamSinh();
            
        }
        return tuoiNhanVien;
        
    }
    
}
