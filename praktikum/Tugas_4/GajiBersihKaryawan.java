/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum.Tugas_4;

public class GajiBersihKaryawan {
    String NIK, nama, status_pernikahan;
    int gaji_pokok, gaji_bersih, tunjangan_istri, tunjangan_anak, total_tunjangan, kode_golongan, jumlah_anak;
    
    void cek_gaji_pokok(){
        switch(kode_golongan){
            case 1 -> { gaji_pokok = 1200000; System.out.println("\nkamu adalah golongan yang " + status_pernikahan + " gaji pokokmu sebesar Rp " + gaji_pokok); }
            case 2 -> { gaji_pokok = 1500000; System.out.println("\nkamu adalah golongan yang " + status_pernikahan + " gaji pokokmu sebesar Rp " + gaji_pokok); }
            case 3 -> { gaji_pokok = 1750000; System.out.println("\nkamu adalah golongan yang " + status_pernikahan + " gaji pokokmu sebesar Rp " + gaji_pokok); }
            case 4 -> { gaji_pokok = 2000000; System.out.println("\nkamu adalah golongan yang " + status_pernikahan + " gaji pokokmu sebesar Rp " + gaji_pokok); }
            default -> System.err.println("tidak masuk golongan apapun");
        }
    }
    
    void total_gaji_bersih(){
        gaji_bersih = gaji_pokok + total_tunjangan;
        System.out.println("Gaji Bersih : " + gaji_bersih);
    }
    
    void total_tunjangan(){
        total_tunjangan = tunjangan_istri + tunjangan_anak;
        System.out.println("Total tunjangan : " + total_tunjangan);
    }
    
    void tunjangan_pasangan(){
        tunjangan_istri = (int) (gaji_pokok * 0.10);
        System.out.println("tunjangan istri : " + tunjangan_istri);
    }
    
    void tunjangan_anak(){
        tunjangan_anak = (int) ((gaji_pokok * 0.05) * jumlah_anak);
        System.out.println("tunjangan anak : " + tunjangan_anak);
    }
}
