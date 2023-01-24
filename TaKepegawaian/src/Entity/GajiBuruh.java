/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entity;

import Entity.Gaji;


/**
 *
 * @author msi pc
 */
public class GajiBuruh extends Gaji {

    private String Namapegawai;
    @Override
    void masukkanGaji(){
        System.out.println("Masukkan Nama Pegawai :");
        Namapegawai = input.nextLine();
        System.out.println("Masukkan Id Pegawai :");
        Idcard = input.nextLine();
        System.out.println("Masukkan Gaji Pokok :");
        pokok = input.nextInt();
        System.out.println("Masukkan Tunjangan :");
        tunjangan = input.nextInt();
        System.out.println("Masukkan Bonus :");
        bonus = input.nextInt();
    }
    @Override
    int Terimagaji(){
       System.out.println("Gaji Yang Diterima : Rp. ");
       total = (pokok+bonus);
       System.out.println(+total);
       return 0;
   }
}


