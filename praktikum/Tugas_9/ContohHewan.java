package praktikum.Tugas_9;

public class ContohHewan extends Hewan {

    public ContohHewan() {
        super(null);
    }
             
    public ContohHewan(String nama) {
        super(nama);
    }
    
    @Override
    void hewanBerkakiDua(){
        System.out.println("hewan berkaki dua : kangguru, ayam, bebek, dll");
    }
    @Override
    void hewanBerkakiEmpat(){
        System.out.println("hewan berkaki empat : kucing, anjing, kuda, dll");
    }
    @Override
    void hewanBerkakiEnam(){
        System.out.println("hewan berkaki enam : capung, nyamuk, kupu-kupu, dll");
    }
    @Override
    void hewanBerkakiDelapan(){
        System.out.println("hewan berkaki delapan : kepiting, belalang, laba-laba, dll");
    }
}
