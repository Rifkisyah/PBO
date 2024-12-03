package praktikum.Tugas_8;

public class Bidang {
    int panjangBidangPutih, lebarBidangPutih, panjangBidangHitam, lebarBidangHitam;
    
    Bidang(int panjangBidangPutih, int lebarBidangPutih, int panjangBidangHitam, int lebarBidangHitam){
        this.panjangBidangPutih = panjangBidangPutih; 
        this.lebarBidangPutih = lebarBidangPutih;
        this.panjangBidangHitam = panjangBidangHitam;
        this.lebarBidangHitam = lebarBidangHitam;
    }
    
    void luasBidangHitam(){
        System.out.println("Panjang Bidang Hitam : " + this.panjangBidangHitam);
        System.out.println("Lebar Bidang Hitam : " + this.lebarBidangHitam);
        System.out.println("Luas Bidang Hitam : " + (this.panjangBidangHitam * this.lebarBidangHitam));
    }
}
