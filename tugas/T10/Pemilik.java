package tugas.T10;

public class Pemilik{
    private String namaPemilik, alamatPemilik;
    private int jumlahMobil;
    private String noPlatMobil[] = new String[5];

    public Pemilik(String namaPemilik, String alamatPemilik) {
        this.namaPemilik = namaPemilik;
        this.alamatPemilik = alamatPemilik;
    }
    
    public void beliMobil(String noPlat){
        if(jumlahMobil < this.noPlatMobil.length){
            this.noPlatMobil[this.jumlahMobil] = noPlat;
            this.jumlahMobil++;
        }else{
            System.out.println(this.namaPemilik + " sudah memiliki 5 mobil");
        }
    }
    
    public void jualMobil(String noPlat){
        if(jumlahMobil > this.noPlatMobil.length){
            this.noPlatMobil[this.jumlahMobil] = noPlat;
            this.jumlahMobil--;
        }else{
            System.out.println(this.namaPemilik + " tidak memiliki mobil");
        }
    }

    public String getNamaPemilik() {
        return namaPemilik;
    }

    public String getAlamatPemilik() {
        return alamatPemilik;
    }

    public String getNoPlatMobil(int index) {
        return noPlatMobil[index];
    }

    public int getJumlahMobil() {
        return jumlahMobil;
    }
    
    
    
}
