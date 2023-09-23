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
public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        QLNV qlnv = new QLNV();
        String check;
        
        while (true) {            
            qlnv.nhap();
            System.out.println("Co muon nhap tiep khong(y/n)?");
            check = sc.nextLine();
            if (check.equals("n")) {
                break;
            }
        }
        
        ArrayList<NhanVien> list = qlnv.xuat();
        for (NhanVien nhanVien : list) {
            nhanVien.inThongTin();
        }
        
        System.out.println("Nhap phong ban: ");
        String nhapPhongBan = sc.nextLine();
        qlnv.timNhanVien(nhapPhongBan);
        ArrayList<NhanVien> nhanVienTimThay = qlnv.timNhanVien(nhapPhongBan);
        if (nhanVienTimThay.isEmpty()) {
            System.out.println("Khong tim thay");
        } else {
            for (NhanVien nhanVien : nhanVienTimThay) {
                nhanVien.inThongTin();
            }
        }
        
        
        
        
    }
}
