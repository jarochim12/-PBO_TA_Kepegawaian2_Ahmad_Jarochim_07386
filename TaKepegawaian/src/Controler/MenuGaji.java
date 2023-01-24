/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controler;

import java.util.Scanner;

import Entity.GajiAsman;
import Entity.GajiBuruh;
import Entity.GajiKabag;
import Entity.GajiManager;
import Entity.GajiSuppervisor;

/**
 *
 * @author msi pc
 */
public class MenuGaji {
    
    GajiManager manager = new GajiManager();
    GajiAsman Asman = new GajiAsman();
    GajiBuruh buruh = new GajiBuruh();
    GajiKabag Kabag = new GajiKabag();
    GajiSuppervisor Spv = new GajiSuppervisor();
    Scanner input = new Scanner(System.in);
    
public void Menugaji() {

       
    int pilihan;
    char ulang;
     
    do {
      System.out.println("##  HITUNG GAJI PEGAWAI ##");
      System.out.println("============================");
      System.out.println("1. HITUNG GAJI MANAGER");
      System.out.println("2. HITUNG GAJI PEGAWAI TETAP");
      System.out.println("3. HITUNG GAJI PEGAWAI KONTRAK");
      System.out.println();
       
      System.out.print("Pilihan anda: ");
      pilihan = input.nextInt();
    
      switch(pilihan){
        case 1 -> System.out.println("=======HITUNG GAJI MANAGER=============");
        case 2 -> System.out.println("=========HITUNG GAJI ASMAN===========");
        case 3 -> System.out.println("=========HITUNG GAJI SUPPERVISOR=========");
        case 4 -> System.out.println("=========HITUNG GAJI KABAG=========");
        case 5 -> System.out.println("=========HITUNG GAJI BURUH=========");
        default -> System.out.println("Pilihan tidak tersedia");
      }
    
      System.out.println();
    
      System.out.print("Ingin memilih menu lain (y/t)? ");
      ulang = input.next().charAt(0);
       
      System.out.println();
    }
    while (ulang!= 't');
    
    System.out.println("Terimakasih...");
}
    }


