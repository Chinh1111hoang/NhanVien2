/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package java2test;

import java.util.Scanner;

/**
 *
 * @author admin
 */
public class Exception {
    public static void main(String[] args) {
        Integer a = null;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap a: ");
        try {
            a = Integer.parseInt(sc.nextLine());
        } catch (NumberFormatException ex) {
            System.out.println("Da chay vao day");
        }
        
        System.out.println("So a la: " + a);
    }
}
