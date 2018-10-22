/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo3.pkg10117104.latihan47.nilaimahasiswa;

/**
 *
 * @author
 * Nama : Aditya Suheryana
 * Kelas : IF-3/PBO3
 * Nim : 10117104
 * Deskripsi Program : Menghasilkan dan Menampilkan Nilai Akhir,
 * Indeks dan keterangan namun user tidak dapat mengetik nilai Uts,Uas dan Quis 
 * di keyboardnya 
 */
public class PBO310117104Latihan47NilaiMahasiswa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        NilaiMahasiswa nilaiMhs = new NilaiMahasiswa();
        nilaiMhs.setNilaiQuis(75);
        nilaiMhs.setNilaiUts(45);
        nilaiMhs.setNilaiUas(34);
        System.out.println("QUIZ \t\t= "+nilaiMhs.getNilaiQuis());
        System.out.println("UTS \t\t= "+nilaiMhs.getNilaiUts());
        System.out.println("UAS \t\t= "+nilaiMhs.getNilaiUas());
        System.out.println("");
        System.out.println("Nilai Akhir \t= "+nilaiMhs.nilaiAkhir
        (nilaiMhs.getNilaiQuis(),nilaiMhs.getNilaiUts(),nilaiMhs.getNilaiUas()));
        System.out.println("");
        System.out.println("Index \t= "+nilaiMhs.index(nilaiMhs.nilaiAkhir(
                nilaiMhs.getNilaiQuis(),nilaiMhs.getNilaiUts(),
                nilaiMhs.getNilaiUas())));
   
        System.out.println("Keterangan = "+nilaiMhs.keterangan
        (nilaiMhs.index(nilaiMhs.nilaiAkhir(
                nilaiMhs.getNilaiQuis(),nilaiMhs.getNilaiUts(),
                nilaiMhs.getNilaiUas()))));
    
    }  
    
}
