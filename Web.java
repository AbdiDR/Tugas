/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author DARUL ZUMANI
 */
public class Web extends InputNilai implements Hitung{
    public Web (String nama, int nilaiSatu, int nilaiDua, int nilaiTiga){
        super(nama, nilaiSatu, nilaiDua, nilaiTiga);
    }
    
    public void inputNilaiSatu(int nilaiSatu) {
        this.nilaiSatu = nilaiSatu;
    }

     public void inputNilaiDua(int nilaiDua) {
        this.nilaiDua = nilaiDua;
    }

     public void inputNilaiTiga(int nilaiTiga) {
        this.nilaiTiga = nilaiTiga;
    }
     
    @Override
    public double NilaiTotal() {
         return (0.4 * super.nilaiSatu) + (0.35 * super.nilaiDua) + (0.25 * super.nilaiTiga);
    }
    
    @Override
    public String Keterangan() {
        if(this.NilaiTotal() >= 85) 
            return "LULUS\nSelamat kepada " + this.nama + " telah DITERIMA sebagai Web Development dengan nilai " + NilaiTotal() + "\n";
        else 
            return "GAGAL\nMohon maaf kepada  " + this.nama + " telah DITOLAK sebagai Web Development\n";
    }
    
}

