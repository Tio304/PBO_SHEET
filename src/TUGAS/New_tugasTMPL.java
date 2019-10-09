/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TUGAS;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author H4NS
 */
public class New_tugasTMPL {
   
    public static void main(String args[]) {
        String str, str1, tab ;

        int choice, z, counter = 0, a = 3;
        int t, s;
        int saldo;

        JOptionPane.showMessageDialog(null, "Selamat Datang  \n DI LAYANAN PENYAJIAN BARANG LABORATORIUM 4 SMK TELKOM MALANG  !", "WELCOME", 1);
        try {
            do {

              

                //cek pin
                {
                    do {
                        str
                                = JOptionPane.showInputDialog(null, "[1] KOMPUTER \n[2] HEADPHONE \n[3] KEYBORAD  \n[4] MEJA \n[5] KURSI \n[6] MOUSE \n[7] AIR COOLER \n[8] PROYEKTOR \n[9] CPU \n[10] ELECTRONIC WHITE BOARD \n[11] SAKLAR \n[12] LAMPU \n[13] SAPU \n[14] CIKRAK\n\nMasukkan Pilihan Jenis Barang:", "Pilih Jesis Barang", 3);

                        choice = Integer.parseInt(str);

                        switch (choice) {
                            case 1:

                                JOptionPane.showInputDialog(null, "  : \n [1] LENOVO  \n[2] ASUS \n[3] VIEW SONIC ","Pilih Negara",3 ); //informasi saldo
                                       choice = Integer.parseInt(str);
                        {
                           
                            case 2:

                                str1 = JOptionPane.showInputDialog(null,"FAKTA YANG ADA DI BENUA EROPA : \n[1]RUSSIA \n[2]PERANCIS \n[3]JERMAN \n[4]SWEDIA \n[5]FINDLANDIA \n[6]ITALIA"); //menabung
                                s = Integer.parseInt(str1);
                                int Choice = 0;
                                switch(Choice){
                                    
                                }
                             
                                z = JOptionPane.showConfirmDialog(null, "Ingin MEliha Fakta Lain???", "LAYANAN FAKTA DUNIA", JOptionPane.YES_NO_OPTION, 3); //konfirmasi transaksi lain

                                if (z == 0) {
                                    break;
                                } else {
                                    JOptionPane.showMessageDialog(null, "TERIMAKASIH TELAH MENGGUNAKAN LAYANAN INI SEMOGA HARI ANDA INDAH :).");
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
                        }while (1 == 1);
                } else if (counter < 3) {	//jika pin salah

                    a--; //menghitung kesalahan login dan memberikan kesempatan login

                    JOptionPane.showMessageDialog(null, "Pin Salah !\nPastikan PIN yang anda masukkan benar", "ERROR", 0);

                    JOptionPane.showMessageDialog(null, "\nKesempatan login " + a + " kali lagi" + "\n");

                } else {

                    JOptionPane.showMessageDialog(null, "Untuk bantuan nasabah,\nsilahkan menghubungi call center 555123 (Gratis)", "Kartu ATM anda diblokir!", 0);
    



  
            }