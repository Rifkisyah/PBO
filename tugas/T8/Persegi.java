package tugas.T8;

public class Persegi extends BangunDatar{
    private float sisi;
    
    public Persegi(float sisi){
        this.sisi = sisi;
    }
    
    public float getSisi() {
        return sisi;
    }
   
    @Override
    float luas(){
        return sisi * sisi;
    }
    
    @Override
    float keliling(){
        return 4 * sisi;
    }
}
