package praktikum.Tugas_9;

public class Kubus {
    private int sisi;

    public void setSisi(int sisi) {
        this.sisi = sisi;
    }
    
    private int volumeKubus(){
        int volume = sisi*sisi*sisi;
        return volume;
    }
    
    public void infoVolumeKubus(){
        System.out.println("Sisi kubus : " + this.sisi + "\nVolume Kubus : " + this.volumeKubus());
    }
}
