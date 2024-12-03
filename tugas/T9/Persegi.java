package tugas.T9;

public class Persegi implements BangunDatar{
    private float sisi;
    
    public Persegi(float sisi){
        this.sisi = sisi;
    }
    
    public float getSisi() {
        return sisi;
    }
   
    @Override
    public float luas(){
        return sisi * sisi;
    }
    
    @Override
    public float keliling(){
        return 4 * sisi;
    }
}
