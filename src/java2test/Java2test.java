/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package java2test;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author admin
 */
public class Java2test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        QuanLySinhVien quanlySinhVien = new QuanLySinhVien();
        String check;
        while (true) {            
            quanlySinhVien.nhap();
            System.out.println("Co muon nhap tiep(y/n)?");
            check = sc.nextLine();
            if (check.equals("n")) {
                break;
            }
        }
        ArrayList<SinhVien> list = quanlySinhVien.xuatSinhVien();
        for (SinhVien sinhVien : list) {
            sinhVien.inThongTin();
        }
        
        System.out.println("Nhap ten can tim: ");
        String tenCanTim = sc.nextLine();
        quanlySinhVien.timKiem(tenCanTim);
        ArrayList<SinhVien> kQTK = quanlySinhVien.timKiem(tenCanTim);
        if (kQTK.isEmpty()) {
            System.out.println("Khong thay ket qua");
        }else{
            for (SinhVien sinhVien : kQTK) {
                sinhVien.inThongTin();
            }
        }
        
        
        System.out.println("Nhap diem: ");
        Integer diem = Integer.parseInt(sc.nextLine());
        quanlySinhVien.diemLonHon(diem);
        ArrayList<SinhVien> diemTimThay = quanlySinhVien.diemLonHon(diem);
        if (diemTimThay.isEmpty()) {
            System.out.println("Khong thay");
        }else{
            for (SinhVien sinhVien : diemTimThay) {
                sinhVien.inThongTin();
            }
        }
        
    }
    
}
