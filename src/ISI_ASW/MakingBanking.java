/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ISI_ASW;

import javax.swing.JOptionPane;
import making.banking.setor;
import making.banking.tarik;

/**
 *
 * @author H4NS
 */
public class MakingBanking {

    public static void main(String args[]) {
        String str, str1;

        int choice, z, pin = 1204, counter = 0, a = 3;
        int t, s, tab = 150000;
        int saldo;

        JOptionPane.showMessageDialog(null, "Selamat Datang\n ANJUNGAN TUNAI MANDIRI \n BNI SYARIAH-BOJONEGORO \n\nMasukkan 4 Digit PIN Anda !", "WELCOME", 1);
        try {
            do {

                str = JOptionPane.showInputDialog(null, "Masukkan 4 Digit PIN Anda:",
                        "ATM BNI SYARIAH-BOJONEGORO", 0);
                pin = Integer.parseInt(str);
                counter += 1; //menghitung kesempatan login

                if (pin == 1204)//cek pin
                {
                    do {
                        str
                                = JOptionPane.showInputDialog(null, "[1] INFORMASI SALDO \n[2]PENYETORAN \n[3] PENARIKAN \n[4] PETUNJUK \n[5] KELUAR \n\nMasukkan Pilihan Menu:", "Pilih Transaksi", 3);

                        choice = Integer.parseInt(str);

                        switch (choice) {
                            case 1:

                                JOptionPane.showMessageDialog(null, "Saldo Anda saat ini sebesar : " + tab); //informasi saldo

                                z = JOptionPane.showConfirmDialog(null, "Melanjutkan transaksi lain?", "ATM BNI SYARIAH-MALANG", JOptionPane.YES_NO_OPTION, 3); //konfirmasi transaksi lain

                                if (z == 0) {
                                    break;
                                } else {
                                    JOptionPane.showMessageDialog(null, "Terimakasih telah menggunakan ATM BNI SYARIAH - BOJONEGORO, ambil kartu ATM Anda.");
                                }

                                System.exit(0);

                            case 2:

                                str1 = JOptionPane.showInputDialog(null, "Masukkan jumlah penyetoran: "); //menabung
                                s = Integer.parseInt(str1);
                                
                                menabung(tab, s);
                                tab =getsaldo();

                                z = JOptionPane.showConfirmDialog(null, "Melanjutkan transaksi lain?", "ATM BNI SYARIAH-BOJONEGORO", JOptionPane.YES_NO_OPTION, 3); //konfirmasi transaksi lain

                                if (z == 0) {
                                    break;
                                } else {
                                    JOptionPane.showMessageDialog(null, "Terimakasih telah menggunakan ATM BRI, ambil kartu ATM Anda.");
                                }
                                System.exit(0);

                            case 3:

                                str1 = JOptionPane.showInputDialog(null, "Masukkan jumlah penarikan : "); //pengambilan

                                t = Integer.parseInt(str1);
                                
                                ambil(tab, t);

                                tab = getsaldo();

                                z = JOptionPane.showConfirmDialog(null, "Melanjutkan transaksi lain?", "ATM BNI SYARIAH-BOJONEGORO", JOptionPane.YES_NO_OPTION, 3); //konfirmasi transaksi lain

                                if (z == 0) {
                                    break;
                                } else {
                                    
                                }
                            case 4:

                                JOptionPane.showMessageDialog(null, "Cara Penggunaan Aplikasi\n[1] Masukkan PIN dengan benar\n[2] Bertransaksilah dengan benar sesuai pilihan\n[3] Gunakan Uang sesuai kebutuhan dan rajinlah menabung\n ", "INFO", 1);
                                break;

                            case 5:
                                z = JOptionPane.showConfirmDialog(null, "Anda inginkeluar?", "Keluar", JOptionPane.YES_NO_OPTION, 0);

                                if (z == 0) {
                                    JOptionPane.showMessageDialog(null, "Terimakasih telahmenggunakan ATM BRI, ambil kartu ATM Anda");
                                    System.exit(0);
                                } else {
                                    break;
                                }

                            default:
                                JOptionPane.showMessageDialog(null, "Pilihan menu tidak tersedia\nSilahkan ulangi lagi \t HARAP BIASAKAN MEMBACA", "ERROR", 0);
                        }
                    } while (1 == 1);
                } else if (counter < 3) {	//jika pin salah

                    a--; //menghitung kesalahan login dan memberikan kesempatan login

                    JOptionPane.showMessageDialog(null, "Pin Salah !\nPastikan PIN yang anda masukkan benar", "ERROR", 0);

                    JOptionPane.showMessageDialog(null, "\nKesempatan login " + a + " kali lagi" + "\n");

                } else {

                    JOptionPane.showMessageDialog(null, "Untuk bantuan nasabah,\nsilahkan menghubungi call center 555123 (Gratis)", "Kartu ATM anda diblokir!", 0);

                    System.exit(0);
                }
            } while (1 == 1);

        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Kesalahan !\n SALAH KODE WOI  \nPROGRAM KELUAR!  \nTerimakasih", "ERROR", 0);

        }
    }

public static int saldo;
    public static void menabung(int bal , int s){
        
    if (s%100!=0)
     JOptionPane.showMessageDialog(null,"Mesin ATM BRI tidak menerima uang koin \nSilahkan ulangi ","Transaksi Gagal",0);
    else if (s<50000)
        JOptionPane.showMessageDialog(null,"HARAP BIASAKAN MEMBACA","EROR",0);
    else if(s>=50000){
        
        int saldo = bal+s;
        JOptionPane.showMessageDialog(null,"Saldo Anda Saat Ini Sebesar : "+ saldo);
        
    }}

    private static int getsaldo() {
       return saldo;
    }
        
        public static void ambil(int tab, int t){
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
    
}
