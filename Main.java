/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg123200143_konvertersuhu;

import java.util.Scanner;



public class Main {
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int opsi;
        float celci;
        
        System.out.println(" ---------------------");
        System.out.println("|Program Konversi Suhu |");
        System.out.println(" ---------------------");
        System.out.print("Suhu Dalam Celcius : ");
        celci = scan.nextFloat(); 
        
        konversi tukar = new konversi(celci);
        
        OUTER:
        while (true) {
            System.out.println();
            System.out.println("Opsi");
            System.out.println("----");
            System.out.println("1. Lihat Data Konversi");
            System.out.println("2. Edit Data Konversi");
            System.out.println("3. Exit");
            System.out.print("Pilih   : ");
            opsi = scan.nextInt();
            System.out.println();
            switch (opsi) {
                case 1 -> {
                    System.out.println("Reamure : " + tukar.reamure() + "°R");
                    System.out.println("Kelvin : " + tukar.kelvin() + "K");
                    System.out.println("Farhenheit : " + tukar.faren() + "°F");
                    if (tukar.nilai() <= 0){
                        System.out.println("Kondisi Air Beku");
                    }else if (tukar.nilai() >= 100){
                        System.out.println("Kondisi Air Mendidih");
                    }else {
                        System.out.println("Kondisi Air Normal");
                    }
                }
                case 2 -> {
                    System.out.println("Input Data");
                    System.out.println("----------");
                    System.out.print("Suhu Dalam Celcius      : ");
                    celci = scan.nextFloat();
                    tukar.aturCelcius(celci);
                }
                case 3 -> {
                    break OUTER;
                }
                default -> System.out.println("Salah pilih opsi");
            }
        }
    }
}
