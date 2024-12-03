/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum.Tugas_4;

public class BonusSalesman {
    String nama_salesman;
    int harga_barang_terjual, uang_jasa, komisi, total_pendapatan;
    
    void total(){
        if(harga_barang_terjual == 2000000){
            uang_jasa = 100000;
            komisi = (int) (0.10 * harga_barang_terjual);
            total_pendapatan = uang_jasa + komisi;
            System.out.println("salesman mendapat total komisi sebesar " + total_pendapatan);
        }else if(harga_barang_terjual > 2000000 && harga_barang_terjual <= 5000000){
            uang_jasa = 200000;
            komisi = (int) (0.15 * harga_barang_terjual);
            total_pendapatan = uang_jasa + komisi;
            System.out.println("salesman mendapat total komisi sebesar " + total_pendapatan);
        }else if(harga_barang_terjual == 5000000){
            uang_jasa = 300000;
            komisi = (int) (0.20 * harga_barang_terjual);
            total_pendapatan = uang_jasa + komisi;
            System.out.println("salesman mendapat total komisi sebesar " + total_pendapatan);
        }else{
            System.err.println("salesman tidak mendapatkan komisi");
        }
    }
}
