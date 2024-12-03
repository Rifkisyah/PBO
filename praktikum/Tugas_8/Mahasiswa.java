package praktikum.Tugas_8;
import java.util.ArrayList;

public class Mahasiswa {
    ArrayList<Integer>  umur = new ArrayList<Integer>();
    
    Mahasiswa(int umur){
        this.umur.add(umur);
    }
    
    int rataRataUmurKelulusan(){
        int avrg = 0;
        for(int i : this.umur){
            avrg += i;
        }
        return avrg / this.umur.size();
    }
}
