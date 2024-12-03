package tugas.T7;

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
    protected float getLuas(){
        return this.panjang * this.lebar;
    }
    
    @Override
    protected float getKeliling(){
        return 2 * (this.panjang + this.lebar);
    }
}
