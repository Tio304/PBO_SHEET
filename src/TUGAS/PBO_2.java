/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TUGAS;

/**
 *
 * @author H4NS
 */
public class PBO_2 {
    public static void main(String[]args){
       PBO_2 motor = new PBO_2();
        motor.setMerk("");
        motor.setNama("");
    }
        private static void setMerk(String merk){
            merk = "honda";
            System.out.println("Merk Motor Adalah : "+merk);
            
            
            
        }
    static void setNama(String nama){
        nama = "beat";
        System.out.println("Nama Motor Adalah : "+nama);
        
    }

    void setAlamat(String string) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
