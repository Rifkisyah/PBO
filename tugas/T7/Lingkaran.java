package tugas.T7;

public class Lingkaran extends BangunDatar{
    private float r, phi = 3.14f;

    public Lingkaran(float r){
        this.r = r;
    }
    
    public float getJariJari(){
        return r;
    }
    
    @Override
    protected float getLuas(){
        return phi * r * r;
    }
    
    @Override
    protected float getKeliling(){
        return 2 * phi * r;
    }
}
