
package Main;

import Entity.*;
import View.*;
import Controler.*;
import java.util.Scanner;
import java.util.ArrayList;
/**
 *
 * @author msi pc
 */
public class Mainclass {
    public static Scanner masuk = new Scanner(System.in);
    public static MenuGaji prnggajian = new MenuGaji();
    public static DataDiriControler datadiri = new DataDiriControler();
    
    public static Gaji gaji = new Gaji();
    public static ArrayList<Pegawai> ArrayPegawai = new ArrayList<>();
    private static int getId;
    
    public static void main(String[] args) {
        regexit gui = new regexit();
        
    }
//       ControlerKepegawaian data = new ControlerKepegawaian();
//       MenuGaji gaji = new MenuGaji(); 
//       Login masuk = new Login();
//       Scanner input = new Scanner(System.in);
//    
//    String usr , pas;
//        System.out.println("=========Login Pegawai==========");
//        System.out.print("Masukan Username : ");
//        usr = input.nextLine();
//        System.out.print("Masukan Pasword : ");
//        pas = input.nextLine();
//    
//        if(usr.equals(masuk.getUsername()) && pas.equals(masuk.getPass()))
//        {
//            System.out.println("Username atau Pasword salah");
//        }else {   
//            System.out.println("Selamat Datang");
//        }
//    int pilihan;
//    char ulang;
//     
//    do {
//      System.out.println("##  Daftar Pilihan  ##");
//      System.out.println("============================");
//      System.out.println("1. Tampilkan Data Pegawai ");
//      System.out.println("2. Tambah Data Pegawai");
//      System.out.println("3. Edit Data Pegawai");
//      System.out.println("4. Hapus Data Pegawai");
//      System.out.println("5. Hitung Gaji Pegawai");
//       
//      System.out.print("Pilihan anda: ");
//      pilihan = input.nextInt();
//    
//      switch(pilihan){
//        case 1:
//          System.out.println("Anda memilih Tampilkan Data Pegawai");
//          data.tampildata();
//          break;
//        case 2:
//          System.out.println("Anda memilih Tambah Data Pegawai");
//          data.isidata();
//          System.out.println("Data Berhasi Ditambah");
//          break;
//        case 3:
//          System.out.println("Anda memilih Edit Data Pegawai");
//          data.editdata();
//            System.out.println("Data Berhasil Di Update");
//          break;
//        case 4:
//          System.out.println("Anda memilih Hapus Data Pegawai");
//          data.hapusdata();
//            System.out.println("Data Berhasil Dihapus");
//          break;
//        case 5:
//          System.out.println("Anda memilih Hitung Gaji Pegawai");
//          gaji.Menugaji();
//          break;
//        default:
//          System.out.println("Menu Ini tidak tersedia");
//      }
//    
//      System.out.println();
//    
//      System.out.print("Apakah Anda Ingin memilih menu lain (y/t)? : ");
//      ulang = input.next().charAt(0);
//       
//      System.out.println();
//    }
//    while (ulang!= 't');
//    
//    System.out.println("Terimakasih...");
//    }
}

