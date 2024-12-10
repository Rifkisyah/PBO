package praktikum.Tugas_9;

public class Kucing extends Hewan {
    Kucing(String nama){
        super(nama);
    }
    
    @Override
    String display(){
        return this.nama;
    }
}
