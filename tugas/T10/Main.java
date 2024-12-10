package tugas.T10;

public class Main {
    public static void main(String[] args) {
        
        
        Pemilik p1 = new Pemilik("Juan", "Jakarta barat");
        Mobil m1 = new Mobil("Lambo", "B 456 CB", 2015);
        Mobil m2 = new Mobil("BMW", "B 998 EE", 2010);
        Mobil m3 = new Mobil("Kijang", "B 231 VY", 2000);
        
        p1.beliMobil("B 456 CB");
        p1.beliMobil("B 998 EE");
        p1.beliMobil("B 231 VY");
        
        String merk[] = {m1.getMerek(), m2.getMerek(), m3.getMerek()};
        long tahunKeluar[] = {m1.getTahunKeluaran(), m2.getTahunKeluaran(), m3.getTahunKeluaran()};
        
        System.out.println("Pemilik mobil " + p1.getNamaPemilik());
        System.out.println("Data Mobil");
        for (int i = 0; i < p1.getJumlahMobil(); i++) {
            System.out.println("=========================================");
            System.out.println(
                    "Merk                 : " + merk[i] + 
                    "\nNo                   : " + p1.getNoPlatMobil(i) + 
                    "\nTahun Keluaran       : " + tahunKeluar[i]);
        }
        
    }
}
