/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bang_NV2;

import java.util.ArrayList;

/**
 *
 * @author admin
 */
public class QuanLyNhanVien2 {
    ArrayList<NhanVien2> listNhanVien2 = new ArrayList<>();
    
    ArrayList<NhanVien2> getListNhanVien2() {
        listNhanVien2.add(new NhanVien2("A", "NVA", "Nam", "SD12345"));
        listNhanVien2.add(new NhanVien2("B", "NVB", "Nữ", "SD12343"));
        listNhanVien2.add(new NhanVien2("C", "NVC", "Nam", "SD12355"));
        return listNhanVien2;
        
    }
}
