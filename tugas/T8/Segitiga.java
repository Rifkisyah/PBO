
package tugas.T8;

public class Segitiga extends BangunDatar{
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
    float luas(){
        return (float) (0.5 * this.a * this.t);
    }
    
    @Override
    float keliling(){
        return this.sisi * this.sisi * this.sisi;
    }
}
