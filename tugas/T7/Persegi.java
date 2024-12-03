package tugas.T7;

public class Persegi extends BangunDatar{
    private float sisi;
    
    public Persegi(float sisi){
        this.sisi = sisi;
    }
    
    public float getSisi() {
        return sisi;
    }
   
    @Override
    protected float getLuas(){
        return sisi * sisi;
    }
    
    @Override
    protected float getKeliling(){
        return 4 * sisi;
    }
}
