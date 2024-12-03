package tugas.T9;

public class PersegiPanjang implements BangunDatar{
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
    public float luas(){
        return this.panjang * this.lebar;
    }
    
    @Override
    public float keliling(){
        return 2 * (this.panjang + this.lebar);
    }
}
