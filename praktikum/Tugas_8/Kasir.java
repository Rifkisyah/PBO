package praktikum.Tugas_8;

public class Kasir {
    int hargaBarang, jumlahBarang, diskon, totalHarga;
    
    Kasir(int hargaBarang){ // konstruktor harga barang saja
        this.hargaBarang = hargaBarang;

        System.out.println("Total Harga : " + (this.totalHarga = this.hargaBarang));
    }
    Kasir(int hargaBarang, int jumlahBarang){ // konstruktor harga barang dan jumlah barang
        this.hargaBarang = hargaBarang;
        this.jumlahBarang = jumlahBarang;
        
        System.out.println("Total Harga : " + (this.totalHarga = this.hargaBarang * this.jumlahBarang));
    }
    Kasir(int hargaBarang, int jumlahBarang, int diskon){ // konstruktor seluruh data
        this.hargaBarang = hargaBarang;
        this.jumlahBarang = jumlahBarang;
        this.diskon = diskon;
        
        System.out.println("Total Harga : " + (this.totalHarga = this.hargaBarang * this.jumlahBarang - this.diskon));
    }
    
}
