/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum.Tugas_7;
import java.util.HashMap;
import java.util.Map;

public class Kelahiran {
    int Tanggal, urutan_bulan, tahun;
    String bulan;
    
    public void tebakKelahiran(int tanggal, String bulan, int tahun){
        this.Tanggal = tanggal;
        this.bulan = bulan;
        this.tahun = tahun;    
        this.urutan_bulan = cekBulan(this.bulan);    
        System.out.println("Hasil akhir = " + this.Tanggal + this.urutan_bulan + this.tahun);
    }
    
    private int cekBulan(String bulan) {
        Map<String, Integer> bulan_map = new HashMap<>();
            bulan_map.put("januari", 1);
            bulan_map.put("februari", 2);
            bulan_map.put("maret", 3);
            bulan_map.put("april", 4);
            bulan_map.put("mei", 5);
            bulan_map.put("juni", 6);
            bulan_map.put("juli", 7);
            bulan_map.put("agustus", 8);
            bulan_map.put("september", 9);
            bulan_map.put("oktober", 10);
            bulan_map.put("november", 11);
            bulan_map.put("desember", 12);
        return bulan_map.getOrDefault(bulan, 0);
    }
}
