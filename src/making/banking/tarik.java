/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package making.banking;

import javax.swing.JOptionPane;

/**
 *
 * @author H4NS
 */
public class tarik {
private int saldo;
public void ambil(int tab, int t){
    if(t%100!=0)
        JOptionPane.showMessageDialog(null,"Mesin ATM BRI tidak Menerima Uang Koin \nSilahkan Ulangi lagi","Transaksi Gagal",0);
    else{
        if(t>tab)
              JOptionPane.showMessageDialog(null,"Saldo Anda Tidak Mencukupi \nSilahkan lakukan Penyetoran","Transaksi Gagal",0);
        else if (t<50000)
              JOptionPane.showMessageDialog(null,"Besaran Minimal Pengambilan  Tunai Adalah Rp 50000","Transaksi Gagal",0);
        else{
            saldo = tab-t;
              JOptionPane.showMessageDialog(null,"Saldo Anda Saat Ini Sebesar : "+saldo);
                JOptionPane.showMessageDialog(null,"Saldo Minimal Harus Rp 50000,00 Segera lakukan Penyetoran Untuk Menghindari Penutupan Akun ","CAUTION",2);
        }
    }
        
        }
  public int getsldo(){
      return saldo;
  }

    int getsaldo() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
