package pertemuan.p11;

// Agregasi

public class Kelas {
    private String nama_kelas;
    private Siswa[] daftar_siswa = new Siswa[36];
    private int jumlah_siswa;

    public Kelas(String nama_kelas) {
        this.nama_kelas = nama_kelas;
    }
    
    

    public void addSiswa(Siswa nama_siswa) {
        if(jumlah_siswa < daftar_siswa.length){
            this.daftar_siswa[jumlah_siswa] = nama_siswa;
            jumlah_siswa++;
        }
    }
    
    public void display(){
        System.out.println("kelas " + this.nama_kelas + " memiliki siswa bernama : ");
        if(jumlah_siswa < daftar_siswa.length){
            for (int i = 0; i < jumlah_siswa; i++) {
                System.out.println((i+1) + ". " + this.daftar_siswa[i].getNama_siswa());
            }
            
        }
    }
    
    
}
