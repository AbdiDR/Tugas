/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg123200143_tugas2;

/**
 *
 * @author DARUL ZUMANI
 */
public class Lingkaran implements MenghitungBangun{
    private double jari;
    
    public Lingkaran(double r){
        jari = r;
    }
    
    // Encaptulation
    public void setJari(int r){
        jari = r;
    }
    
    public double getJari(){
        return jari;
    }
    
    public double getDiameter(){
        return 2*jari;
    }

    @Override
    public double hitungLuas() {
        return PHI * (jari * jari);
    }

    @Override
    public double hitungKeliling() {
        return PHI * (2*jari);
    }
}
