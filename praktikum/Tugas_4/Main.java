/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum.Tugas_4;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    static void soal_1(BufferedReader bfr) throws IOException{
        GenapAtauGanjil gag = new GenapAtauGanjil();
        
        System.out.print("Masukan bilanganmu : ");
        gag.bilangan = Integer.parseInt(bfr.readLine());
        gag.info();
    }
    
    static void soal_2(BufferedReader bfr) throws IOException{
        KodeHari kh = new KodeHari();
        
        System.out.print("Masukan Kode harimu : ");
        kh.kode = Integer.parseInt(bfr.readLine());
        kh.info_hari();
    }
    
    static void soal_3(BufferedReader bfr) throws IOException{
        GajiBersihKaryawan gbk = new GajiBersihKaryawan();
        
        System.out.print("Masukan NIK karyawan : ");
        gbk.NIK = bfr.readLine();
        System.out.print("Masukan nama karyawan : ");
        gbk.nama = bfr.readLine();
        System.out.print("Masukan kode golongan karyawan : ");
        gbk.kode_golongan = Integer.parseInt(bfr.readLine());
        System.out.print("Masukan status pernikahan karyawan : ");
        gbk.status_pernikahan = bfr.readLine();
        System.out.print("Masukan jumlah anak : ");
        gbk.jumlah_anak = Integer.parseInt(bfr.readLine());
        
        gbk.cek_gaji_pokok();
        gbk.tunjangan_pasangan();
        gbk.tunjangan_anak();
        gbk.total_tunjangan();
        gbk.total_gaji_bersih();
    }
    
    static void soal_4(BufferedReader bfr) throws IOException{
        TahunKabisat tk = new TahunKabisat();
        
        System.out.print("Masukan Tahun : ");
        tk.tahun = Integer.parseInt(bfr.readLine());
        
        tk.menentukan_tahun_kabisat();
    }
    
    static void soal_5(BufferedReader bfr) throws IOException{
        BonusSalesman bs = new BonusSalesman();
        
        System.out.print("Masukan nama salesman : ");
        bs.nama_salesman = bfr.readLine();
        System.out.print("Masukan total harga barang yang terjual : ");
        bs.harga_barang_terjual = Integer.parseInt(bfr.readLine());
        
        bs.total();
        
    }
    
    static void soal_6(BufferedReader bfr) throws IOException{
        Kasir k = new Kasir();
        
        System.out.print("Masukan total belanja : ");
        k.total_belanja = Integer.parseInt(bfr.readLine());
        System.out.print("Masukan nominal uang yang dimiliki : ");
        k.bayar = Integer.parseInt(bfr.readLine());
        System.out.print("Apakah memiliki kartu member : ");
        k.kartu_member = bfr.readLine();
        
        k.menentukan_total_diskon();
        k.pembayaran();
    }
    
    static void soal_7(BufferedReader bfr) throws IOException{
        BangunDatar bd = new BangunDatar();
        
        System.out.print("pilih menu luas bangun datar\n1)luas persegi\n2)luas segitiga\n3)luas lingkaran\n4)luas trapesium\n5)luas layang layang\ntentukan pilihanmu : ");
        bd.menu = Integer.parseInt(bfr.readLine());
        
        System.out.println("");
        switch(bd.menu){
            case 1 ->  { 
                System.out.print("tentukan nilai sisi : ");
                bd.s = Integer.parseInt(bfr.readLine());
            }
            case 2 ->  { 
                System.out.print("tentukan nilai alas : ");
                bd.a = Integer.parseInt(bfr.readLine()); 
                System.out.print("tentukan nilai tinggi : "); 
                bd.t = Integer.parseInt(bfr.readLine());
            }
            case 3 ->  { 
                System.out.print("tentukan nilai jari jari : "); 
                bd.r = Integer.parseInt(bfr.readLine());
            }
            case 4 ->  { 
                System.out.print("tentukan nilai sisi sejajar 1 : ");
                bd.b1 = Integer.parseInt(bfr.readLine());
                System.out.print("tentukan nilai sisi sejajar 2 : ");
                bd.b2 = Integer.parseInt(bfr.readLine());
                System.out.print("tentukan nilai tinggi : ");
                bd.t = Integer.parseInt(bfr.readLine());
            }
            case 5 ->  { 
                System.out.print("tentukan nilai panjang diagonal 1 : ");
                bd.d1 = Integer.parseInt(bfr.readLine());
                System.out.print("tentukan panjang diagonal 2 : ");
                bd.d2 = Integer.parseInt(bfr.readLine());
            }
            default -> {
                System.err.print("menu tidak tersedia");
            }
        }
        
        bd.nilaiDihitung();
    }
        
    public static void main(String[] args) throws IOException {
        InputStreamReader in = new InputStreamReader(System.in);
        BufferedReader bfr = new BufferedReader(in);
        
        soal_1(bfr);
        soal_2(bfr);
        soal_3(bfr);
        soal_4(bfr);
        soal_5(bfr);
        soal_6(bfr);
        soal_7(bfr);
    }
}
