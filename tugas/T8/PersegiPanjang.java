package tugas.T8;

public class PersegiPanjang extends BangunDatar{
    private float panjang, lebar;

    public PersegiPanjang(float panjang, float lebar) {
        this.panjang = panjang;
        this.lebar = lebar;
    }

    public float getPanjang() {
        return panjang;
    }

    public float getLebar() {
        return lebar;
    }
    
    @Override
    float luas(){
        return this.panjang * this.lebar;
    }
    
    @Override
    float keliling(){
        return 2 * (this.panjang + this.lebar);
    }
}
