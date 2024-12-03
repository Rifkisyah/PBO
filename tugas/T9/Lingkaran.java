package tugas.T9;

public class Lingkaran implements BangunDatar{
    private float r, phi = 3.14f;

    public Lingkaran(float r){
        this.r = r;
    }
    
    public float getJariJari(){
        return r;
    }
    
    @Override
    public float luas(){
        return phi * r * r;
    }
    
    @Override
    public float keliling(){
        return 2 * phi * r;
    }
}
