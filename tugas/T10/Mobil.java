package tugas.T10;

public class Mobil {
    private String merek, noPlat;
    private long tahunKeluaran;

    public Mobil(String merek, String noPlat, long tahunKeluaran) {
        this.merek = merek;
        this.noPlat = noPlat;
        this.tahunKeluaran = tahunKeluaran;
    }

    public String getMerek() {
        return merek;
    }

    public String getNoPlat() {
        return noPlat;
    }

    public long getTahunKeluaran() {
        return tahunKeluaran;
    }
    
}
