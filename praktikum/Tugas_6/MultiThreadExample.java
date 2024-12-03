package praktikum.Tugas_6;

public class MultiThreadExample extends Thread {
    @Override
    public void run(){
        try{
            System.out.println("Hello Thread Name : " + Thread.currentThread().getName() + ", With Thread ID : " + Thread.currentThread().getId());
        }catch (Exception e){
            System.err.println("Thread error");
        }
    }
}
