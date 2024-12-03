package praktikum.Tugas_2;

public class KonversiSuhu {
    double C, F, R;
    
    void celcius_and_fahrenheit(int c, int f){
        this.F = (9.0/5.0 * c) + 32;
        this.C = 5.0/9.0 * (f - 32);
        
        System.out.println("Celcius = " + c + " --> Fahrenheit = " + this.F);
        System.out.println("Fahrenheit = " + f + " --> Celcius = " + this.C);
    }
    
    void celcius_and_reamur(int c, int r){
        this.R = 4.0/5.0 * c;
        this.C = 5.0/4.0 * r;
        
        System.out.println("Celcius = " + c + " --> Reamur = " + this.R);
        System.out.println("Reamur = " + r + " --> Celcius = " + this.C);
    }
    
    void fahrenheit_and_reamur(int f, int r){
        this.R = 4.0/9.0 * (f - 32);
        this.F = (9.0/4.0 * r) + 32;
        
        System.out.println("Fahrenheit = " + f + " --> Reamur = " + this.R);
        System.out.println("Reamur = " + r + " --> Fahrenheit = " + this.F);
    }
}
