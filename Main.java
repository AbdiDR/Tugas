/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
import java.util.Scanner;

public class Main {

    
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("Pelamaran PT Digitalisasi");
        System.out.println(" 1. Web Development");
        System.out.println(" 2. Android Development");
        System.out.println(" Pilih Jenis Form : ");
        int pilih = input.nextInt();
        
        //scanner berupa data
        System.out.println("=== FORMULIR PENDAFTARAN ===");
        Scanner data= new Scanner(System.in);
        System.out.println(" NIK : ");
        String NIK = data.next();
        data.nextLine();
        System.out.println(" Nama Lengkap : ");
        String nama = data.nextLine();
        
        
        System.out.println("---Penilaian---");
        System.out.println("Keterangan: Nilai yang valid berada di antara 0-100");
        
        if (pilih == 1){
            //Android
            System.out.println("Input Nilai Tulis : ");
            int nilaiSatu= data.nextInt();
            System.out.println("Input Nilai Coding : ");
            int nilaiDua = data.nextInt();
            System.out.println("Input Nilai Wawancara : ");
            int nilaiTiga = data.nextInt();
            Web web = new Web(nama,nilaiSatu,nilaiDua,nilaiDua);
            do{
                System.out.println("=== MENU ===");
                System.out.println(" 1. Tampilkan");
                System.out.println(" 2. Edit");
                System.out.println(" 3. Exit");
                System.out.print(" Pilih : ");
                int Menu = input.nextInt();
                if (Menu == 1){
                    System.out.println("Nilai Akhir : " + web.NilaiTotal());
                    System.out.println("Keterangan : " + web.Keterangan());
                }
                else if (Menu == 2){
                    System.out.println("Input Nilai Tulis : ");
                    web.inputNilaiSatu(input.nextInt());
                    System.out.println("Input Nilai Coding : ");
                    web.inputNilaiDua(input.nextInt());
                    System.out.println("Input Nilai Wawancara : ");
                    web.inputNilaiTiga(input.nextInt());  
                }
                else {
                    System.out.println("Terimakasih");
                    break;
                }
            }while(true);
        }
        else if (pilih == 2){
            System.out.println("Input Nilai Tulis : ");
            int nilaiSatu= data.nextInt();
            System.out.println("Input Nilai Coding : ");
            int nilaiDua = data.nextInt();
            System.out.println("Input Nilai Wawancara : ");
            int nilaiTiga = data.nextInt();
            Android android = new Android(nama,nilaiSatu,nilaiDua,nilaiTiga);
            do{
                System.out.println("=== MENU ===");
                System.out.println(" 1. Tampilkan");
                System.out.println(" 2. Edit");
                System.out.println(" 3. Exit");
                System.out.println(" Pilih : ");
                int Menu = input.nextInt();
                
                if (Menu == 1){
                    System.out.println("Nilai Akhir : " + android.NilaiTotal());
                    System.out.println("Keterangan : " + android.Keterangan());
                }
                else if (Menu == 2){
                    System.out.println("Input Nilai Tulis : ");
                    android.inputNilaiSatu(input.nextInt());
                    System.out.println("Input Nilai Coding : ");
                    android.inputNilaiDua(input.nextInt());
                    System.out.println("Input Nilai Wawancara : ");
                    android.inputNilaiTiga(input.nextInt());
                }
                else {
                     System.out.println("Terimakasih");
                    break;
                }
            }while(true);
        }
        else{
            System.out.println("=== Input SALAH ===");
            System.out.println("(Mohon Input Ulang)");
        }
    }
        
}
    
