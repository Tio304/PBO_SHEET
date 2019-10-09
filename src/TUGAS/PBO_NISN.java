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
public class PBO_NISN {
    public static void main(String[]args){
       PBO_NISN NISN = new PBO_NISN();
        NISN.setNama("");
        NISN.setNIS(0);
        NISN.setTMPT("");
        NISN.setLHR("");
        NISN.setKELMN("");
        NISN.setAlamat("");
        NISN.setMotto("");
        
    }
        private static void setNama(String nama){
            nama = "Kevin Arullah Herdiansyah";
            System.out.println("NAMA : "+ nama);
            
            
            
        }
    private static void setAlamat(String Alamat){
        Alamat = "JL.D.PAMIAI TERUSAN II BLOK H7A22";
        System.out.println("ALAMAT DI MALANG : "+Alamat);
        
        
    }

   

    private static void setNIS(int NIS) {
     NIS = 99999;
        System.out.println("NIS : "+NIS);
        
     
    }

    private static void setTMPT(String  TMPT) {
        TMPT = "MALANG";
        System.out.println("TEMPAT LAHIR : "+TMPT);
        
    }

    private static void setKELMN(String KELMN) {
      KELMN = "LAKI-LAKI";
        System.out.println("JENIS KELAMIN : "+KELMN);
    }

    private static  void setLHR(String LHR) {
        LHR = "14 - 06 - 04";
        System.out.println("TANGGAL LAHIR : "+LHR);
    }

    private static void setMotto(String Motto) {
        Motto = "Jangan Buat Dirimu Bermimpi Tapi Buat Dirimu Bertindak ";
        System.out.println("MOTTO HIDUP : "+Motto);
       
    }
    
    
    
    
}
