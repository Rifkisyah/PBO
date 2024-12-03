package praktikum.Tugas_3;

public class Karyawan {
    String nomor_Induk_Karyawan, Nama, alamat, Jabatan;
    long gaji_Pokok, tunjangan_Jabatan, tunjangan_Istri, tunjangan_Anak;
    long total_Gaji, pajak_Penghasilan, gaji_Bersih;
    
    void total_kotor(){
        this.total_Gaji = (long) (this.gaji_Pokok + this.tunjangan_Jabatan + this.tunjangan_Istri + this.tunjangan_Anak);
        System.out.println("Total Gaji : " + this.total_Gaji); 
    }
    void pajak(){
        this.pajak_Penghasilan = (long) (0.10 * (this.gaji_Pokok + this.tunjangan_Jabatan + this.tunjangan_Anak));
        System.out.println("Pajak Penghasilan : " + this.pajak_Penghasilan);
    }
    void total_bersih(){
        this.gaji_Bersih = (long) (this.total_Gaji - this.pajak_Penghasilan);
        System.out.println("Gaji Bersih : " + this.gaji_Bersih);
    }
}
