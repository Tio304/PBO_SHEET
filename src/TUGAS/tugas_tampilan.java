/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TUGAS;

import javax.swing.JOptionPane;

/**
 *
 * @author H4NS
 */
public class tugas_tampilan {
      public static void main(String args[]) {
        String str, str1, tab ;

        int choice, z, counter = 0, a = 3;
        int t, s;
        int saldo;

        JOptionPane.showMessageDialog(null, "Selamat Datang  \n Menghitung Barang di LAB 4 SMK TELKOM MALANG !", "WELCOME", 1);
        try {
            do {

              

                //cek pin
                {
                    do {
                        str
                                = JOptionPane.showInputDialog(null, "[1] KOMPUTER \n[2] KEYBOARD\n[3] HEADPHONE  \n[4] MEJA \n[5] KURSI\n[6] MOUSE \n[7]AC \n[8] PROYEKTOR\n[9]LAMPU\n[10] CPU\n[11]ELECTRONIC WHITE BOARD \n[12]SAKLAR\n[13]SAPU\n[14]CIKRAK \n[15] KELUAR\nMasukkan Pilihan Menu:", "Pilih Jenis Barang", 3);

                        choice = Integer.parseInt(str);
  switch (choice) {
                          case 1:

                                JOptionPane.showInputDialog(null,"Merk Komputer \n LENOVO \tJumlah = \t 21 \t Warna Hitam  \n ASUS \t Jumlah = \t 1 \t Warna Hitam \n VIEW SONIC \t Jumlah = \t 4 \t Warna Hitam\n[1]KEMBALI"
                                
                                
                                
                                
                                
                                
                                ); 

                                z = JOptionPane.showConfirmDialog(null, "Melanjutkan Melihat Jumlah Barang  lain?", "OPTIONAL", JOptionPane.YES_NO_OPTION, 3); 

                                if (z == 0) {
                                    break;
                                } else {
                                    JOptionPane.showMessageDialog(null, "Terimakasih telah menggunakan Layanan Aplikasi Kami , Semoga Hari Anda Menyenangkan :) .");
                                }

                                System.exit(0);
                                    
                             
                            case 2:

                                str1 = JOptionPane.showInputDialog(null,"Merk Keyboard \n LENOVO \tJumlah = \t 20 \t Warna Hitam  \n LOGITECH \t Jumlah = \t 3 \t Warna Hitam \n VOTRE \t Jumlah = \t 1 \t Warna Hitam \n ASUS \t Jumlah = \t 1 \t Warna Hitam\n[1]KEMBALI"); 
                              
                         
                                    
                              
                             
                                z = JOptionPane.showConfirmDialog(null,"Melanjutkan Melihat Jumlah Barang  lain?", "OPTIONAL", JOptionPane.YES_NO_OPTION, 3); 

                                if (z == 0) {
                                    break;
                                } else {
                                    JOptionPane.showMessageDialog(null, "Terimakasih telah menggunakan Layanan Aplikasi Kami , Semoga Hari Anda Menyenangkan :) .");
                                }
                                System.exit(0);

                            case 3:

                                str1 = JOptionPane.showInputDialog(null, "Merk Headphone \n LOGITECH \tJumlah = \t 13 \t Warna Hitam  \n SPARTA \t Jumlah = \t 9 \t Warna Hitam \n[1]KEMBALI"); 

                               
                                
                            

                           

                                z = JOptionPane.showConfirmDialog(null,"Melanjutkan Melihat Jumlah Barang  lain?", "OPTIONAL" , JOptionPane.YES_NO_OPTION, 3); 

                                if (z == 0) {
                                    break;
                                } else { JOptionPane.showMessageDialog(null, "Terimakasih telah menggunakan Layanan Aplikasi Kami , Semoga Hari Anda Menyenangkan :) .");
                                }
                                System.exit(0);
                                    
                                
                            case 4:
                                str1 = JOptionPane.showInputDialog(null, "Merk Meja \n Kayu Biasa \tJumlah = \t 4 \t Warna Coklat  \n Kayu Press \t Jumlah = \t 21 \t Warna Abu-Abu\n[1]KEMBALI "); 

                                
                                
                                 z = JOptionPane.showConfirmDialog(null,"Melanjutkan Melihat Jumlah Barang  lain?", "OPTIONAL" , JOptionPane.YES_NO_OPTION, 3); 
                                 
                                 if (z == 0) {
                                    break;
                                } else { JOptionPane.showMessageDialog(null, "Terimakasih telah menggunakan Layanan Aplikasi Kami , Semoga Hari Anda Menyenangkan :) .");
                                }
                                System.exit(0);
                                
                                     
                            case 5:
                                str1 = JOptionPane.showInputDialog(null, "Merk Kursi \n Kayu Biasa \tJumlah = \t 1 \t Warna Coklat  \n Kursi lipat  \t Jumlah = \t 12 \t Warna Merah  \n Kursi lipat  \t Jumlah = \t 4 \t Warna Hitam \n[1]KEMBALI  "); 

                                
                                
                                 z = JOptionPane.showConfirmDialog(null,"Melanjutkan Melihat Jumlah Barang  lain?", "OPTIONAL" , JOptionPane.YES_NO_OPTION, 3); 
                                 
                                 if (z == 0) {
                                    break;
                                } else { JOptionPane.showMessageDialog(null, "Terimakasih telah menggunakan Layanan Aplikasi Kami , Semoga Hari Anda Menyenangkan :) .");
                                }
                                System.exit(0);
                                     
                            case 6:
                                str1 = JOptionPane.showInputDialog(null, "Merk Mouse \n LENOVO \tJumlah = \t 13 \t Warna Hitam  \n LOGITECH \t Jumlah = \t 6 \t Warna Hitam \n ASUS \t Jumlah = \t 1 \t Warna Hitam \n 4TECH \t Jumlah = \t 1 \t Warna Hitam\n[1]KEMBALI "); 

                                
                                
                                 z = JOptionPane.showConfirmDialog(null,"Melanjutkan Melihat Jumlah Barang  lain?", "OPTIONAL" , JOptionPane.YES_NO_OPTION, 3); 
                                 
                                 if (z == 0) {
                                    break;
                                } else { JOptionPane.showMessageDialog(null, "Terimakasih telah menggunakan Layanan Aplikasi Kami , Semoga Hari Anda Menyenangkan :) .");
                                }
                                System.exit(0);
                                     
                            case 7:
                                str1 = JOptionPane.showInputDialog(null, "Merk AC \nPANASONIC \tJumlah = \t 2 \t Warna Putih \n[1]KEMBALI"); 

                                
                                
                                 z = JOptionPane.showConfirmDialog(null,"Melanjutkan Melihat Jumlah Barang  lain?", "OPTIONAL" , JOptionPane.YES_NO_OPTION, 3); 
                                 
                                 if (z == 0) {
                                    break;
                                } else { JOptionPane.showMessageDialog(null, "Terimakasih telah menggunakan Layanan Aplikasi Kami , Semoga Hari Anda Menyenangkan :) .");
                                }
                                System.exit(0);
                                     
                            case 8:
                                str1 = JOptionPane.showInputDialog(null, "Merk Proyektor \n Infocus \tJumlah = \t 1 \t Warna Hitam \n[1]KEMBALI "); 

                                
                                
                                 z = JOptionPane.showConfirmDialog(null,"Melanjutkan Melihat Jumlah Barang  lain?", "OPTIONAL" , JOptionPane.YES_NO_OPTION, 3); 
                                 
                                 if (z == 0) {
                                    break;
                                } else { JOptionPane.showMessageDialog(null, "Terimakasih telah menggunakan Layanan Aplikasi Kami , Semoga Hari Anda Menyenangkan :) .");
                                }
                                System.exit(0);
                                     
                            case 9:
                                str1 = JOptionPane.showInputDialog(null, "Merk Lampu  \n PHILLIPS \tJumlah = \t 6 \t Warna Putih\n[1]KEMBALI   "); 

                                
                                
                                 z = JOptionPane.showConfirmDialog(null,"Melanjutkan Melihat Jumlah Barang  lain?", "OPTIONAL" , JOptionPane.YES_NO_OPTION, 3); 
                                 
                                 if (z == 0) {
                                    break;
                                } else { JOptionPane.showMessageDialog(null, "Terimakasih telah menggunakan Layanan Aplikasi Kami , Semoga Hari Anda Menyenangkan :) .");
                                }
                                System.exit(0);
                                     
                            case 10:
                                str1 = JOptionPane.showInputDialog(null, "Merk CPU \n COOLERMASTER \tJumlah = \t 4 \t Warna HITAM \n ASUS \tJumlah = \t 1 \t Warna PUTIH \n[1]KEMBALI "); 

                                
                                
                                 z = JOptionPane.showConfirmDialog(null,"Melanjutkan Melihat Jumlah Barang  lain?", "OPTIONAL" , JOptionPane.YES_NO_OPTION, 3); 
                                 
                                 if (z == 0) {
                                    break;
                                } else { JOptionPane.showMessageDialog(null, "Terimakasih telah menggunakan Layanan Aplikasi Kami , Semoga Hari Anda Menyenangkan :) .");
                                }
                                System.exit(0);
                                     
                            case 11:
                                str1 = JOptionPane.showInputDialog(null, "Merk Electronic White Board \n INFOCUS \tJumlah = \t 1 \t Warna Putih Abu-Abu \n[1]KEMBALI  "); 

                                
                                
                                 z = JOptionPane.showConfirmDialog(null,"Melanjutkan Melihat Jumlah Barang  lain?", "OPTIONAL" , JOptionPane.YES_NO_OPTION, 3); 
                                 
                                 if (z == 0) {
                                    break;
                                } else { JOptionPane.showMessageDialog(null, "Terimakasih telah menggunakan Layanan Aplikasi Kami , Semoga Hari Anda Menyenangkan :) .");
                                }
                                System.exit(0);
                                     
                            case 12:
                                str1 = JOptionPane.showInputDialog(null, "Merk Sakelar \n BROCO(Tembok) \tJumlah = \t 19 \t Warna Putih  \n Tanpa Merk (LANTAI) \t Jumlah = \t 10 \t Warna Abu-Abu Putih\n[1]KEMBALI "); 

                                
                                
                                 z = JOptionPane.showConfirmDialog(null,"Melanjutkan Melihat Jumlah Barang  lain?", "OPTIONAL" , JOptionPane.YES_NO_OPTION, 3); 
                                 
                                 if (z == 0) {
                                    break;
                                } else { JOptionPane.showMessageDialog(null, "Terimakasih telah menggunakan Layanan Aplikasi Kami , Semoga Hari Anda Menyenangkan :) .");
                                }
                                System.exit(0);
                                     
                            case 13:
                                str1 = JOptionPane.showInputDialog(null, "Merk Sapu \n 2MACAN \tJumlah = \t 1 \t Warna Hijau \n [1]KEMBALI   "); 

                                
                                
                                 z = JOptionPane.showConfirmDialog(null,"Melanjutkan Melihat Jumlah Barang  lain?", "OPTIONAL" , JOptionPane.YES_NO_OPTION, 3); 
                                 
                                 if (z == 0) {
                                    break;
                                } else { JOptionPane.showMessageDialog(null, "Terimakasih telah menggunakan Layanan Aplikasi Kami , Semoga Hari Anda Menyenangkan :) .");
                                }
                                System.exit(0);
                                     
                            case 14:
                                str1 = JOptionPane.showInputDialog(null, "Merk Cikrak \n LION STAR \tJumlah = \t 1 \t Warna Hijau \n[1]KEMBALI  "); 

                                
                                
                                 z = JOptionPane.showConfirmDialog(null,"Melanjutkan Melihat Jumlah Barang  lain?", "OPTIONAL" , JOptionPane.YES_NO_OPTION, 3); 
                                 
                                 if (z == 0) {
                                    break;
                                } else { JOptionPane.showMessageDialog(null, "Terimakasih telah menggunakan Layanan Aplikasi Kami , Semoga Hari Anda Menyenangkan :) .");
                                }
                                System.exit(0);
                                
                                case 15:
                                z = JOptionPane.showConfirmDialog(null, "Anda inginkeluar?", "Keluar", JOptionPane.YES_NO_OPTION, 0);

                                if (z == 0) {
                                    JOptionPane.showMessageDialog(null, "Terimakasih telah menggunakan Aplikasi Kami Semoga Hari  Anda Menyenangkan :)");
                                    System.exit(0);
                                } else {
                                    break;
                                }

                            default:
                                JOptionPane.showMessageDialog(null, "Pilihan menu tidak tersedia\nSilahkan ulangi lagi \t HARAP BIASAKAN MEMBACA", "ERROR", 0);
                        }
                    } while (1 == 1);
                } } while (1 == 1);

        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Kesalahan !\n SALAH KODE WOI  \nPROGRAM KELUAR!  \nTerimakasih", "ERROR", 0);

        }
    }

}
