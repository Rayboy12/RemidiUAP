
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ALEXIS
 */
public class UAP {
    public static void main(String[] args) {
         Scanner masukan = new Scanner (System.in);    
    
         String nim, nama, urut = " ", ulang;
         String jurusan = " ";
         int tahun = 2000;
         
         do{
             System.out.println("Masukan nim :");
             nim = masukan.nextLine();
             System.out.println("Masukan nama :");
             nama = masukan.nextLine();
             
             String inputan = nim.substring(3, 5);
             
             switch (inputan) {
                 case "51"  :
                     jurusan = "S1 - Sistem Informasi";
                     break;
                 default :
                     jurusan = "Tidak diketahui";

             }
             
              String last = nim.substring(8, 9);
            if (last.equals("0")) {
                urut = nim.substring(9);
            } else {
                urut = nim.substring(8,10);
            }
           
             String year = nim.substring(0,2);
            int tahunPertama = Integer.parseInt(year);
            //tahun ajaran masuk
            tahunPertama = tahun + tahunPertama;
            int tahunKedua = tahunPertama + 1;
         
  
            
              System.out.println("NIM = " + nim);
            System.out.println("Tahun Ajaran Masuk = " + tahunPertama + "-" + tahunKedua);
            System.out.println("NAMA = " + nama);
            System.out.println("Jurusan = " + jurusan);
            System.out.println("No Urut Masuk = " + urut);
            
            System.out.println("Apakah Anda ingin memasukkan data lagi [ya/tidak]");
            ulang = masukan.nextLine();
            }
         while(ulang.equalsIgnoreCase("Ya"));
        
        System.out.println("Terimakasih!");
         }
}