/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entity;

/**
 *
 * @author msi pc
 */
import java.util.Scanner;
public class Gaji {

    public static void Menugaji() {
        throw new UnsupportedOperationException("Not supported yet."); 
    }
    int pokok,tunjangan,bonus, total;
    String Namakaryawan,Idcard;
    
    Scanner input = new Scanner(System.in);
    
    void masukkanGaji(){
        System.out.println("Masukkan Nama Pegawai :");
        Namakaryawan = input.nextLine();
        System.out.println("Masukkan Id Pegawai :");
        Idcard = input.nextLine();
        System.out.println("Masukkan Gaji Pokok :");
        pokok = input.nextInt();
        System.out.println("Masukkan Tunjangan :");
        tunjangan = input.nextInt();
        System.out.println("Masukkan Bonus :");
        bonus = input.nextInt();
    }
   int Terimagaji(){
       System.out.println("Gaji Yang Diterima :");
       return 0;
   }

    
}
