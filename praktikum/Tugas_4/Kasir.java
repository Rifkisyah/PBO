/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum.Tugas_4;

public class Kasir {
    int bayar, total_belanja, diskon, total_bayar, total_kembalian;
    String kartu_member;
    
    boolean member(){
        return "ya".equals(kartu_member) || "y".equals(kartu_member);
    }
    
    void menentukan_total_diskon(){
        if(member() == true && total_belanja == 500000){
            diskon = 50000;
        }else if(member() == true && total_belanja == 100000){
            diskon = 15000;
        }else{
            if(total_belanja > 100000){
                diskon = 10000;
            }else{
                diskon = 0;
            }
            
        }
    }
    
    boolean uang_cukup(){
        if(bayar < total_belanja){
            System.err.println("maaf uang anda tidak cukup");
            return false;
        }else{
            return true;
        }
    }
    
    void pembayaran(){
        if(uang_cukup()){
            total_bayar = total_belanja - diskon;
            total_kembalian = bayar - total_bayar;
            System.out.println("mendapat diskon sebesar " + diskon + "\ntotal yang harus dibayar adalah " + total_bayar + "\nkembalian sebesar " + total_kembalian);
        }else{
            System.err.println("maaf pembayaran dan pembelian gagal dilakukan!");
        }
        
    }
}
