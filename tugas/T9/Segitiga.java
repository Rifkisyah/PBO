package tugas.T9;

public class Segitiga implements BangunDatar{
    private float sisi, a, t;

    public Segitiga(float sisi, float a, float t) {
        this.sisi = sisi;
        this.a = a;
        this.t = t;
    }

    public float getSisi() {
        return sisi;
    }

    public float getA() {
        return a;
    }

    public float getT() {
        return t;
    }
    
    @Override
    public float luas(){
        return (float) (0.5 * this.a * this.t);
    }
    
    @Override
    public float keliling(){
        return this.sisi * this.sisi * this.sisi;
    }
}
