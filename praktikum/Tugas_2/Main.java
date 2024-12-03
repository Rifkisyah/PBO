package praktikum.Tugas_2;

public class Main {
    public static void main(String[] args) {
        soal_1();
        soal_2();
        soal_3();
        soal_4();
        soal_5();
        soal_6();
        soal_7();
        soal_8();
        soal_9();
    }
    
    static void soal_1(){
        OperatorIncrement obj = new OperatorIncrement();
        
        obj.post_increment = 1;
        obj.pre_increment = 1;
        
        obj.postIncrement(1);
        obj.preIncrement(1);
        System.out.println("\n");
    }
    
    static void soal_2(){
        PersegiPanjang obj = new PersegiPanjang();
        
        obj.panjang = 50 ;
        obj.lebar = 45 ;
        
        obj.luasPersegiPanjang();
        System.out.println("\n");
    }
    
    static void soal_3(){
        PersamaanKuadrat obj =  new PersamaanKuadrat();
        
        obj.a = 2 ;
        obj.b = 10 ;
        obj.c = 5 ;
        
        obj.persamaan_kuadrat();
        System.out.println("\n");
    }
    
    static void soal_4(){
        OperasiMatematika obj = new OperasiMatematika();
        
        obj.x = 22 ;
        obj.y = 33 ;
        
        obj.penjumlahan();
        obj.pengurangan();
        obj.perkalian();
        obj.pembagian();
        System.out.println("\n");
    }
    
    static void soal_5(){
        Segitiga obj = new Segitiga();
        
        obj.a = 6;
        obj.b = 8;
        
        obj.luas_segitiga();
        System.out.println("\n");
    }
    
    static void soal_6(){
        Pythagoras obj = new Pythagoras();
        
        obj.a = 6;
        obj.b = 8;
        
        obj.mencari_nilai_c_pada_Segitiga();
        obj.keliling_segitiga();
        System.out.println("\n");
    }
    
    static void soal_7(){
        SayaBelajarJava obj = new SayaBelajarJava();
        
        obj.mengubah_string("saya belajar java", "SAYA BELAJAR JAVA");
        System.out.println("\n");
    }
    
    static void soal_8(){
        KecepatanCahaya obj = new KecepatanCahaya();
        
        obj.waktu_tempuh();
        System.out.println("\n");
    }
    
    static void soal_9(){
        KonversiSuhu obj = new KonversiSuhu();
        
        obj.celcius_and_fahrenheit(10, 15);
        obj.celcius_and_reamur(10, 5);
        obj.fahrenheit_and_reamur(15, 5);
        System.out.println("\n");
    }
}
