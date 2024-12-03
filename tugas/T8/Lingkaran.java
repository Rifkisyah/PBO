package tugas.T8;

public class Lingkaran extends BangunDatar{
    private float r, phi = 3.14f;

    public Lingkaran(float r){
        this.r = r;
    }
    
    public float getJariJari(){
        return r;
    }
    
    @Override
    float luas(){
        return phi * r * r;
    }
    
    @Override
    float keliling(){
        return 2 * phi * r;
    }
}
