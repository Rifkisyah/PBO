package praktikum.Tugas_3;

public class SelisihWaktuIndonesia {
    /*
    UTC +7 = barat
    UTC +8 = tengah
    UTC +9 = timur
    */
    float UTC_7, UTC_8, UTC_9;
    
    public SelisihWaktuIndonesia(float utc7, float utc8, float utc9){
        if(utc7 < 0 && utc8 < 0 && utc9 < 0 || utc7 > 24 && utc8 > 24 && utc9 > 24){
            System.err.println("clock value is invalid");
        } else {
            this.UTC_7 = utc7;
            this.UTC_8 = utc8;
            this.UTC_9 = utc9;
        }
    }
    
    void difference_time(){
        float utc7_to_utc8 = this.UTC_7 + (8 - 7);
        float utc7_to_utc9 = this.UTC_8 + (9 - 7);
        
        System.out.println("jadi selisih dari\nUTC-7 : " + this.UTC_7 + " jam\nUTC-8 : " + this.UTC_8 + " jam\nUTC-9 : " + this.UTC_9 + " jam\n\nUTC-7 ke UTC-8 di indonesia : " + (utc7_to_utc8 - this.UTC_7) + "jam\nUTC-7 ke UTC-9 di indonesia : " + (utc7_to_utc9 - this.UTC_7) + "jam");
    }
}
